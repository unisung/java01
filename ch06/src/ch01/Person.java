package ch01;

public class Person {
	String name;
	int age;
	Calculator calcualtor;
	//생성자 클래스명과 같은 메소드형태
	//생성된 객체의 필드값 초기화 하는 역할
	Person(){
	name="홍길동";
	age=13;
	calcualtor
	 =new Calculator();				
	}
	
	public void getResult() {
		System.out.println(
				calcualtor.add(10, 20));
	}
}
