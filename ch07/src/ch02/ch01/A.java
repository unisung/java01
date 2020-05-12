package ch02.ch01;

//상속받은 자식클래스의 생성자
//첫줄에 부모클래스의 생성자호출메소드 super()가
//존재
public class A extends Object{
  A(){
	  super();
	  System.out.println("A생성자 실행");
  }
}

class B extends A{
	B(){
		super();
		System.out.println("B생성자 실행");
	}
}
class C extends B{
	C(){
		super();//super()메소드는 반드시 첫중에 위치해야함.
		System.out.println("C생성자 실행");
		//super();
	}
}
