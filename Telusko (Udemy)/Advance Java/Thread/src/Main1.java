class A1 implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
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

class B1 implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
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
public class Main1 {
	public static void main(String[] args) {
		A1 obj1=new A1();
		B1 obj2=new B1();
		
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		
		t1.start();
		t2.start();
	}
}
