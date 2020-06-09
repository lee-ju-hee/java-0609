package java04;

import java.util.Scanner;

public class TestApp {

	public static void main(String[] args) {

		//ExamList list = new ExamList();
		ExamList list = new ExamList(3);
		
		// exam. -> 연산자
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
		System.out.println("종료합니다.");
	}

	private static int selectMenu() {

		// 메뉴
		Scanner scan = new Scanner(System.in);

		int menu;
		System.out.println("┌──────────┐");
		System.out.println("│  메뉴 선택   │");
		System.out.println("└──────────┘");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 >> ");
		menu = scan.nextInt();
		return menu;
	}
}
