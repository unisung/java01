package ch04.verify;

public class VehicleMainExam {
	public static void main(String[] args) {
		//"suv"-�ð��� 5000��
		//"sedan" -�ð��� 7000��
		//"truck" - �ð��� 9000��
		//12�ð� �ʰ��� �ϰ� 50000��
		Vehicle vehicle = new Suv("suv", 5000, 10, 18);
		Vehicle vehicle2 = new Sedan("sedan", 7000, 8, 16);
		Vehicle vehicle3 = new Truck("truck",9000, 5, 17);
		
		Vehicle[] vehicles= {vehicle,vehicle2,vehicle3};
		for(int i=0;i<vehicles.length;i++)
			vehicles[i].print();
	}
}
class Suv extends Vehicle{
	public Suv(String kind, int feePerTime, int intTime, int outTime) {
		super(kind, feePerTime, intTime, outTime);
	}
	@Override
	int calcTime() {
		return outTime-intTime;
	}}
class Sedan extends Vehicle{
	public Sedan(String kind, int feePerTime, int intTime, int outTime) {
		super(kind, feePerTime, intTime, outTime);
	}
	@Override
	int calcTime() {
		return outTime-intTime;
	}}
class Truck extends Vehicle{
	public Truck(String kind, int feePerTime, int intTime, int outTime) {
		super(kind, feePerTime, intTime, outTime);
	}

	@Override
	int calcTime() {
		return outTime-intTime;
	}}