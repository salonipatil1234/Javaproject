package abs;

public abstract class Abstraction {
// Abstract class will always be the parent  class 
// Abstract class will never have java main method 
//Only in abstract class we can define abstract methods 
//Abstract class is denoted by its keyword abstract 
	
	
private int empid;
private String empname;
private double empsal;
public int getEmpid() {
	return empid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public double getEmpsal() {
	return empsal;
}
public void setEmpsal(double empsal) {
	this.empsal = empsal;
}
public void setEmpid(int empid) {
	this.empid = empid;
}

public abstract void display();
//public abstract void SignupformTest();
//public abstract void PaymentFormTest();


//concrete methods 
	//method which is defined in abstract class with abstract keyword
	//is called Concrete methods








}