package autowire;

public class BasePojo {


	@Override
	public String toString() {
		return "BasePojo [btp=" + btp + ", name=" + name + "]";
	}

	public ByTypePojo getBtp() {
		return btp;
	}

	public void setBtp(ByTypePojo btp) {
		this.btp = btp;
	}

	public ByTypePojo btp;
	public String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
