package ch01;

public class BitReverseOperationExam2 {
	public static void main(String[] args) {
		int v1=10;
		int v2=~v1;//��Ʈ���� 1�Ǻ���


		for(int i=1;i<11;i++) {
			System.out.println(Integer.toBinaryString(~i));
		}		
	}
	//�޼ҵ� 
	//���������� ������������� ����Ÿ�� �޼ҵ��(�Ű�����Ÿ�� �Ű�������){���๮;}
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		while(str.length()<32) {
			//System.out.println(str);
			str="0"+str;//1010 => 01010=>001010=>0001010=>00001010
		}
		return str;//�Լ�(�޼ҵ�)���� return���� ������ �����ϰ� ȣ���Ѱ����� �̵�.
		           //return ��; �̸� ���� ������.
	}
}
