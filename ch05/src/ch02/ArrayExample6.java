package ch02;

public class ArrayExample6 {
	public static void main(String[] args) {
		//������ �迭�� ����ҵ��� �������,doubleŸ���� �⺻��0.0
		double[] doubleArray=new double[5];
		for(int i=0;i<doubleArray.length;i++)
			System.out.println(doubleArray[i]);
		//�迭�� �� ��������� index��ȣ�� ����
		doubleArray[0]=10.0; doubleArray[1]=20.0;
		doubleArray[2]=30.0;
		//�迭�� �� ��Ұ� ���
		for(int i=0;i<doubleArray.length;i++)
			System.out.println(doubleArray[i]);
		
		//double�� �⺻���� ����� ��ҿ� ����
		double result=doubleArray[3]+5;
		System.out.println("result:"+result);

	}
}
