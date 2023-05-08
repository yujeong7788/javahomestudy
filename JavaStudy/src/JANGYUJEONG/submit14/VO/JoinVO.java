package JANGYUJEONG.submit14.VO;

public class JoinVO {
	private int rcNo;
	private String rcName;
	private String rcPart;
	private String rcMenual;
	private String rcAuthor;
	private String rcType;
	private String memId;
	
	public JoinVO(int rcNo, String rcName, String rcPart, String rcMenual, String rcAuthor, String rcType,
			String memId) {
		super();
		this.rcNo = rcNo;
		this.rcName = rcName;
		this.rcPart = rcPart;
		this.rcMenual = rcMenual;
		this.rcAuthor = rcAuthor;
		this.rcType = rcType;
		this.memId = memId;
	}
	
	public JoinVO() {}
	@Override
	public String toString() {
		return "JoinVO [rcNo=" + rcNo + ", rcName=" + rcName + ", rcPart=" + rcPart + ", rcMenual=" + rcMenual
				+ ", rcAuthor=" + rcAuthor + ", rcType=" + rcType + ", memId=" + memId + "]";
	}
	
	public int getRcNo() {
		return rcNo;
	}

	public String getRcName() {
		return rcName;
	}

	public String getRcPart() {
		return rcPart;
	}

	public String getRcMenual() {
		return rcMenual;
	}

	public String getRcAuthor() {
		return rcAuthor;
	}

	public String getRcType() {
		return rcType;
	}

	public String getMemId() {
		return memId;
	}

	public void setRcNo(int rcNo) {
		this.rcNo = rcNo;
	}

	public void setRcName(String rcName) {
		this.rcName = rcName;
	}

	public void setRcPart(String rcPart) {
		this.rcPart = rcPart;
	}

	public void setRcMenual(String rcMenual) {
		this.rcMenual = rcMenual;
	}

	public void setRcAuthor(String rcAuthor) {
		this.rcAuthor = rcAuthor;
	}

	public void setRcType(String rcType) {
		this.rcType = rcType;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	
	
	

}
