import java.util.Scanner;

public class QuestionService
{
	Question[] questions=new Question[5];
	String userAnswer[]=new String[5];
	
	public QuestionService()
	{
		questions[0] = new Question(0, "Size of int in Java (in bytes)? ", "2", "4", "8", "16", "4");  
		questions[1] = new Question(1, "Size of double in Java (in bytes)? ", "2", "4", "8", "16", "8");  
		questions[2] = new Question(2, "Size of char in Java (in bytes)? ", "1", "2", "4", "8", "2");  
		questions[3] = new Question(3, "Size of boolean in Java (in bytes)? ", "1", "2", "4", "Depends", "Depends");  
		questions[4] = new Question(4, "Size of float in Java (in bytes)? ", "2", "4", "8", "16", "4");  
	}
	public void playQuiz()
	{
		int i=0;
		for(Question q : questions)
		{
			System.out.println("Question Number : "+(q.getId()+1));
			System.out.println(q.getQuestion());
			System.out.println();
			System.out.println("1.Option : "+q.getOpt1()+"     2.Option : "+q.getOpt2());
			System.out.println("3.Option : "+q.getOpt3()+"     4.Option : "+q.getOpt4());
			System.out.println();
			
			// Input form User
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the correct option : ");
			userAnswer[i++]=sc.next();
			
			System.out.println();
		}
	}
	public void printScore()
	{
		int score=0;
		for(int i=0;i<5;i++)
		{
			if(questions[i].getAnswer().equals(userAnswer[i].trim())) score++;
		}
		System.out.println("Congratulations! You Scored "+score+" out of 5");
	}

}
