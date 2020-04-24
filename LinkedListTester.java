import java.util.LinkedList;

public class LinkedListTester 
{
	public static void main(String[] args)
	{
		LinkedList<String> cars = new LinkedList<String>();
		cars.addFirst("Mercedes G-Wagon");
		cars.addFirst("BMW i8");
		cars.addFirst("Dodge Ram");
		cars.addFirst("Ford Raptor");
		cars.addFirst("Toyota Camry");
		System.out.println("Most Popular cars per company: "+ cars);
		
		System.out.println("Is the toyota camry the most popluar car for its Company?: ");
		System.out.println(cars.contains("Toyota Camry"));
		System.out.println("Is the Ford Focus the most popluar car for its Company?: ");
		System.out.println(cars.contains("Ford Focus"));
		System.out.println("Is the Dodge Ram the most popluar car for its Company?: ");
		System.out.println(cars.contains("Dodge Ram"));
		
	}
	


}
