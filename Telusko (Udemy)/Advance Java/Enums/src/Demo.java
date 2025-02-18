enum Status
{
	// Enum is a class but we can't extend it else otherwise everything we can do here
	// Named Constants
	Running,Failed,Pending,Success;
}
public class Demo
{
	public static void main(String[] args)
	{
		int i=5;
		Status s=Status.Running;
		System.out.println(s);  // Output : Running
		System.out.println(s.ordinal());  // Prints the index from 0 at which Running is present ( 0 here )
		
		// To print all the values of 
        Status[] ss=Status.values();
		System.out.println(ss[2]);
		
		// Inside Loop
		for(Status s1:ss) System.out.println(s1+" : "+s1.ordinal());
		
		// Conditional Statement
		
		Status s2=Status.Pending;
		if(s2==Status.Running) System.out.println("All Good");
		else if (s2==Status.Failed) System.out.println("Try Again");
		else if (s2==Status.Pending) System.out.println("Please Wait");
		else System.out.println("Done");
		
		// Switch Statement
		
		Status s3=Status.Pending;
		switch (s3) {
        case Running:
            System.out.println("All Good");
            break;
        case Failed:
            System.out.println("Try Again");
            break;
        case Pending:
            System.out.println("Please Wait");
            break;
        default:
            System.out.println("Done");
		}
		
		// Enum in Java extends by default the enum class which can be seen by this 
		System.out.println(s3.getClass().getSuperclass());
	}
}
