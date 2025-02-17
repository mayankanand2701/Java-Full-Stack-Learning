import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


// to implement comparable directly inside Student class we need to implement it 
class Student implements Comparable<Student>
{
	int age;
	String name;
	
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student  that) {
		if(this.age>that.age)return 1;
		else return -1;
	}
}
public class Main1
{
	public static void main(String[] args)
	{
		Comparator<Student> comp=new Comparator<Student>()
		{
			@Override
			public int compare(Student o1, Student o2)
			{
				if(o1.age>o2.age)return 1;
				else return -1;
			}
					
		};
		
		List<Student> list=new ArrayList<>();
		list.add(new Student(18,"Mayank"));
		list.add(new Student(23,"Aman"));
		list.add(new Student(20,"Raj"));
		list.add(new Student(14,"Shibham"));

		System.out.println("List of all the students are : ");
		for(Student s:list) System.out.println(s);
		
		// To sort on the basis of age
		// Using comparator
		// Collections.sort(list,comp);
		// System.out.println("List of studnets after sorting on the basisi of age are : ");
		// for(Student s:list) System.out.println(s);
		
		// Using Comparable
		Collections.sort(list);
		System.out.println("List of studnets after sorting on the basisi of age are : ");
		for(Student s:list) System.out.println(s);
	}
}
