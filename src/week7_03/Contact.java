package week7_03;

public class Contact implements Comparable{
    private String studentName;
    private int studentId;
    private int courseId;
    private double score;

    public Contact(String myName, int myStudentId){
        studentName = myName;
        studentId = myStudentId;
        courseId = 0;
        score = 0;
    }

    public Contact(String myName,int myStudentId,int myCourseId,double myScore){
        studentName = myName;
        studentId = myStudentId;
        courseId = myCourseId;
        score = myScore;
    }

    /**Set*/
    public void setStudentName(String myName){
        studentName = myName;
    }
    public void setStudentId(int myStudentId){
        studentId = myStudentId;
    }
    public void setCourseId(int myCourseId){
        courseId = myCourseId;
    }
    public int setScore(double myScore){
        if(myScore<0)
            return 0;
        score = myScore;
        return 1;
    }

    /**get*/
    public String getStudentName(){
        return studentName;
    }
    public int getStudentId(){
        return studentId;
    }
    public int getCourseId(){
        return courseId;
    }
    public double getScore(){
        return score;
    }

    @Override
    public int compareTo(Object o) {
        return this.getStudentName().compareTo(((Contact)o).getStudentName());
    }

    @Override
    public String toString() {
        return "Contact{" +
                "studentName='" + studentName + '\'' +
                ", studentId=" + studentId +
                ", courseId=" + courseId +
                ", score=" + score +
                '}';
    }
}
