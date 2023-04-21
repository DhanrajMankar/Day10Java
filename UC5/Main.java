package Day10Java;
import java.util.*;

import Day9Java.AddressBook;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		
        ArrayList<Person>person=new ArrayList<Person>();
        
        System.out.println("The data of person is added in Address book class object");
        System.out.println("Enter the no of persons for which you want to store the data");
        int n =sc.nextInt();
        
        String attribute[]= {"FirstName","LastName","Email","MobNo","Address","City","State","zipcode"};
       
        for(int i=0;i<n;i++)
        {
        	ArrayList<String>strList=new ArrayList<String>();
        	for(int j=0;j<attribute.length;j++)
        	{
        		 System.out.println("Enter the "+attribute[j]);
        		 String temp=sc.nextLine();
        		 strList.add(temp);
        	}
        	person.add(new Person(strList));
        }
        System.out.println("Done");
        
        ListIterator<Person>iterate = person.listIterator();
        while(iterate.hasNext())
        {
        	Person p=iterate.next();
        	System.out.print(p);
        }
	}

}
