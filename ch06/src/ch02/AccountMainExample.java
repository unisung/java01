package ch02;

public class AccountMainExample {
	public static void main(String[] args) {
		Account acc1 = new Account("ȫ�浿", 10000);
		acc1.getBalance();
		//�Ա�
		acc1.deposit(2000);
		acc1.getBalance();
		//���
		acc1.withDraw(13000, "ȫ�浿");
		acc1.getBalance();
		acc1.withDraw(8000, "�Ӳ���");
		acc1.getBalance();
		acc1.withDraw(8000, "ȫ�浿");
        acc1.getBalance();		
		

	}

}
