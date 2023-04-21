package Day10Java;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        ArrayList<AddressBook>addressBook=new ArrayList<AddressBook>();
        
        addressBook.add(new AddressBook("Ram","Patil","ram@123","8329391987","Airoli","Mumbai","Maharastra",444709));
        
        System.out.println("The data of person is added in Address book class object");
	}

}
