package Exam;

public class BookData {
	private String title; // å�̸�
	private int price; // å ����
	private String writer; // å ����

	public BookData(String title, int price, String writer) {
		super();
		this.title = title;
		this.price = price;
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public int getPrice() {
		return price;
	}

	public String getWriter() {
		return writer;
	}
}
