/*
 Date Jan 26, 2022 
 Author: Fallon H
 Comments: This is a comment
 */
package studentlist;

/**
 *
 * @author Ronak
 */
public class Student {
    
    private String studentId;
    private String studentName;
    private String address;
    
    public Student(String studentId,String studentName){
        this.studentId = studentId;
        this.studentName=studentName;                
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
    
    
}
