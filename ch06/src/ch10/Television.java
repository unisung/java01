package ch10;

public class Television {
	String company;
	String model;
	String info;
	//instance초기화 블럭
	{
		company="samsong";
		model="UHD8K";
		info=company+model;
	}
	@Override
	public String toString() {
		return "Television [company=" + company 
			 + ", model=" + model + ", info=" + info + "]";
	}

}
