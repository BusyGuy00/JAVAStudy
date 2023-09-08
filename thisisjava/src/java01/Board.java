package java01;

public class Board {
	//필드,생성자,메소드
	
	//필드
	private String subject;
	private String content;
	private String writer;
	
	//생성자
	public Board(String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
		
		
		
	}
	@Override
	public int hashCode() {
		return subject.hashCode() + content.hashCode() + writer.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Board b) {
			return b.subject.equals(subject) && b.content.equals(content)
					&& b.writer.equals(writer);
			}
			return false;	
		
		
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
}
