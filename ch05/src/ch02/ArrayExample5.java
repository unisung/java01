package ch02;

public class ArrayExample5 {
	public static void main(String[] args) {
		//������ �迭�� ����ҵ��� �������,intŸ���� �⺻��0
		int[] intArray=new int[5];
		for(int i=0;i<intArray.length;i++)
			System.out.println(intArray[i]);
		//�迭�� �� ��������� index��ȣ�� ����
		intArray[0]=10; intArray[1]=20;
		intArray[2]=30;
		//�迭�� �� ��Ұ� ���
		for(int i=0;i<intArray.length;i++)
			System.out.println(intArray[i]);
		//intŸ���� �⺻���� ����� ��� ����
		int result=intArray[3]+5;
		System.out.println("result:"+result);

	}
}
