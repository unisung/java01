package ch04;

public class ArrayExample24 {
	public static void main(String[] args) {
		int[] score= {78,98,54,76,87};//98,87,78,76,54
		int temp;
		for(int i=0;i<score.length;i++) {
		     	for(int j=i+1;j<score.length;j++) {
		     		if(score[i]<score[j]) {//�������� ����
		     			temp=score[i];
		     			score[i]=score[j];
		     			score[j]=temp;
		     		}
		     	}
		 }//for�� ��.
		//�������� ���
		for(int i=0;i<score.length;i++)
			System.out.println(score[i]);
	}
}
