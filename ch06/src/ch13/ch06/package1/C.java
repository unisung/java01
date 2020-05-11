package ch13.ch06.package1;

//동일패키지
public class C {
	public void k() {
		//접근가능
		B b=new B();
		//동일패키지내에서 접근가능
		b.n=7;
		b.g();
	}
}
