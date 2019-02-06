import com.zubiri.school.*;
import java.util.Scanner;
/**
 * 
 */

/**
 * @author ik013043z1
 *
 */
public class StaticMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the age to create a person");
		
		if(Person.isAdult(sc.nextInt())) {
			
			Person person = new Person();
			
			System.out.println("The value of the counter is "+ person.getCounter());
		}
		
		else {
			
			System.out.println("You are not allowed to create a person");
			
		}
		
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the age to create a person");
		
		if(Person.isAdult(sc.nextInt())) {
			
			Person person = new Person();
			
			
		}
		
		else {
			
			System.out.println("You are not allowed to create a person");
			
		}
		
		System.out.println("The value of the counter is "+ Person.getCounter());
	
		
	}

}
