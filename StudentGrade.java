import java.util.Scanner;

public class StudentGrade {
    public static void main(String args[])
    {
        int marks[] = new int[6];
        float total=0, avg;
        Scanner sc = new Scanner(System.in);
		
        System.out.println("----------STUDENT GRADE CALCULATOR----------");
        
        for(int i=0; i<6; i++) { 
           System.out.print("Enter Marks of Subject"+" "+(i+1)+":");
           marks[i] = sc.nextInt();
           total = total + marks[i];
        }
        sc.close();
        //Calculating average here
        avg = total/6;
        System.out.println("The total marks obtained is: "+ total);
        System.out.println("The average percentage obtained is: "+avg+"%");
        System.out.print("The student Grade is: ");
        if(avg>=80)
        {
            System.out.print("A");
        }
        else if(avg>=70 && avg<80)
        {
           System.out.print("B");
        } 
        else if(avg>=60 && avg<70)
        {
            System.out.print("C");
        }
        else if(avg>=50 && avg<=60)
        {
            System.out.print("D");
        }
        else{
            System.out.print("F");
        }
        
    }
}


