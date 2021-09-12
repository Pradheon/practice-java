// Fig. 7.18: GradeBook.java
// Grade book using a two-dimensional array to store grades.

public class GradeBookT {
  private String courseName;
  private int grades[][];

  private GradeBookT(String name, int gradesArray[][]) {
    courseName = name;
    grades = gradesArray;
  }

  private void setCourseName(String name) {
    courseName = name;
  }

  public String getCourseName() {
    return courseName;
  }

  public void displayMessage() {
    System.out.printf("Welcome to grade book for %s!", getCourseName());
  }

  public void processGrades() {
    outputGrades();

    System.out.printf("%s %d%s %d",
      "\n\nLowest grade in the grade book is", getMinimum(),
      "\nHighest grade in the grade book is", getMaximum());

      outputBarChart();
  }

  private int getMinimum() {
    int lowGrade = grades[0][0];

    for (int studentGrades[] : grades) {
      for (int grade : studentGrades) {
        if (grade < lowGrade) {
          lowGrade = grade;
        }
      }
    }

    return lowGrade;
  }

  private int getMaximum() {
    int highGrade = grades[0][0];

    for (int studentGrades[] : grades) {
      for (int grade : studentGrades) {
        if (grade > highGrade) {
          highGrade = grade;
        }
      }
    }

    return highGrade;
  }

  private double getAverage(int setOfGrades[]) {
    int total = 0;

    for (int grade : setOfGrades) {
      total += grade;
    }

    return (double) total / setOfGrades.length;
  }

  private void outputBarChart() {
    System.out.println("\n\nOverall grade distribution:");

    int frequency[] = new int [11];

    for (int studentGrades[] : grades) {
      for (int grade : studentGrades) {
        ++frequency[grade / 10];
      }
    }

    for (int count = 0; count < frequency.length; count++) {
      if (count == 10) {
        System.out.printf("%5d: ", 100);
      } else {
        System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);
      }

      for (int stars = 0; stars < frequency[count]; stars++) {
        System.out.print("*");
      }

      System.out.println();
    }
  }

  private void outputGrades() {
    System.out.println("\n\nThe grades are:");
    System.out.print("            ");

    for (int test = 0; test < grades[0].length; test++) {
      System.out.printf("Test %d  ", test + 1);
    }

    System.out.println("Average");

    for (int student = 0; student < grades.length; student++) {
      System.out.printf("\nStudent %2d", student + 1);
      for (int test : grades[student]) {
        System.out.printf("%8d", test);
      }

      double average = getAverage(grades[student]);
      System.out.printf("%9.2f", average);
    }
  }

  public static void main(String[] args) {
    int gradesArray[][] = {{87, 96, 70}, {68, 87, 90}, {94, 100, 90}, {100, 81, 82},
      {83, 65, 85}, {78, 87, 65}, {85, 75, 83}, {91, 94, 100}, {76, 72, 84},
      {87, 93, 73}};

    GradeBookT myGradeBookT = new GradeBookT("\nCS110 Introduction to Java Programming", gradesArray);
    //System.out.printf("Welcome to the grade book for %n%s%n%n", myGradeBookT.getCourseName());
    myGradeBookT.displayMessage();
    myGradeBookT.processGrades();
  }
}
