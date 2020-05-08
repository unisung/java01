package ch10.ch02;

public class StaticBlockExample {
	//인스턴스 맴버
	int field1;
	void method1() {}
	
	//static맴버
	static int field2;
	static void method2() {}
	
	//static초기화 블럭
	static {
		//field1=10;//static초기화 블럭에는 인스턴스맴버는 올수 없음
		//method1();//static초기화 블럭에는 인스턴스맴버는 올수 없음
		field2=10;
		method2();	
	}
	//static메소드 
	static void method3() {
		//this.feidl1=10;//static맴버에는 인스턴스를 가리키는 this가 올수 없음
		//this.method1();//static맴버에는 인스턴스를 가리키는 this가 올수 없음
		field2=10;
		method2();
	}
}
