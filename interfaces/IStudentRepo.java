package interfaces;

import java.lang.*;

import entity.*;

public interface IStudentRepo
{
	public void insertStudent(Student s);
	public void deleteStudent(String userID);
	public void updateStudent(Student s);
	public Student searchStudent(String userID);
	//public String[][] getAllStudent();
}