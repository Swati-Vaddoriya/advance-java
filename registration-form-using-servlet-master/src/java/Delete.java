/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class Delete extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            
            String str = request.getParameter("id");
                int EmpId= Integer.parseInt(str);
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Delete</title>");            
            out.println("</head>");
            out.println("<body>");
             Connection con=null;
                PreparedStatement ps=null;
                ResultSet rs = null;
                
                try{

                    
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    con=(Connection) DriverManager.getConnection( "jdbc:mysql://localhost:3306/empdb?zeroDateTimeBehavior=CONVERT_TO_NULL&useSSL=false","root", "root");
                    
                    String sql = "DELETE FROM employee WHERE id=?" ;
                    ps=con.prepareStatement(sql);
                    ps.setInt(1, EmpId);
                    int i=ps.executeUpdate();
                    if(i>0){
                        out.println("Record Deleted");
                    }else{
                       out.println("Error Occured"); 
                    }
                    
                     String show;
                    show = "select*from employee";
                    
                    rs=ps.executeQuery(show);
                    
                    
                    
                    out.print("<table border=7>");
                    out.print("<tr><th>EmpId</th><th>EmpName</th> <th>EmpMail</th><th>EmpAge</th></tr>");
                    while(rs.next())
                    {
                        int id=rs.getInt("id");
                        String name=rs.getString("name");
                        String email=rs.getString("email");
                        int age=rs.getInt("age");
                        
                        out.print("<tr><td>" +id+ "</td><td>"+name+"</td><td>"+email+"</td><td>"+age+"</td></tr>");
                    }
                    out.println("</table>");
                    
                    out.println("</body>");
                    out.println("</html>");
                }catch (SQLException e){
                    throw new ServletException("Servlet could not display records.",e);
                }
                catch(ClassNotFoundException e)
                {
                    throw new ServletException("JDBC Driver not found." , e);
                }
                finally
                {
                    try{
                        if(rs!=null)
                        {
                            rs.close();
                            rs=null;
                        }
                        if(ps!=null)
                        {
                            ps.close();
                            ps=null;
                        }
                        if(con!=null)
                        {
                            con.close();
                            con=null;
                        }
                        
                    }catch(SQLException e){}
           
        }
    }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
