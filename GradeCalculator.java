public class GradeCalculator {
    public String calculateGrade(double studentScore, double totalScore) {
        double percentage = (studentScore / totalScore) * 100;

        String grade=" ";

        if (percentage >= 93) {
            grade = "A";
        } else if (percentage >= 90) {
            grade = "A";
        } else if (percentage >= 87) {
            grade = "B+";
        } else if (percentage >= 83) {
            grade = "B";
        } else if (percentage >= 80) {
            grade = "B-";
        } else if (percentage >= 77) {
            grade = "C+";
        } else if (percentage >= 73) {
            grade = "C";
        } else if (percentage >= 70) {
            grade = "C-";
        } else if (percentage >= 67) {
            grade = "D+";
        } else if (percentage >= 63) {
            grade = "D";
        } else if (percentage >= 60) {
            grade = "D-";
        } else {
            grade = "F";
        }

        return grade;
    }
}