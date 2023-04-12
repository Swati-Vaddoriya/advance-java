package autowire;

public class BasePojo {
	@Override
	public String toString() {
		return "BasePojo [btp=" + btp + "]";
	}

	public ByTypePojo getBtp() {
		return btp;
	}

	public void setBtp(ByTypePojo btp) {
		this.btp = btp;
	}

	public ByTypePojo btp;

}
