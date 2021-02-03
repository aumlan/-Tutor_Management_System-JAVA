package repository;

import java.lang.*;
import java.util.ArrayList;
import entity.*;
import interfaces.*;

public class AdminRepo implements IAdminRepo
{
	DatabaseConnection dbc;
	
	public AdminRepo()
	{
		dbc = new DatabaseConnection();
	}
	public Admin getAdmin(String userID, String password)
	{
		Admin admin = null;
		String query = "SELECT userID, password, Status FROM login2 WHERE userID='"+userID+"' AND password='"+password+"';";
		try
		{
			System.out.println(query);
			dbc.openConnection();
			dbc.result = dbc.st.executeQuery(query);
		
			while(dbc.result.next())
			{
				admin = new Admin();
				admin.setA_UserID(dbc.result.getString("userID"));
				admin.setA_Password(dbc.result.getString("password"));
				admin.setA_Status(dbc.result.getInt("status"));
			}
		}
        catch(Exception ex)
		{
			System.out.println("Exception : " +ex.getMessage());
        }
		dbc.closeConnection();
		return admin;
	}

	public Admin searchAdmin(String userID)
	{
		Admin ad = null;
		String query = "SELECT * FROM admin WHERE userID='"+userID+"';";
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
				String cntact = dbc.result.getString("ContactNumber");
				
				int ct = Integer.valueOf(cntact);

				ad = new Admin();
				ad.setA_UserID(uid);
				ad.setA_Name(nm);
				ad.setA_Email(eml);
				ad.setA_Password(pass);
				ad.setA_Contact(ct);
			
			}
			
		}
		catch(Exception ex){System.out.println(ex.getMessage());}
		dbc.closeConnection();
		return ad;
	}


	/////////////////////////////////////////////////////////////

	public void updateAdmin(Admin a)
	{
		String query = "UPDATE admin SET Name='"+a.getA_Name()+"', Email = '"+a.getA_Email()+"', Password = '"+a.getA_Password()+"',a.ContactNumber = '"+a.getA_Contact()+"' WHERE userID='"+a.getA_UserID()+"'";
		
		try
		{
			dbc.openConnection();
			dbc.st.executeUpdate(query);
			dbc.closeConnection();
		}
		catch(Exception ex){System.out.println(ex.getMessage());}
	}






	






















	/*public void insertTeacher(Teacher t)
	{
		String query = "INSERT INTO login2 VALUES ('"+u.getUserID()+"','"+u.getPassword()+"',"+u.getStatus()+");";
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

	}
	public void deleteTeacher(String userID)
	{
		String query = "DELETE from login  WHERE userId='"+userID+"';";
		try
		{
			dbc.openConnection();
			dbc.st.execute(query);
			dbc.closeConnection();
		}
		catch(Exception e){System.out.println(e.getMessage());}
	}*/
}