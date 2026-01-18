package encapsulation1;

public class encapsu {
	
	public int val ;
	public void setValue(int val) {
		this.val=val;
		
}
	
	public int getdata()
	{
		return val *val;
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
encapsu e = new encapsu();
e.setValue(4);
  System.out.println(" Sqauare :- " +e.getdata());



	}

}
// no java bean rules follow in encapsulation -- private , get set methods 


