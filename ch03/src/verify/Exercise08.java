package verify;

public class Exercise08 {
	public static void main(String[] args) {
	double x=5.0;
	double y=0.0;
	
	double z=x%y;
	
	if(Double.isNaN(z)) {//WrapperŬ���� �⺻Ÿ�� double�� Ŭ����ȭ �� ��
		System.out.println("0.0���� ������ �����ϴ�.");
	}else {
		double result = z+10;
		System.out.println("���:"+result);
	}
	}
}
