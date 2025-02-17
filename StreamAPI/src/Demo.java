import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo
{
	public static void main(String[] args)
	{
		List<Integer> list =Arrays.asList(1,2,3,4,5,6,7,8);
		
		list.stream().forEach(n -> System.out.println(n));
		 
		// Method 1
		list.stream().filter(n -> n%2==0).forEach(System.out::println);
		
		// Method 2
		List<Integer> evenNumbers = list.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
		System.out.println(evenNumbers); 

		// String filtration
		List<String> names = Arrays.asList("John", "Alex", "Steve", "Mark");

	    // Using Stream API
	    List<String> result = names.stream()
	                               .filter(name -> name.startsWith("A"))
	                               .collect(Collectors.toList());

	    System.out.println(result); 
	        
	    long count = list.stream().filter(n -> n > 2).count();
	    System.out.println(count);
	    
	    // Replacing the value at its place
	    list.replaceAll(n -> n % 2 == 0 ? n * 2 : n);

        // Calculate the sum of the doubled even numbers
        int sum = list.stream()
                      .filter(n -> n % 2 == 0)
                      .mapToInt(Integer::intValue)
                      .sum();

        // Output the results
        System.out.println("Updated List: " + list);
        System.out.println("Sum of doubled even numbers: " + sum);
        
        
        int sum1 = list.stream()
                .filter(n -> n % 2 == 0)   // Filter even numbers
                .reduce(0, (a, b) -> a + b); // Sum them up
        System.out.println("Sum of doubled even numbers (using reduce): " + sum1);
	}
}
