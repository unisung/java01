package ch06;

public class FunctionExam {
	double x,y;
	//�� ���� �Ǽ�(double)�� �޾Ƽ� �ִ밪�� �����ϴ� �޼ҵ�
	double method1(double x, double y){
		double result;
		
		if(x>y)result=x;
		else result=y;
		
		return result;
	}
	//�� ���� �Ǽ�(double)�� �޾Ƽ� �ִ밪�� ���������ʰ� ����ϴ� �޼ҵ�
	void method2(double x, double y){
		System.out.println(x>y?x:y);
	}
	//�� �Ǽ� x,y �� �ִ밪�� �����ϴ� �޼ҵ�
	double method3(){
		return x>y?x:y;
	}
	//�� �Ǽ� x,y �� �ִ밪�� ���������ʰ� ����ϴ� �޼ҵ�
	void method4(){
		System.out.println(x-y>0?x:y);
	}

}
