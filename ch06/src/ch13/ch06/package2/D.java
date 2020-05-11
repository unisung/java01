package ch13.ch06.package2;

import ch13.ch06.package1.B;
//상속관계의 자식클래스는
//다른패키지에 속해있어도
//B클래스의 protected접근제한자로
//선언된 맴버에 접근 가능
public class D extends B{
	void f() {
		n=3;
		g();
	}

}
