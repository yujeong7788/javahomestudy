package JANGYUJEONG.submit13.vo;

public class MemVO {
	private String memId;
	private String memPassword;
	private String memName;
	
	public MemVO() {}

	public MemVO(String memId, String memPassword, String memName) {
		super();
		this.memId = memId;
		this.memPassword = memPassword;
		this.memName = memName;
	}

	@Override
	public String toString() {
		return "MemVO [memId=" + memId + ", memPassword=" + memPassword + ", memName=" + memName + "]";
	}

	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public String getMemPassword() {
		return memPassword;
	}

	public void setMemPassword(String memPassword) {
		this.memPassword = memPassword;
	}

	public String getMemName() {
		return memName;
	}

	public void setMemName(String memName) {
		this.memName = memName;
	}
	
	
	

}
