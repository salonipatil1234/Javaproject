package abs;

public class Childclass extends Abstraction{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		setEmpid(123);
		setEmpname("ABC");
		setEmpsal(1234.56);
		
		System.out.println("EMP ID:- "   +getEmpid());
		System.out.println("EMP NAME:- " +getEmpname());
		System.out.println("EMP SALARY:- " +getEmpsal());
		
	}

}
