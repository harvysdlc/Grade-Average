import java.util.*;

public class GradeAverage{
    static Scanner scan = new Scanner(System.in);
    static String studentName;
    static ArrayList <String> studentSubjects = new ArrayList <String> ();
    static int numSubs;
    static int userGrades[] = new int[10];
    static double gradesAverage = 0;

    public static void main(String[] args) {

        System.out.print("\nStudent Name: ");
        studentName = scan.next();
        System.out.print("Number of Subjects: ");
        numSubs = scan.nextInt();
        System.out.println("");

        for (int i = 0; i < numSubs; i++){
            System.out.print("Name of Subject: ");
            studentSubjects.add(scan.next()); 
        }
        
        System.out.println("\nYou can now add your grades\n");
        System.out.println(studentSubjects);
        System.out.println("Enter your grades based on subject order above\n");

        for (int i = 0; i < numSubs; i++){
            System.out.print("Enter Grade: ");
            userGrades[i] = scan.nextInt();
        }

        for (double average : userGrades){
            gradesAverage = gradesAverage + average;
        }

        double finalAverage = gradesAverage/numSubs;
        System.out.println("\nAverage: " + finalAverage);


        if (finalAverage > 100) System.out.println("Remarks: Invalid Grade");
        else if (finalAverage >= 98 && finalAverage <= 100) System.out.println("Remarks: With Highest Honors");
        else if (finalAverage >= 95 && finalAverage < 98) System.out.println("Remarks: With High Honors");
        else if (finalAverage >= 90 && finalAverage < 95) System.out.println("Remarks: With Honors");
        else if (finalAverage >= 75 && finalAverage < 90) System.out.println("Remarks: Passed");
        else System.out.println("Remarks: Failed");
    }
}