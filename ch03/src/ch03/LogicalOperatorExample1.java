package ch03;

public class LogicalOperatorExample1 {
	public static void main(String[] args) {
		System.out.println(!true);
		// ^ ������ false �ٸ��� true
		System.out.println(true^true);// false
		System.out.println(true^false);//true
		System.out.println(false^true);//true
		System.out.println(false^false);//false
		
		// |, || ������ true�̸� �ٸ� �� ������� ����� true
		System.out.println(true||true);
		System.out.println(true||false);
		System.out.println(false||true);
		System.out.println(false||false);
		
		// &, && ������ false�̸� �ٸ� �� ������� ����� false
		System.out.println(true&&true);
		System.out.println(true&&false);
		System.out.println(false&&true);
		System.out.println(false&&false);
	}
}
