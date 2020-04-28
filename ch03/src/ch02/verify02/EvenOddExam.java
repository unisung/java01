package ch02.verify02;
//2. 정수를 입력받아서 홀수이면 홀수출력,
//짝수이면 짝수를 출력하는 프로그램을 작성하세요
//반복여부를 물어보고 y,Y를 입력받으면 계속
//n,N을 입력받으면 중지하는 내용 포함

import java.util.Scanner;

public class EvenOddExam {
	public static void main(String[] args) {
		//키보드로 부터 입력받는 Scanner인스턴스 생성
		Scanner scanner = new Scanner(System.in);
		boolean isRun=true;
		
		while(isRun) {
			System.out.println("숫자를 입력하세요");
			int num = scanner.nextInt();
			if(num%2==0) {//입력받은 숫자를 2로 나눈 나머지가 0 이면 참
				System.out.println("짝수");
			}else {
				System.out.println("홀수");
			}
			
			System.out.println("계속할까요?");
			char yesNo=scanner.next().charAt(0);
			if(yesNo=='n'||yesNo=='N') {
				isRun = !isRun;
			}
		}
		System.out.println("프로그램 종료");
		
		//자원 해제
		scanner.close();
	}

}
