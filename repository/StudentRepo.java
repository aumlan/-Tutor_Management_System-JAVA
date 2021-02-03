package repository;

import java.lang.*;
import java.util.ArrayList;
import entity.*;
import interfaces.*;

public class StudentRepo implements IStudentRepo
{
	DatabaseConnection dbc;
	
	public StudentRepo()
	{
		dbc = new DatabaseConnection();
	}


	public Student getStudent(String userID, String password)
	{
		Student student = null;
		String query = "SELECT userID, password, Status FROM login2 WHERE userID='"+userID+"' AND password='"+password+"';";
		try
		{
			System.out.println(query);
			dbc.openConnection();
			dbc.result = dbc.st.executeQuery(query);
		
			while(dbc.result.next())
			{
				student = new Student();
				student.setS_UserID(dbc.result.getString("userID"));
				student.setS_Password(dbc.result.getString("password"));
				student.setS_Status(dbc.result.getInt("status"));
			}
		}
        catch(Exception ex)
		{
			System.out.println("Exception : " +ex.getMessage());
        }
		dbc.closeConnection();
		return student;
	}
	
	public void insertStudent(Student s)
	{
		System.out.println("Enter into Student DB");
		String query = "INSERT INTO student VALUES ('"+s.getS_UserID()+"','"+s.getS_Name()+"','"+s.getS_Email()+"','"+s.getS_Password()+"','"+s.getS_Edu_Institution()+"','"+s.getS_Class()+"','"+s.getS_Medium()+"','"+s.getS_Location()+"','"+s.getS_Contact()+"',"+s.getS_Gender()+");";
		try
		{
			dbc.openConnection();
			dbc.st.execute(query);
			dbc.closeConnection();
		}
		catch(Exception ex){System.out.println(ex.getMessage());}

		query = "INSERT INTO login2 VALUES ('"+s.getS_UserID()+"',"+s.getS_Password()+");";

		try
		{
			dbc.openConnection();
			dbc.st.execute(query);
			dbc.closeConnection();
		}
		catch(Exception ex){System.out.println(ex.getMessage());}

		

	}



	public void deleteStudent(String userID)
	{
		String query = "DELETE from student WHERE userID='"+userID+"';";
		try
		{
			dbc.openConnection();
			dbc.st.execute(query);
			dbc.closeConnection();
		}
		catch(Exception e){System.out.println(e.getMessage());}
	}



	public void updateStudent(Student s)
	{
		System.out.println("Enter into DB");
		String query = "UPDATE student SET Name='"+s.getS_Name()+"', Email = '"+s.getS_Email()+"', Password = '"+s.getS_Password()+"', EducationalInstitution = '"+s.getS_Edu_Institution()+"', Class = '"+s.getS_Class()+"' ,Medium = '"+s.getS_Medium()+"',Location = '"+s.getS_Location()+"', ContactNumber = '"+s.getS_Contact()+"', Gender = '"+s.getS_Gender()+"' WHERE userID='"+s.getS_UserID()+"'";
		
		try
		{
			dbc.openConnection();
			dbc.st.executeUpdate(query);
			dbc.closeConnection();
		}
		catch(Exception ex){System.out.println(ex.getMessage());}
	}



	public Student searchStudent(String userID)
	{
		Student st = null;
		String query = "SELECT * FROM student WHERE userID='"+userID+"';";
		try
		{
			System.out.println(query);
			dbc.openConnection();
			dbc.result = dbc.st.executeQuery(query);
		
			while(dbc.result.next())
			{
				
				String uid = dbc.result.getString("userID");
				String nm = dbc.result.getString("Name");
				String eml = dbc.result.getString("Email");
				String pass = dbc.result.getString("Password");
				String e_ins = dbc.result.getString("EducationalInstitution");
				String clss = dbc.result.getString("Class");
				String mdium = dbc.result.getString("Medium");
				String lction = dbc.result.getString("Location");
				String cntact = dbc.result.getString("ContactNumber");
				String gnder = dbc.result.getString("Gender");

				int cl = Integer.valueOf(clss);
				int ct = Integer.valueOf(cntact);

				st = new Student();
				st.setS_UserID(uid);
				st.setS_Name(nm);
				st.setS_Email(eml);
				st.setS_Password(pass);
				st.setS_Edu_Institution(e_ins);
				st.setS_Class(cl);
				st.setS_Medium(mdium);
				st.setS_Location(lction);
				st.setS_Contact(ct);
				st.setS_Gender(gnder);
			}
			
		}
		catch(Exception ex){System.out.println(ex.getMessage());}
		dbc.closeConnection();
		return st;
	}

	/*public String[][] getAllStudent()
	{
		ArrayList<Student> ar = new ArrayList<Student>();
		String query = "SELECT * FROM student;";  
		
		try
		{
			dbc.openConnection();
			dbc.result = dbc.st.executeQuery(query);
			
		
			while(dbc.result.next())
			{
				String empId = dbc.result.getString("empId");
				String name = dbc.result.getString("employeeName");
				String designation = dbc.result.getString("designation");
				double salary = dbc.result.getDouble("salary");
				
				Employee e = new Employee(empId,name,designation,salary);
				ar.add(e);
			}
		}
		catch(Exception e){System.out.println(e.getMessage());}
		dbc.closeConnection();
		
		
		Object obj[] = ar.toArray();
		String data[][] = new String [ar.size()][4];
		
		for(int i=0; i<obj.length; i++)
		{
			data[i][0] = ((Employee)obj[i]).getEmpId();
			data[i][1] = ((Employee)obj[i]).getName();
			data[i][2] = ((Employee)obj[i]).getDesignation();
			data[i][3] = (((Employee)obj[i]).getSalary())+"";
		}
		return data;
	}*/
}




