package ch02.verify02;
//1. �ϳ��� ���ڿ� 12���� ���� �� �ִ� �ڽ��� �ֽ��ϴ�.
//������ 127���� �ִٸ� ��ڽ��� ���� �� ������,
//�������� ��Դϱ�?
public class RemainExam {
	
	public static void main(String[] args) {
	  int orange=127;
	  final int BOX=12;//���
	  
	  int mok = orange/BOX;//��
	  int nam = orange%BOX;//������
	  
	  System.out.println(mok+"�ڽ�, ������:"+nam);
		
	}
}
