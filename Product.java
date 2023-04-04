public class Product{
int pcode;
String pname;
double price;
public Product(int pcode,String pname,double price){
this.pcode=pcode;
this.pname=pname;
this.price=price;
}
public static void main(String[]  args){
Product p1=new Product(101, "Product 1",20.5);
Product p2=new Product(102, "Product 2",15.2);
Product p3=new Product(103, "Product 3",25.8);
double lowestPrice=p1.price;
String lowestPName=p1.pname;
if(p2.price<lowestPrice){
lowestPrice=p3.price;
lowestPName=p3.pname;
}
System.out.println("product with thr lowest price is:" + lowestPName + " with the price" + lowestPrice);
}
}
