package ch05.ch06.verify;

public class FruitMainExample {
	public static void main(String[] args) {
		//�迭�� ����
	 Fruit[] fruits = {
			 new Fruit("apple", 2000, Brix.LOW),
			 new Fruit("banana",5000, Brix.valueOf("MEDIUM")),
			 new Fruit("mango",10000, Brix.HIGH),
			 new Fruit("grape",7000, Brix.valueOf("HIGH"))
	 };
	 
	 //���� for��
	 for(Fruit f:fruits)
		 System.out.println(f.toString());
	 
	 //for��
	 for(int i=0;i<fruits.length;i++) {
		 Fruit f = fruits[i];
		 System.out.println(f);//toString()�� �ڵ� ȣ�� ��.
	 }
		 
	 
	}

}
