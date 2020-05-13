package ch04.verify;

public abstract class Vehicle {
	final int MAX_FEE = 50000;
	String kind;
	int feePerTime;//�ð���������
	int intTime;//�����ð�
	int outTime;//�����ð�
	
	public Vehicle(String kind, int feePerTime, int intTime, int outTime) {
		this.kind = kind;
		this.feePerTime = feePerTime;
		this.intTime = intTime;
		this.outTime = outTime;
	}
    //�ݵ�� ������ �Ǿ���
	abstract int calcTime();
	
	final int calcFee() {
		int time = calcTime();
		if(time>12) return MAX_FEE;
		else{
			return time*getFeePerTime();
		}
	}
	
	int getFeePerTime() {
		return feePerTime;
	}
	
	void print() {
			System.out.println("================");
			System.out.println("����:"+kind);
			System.out.println("�����ð�:"+calcTime());
			System.out.println("�������:"+calcFee());
	 }
}
