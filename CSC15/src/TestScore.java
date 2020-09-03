import java.util.*;
public class TestScore {
public static void main(String [] args)
{
	Scanner console = new Scanner(System.in);
	introduction();
	int applicant1 = firstApplicant (console);
	int applicant2 = secondApplicant(console);
	double scoreOne = satScore(console);
	double scoreTwo = actScore(console);
	scoreComparison (scoreOne, scoreTwo);
}
public static void introduction()
{
	System.out.println("This program compares two applicants to");
	System.out.println("determine which one seems like the stronger");
	System.out.println("applicant.  For each candidate I will need");
	System.out.println("either SAT or ACT scores plus a weighted GPA.");
	System.out.println();
}
public static int firstApplicant (Scanner console) 
{
	System.out.println("Information for the first applicant:");
	System.out.print("do you have 1) SAT sores or 2) ACT scores? ");
	int testType = console.nextInt();
	return testType;
}
public static int secondApplicant (Scanner console)
{
	System.out.println("Information for the second applicant:");
	System.out.print("do you have 1) SAT sores or 2) ACT scores? ");
	int testType = console.nextInt();
	return testType;
}
public static double satScore (Scanner console)
{
	
	
	System.out.print("SAT math? ");
	double math = console.nextDouble();
	System.out.print("SAT verbal? ");
	double verbal = console.nextDouble();
	System.out.print("actual GPA? ");
	double gpa = console.nextDouble();
	System.out.print("max GPA? ");
	double maxGPA = console.nextDouble();
	double score = (2 * verbal + math) / 24;
	double gpaScore = (gpa/maxGPA) * 100;
	double totalScore = score + gpaScore;
	return totalScore;
	
}
public static double actScore(Scanner console)
{
	System.out.print("ACT English? ");
	int english = console.nextInt();
	System.out.print("ACT math? ");
	int math = console.nextInt();
	System.out.print("ACT reading? ");
	int reading = console.nextInt();
	System.out.print("ACT science? ");
	int science = console.nextInt();
	System.out.print("actual GPA? ");
	double gpa = console.nextDouble();
	System.out.print("max GPA? ");
	double maxGPA = console.nextDouble();
	double score2 = (2 * reading + english + math + science) / 1.8;
	double gpaScore2 = (gpa/maxGPA) * 100;
	double totalScore2 = gpaScore2 + score2;
	return totalScore2;
}
public static void scoreComparison(double scoreOne, double scoreTwo)
{
	System.out.println("First applicant overall score = " + scoreOne);
	System.out.println("Second applicant overall score = " + scoreTwo);
	if (scoreOne > scoreTwo)
	{
		System.out.println("The first applicant seems to be better.");
	}
	else if (scoreOne == scoreTwo)
	{
		System.out.println("The tow applicants seem equal.");
	}
		else 
		{
			System.out.println("The second applicant seems to be better.");
		}
	}

 
}
