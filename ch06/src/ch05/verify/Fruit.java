package ch05.ch08.verify;

public class Fruit extends Object{
	//�ʵ�
private String kind; private int price;   
private Brix brix; private int sale;//�Ǹż���
//������3��¥�� 
public Fruit(String kind, int price, Brix brix) {
	this.kind = kind;
	this.price = price;
	this.brix = brix;
}
//�޼ҵ�
public String toString() {
	return "Fruit [kind=" + kind + ", price=" 
            + price + ", brix=" + brix 
            + ", sale=" + sale +",total="+price*sale+"]";
}
//�����Ӽ� ���
public String getKind() {return kind;}
public int getPrice() {	return price;}
public Brix getBrix() {	return brix;}
public int getSale() {	return sale;}
public void setSale(int sale) {	this.sale = sale;}


   
   
}