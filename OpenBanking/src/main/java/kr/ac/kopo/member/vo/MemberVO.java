package kr.ac.kopo.member.vo;

public class MemberVO {
	
	private String name;//
	private String id;//
	private String identity;//
	private String password;//
	private String regDate;//
	private String gender;//
	private String phoneNumber;//
	private String address;//
	private String type;//
	private String detailAddress;//
	private String zipCode;//
	private String openBanking;
	private String syBank;
	public String getSyBank() {
		return syBank;
	}
	public void setSyBank(String syBank) {
		this.syBank = syBank;
	}
	public String getYkBank() {
		return ykBank;
	}
	public void setYkBank(String ykBank) {
		this.ykBank = ykBank;
	}
	public String getHjBank() {
		return hjBank;
	}
	public void setHjBank(String hjBank) {
		this.hjBank = hjBank;
	}
	private String ykBank;
	public MemberVO(String name, String id, String identity, String password, String regDate, String gender,
			String phoneNumber, String address, String type, String detailAddress, String zipCode, String openBanking,
			String syBank, String ykBank, String hjBank) {
		super();
		this.name = name;
		this.id = id;
		this.identity = identity;
		this.password = password;
		this.regDate = regDate;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.type = type;
		this.detailAddress = detailAddress;
		this.zipCode = zipCode;
		this.openBanking = openBanking;
		this.syBank = syBank;
		this.ykBank = ykBank;
		this.hjBank = hjBank;
	}
	private String hjBank;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public MemberVO() {
		super();
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDetailAddress() {
		return detailAddress;
	}
	public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getOpenBanking() {
		return openBanking;
	}
	public void setOpenBanking(String openBanking) {
		this.openBanking = openBanking;
	}
	@Override
	public String toString() {
		return "MemberVO [name=" + name + ", id=" + id + ", identity=" + identity + ", password=" + password
				+ ", regDate=" + regDate + ", gender=" + gender + ", phoneNumber=" + phoneNumber + ", address="
				+ address + ", type=" + type + ", detailAddress=" + detailAddress + ", zipCode=" + zipCode
				+ ", openBanking=" + openBanking + ", syBank=" + syBank + ", ykBank=" + ykBank + ", hjBank=" + hjBank
				+ "]";
	}
	public MemberVO(String name, String id, String identity, String password, String regDate, String gender,
			String phoneNumber, String address, String type, String detailAddress, String zipCode, String openBanking) {
		super();
		this.name = name;
		this.id = id;
		this.identity = identity;
		this.password = password;
		this.regDate = regDate;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.type = type;
		this.detailAddress = detailAddress;
		this.zipCode = zipCode;
		this.openBanking = openBanking;
	}
	public MemberVO(String id, String password) {
		super();
		this.id = id;
		this.password = password;
	}
	public MemberVO(String id) {
		super();
		this.id = id;
	}
	public MemberVO(String name, String id, String identity, String password, String gender, String phoneNumber,
			String address, String detailAddress, String zipCode) {
		super();
		this.name = name;
		this.id = id;
		this.identity = identity;
		this.password = password;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.detailAddress = detailAddress;
		this.zipCode = zipCode;
	}

	


}
