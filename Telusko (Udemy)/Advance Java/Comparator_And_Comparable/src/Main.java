import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main
{
	public static void main(String[] args)
	{
		// To sort on the basis of last digit
		Comparator<Integer> comp=new Comparator<Integer>()
		{
			@Override
			public int compare(Integer o1, Integer o2)
			{
				if(o1%10>o2%10)return 1;
				else return -1;
			}
			
		};
		List<Integer> list=new ArrayList<>();
		list.add(34);
		list.add(11);
		list.add(84);
		list.add(29);
		list.add(56);
		list.add(43);
		
		// To sort the list normally
		Collections.sort(list);
		System.out.println(list);
		
		// 1
		// We want to sort the above list on the basis of last digit
		Collections.sort(list,comp);
		System.out.println("Sorted list on the basis of last digit : ");
		System.out.println(list);
	}
}
