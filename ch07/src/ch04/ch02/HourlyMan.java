package ch04.ch02;

public class HourlyMan extends Employee{
   //�ʵ�
	int workHour,moneyPerHour;

	public HourlyMan(String name, int workHour, int moneyPerHour) {
		super(name);
		this.workHour = workHour;
		this.moneyPerHour = moneyPerHour;
	}

	//����/�ñ� ������ ���� �ٸ� �޿� ������ ���� �޼ҵ� ������
	@Override
	int computePay() {
		return workHour*moneyPerHour;//�ٹ��ð�*�ñ�
	}
	
	
}
