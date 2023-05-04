package JANGYUJEONG.submit14.VO;

// 즐겨찾기 관리
public class MyVO {
	private int myNo;
	private String memId;
	private String recName;
	
	public MyVO() {}
	
	public MyVO(int myNo, String memId, String recName) {
		super();
		this.myNo = myNo;
		this.memId = memId;
		this.recName = recName;
	}
	
	
	@Override
	public String toString() {
		return "MyVO [myNo=" + myNo + ", memId=" + memId + ", recName=" + recName + "]";
	}
	public int getMyNo() {
		return myNo;
	}
	public String getMemId() {
		return memId;
	}
	public String getRecName() {
		return recName;
	}
	public void setMyNo(int myNo) {
		this.myNo = myNo;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public void setRecName(String recName) {
		this.recName = recName;
	}
	
	
	
	

}
