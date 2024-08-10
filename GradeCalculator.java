import java.util.Scanner;
class GradeCalculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Subjects : ");
        int sub = sc.nextInt();
        int [] mark = new int[sub];
        for(int i=0;i<sub;i++)
        {
            System.out.print("Enter Marks of Subject "+(i+1)+" : ");
            mark[i] = sc.nextInt();
        }
        int total = 0;
        for(int marks:mark)
        {
            total=total+marks;
        }
        double average = (double) total/sub;
        char grade ;
        if(average>=90)
        {
            grade = 'A';
        }
        else if(average>=80)
        {
            grade = 'B';
        }
        else if(average>=70)
        {
            grade = 'C';
        }
        else if(average>=60)
        {
            grade = 'D';
        }
        else
        {
            grade = 'E';
        }
        System.out.println("Total Marks : "+total);
        System.out.println("Average Percentage : "+average+"%");
        System.out.println("Grade : "+grade);
    }
}