package ch02;

public class ArrayExample7 {
	public static void main(String[] args) {
		//������ �迭�� ����ҵ��� �������,booleanŸ���� �⺻��false
		boolean[] booleanArray=new boolean[5];
		for(int i=0;i<booleanArray.length;i++)
			System.out.println(booleanArray[i]);
		//�迭�� �� ��������� index��ȣ�� ����
		booleanArray[0]=false; booleanArray[1]=true;
		//boolean booeanVar =10>1;
		booleanArray[2]=10>1;
		//�迭�� �� ��Ұ� ���
		for(int i=0;i<booleanArray.length;i++)
			System.out.println(booleanArray[i]);
		//booleanŸ���� �⺻�� false�� ����ִ� ��ҿ� ����
		boolean result = booleanArray[3] & true;
		System.out.println("result:"+result);

	}
}
