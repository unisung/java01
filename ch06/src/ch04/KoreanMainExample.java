package ch05.ch04;

public class KoreanMainExample {
	public static void main(String[] args) {
		
		//Korean k = new Korean();//default�����ڷδ� �����Ұ�
		Korean korean1 = new Korean("ȫ�浿", "011225-1234567");
		Korean korean2 = new Korean("������", "930525-0654321");
		
		korean1.getInfo();
		korean2.getInfo();
		

	}

}
