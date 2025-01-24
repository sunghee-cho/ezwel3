package boardmapper;

import org.springframework.web.multipart.MultipartFile;

public class BoardWriterDTO {
	int seq;
	String title, contents;
	int pw, viewcount;
	String writingtime, file1;
	MultipartFile multifile1;
	MemberDTO writerdto;//writerdto(id, ...) 컬럼 없다
	
	
	
	public MemberDTO getWriterdto() {
		return writerdto;
	}
	public void setWriterdto(MemberDTO writerdto) {
		this.writerdto = writerdto;
	}
	//board-mapping.xml
	// BoardDTO file1- 매핑 - board테이블 file1-varchar2 컬럼조회
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public int getPw() {
		return pw;
	}
	public void setPw(int pw) {
		this.pw = pw;
	}
	public int getViewcount() {
		return viewcount;
	}
	public void setViewcount(int viewcount) {
		this.viewcount = viewcount;
	}
	public String getWritingtime() {
		return writingtime;
	}
	public void setWritingtime(String writingtime) {
		this.writingtime = writingtime;
	}
	public String getFile1() {
		return file1;
	}
	public void setFile1(String file1) {
		this.file1 = file1;
	}
	
	
	public MultipartFile getMultifile1() {
		return multifile1;
	}
	public void setMultifile1(MultipartFile multifile1) {
		this.multifile1 = multifile1;
	}
	@Override
	public String toString() {
		return "BoardDTO [seq=" + seq + ", title=" + title + ", contents=" + contents + ", pw="
				+ pw + ", viewcount=" + viewcount + ", writingtime=" + writingtime + ", file1=" + file1 + "]";
	}

	

}