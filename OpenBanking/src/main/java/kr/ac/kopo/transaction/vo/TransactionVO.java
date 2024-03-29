package kr.ac.kopo.transaction.vo;

public class TransactionVO {
	private transient int tranNum;
	private String withrawalBankCode;
	private String depositBankCode;
	private String withrawalName;
	private String withrawalAccountNum;
	private String depositName;
	private String depositAccountNum;
	private int tranAmount;
	private String tranDate;
	private String depositBankName;
	private String withrawalBankName;
	private String withrawalPhoneNumber;
	private String depositPhoneNumber;
	
	public TransactionVO() {
		super();
	}
	public int getTranNum() {
		return tranNum;
	}
	public void setTranNum(int tranNum) {
		this.tranNum = tranNum;
	}
	public String getWithrawalBankCode() {
		return withrawalBankCode;
	}
	public void setWithrawalBankCode(String withrawalBankCode) {
		this.withrawalBankCode = withrawalBankCode;
	}
	public String getDepositBankCode() {
		return depositBankCode;
	}
	public void setDepositBankCode(String depositBankCode) {
		this.depositBankCode = depositBankCode;
	}
	public String getWithrawalName() {
		return withrawalName;
	}
	public void setWithrawalName(String withrawalName) {
		this.withrawalName = withrawalName;
	}
	public String getWithrawalAccountNum() {
		return withrawalAccountNum;
	}
	public void setWithrawalAccountNum(String withrawalAccountNum) {
		this.withrawalAccountNum = withrawalAccountNum;
	}
	public String getDepositName() {
		return depositName;
	}
	public void setDepositName(String depositName) {
		this.depositName = depositName;
	}
	public String getDepositAccountNum() {
		return depositAccountNum;
	}
	public void setDepositAccountNum(String depositAccountNum) {
		this.depositAccountNum = depositAccountNum;
	}
	public int getTranAmount() {
		return tranAmount;
	}
	public void setTranAmount(int tranAmount) {
		this.tranAmount = tranAmount;
	}
	public String getTranDate() {
		return tranDate;
	}
	public void setTranDate(String tranDate) {
		this.tranDate = tranDate;
	}
	public String getDepositBankName() {
		return depositBankName;
	}
	public void setDepositBankName(String depositBankName) {
		this.depositBankName = depositBankName;
	}
	public String getWithrawalBankName() {
		return withrawalBankName;
	}
	public void setWithrawalBankName(String withrawalBankName) {
		this.withrawalBankName = withrawalBankName;
	}
	public String getWithrawalPhoneNumber() {
		return withrawalPhoneNumber;
	}
	public void setWithrawalPhoneNumber(String withrawalPhoneNumber) {
		this.withrawalPhoneNumber = withrawalPhoneNumber;
	}
	public String getDepositPhoneNumber() {
		return depositPhoneNumber;
	}
	public void setDepositPhoneNumber(String depositPhoneNumber) {
		this.depositPhoneNumber = depositPhoneNumber;
	}
	@Override
	public String toString() {
		return "TransactionVO [tranNum=" + tranNum + ", withrawalBankCode=" + withrawalBankCode + ", depositBankCode="
				+ depositBankCode + ", withrawalName=" + withrawalName + ", withrawalAccountNum=" + withrawalAccountNum
				+ ", depositName=" + depositName + ", depositAccountNum=" + depositAccountNum + ", tranAmount="
				+ tranAmount + ", tranDate=" + tranDate + ", depositBankName=" + depositBankName
				+ ", withrawalBankName=" + withrawalBankName + ", withrawalPhoneNumber=" + withrawalPhoneNumber
				+ ", depositPhoneNumber=" + depositPhoneNumber + "]";
	}
	public TransactionVO(int tranNum, String withrawalBankCode, String depositBankCode, String withrawalName,
			String withrawalAccountNum, String depositName, String depositAccountNum, int tranAmount, String tranDate,
			String depositBankName, String withrawalBankName, String withrawalPhoneNumber, String depositPhoneNumber) {
		super();
		this.tranNum = tranNum;
		this.withrawalBankCode = withrawalBankCode;
		this.depositBankCode = depositBankCode;
		this.withrawalName = withrawalName;
		this.withrawalAccountNum = withrawalAccountNum;
		this.depositName = depositName;
		this.depositAccountNum = depositAccountNum;
		this.tranAmount = tranAmount;
		this.tranDate = tranDate;
		this.depositBankName = depositBankName;
		this.withrawalBankName = withrawalBankName;
		this.withrawalPhoneNumber = withrawalPhoneNumber;
		this.depositPhoneNumber = depositPhoneNumber;
	}
	public TransactionVO(String withrawalBankCode, String depositBankCode, String withrawalName,
			String withrawalAccountNum, String depositName, String depositAccountNum, int tranAmount,
			String depositBankName, String withrawalBankName, String withrawalPhoneNumber, String depositPhoneNumber) {
		super();
		this.withrawalBankCode = withrawalBankCode;
		this.depositBankCode = depositBankCode;
		this.withrawalName = withrawalName;
		this.withrawalAccountNum = withrawalAccountNum;
		this.depositName = depositName;
		this.depositAccountNum = depositAccountNum;
		this.tranAmount = tranAmount;
		this.depositBankName = depositBankName;
		this.withrawalBankName = withrawalBankName;
		this.withrawalPhoneNumber = withrawalPhoneNumber;
		this.depositPhoneNumber = depositPhoneNumber;
	}
	
	

	

	
}
