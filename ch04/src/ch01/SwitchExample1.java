package ch01;

public class SwitchExample1 {
	public static void main(String[] args) {
		char day='ȭ';
		
		switch(day) {
		case '��': 
			       System.out.println("�� ���� ����");
			       break;//switch�������� ���� ���������� ��ɹ�
		case 'ȭ': System.out.println("���� ��° ��");
		           //break;
		case '��': System.out.println("���� �߰� ");
		           break;
		case '��': System.out.println("�ָ��� ��ٷ����� ��");
		case '��': System.out.println("�� �ָ�");
		case '��': System.out.println("�ָ��̴�.");
		default: System.out.println("�Ͽ���");
		}
	}

}
