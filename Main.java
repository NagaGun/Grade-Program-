// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the total possible score:");
    double totalScore = scanner.nextDouble();

    System.out.println("Enter the student's score:");
    double studentScore = scanner.nextDouble();

    GradeCalculator calculator = new GradeCalculator();
    String grade = calculator.calculateGrade(studentScore, totalScore);

    System.out.println("Student's grade: " + grade);

    scanner.close();
  
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}