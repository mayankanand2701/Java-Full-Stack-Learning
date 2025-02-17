class A extends Thread
{
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			System.out.println("Hi");
			try
			{
				Thread.sleep(10);
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
		    }
		}
	}
}

class B extends Thread
{
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			System.out.println("Hello");
			try
			{
				Thread.sleep(10);
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
		    }
		}
	}
}
public class Main {
	public static void main(String[] args) {
		A obj1=new A();
		B obj2=new B();
		
		// to get the priority
		// 1 is Lowest
		// 10 is Highest 
		// By Default the priority is 5
		System.out.println(obj1.getPriority());
		System.out.println(obj2.getPriority());
		
		obj2.setPriority(Thread.MAX_PRIORITY);
		
		obj1.start();
		obj2.start();
	}
}
