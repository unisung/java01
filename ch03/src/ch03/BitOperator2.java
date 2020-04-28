package ch03;
//��Ʈshift: << >>, >>>
public class BitOperator2 {
	public static void main(String[] args) {
		byte c=20;//0x14
		byte d=-8;//0xf8
		
		System.out.println(toBinaryString(c));//00010100
		System.out.println(toBinaryString(d));//11111000
		//��Ʈ����Ʈ ����
		// >> �� �ֻ�����Ʈ�� ä����, >>>�� 0�� ä����
		System.out.println("[����Ʈ ���� ���]");
		System.out.println(c<<2);//c�� 2��Ʈ ���� ����Ʈ   01010000
		System.out.println(c>>2);//c�� 2��Ʈ ������ ����Ʈ00000101
		System.out.println(d>>2);//d�� 2��Ʈ ������ ����Ʈ11111110
		System.out.printf("%x\n", (d>>>2));//d�� 2��Ʈ ������ ����Ʈ 00111110
	}
   public static String toBinaryString(byte b) {
	   String str=Integer.toBinaryString(b);
	   while(str.length()<8) {
		   str="0"+str;
	   }
	   return str;
   }
}
