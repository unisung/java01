package ch01;

public class Test1 {
	public static void main(String[] args) {
		char a=0xD64D;
		char b='\uAE38';
		char c='\uB3D9';
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(""+a+b+c);//""+'\uD64D' =>"ȫ","ȫ"+'\uAE38'="ȫ��","ȫ��"+'\uB3D9'=>"ȫ�浿"
		System.out.println(10+20);
		System.out.println(""+10+20);//""+10=>"10", "10"+20 => "1020"
		System.out.println(b);
		System.out.println(c);
		System.out.print(a);
		System.out.print(b);
		System.out.print(c);

	}

}
