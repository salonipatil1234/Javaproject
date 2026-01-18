package inter;

public class Childclass  implements Inter1,inter2{

	@Override
	public void mul(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Mul "+(a*b));

	}

	@Override
	public void div(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("div "+(a/b));

	}

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("add"+(a+b));

	}

	@Override
	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("sub "+(a-b));

	}

}











