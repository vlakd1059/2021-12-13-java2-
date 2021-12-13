package Exam;

import java.util.Scanner;

public class BookData_Main {

	public static void main(String[] args) {

		BookData bd1 = new BookData("JAVA", 10000, "병관");
		BookData bd2 = new BookData("DB", 20000, "동원");
		BookData bd3 = new BookData("WEB", 30000, "승환");

		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하세요 : ");
		int money = sc.nextInt();

		System.out.println("구매 가능한 목록");
		BookData[] bookList = new BookData[3];
		bookList[0] = bd1;
		bookList[1] = bd2;
		bookList[2] = bd3;
		System.out.println("============================================");
		for (int i = 0; i < bookList.length; i++) {
			if (bookList[i].getPrice() <= money) {
				System.out.println("책 제목 : " + bookList[i].getTitle());
				System.out.println("책 가격 : " + bookList[i].getPrice() + "원");
				System.out.println("책 저자 : " + bookList[i].getWriter() + "(님)");
			}
			System.out.println();
		}
		System.out.println("============================================");
	}
}
//for (int i = 0; i < bookList.length; i++) {
//System.out.print("책 제목을 입력해주세요 >>");
//String title = sc.next();
//System.out.print("가격을 입력해주세요 >> ");
//int price = sc.nextInt();
//System.out.print("저자를 입력해주세요 >> ");
//String writer = sc.next();
//System.out.println("============================================");
//BookData bd = new BookData(title, price, writer);
//bookList[i] = bd;


//}