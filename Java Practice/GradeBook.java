// Fig. 7.18: GradeBook.java
// GradeBook class using a two-dimensional array to store grades.

public class GradeBook {
  private String courseName; // name of course this grade book represents
  private int[][] grades; // two-dimensional array of student grades

  // two-arguement constructor inilializes courseName and grades array
  public GradeBook(String courseName, int[][] grades) {
    this.courseName = courseName;
    this.grades = grades;
  }

  // method to set course name
  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }

  // method to retreive the course name
  public String getCourseName() {
    return courseName;
  }

  // perform various operations on the data
  public void processGrades() {
    // outputs grades array
    outputGrades();

    // call methods getminimum and getMaximum
    System.out.printf(%n%s %d%n%s %d%n%n,
      "Lowest grade in the grade book is", getMinimum(),
      "Highest grade in grade book is", getMaximum());

    // output grade distribution chart of all grades on all tests
    outputBarChart();
  }

  // find minimum grade
  public int getMinimum() {
    // assume first element of grades array is smallest
    int lowGrade = grades[0][0];

    // loop through rows of grades array
    for (int[] studentGrades : grades) {
      // loop through columns of current row
      for (int grade : studentGrades) {
        // if grade less than lowGrade, assigne it to lowGrade
        if (grade < lowGrade) {
          lowGrade = grade;
        }
      }
    }

    return lowGrade;
  }

  // find maximum grade
  public int getMaximum() {
    // aassume first element of grades array is largest
    int highGrade = grades[0][0];

    // loop through rows of grades array
    for (int[] studentGrades : grades) {
      // loop through columns of current row
      for (int grade : studentGrades) {
        // if grade greater than highGrade, assign it to highGrade
        if (grade > highGrade) {
          highGrade = grade;
        }
      }
    }

    return highGrade;
  }

}
