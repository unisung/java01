package ch02;

public class TryCatchExam4 {
	public static void main(String[] args) {
	 try {
		 int num1=10;
	     int num2=0;
		 int result =num1/num2;
	} catch (Exception e) {
		 System.out.println("0으로 나눌수 없습니다");
	}
	}
}
