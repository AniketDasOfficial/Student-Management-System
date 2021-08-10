import java.util.Date;

public class Examination {

    int rollNo;
    String dept, examDate, examTime;

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setExamDate(String examDate) {
        this.examDate = examDate;
    }

    public void setExamTime(String examTime) {
        this.examTime = examTime;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getDept() {
        return dept;
    }

    public String getExamDate() {
        return examDate;
    }

    public String getExamTime() {
        return examTime;
    }
}
