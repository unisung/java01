package ch10.ch04;

import java.util.Calendar;

public class SingletoneExample {
	public static void main(String[] args) {
		//Calendar cal = new Calendar();
		//�̱��� ��ü Calendar�ν��Ͻ� ������
		Calendar cal = Calendar.getInstance();	
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
		Calendar cal2 = Calendar.getInstance();
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		
		//Calendar�� ���� �ٸ���ü
		System.out.println(cal==cal2);
	}
}
