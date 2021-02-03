package entity;

import java.lang.*;

public class Teacher
{
	private String t_userID;
	private String t_name;
	private String t_email;
	private String t_password;
	private String t_edu_status;
	private String t_edu_institution;
	private String t_medium;
	private double t_experience;
	private double t_salary;
	private String t_location;
	private int t_contact;
	private String t_gender;
	private int t_status;

	public Teacher(){}
	public Teacher(String t_userID,String t_name,String t_email,String t_password,String t_edu_status,String t_edu_institution,String t_medium, double t_experience,double t_salary,String t_locarion,int t_contact,String t_gender,int t_status)
	{
		this.t_userID =t_userID;
		this.t_name=t_name;
		this.t_email=t_email;
		this.t_password=t_password;
		this.t_edu_status=t_edu_status;
		this.t_edu_institution=t_edu_institution;
		this.t_medium=t_medium;
		this.t_experience=t_experience;
		this.t_salary=t_salary;
		this.t_location=t_location;
		this.t_contact=t_contact;
		this.t_gender=t_gender;
		this.t_status= t_status;
	}
	
	public void setT_UserID(String t_userID){this.t_userID =t_userID;}
	public void setT_Name(String t_name){this.t_name=t_name;}
	public void setT_Email(String t_email){this.t_email=t_email;}
	public void setT_Password(String t_password){this.t_password=t_password;}
	public void setT_Edu_Status(String t_edu_status){this.t_edu_status=t_edu_status;}
	public void setT_Edu_Institution(String t_edu_institution){this.t_edu_institution=t_edu_institution;}
	public void setT_Medium(String t_medium){this.t_medium=t_medium;}
	public void setT_Experience(double t_experience){this.t_experience=t_experience;}

	public void setT_Salary(double t_salary){this.t_salary=t_salary;}
	public void setT_Location(String t_location){this.t_location=t_location;}
	public void setT_Contact(int t_contact){this.t_contact=t_contact;}
	public void setT_Gender(String t_gender){this.t_gender=t_gender;}
	public void setT_Status(int t_status){this.t_status=t_status;}




	public String getT_UserID(){return t_userID;}
	public String getT_Name(){return t_name;}
	public String getT_Email(){return t_email;}
	public String getT_Password(){return t_password;}
	public String getT_Edu_Status(){return t_edu_status;}
	public String getT_Edu_Institution(){return t_edu_institution;}
	public String getT_Medium(){return t_medium;}
	public double getT_Experience(){return t_experience;}
	public double getT_Salary(){return t_salary;}
	public String getT_Location(){return t_location;}
	public int getT_Contact(){return t_contact;}
	public String getT_Gender(){return t_gender;}
	public int getT_Status(){return t_status;}


}