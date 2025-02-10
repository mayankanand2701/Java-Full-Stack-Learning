
public class Client
{
	public static void main(String[] args)
	{
		// Traditional Way to create constructor in Java
		
		Employee e=new Employee();
		e.setEid(123);
		e.setEname("Mayank Anand");
		e.setEsalary(123456);

		System.out.println(e);
		
		// Inversion of Control
		// Step 1 : Add jar files for Spring Core
		// Step 2 : Configure Java object in Jar File
		// Step 3 : Use Spring IOC Container ( example :  Bean Factory or Application Context
		//          to get the objects constructed by them.
		
		// As i have not got the JAR File so i have not download and put the jar file 
		// But the code after putting the jar file and all goes like this
		// Also add the xml file to the code then
		
		// ApplicationContext context=new ClassPathXmlApplicationContext("employee.xml");
		// Employee e1=(Employee)Context.getBean("emp1");
		// Employee e2=Context.getBean("emp2");
		
		// System.out.println("----Spring IOC in Action------------");
		
		// System.out.println(e1);
		// System.out.println(e2);
	}
}
