package ch05;
//��������(swallow copy)
public class ArrayCopyExample31 {
	public static void main(String[] args) {
		int[] arr1 = {10,20,30,40,50};
		//arr1�� �����ϴ� �迭��ü�� ������ �ѱ�
		int[] arr2=arr1;
		
		//�迭�� ������
		System.out.print("arr2:\t");
		for(int i=0;i<arr2.length;i++)
		     System.out.print(arr2[i]+"\t");
		System.out.println();
		System.out.print("arr1:\t");
		for(int i=0;i<arr2.length;i++)
		     System.out.print(arr2[i]+"\t");

		
		arr2[2]=99;
		//�迭�� ������
		System.out.println();
		System.out.print("arr1:\t");
		for(int i=0;i<arr1.length;i++)
			System.out.print(arr1[i]+"\t");
		
		System.out.println();
		System.out.print("arr2:\t");
		for(int i=0;i<arr2.length;i++)
			System.out.print(arr2[i]+"\t");
		

	}

}
