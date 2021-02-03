package interfaces;

import java.lang.*;
import entity.*;

public interface IAdminRepo
{
	Admin getAdmin(String userID, String password);
	//public String[][] getAllStudent();
	/*void insertTeacher(Teacher t);
	void updateTeacher(Teacher t);
	void deleteTeacher(String t_userID);*/
}