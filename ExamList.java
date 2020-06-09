package java04;

import java.util.Scanner;

public class ExamList {

	private Exam[] exams;
	private int current;

	public ExamList() {
		this(3);
	}

	public ExamList(int size) {
		//exams = new Exam[size];
		//current = 0;
		this(new Exam[size], 0);
	}

	public ExamList(Exam[] exams, int current) {
		super();
		this.exams = exams;
		this.current = current;
	}

	public int getCurrent() {
		return current;
	}

	public void setCurrent(int current) {
		if (current > 3) {
			System.out.println("배열의 크기를 확인하세요.");
		} else {
			this.current = current;
		}
	}

	void inputScore() {

		Scanner scan = new Scanner(System.in);
		// 입력
		System.out.println("┌──────────┐");
		System.out.println("│  성적 입력   │");
		System.out.println("└──────────┘");

		int kor, eng, math;

		do {
			System.out.print("국어: ");
			kor = scan.nextInt();
			if (kor < 0 || 100 < kor)
				System.out.println("성적범위를 (0~100) 벗어났습니다.");
		} while (kor < 0 || kor > 100);

		do {
			System.out.print("영어: ");
			eng = scan.nextInt();
			if (eng < 0 || 100 < eng)
				System.out.println("성적범위를 (0~100) 벗어났습니다.");
		} while (eng < 0 || eng > 100);

		do {
			System.out.print("수학: ");
			math = scan.nextInt();
			if (math < 0 || 100 < math)
				System.out.println("성적범위를 (0~100) 벗어났습니다.");
		} while (math < 0 || math > 100);

		Exam exam = new Exam();
		exam.kor = kor;
		exam.eng = eng;
		exam.math = math;

		Exam[] exams = this.exams;
		int size = this.current;
		if (exams.length == size) {
			Exam[] temp = new Exam[size + 3];
			for (int i = 0; i < size; i++) {
				temp[i] = exams[i];
			}
			this.exams = temp;
		}
		this.exams[this.current] = exam;
		this.current++;

		System.out.println("------------------");
	}

	void displayScore() {
		// 출력
		displayScore(current);
	}

	void displayScore(int size) {
		// 출력
		int total = 0;
		double avg = 0.0;

		for (int i = 0; i < size; i++) {
			Exam exam = this.exams[i];
			int kor = exam.kor;
			int eng = exam.eng;
			int math = exam.math;

			total = kor + eng + math;
			avg = total / 3;
			System.out.println("┌──────────┐");
			System.out.println("│  성적 출력   │");
			System.out.println("└──────────┘");

			System.out.printf("국어: %d\n", kor);
			System.out.printf("영어: %d\n", eng);
			System.out.printf("수학: %d\n", math);

			System.out.printf("총점: %d\n", total);
			System.out.printf("평균: %6.2f\n", avg);// 전체 6자리 중 소수점 2번째까지

			System.out.println("------------------");
		}
	}
}
