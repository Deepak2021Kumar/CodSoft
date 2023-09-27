import java.lang.*;
import java.util.Scanner;

public class StudentGradeCalculator  {
    public static void main(String args[])
    {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = s.nextInt();
        float TotalMarks = 0;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + ": ");
            float marks = s.nextFloat();

            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks. Marks should be between 0 and 100.");
                return ;
            }

            TotalMarks = TotalMarks + marks;
        }  
        
        System.out.println("Total marks obtained are: "+TotalMarks);
        float AveragePercentage=(float) TotalMarks / (numSubjects*100)*100;
        System.out.println("Total Average Percentage obtained is : "+AveragePercentage+"%");
        
        if (AveragePercentage<=100 & AveragePercentage>=90)
        System.out.println("Grade is : O (O means Outstanding) ");
        else if (AveragePercentage<=89 & AveragePercentage>=80)
        System.out.println("Grade is : E (E means Excellent) ");
        else if (AveragePercentage<=79 & AveragePercentage>=70)
        System.out.println("Grade is : A (A means Very Good) ");
        else if (AveragePercentage<=69 & AveragePercentage>=60)
        System.out.println("Grade is : B (B means Good) ");
        else if (AveragePercentage<=59 & AveragePercentage>=50)
        System.out.println("Grade is : C (C means Fair) ");
        else if (AveragePercentage<=49 & AveragePercentage>=40)
        System.out.println("Grade is : D (D means  Below Average) ");
        else if (AveragePercentage<40)
        System.out.println("Grade is : F (F means Failed) ");
        else 
        System.out.println("Result data is incomplete");
    }
}

