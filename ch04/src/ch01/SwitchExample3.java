package ch01;

public class SwitchExample3 {
	public static void main(String[] args) {
		char day='��';
		
		switch (day) {
		case '��': 
		case 'ȭ': 
		case '��': 
		case '��': System.out.println("������ �����մϴ�.");
			break;
		case '��':System.out.println("�ָ��� ��ٷ����ϴ�.");
			break;
		case '��':
		case '��':System.out.println("������ ���ϴ�.");
		}

	}

}
