package Day10Java;
import java.util.*;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		
        ArrayList<Person>person=new ArrayList<Person>();
        
        person.add(new Person("Dipak","Patil","ram@123","8329391987","Airoli","Mumbai","Maharastra","444709"));
        person.add(new Person("Dhanraj","Mankar","dhanraj@123","832937","rajkhed","Amravati","Maharastra","878909"));
        person.add(new Person("Vinay","Mane","vinay@123","832930907","Hadpsar","Pune","Maharastra","234567"));
        person.add(new Person("Aditya","sharma","ars@123","832900987","sector2","Agra","UP","111709"));


        
        System.out.println("pls Enter the name of person whose details you want to delete");
        String temp=sc.nextLine();
        ListIterator<Person>iterate = person.listIterator();
        int n=0,n1=0;
        while(iterate.hasNext())
        {
        	n++;
        	Person p=iterate.next();
        	if(p.getFirstName().equalsIgnoreCase(temp))
        	{
        		n1=n-1;
            }
            
        }
        
        person.remove(n1);
        System.out.print("Deletion is done sucessfully");
        System.out.print(person);
       
	}
}    


