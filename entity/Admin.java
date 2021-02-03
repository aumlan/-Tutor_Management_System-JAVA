package entity;

import java.lang.*;

public class Admin
{
	private String a_userID;
	private String a_name;
	private String a_email;
	private String a_password;
	private int a_contact;
	private int a_status;
	
	public Admin(){}
	public Admin(String a_userID,String a_name,String a_email,String a_password,int a_contact, int a_status)
	{
		this.a_userID =a_userID;
		this.a_name=a_name;
		this.a_email=a_email;
		this.a_password=a_password;
		this.a_contact=a_contact;
		this.a_status= a_status;
	}
	
	public void setA_UserID(String a_userID){this.a_userID =a_userID;}
	public void setA_Name(String a_name){this.a_name=a_name;}
	public void setA_Email(String a_email){this.a_email=a_email;}
	public void setA_Password(String a_password){this.a_password=a_password;}
	public void setA_Contact(int a_contact){this.a_contact=a_contact;}
	public void setA_Status(int a_status){this.a_status=a_status;}





	public String getA_UserID(){return a_userID;}
	public String getA_Name(){return a_name;}
	public String getA_Email(){return a_email;}
	public String getA_Password(){return a_password;}
	public int getA_Contact(){return a_contact;}
	public int getA_Status(){return a_status;}



}