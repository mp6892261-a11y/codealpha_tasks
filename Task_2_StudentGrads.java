import java.util.ArrayList;
import java.util.Scanner;

public class Task_2_StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();
        
        System.out.println("=== CodeAlpha Student Grade Tracker ===");
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; i++) {
            System.out.print("Enter grade for student " + i + ": ");
            int grade = sc.nextInt();
            grades.add(grade);
        }
        
        int sum = 0, highest = grades.get(0), lowest = grades.get(0);
        for(int grade : grades) {
            sum += grade;
            if(grade > highest) highest = grade;
            if(grade < lowest) lowest = grade;
        }
        
        double average = (double)sum / n;
        
        System.out.println("\n=== RESULTS ===");
        System.out.println("Total Students: " + n);
        System.out.println("Average Grade: " + average);
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);
        System.out.println("\nSubmitted by: Mahima Patel - CodeAlpha Java Intern");
        sc.close();
    }
}
