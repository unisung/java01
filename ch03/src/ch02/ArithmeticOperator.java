package ch02;

import java.util.Scanner;//import:다른패키지의 클래스를 사용하는 명령문

public class ArithmeticOperator {
	public static void main(String[] args) {
		int time = 5000;	
        Scanner scanner = new Scanner(System.in); 
   		boolean play=true;
        
	while(play){ 
		 System.out.print("정수를 입력하세요: ");
		
		 time=scanner.nextInt();
		
		int second = time % 60; 				// 60으로 나눈 나머지는 초
		int minute = (time / 60) % 60; 	// 60으로 나눈 몫을 다시 60으로 나눈 나머지는 분
		int hour = (time / 60) / 60; 		// 60으로 나눈 몫을 다시 60으로 나눈 몫은 시간
		
		System.out.print(time + "초는 ");
		System.out.print(hour + "시간, ");
		System.out.print(minute + "분, ");
		System.out.println(second + "초입니다.");
		
		System.out.println("계속할까요?>");
	    char yesNo=scanner.next().charAt(0);
	    if(yesNo=='n' || yesNo=='N') {//문자비교 ==
	    	play=!play;
	    } 
	  }//while문 끝.
	System.out.println("끝");
	}
}
