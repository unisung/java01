package ch03;
//int Ÿ�� �� ���� -2^31 ~ 2^31-1
public class IntExample {
	public static void main(String[] args) {
		int var1 = 10;//10����
		int var2 = 012;//8����
		int var3 = 0xA;//16����
		int var4 = 0b1011;//2����
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		
		//
		System.out.println("intŸ�԰��� �ִ����:"+Integer.MAX_VALUE);
		System.out.println("intŸ�԰��� �ּҹ���:"+Integer.MIN_VALUE);

	}

}
