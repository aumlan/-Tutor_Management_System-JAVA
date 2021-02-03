package repository;

import java.lang.*;

import entity.*;
import java.util.ArrayList;
import interfaces.*;

public class TeacherRepo implements ITeacherRepo
{
	DatabaseConnection dbc;
	
	public TeacherRepo()
	{
		dbc = new DatabaseConnection();
	}
	public Teacher getTeacher(String userID, String password)
	{
		Teacher teacher = null;
		String query = "SELECT userID, Password, Status FROM login2 WHERE userID='"+userID+"' AND Password='"+password+"';";
		try
		{
			System.out.println(query);
			dbc.openConnection();
			dbc.result = dbc.st.executeQuery(query);
		
			while(dbc.result.next())
			{
				teacher = new Teacher();
				teacher.setT_UserID(dbc.result.getString("userID"));
				teacher.setT_Password(dbc.result.getString("Password"));
				teacher.setT_Status(dbc.result.getInt("status"));
			}
		}
        catch(Exception ex)
		{
			System.out.println("Exception : " +ex.getMessage());
        }
		dbc.closeConnection();
		return teacher;
	}
	public void insertTeacher(Teacher t)
	{
		System.out.println("Enter into Teacher DB");
		String query = "INSERT INTO teacher VALUES ('"+t.getT_UserID()+"','"+t.getT_Name()+"','"+t.getT_Email()+"','"+t.getT_Password()+"','"+t.getT_Edu_Status()+"','"+t.getT_Edu_Institution()+"','"+t.getT_Medium()+"','"+t.getT_Experience()+"','"+t.getT_Salary()+"','"+t.getT_Location()+"','"+t.getT_Contact()+"','"+t.getT_Gender()+"',null);";




		/*UserID='"+t.getT_UserID()+"', Name ='"+t.getT_Name()+"', Email = '"+t.getT_Email()+"', Password = '"+t.getT_Password()+"', EducationalStatus = '"+t.getT_Edu_Status()+"', EducationalInstitution = '"+t.getT_Edu_Institution()+"', Medium = '"+t.getT_Medium()+"', Experience = '"+t.getT_Experience()+"', Salary = '"+t.getT_Salary()+"', Location = '"+t.getT_Location()+"', ContactNumber = '"+t.getT_Contact()+"', Gender = '"+t.getT_Gender()+"';";*/
		try
		{
			dbc.openConnection();
			dbc.st.execute(query);
			dbc.closeConnection();
		}
		catch(Exception ex){System.out.println(ex.getMessage());}

		query = "INSERT INTO login2 VALUES ('"+t.getT_UserID()+"','"+t.getT_Password()+"','"+t.getT_Status()+"');";

		//query = "INSERT INTO login2 VALUES userID='"+t.getT_UserID()+"', Password = '"+t.getT_Password()+"',Status = '"+t.getT_Status()+"';";
		try
		{
			dbc.openConnection();
			dbc.st.execute(query);
			dbc.closeConnection();
		}
		catch(Exception ex){System.out.println(ex.getMessage());}

		
	}
	public void updateTeacher(Teacher t)
	{
		System.out.println("Enter In Teacher DB");
		String query = "UPDATE teacher SET Name='"+t.getT_Name()+"', Email = '"+t.getT_Email()+"', Password = '"+t.getT_Password()+"', EducationalStatus = '"+t.getT_Edu_Status()+"', EducationalInstitution = '"+t.getT_Edu_Institution()+"', Medium = '"+t.getT_Medium()+"', Experience = '"+t.getT_Experience()+"', Salary = '"+t.getT_Salary()+"', Location = '"+t.getT_Location()+"', ContactNumber = '"+t.getT_Contact()+"', Gender = '"+t.getT_Gender()+"' WHERE UserID='"+t.getT_UserID()+"'";
		
		try
		{
			dbc.openConnection();
			dbc.st.executeUpdate(query);
			dbc.closeConnection();
		}
		catch(Exception ex){System.out.println(ex.getMessage());}
	}

	public void deleteTeacher(String userID)
	{
		String query = "DELETE FROM teacher WHERE userID='"+userID+"';";
		try
		{
			dbc.openConnection();
			dbc.st.execute(query);
			dbc.closeConnection();
		}
		catch(Exception e){System.out.println(e.getMessage());}

		query = "DELETE FROM login2 WHERE userID='"+userID+"';";
		try
		{
			dbc.openConnection();
			dbc.st.execute(query);
			dbc.closeConnection();
		}
		catch(Exception ex){System.out.println(ex.getMessage());}

	}

	public Teacher searchTeacher(String userID)
	{
		System.out.println("Enter into DB");
		Teacher tch = null;
		String query = "SELECT `UserID`,`Name`,`Email` ,`Password`,`EducationalStatus`,`EducationalInstitution`,`Medium`, `Experience`,`Location`,`Salary`,`Gender`,`ContactNumber` FROM teacher WHERE `UserID`='"+userID+"';";     
		try
		{
			System.out.println(query);
			dbc.openConnection();
			dbc.result = dbc.st.executeQuery(query);
		
			while(dbc.result.next())
			{
				
				String uid = dbc.result.getString("UserID");
				String nm = dbc.result.getString("Name");
				String eml = dbc.result.getString("Email");
				String pass = dbc.result.getString("Password");
				String e_sts = dbc.result.getString("EducationalStatus");
				String e_ins = dbc.result.getString("EducationalInstitution");
				String mdium = dbc.result.getString("Medium");
				double exp = dbc.result.getDouble("Experience");
				double slry = dbc.result.getDouble("Salary");

				String lction = dbc.result.getString("Location");
				String cntact = dbc.result.getString("ContactNumber");
				String gnder = dbc.result.getString("Gender");

				System.out.println("Database worked");


				int ct = Integer.valueOf(cntact);

				tch = new Teacher();
				tch.setT_UserID(uid);
				tch.setT_Name(nm);
				tch.setT_Email(eml);
				tch.setT_Password(pass);
				tch.setT_Edu_Status(e_sts);
				tch.setT_Edu_Institution(e_ins);
				tch.setT_Medium(mdium);
				tch.setT_Experience(exp);
				tch.setT_Salary(slry);
				tch.setT_Location(lction);
				tch.setT_Contact(ct);
				tch.setT_Gender(gnder);
			}
			
		}
		catch(Exception ex){System.out.println(ex.getMessage());}
		dbc.closeConnection();
		return tch;
	}
}