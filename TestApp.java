package java04;

import java.util.Scanner;

public class TestApp {

	public static void main(String[] args) {

		//ExamList list = new ExamList();
		ExamList list = new ExamList(3);
		
		// exam. -> ������
		int menu = 0;
		boolean flag = true;

		while (flag) {

			menu = selectMenu();

			switch (menu) {
			case 1:
				list.inputScore();
				break;

			case 2:
				list.displayScore();
				// displayScore(list,1);
				break;

			case 3:
				flag = false;
				break;
			}
		}
		System.out.println("�����մϴ�.");
	}

	private static int selectMenu() {

		// �޴�
		Scanner scan = new Scanner(System.in);

		int menu;
		System.out.println("������������������������");
		System.out.println("��  �޴� ����   ��");
		System.out.println("������������������������");
		System.out.println("1. �����Է�");
		System.out.println("2. �������");
		System.out.println("3. ����");
		System.out.print("���� >> ");
		menu = scan.nextInt();
		return menu;
	}
}
