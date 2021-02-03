package interfaces;

import java.lang.*;
import entity.*;

public interface ITeacherRepo
{
	Teacher getTeacher(String userID, String password);
	void insertTeacher(Teacher t);
	void updateTeacher(Teacher t);
	void deleteTeacher(String userID);
}