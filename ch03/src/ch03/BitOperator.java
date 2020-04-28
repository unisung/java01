package ch03;

public class BitOperator {
	public static void main(String[] args) {
	 short a = (short)0x55ff;
	 short b = (short)0x00ff;
	
	 System.out.println(toBinaryString(a));
	 System.out.println(toBinaryString(b));
	 //��Ʈ������
	 System.out.println("[��Ʈ ���� ���]");
	 System.out.printf("%04x\n",(short)(a&b));//��Ʈ AND
	 System.out.printf("%04x\n",(short)(a|b));//��Ʈ OR
	 System.out.printf("%04x\n",(short)(a^b));//��Ʈ XOR
	 System.out.printf("%04x\n",(short)(~a));//��Ʈ not
	}
	
	public static String toBinaryString(short a) {
		String str=Integer.toBinaryString(a);
		while(str.length()<16) {
			  str="0"+str;
		}
		return str;
	}
	
	

}
