import java.util.*; 
import java.util.stream.Stream; 

class CustomSorting { 

	// Driver code 
	public static void main(String[] args) 
	{ 

		// Creating a list of Integers 
		List<Integer> list = Arrays.asList(2, 4, 0, 1, 3, 7, 0, 5, 9, 0, 6, 8); 

		System.out.println("The sorted stream according "
						+ "to provided Comparator is : "); 

		// Displaying the list of Strings in 
		// reverse order after sorting 
		list.stream().sorted((a, b) -> (a == 0 || b == 0 ) ? a.compareTo(b) : b.compareTo(a)). 
						forEach(System.out::print);
                        
                       
                        
	} 
} 
