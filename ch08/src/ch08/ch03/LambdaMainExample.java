package ch08.ch03;

public class LambdaMainExample {
	public static void main(String[] args) {
	  //����(anonymous interface)
	  MyFunctionalInteface mi=new MyFunctionalInteface() {
		
		@Override
		public int sum(int x, int y) {
			return x+y;
		}
	 };
	  
	 System.out.println(mi.sum(10, 20));
	 
	 MyFunctionalInteface mi2=new MyClass();//promotion
	 System.out.println(mi2.sum(10, 20));
	 //���ٽ�
	 //���ԵǴ� �������̽��� Ÿ���� �ڹٰ� �˰�����= 
	 //�������̽����� �߻�޼ҵ尡 ���� �ϳ����߸� ��.
	 //=�������������̽����� �޼ҵ���� ����,
	 //�Ű������� Ÿ�Ի��� ��������, ǥ��
	 //()->{} ȭ��ǥ�� ǥ��
	 //{}���� ���ɹ��� �ϳ��� {}��������, return���� ��������.
	 MyFunctionalInteface mi3=(x,y)->x+y;
	 System.out.println(mi3.sum(10, 20));
	
	 

	}

}