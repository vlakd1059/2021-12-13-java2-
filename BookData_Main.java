package Exam;

import java.util.Scanner;

public class BookData_Main {

	public static void main(String[] args) {

		BookData bd1 = new BookData("JAVA", 10000, "����");
		BookData bd2 = new BookData("DB", 20000, "����");
		BookData bd3 = new BookData("WEB", 30000, "��ȯ");

		Scanner sc = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��ϼ��� : ");
		int money = sc.nextInt();

		System.out.println("���� ������ ���");
		BookData[] bookList = new BookData[3];
		bookList[0] = bd1;
		bookList[1] = bd2;
		bookList[2] = bd3;
		System.out.println("============================================");
		for (int i = 0; i < bookList.length; i++) {
			if (bookList[i].getPrice() <= money) {
				System.out.println("å ���� : " + bookList[i].getTitle());
				System.out.println("å ���� : " + bookList[i].getPrice() + "��");
				System.out.println("å ���� : " + bookList[i].getWriter() + "(��)");
			}
			System.out.println();
		}
		System.out.println("============================================");
	}
}
//for (int i = 0; i < bookList.length; i++) {
//System.out.print("å ������ �Է����ּ��� >>");
//String title = sc.next();
//System.out.print("������ �Է����ּ��� >> ");
//int price = sc.nextInt();
//System.out.print("���ڸ� �Է����ּ��� >> ");
//String writer = sc.next();
//System.out.println("============================================");
//BookData bd = new BookData(title, price, writer);
//bookList[i] = bd;


//}