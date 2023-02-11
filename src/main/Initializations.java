package main;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class Student {

    private long studentId;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private String gender;
    private Date birthdate;
    private Date admissionDate;
    private long rollNumber;
    private String curriculumName;

    public Student(long studentId,
            String userName,
            String password,
            String studentName,
            String fatherName,
            String email,
            String phone,
            String address,
            String gender,
            Date birthdate,
            Date admissionDate,
            long rollNumber,
            String curriculumName) {
        this.studentId = studentId;
        this.userName = userName;
        this.password = password;
        this.lastName = fatherName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.gender = gender;
        this.birthdate = birthdate;
        this.admissionDate = admissionDate;
        this.rollNumber = rollNumber;
        this.curriculumName = curriculumName;
    }

    public long getStudentId() {
        return this.studentId;
    }

    public void setStudentId(long studentId) {
    	this.studentId=studentId;
    }

    public String getUserName() {
    	 return this.userName;
    }

    public void setUserName(String userName) {
    	this.userName=userName;
    }

    public String getPassword() {
    	return this.password;
    }

    public void setPassword(String password) {
    	this.password=password;
    }

    public String getFirstName() {
    	return this.firstName;
    }

    public void setFirstName(String firstName) {
    	this.firstName=firstName;
    }

    public String getLastName() {
    	return this.lastName;
    }

    public void setLastName(String lastName) {
    	this.lastName=lastName;
    }

    public String getEmail() {
    	return this.email;
    }

    public void setEmail(String email) {
    	this.email=email;
    }

    public String getPhone() {
    	return this.phone;
    }

    public void setPhone(String phone) {
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthdate() {
    	return this.birthdate;
    }

    public void setBirthdate(Date birthdate) {
    	this.birthdate = birthdate;
    }

    public Date getAdmissionDate() {
        return this.admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    public long getRollNumber() {
    	return this.rollNumber;
    }

    public void setRollNumber(long rollNumber) {
    	this.rollNumber = rollNumber;
    	
    }

    public String getCurriculumName() {
        return this.curriculumName;
    }

    public void setCurriculumName(String curriculumName) {
    	this.curriculumName = curriculumName;
    }

    public void editStudent(List<Student> universityStudents, Student student) {
    	student.setStudentId(this.studentId);//replaced with the same ID
    	universityStudents.set((universityStudents.indexOf(this)), student);
       
    }

    public String toString() {
        return "(Student: \n" +
                "studentId = " + this.studentId + "\n" +
                "userName = " + this.userName + "\n" +
                "password = " + this.password + "\n" +
                "firstName = " + this.firstName + "\n" +
                "lastName = " + this.lastName + "\n" +
                "email = " + this.email + "\n" +
                "phone = " + this.phone + "\n" +
                "address = " + this.address + "\n" +
                "gender = " + this.gender + "\n" +
                "birthdate = " + this.birthdate + "\n" +
                "admissionDate = " + this.admissionDate + "\n" +
                "rollNumber = " + this.rollNumber + "\n" +
                "curriculumName = " + this.curriculumName + ")";
    }

}

class University {

    // property
	ArrayList<Student> students= new ArrayList<>();

    public void addStudent(Student s) {
    	students.add(s);
    }

    public Student getStudent(long studentId) {
    	for (Student s: this.students) {
			if(s.getStudentId()==studentId) {
				return s;
			}
		}
		return null;
      
    }

    public List<Student> searchStudent(String userNamePrefix) {
       // return all students that have usernames beginning with the prefix 
    	List<Student> result= new ArrayList<>();
		for (Student s: this.students) {
			if(s.getUserName().startsWith(userNamePrefix)) {
				result.add(s);
			}
		}
		return result;

	}
    

    public boolean deleteStudent(long studentId) {
       // return if a successful deletion happened
    	if (students.contains(getStudent(studentId))) {
    		this.students.remove(getStudent(studentId));
    		return true;
    	}
    	return false;
    }

}

public class Initializations {
    public static void main(String[] args) throws ParseException {
    	DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
		Date d1 = df.parse("01-01-1980");
		Date d2 = df.parse("02-01-2023");

		University university =new University();
    	Student kamil= new Student(123, "kamil123", "654321",
    			"kamil","Amin" , "kamil@gmail.com", "111-111-1111"
    			, "no where", "Male", d1, d2, 0, "obdjava");
    	university.addStudent(kamil);
    	d1 = df.parse("01-01-1988");
    	d2 = df.parse("02-01-2023");
    	Student sami= new Student(124, "sami123", "654321",
    			"sami","Amin" , "sami@gmail.com", "111-111-1111"
    			, "no where", "Male", d1, d2, 0, "obdjava");
    	university.addStudent(sami);
    	d1 = df.parse("01-01-1990");
    	d2 = df.parse("02-01-2023");
    	Student samil= new Student(125, "samil123", "654321",
    			"samil","Amin" , "samil@gmail.com", "111-111-1111"
    			, "no where", "Male", d1, d2, 0, "obdjava");
    	university.addStudent(samil);
        // create instance of university and populate it with students.
        

        System.out.println("\nUniversity ------ \n" + university.students);
        System.out.println("Getting student------\n" + university.getStudent(123));
        System.out.println("Deleting student------\n" + university.deleteStudent(123));
        System.out.println("Seaching student------\n" + university.searchStudent("sami"));

        System.out.println("\nUniversity ------ \n" + university.students);

    }
}

