package verify0427;
//3. 2�� 100������ ��� �Ҽ�(prime number)�� ã�� ���α׷��� �ۼ��Ͻÿ�.
//�־��� �� k�� 2���� k-1������ ���ڷ� ����� 
//�������� 0�� ���� �ϳ��� ������ �Ҽ��� �ƴϴ�.
public class Exam0427_3_PrimNumber {
	public static void main(String[] args) {
		int  count2=0;
		System.out.println("2���� 100������ ��� �Ҽ�:");
		for(int i=2;i<=100;i++) {
			count2=0;
			for(int k=2;k<i;k++) {// k<i : k=i-1 
				if((i%k)==0) {
					count2++;//count2�� 0���� 1�� �ٲ��
					break;//���� �ߴ�
				}
			}
		 //�Ҽ� ���
		  if(count2==0) System.out.print(" " + i);
		}
	}

}
