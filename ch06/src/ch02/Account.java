package ch02;

public class Account {
  private String owner;  private double balance;
  //������
  Account(String owner, double amount){
	  this.owner=owner;   balance=amount;
  }
  //�Ա�
  void deposit(int amount) {  this.balance+=amount;  }
  //���
  void withDraw(int amount,String owner) {
	  //��ݽ� "���¼����ڰ� �ƴϸ� ��� �Ҽ� �����ϴ�." ���
	  //���¼����ڶ� �ܰ��� ��ݾ��� ������  "�ܰ����"���
	  //����� ���ó��
	  if(!this.owner.equals(owner)) {
		  System.out.println("���¼����ڰ� �ƴϸ� ��� �Ҽ� �����ϴ�.");
	  }else if(this.balance -amount <0) {
		  System.out.println("�ܰ��� ��ݾ��� ���Ƽ� �ܰ����");
	  }else {
		  this.balance-=amount;
	  }
  }
  //�ܰ� ���
  void getBalance() {
   System.out.println("�����ܰ�:"+balance);
  }
	

}
