package ch03;
//casting(��������ȯ) 
public class CastringExample {
	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char)intValue;//casting int ->char
		System.out.println(charValue);
		
		//�����ڵ尪�� �ش��ϴ� ���ڰ�
		for(int i=0;i<10;i++) {
			System.out.println((char)intValue);
			intValue++;
		}
		
		long longValue = 500;
		intValue = (int)longValue; // long ->int
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int)doubleValue; // double -> int
		System.out.println(intValue);
		
		
	}
}
