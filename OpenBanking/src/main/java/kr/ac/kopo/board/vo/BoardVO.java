package kr.ac.kopo.board.vo;

public class BoardVO {
	private String id;
	private int boardNum;
	private String title;
	private String content;
	private String regDate;
	private int subNum;
	private int viewCnt;
	private int parentNum;
	public String getId() {
		return id;
	}
	public BoardVO(String id, int boardNum, String title, String content, String regDate, int subNum, int viewCnt,
			int parentNum) {
		super();
		this.id = id;
		this.boardNum = boardNum;
		this.title = title;
		this.content = content;
		this.regDate = regDate;
		this.subNum = subNum;
		this.viewCnt = viewCnt;
		this.parentNum = parentNum;
	}
	public BoardVO(String id, String title, String content) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
	}
	public int getParentNum() {
		return parentNum;
	}
	public void setParentNum(int parentNum) {
		this.parentNum = parentNum;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getBoardNum() {
		return boardNum;
	}
	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public int getSubNum() {
		return subNum;
	}
	public void setSubNum(int subNum) {
		this.subNum = subNum;
	}
	public int getViewCnt() {
		return viewCnt;
	}
	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}
	public BoardVO(String id, int boardNum, String title, String content, String regDate, int subNum, int viewCnt) {
		super();
		this.id = id;
		this.boardNum = boardNum;
		this.title = title;
		this.content = content;
		this.regDate = regDate;
		this.subNum = subNum;
		this.viewCnt = viewCnt;
	}
	public BoardVO(String id, int boardNum, String title, String content, String regDate, int subNum) {
		super();
		this.id = id;
		this.boardNum = boardNum;
		this.title = title;
		this.content = content;
		this.regDate = regDate;
		this.subNum = subNum;
	}
	public BoardVO(String id, int boardNum, String title, String content, String regDate) {
		super();
		this.id = id;
		this.boardNum = boardNum;
		this.title = title;
		this.content = content;
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "BoardVO [id=" + id + ", boardNum=" + boardNum + ", title=" + title + ", content=" + content
				+ ", regDate=" + regDate + ", subNum=" + subNum + ", viewCnt=" + viewCnt + "]";
	}
	public BoardVO() {
		super();
	}
	

	
	

}