package com.codeming.springbootexample.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.codeming.springbootexample.Product;

@RestController
public class ProductController {

	static Map<Integer, Product> productRepo = new HashMap<>();
	static Product product1 = new Product("Book", 500, 1);
	static Product product2 = new Product("Pen", 500, 2);

	static {

		// Manually added 2 records
		productRepo.put(1, product1);
		productRepo.put(2, product2);

	}

	// Fetch all records
	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public ResponseEntity<Object> getProduct() {

		return new ResponseEntity<>(productRepo, HttpStatus.OK);
	}

	// fetch record by id
	@RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
	public ResponseEntity<Object> getProductById(@PathVariable int id) {

		return new ResponseEntity<>(productRepo.get(id), HttpStatus.BAD_REQUEST);
	}

	// add record
	@RequestMapping(value = "/products", method = RequestMethod.POST)
	public ResponseEntity<Object> addProduct(@RequestBody Product product) {
		productRepo.put(2, product);

		return new ResponseEntity<>(productRepo, HttpStatus.CREATED);
	}

	// add record
	@RequestMapping(value = "/upload", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<Object> uploadFile(@RequestParam("myfile") MultipartFile file) throws IOException {
		File localFile = new File("C:\\Users\\swati\\Desktop\\multipart" + file.getOriginalFilename());
		localFile.createNewFile();
		FileOutputStream fout = new FileOutputStream(localFile);
		fout.write(file.getBytes());
		System.out.println("File saved succeassfully");
		fout.close();
		return new ResponseEntity<>("File Saved in local storage successfully", HttpStatus.OK);
//		productRepo.put(2, product);

//		return new ResponseEntity<>(productRepo, HttpStatus.CREATED);
	}

	// add record by id
	// Throwing the exception
	@RequestMapping(value = "/products/{id}", method = RequestMethod.POST)
	public ResponseEntity<Object> addProduct(@PathVariable int id, @RequestBody Product product) {
		if (id < 100 && id > 0) {
			product.setId(id);
			productRepo.put(id, product);

			return new ResponseEntity<>("Product added successfully", HttpStatus.CREATED);
		} else {
			throw new ProductException();
		}

	}

	// delete record
	@RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Object> deleteProduct(@PathVariable int id) {
		productRepo.remove(id);

		return new ResponseEntity<>(productRepo, HttpStatus.OK);
	}

	// Update record
	@RequestMapping(value = "/products/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Object> editProduct(@PathVariable int id, @RequestBody Product prod) {
		productRepo.replace(id, prod);

		return new ResponseEntity<>(productRepo, HttpStatus.OK);
	}

}
