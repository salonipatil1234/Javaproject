package test;

public class WebsiteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		WebElement username= d.findElement(By.id("username"));
		username.sendkeys("patilsaloni0610@gmail.com");
		
		//syntax of generating xpath:-
		//tagname[@attribute='attribute values']
		//input[@id = 'email']
		
	}

}
