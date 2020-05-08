package ch06;

public class FunctionMainExam {
	public static void main(String[] args) {
		FunctionExam fe=new FunctionExam();
		//매개변수 받고 리턴타입있는 메소드 호출
		double result=fe.method1(10, 20);
		System.out.println(result);
		
		//매개변수 받고 리턴타입 없는 메소드 호출
		fe.method2(10, 20);
		
		fe.x=20.0; fe.y=30.0;
		//매개변수 받지않고 리턴타입 있는 메소드 호출
		result = fe.method3();
		System.out.println(result);
		
		//매개변수 받지않고 리턴타입 없는 메소드 호출
		fe.method4();

	}

}
