package ch03;
//promotion(�ڵ�����ȯ) : ������ ���� Ÿ�� -> ������ ���� Ÿ�� �ڵ� �� ��ȯ
public class PromotionExam {
	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue =byteValue;//byte -> int
		System.out.println(intValue);
		
		char charValue = '��';
		intValue = charValue; //char -> int
		System.out.println("���� �����ڵ�="+intValue);//int ->String
		
		intValue = 500;
		long longValue = intValue;//int ->long
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue;//int ->double
		System.out.println(doubleValue);

	}

}
