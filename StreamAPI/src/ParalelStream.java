import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParalelStream
{
	public static void main(String[] args)
	{
		int size=10_000;
		List<Integer> list= new ArrayList<>(size);
		
		Random r=new Random();
		
		// Goal is to multiply every number by 2 and find the sum of it 
		
		for(int i=1;i<size;i++) list.add(r.nextInt(100));
		
		long startTime=System.currentTimeMillis();
		int sum1=list.stream()
				.map(i -> i*2)
				.mapToInt(i->i)
				.sum();
		long endTime=System.currentTimeMillis();
		System.out.println("Time taken by normal stream is : "+(endTime-startTime));
		
		long startTime1=System.currentTimeMillis();
		int sum2=list.parallelStream()
				.map(i -> i*2)
				.mapToInt(i->i)
				.sum();
		long endTime1=System.currentTimeMillis();
		System.out.println("Time taken by parelel stream is : "+(endTime1-startTime1));
		
		System.out.println(sum1+"  "+sum2);
	}
}
