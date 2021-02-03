package entity;

import java.lang.*;

public class Student
{
	private String s_userID;
	private String s_name;
	private String s_email;
	private String s_password;
	private String s_edu_institution;
	private int s_class;
	private String s_medium;
	private String s_location;
	private int s_contact;
	private String s_gender;
	private int s_status;
	
	public Student(){}
	public Student(String s_userID,String s_name,String s_email,String s_password,String s_edu_institution,int s_class,String s_medium,String s_locarion,int s_contact,String s_gender,int s_status)
	{
		this.s_userID =s_userID;
		this.s_name=s_name;
		this.s_email=s_email;
		this.s_password=s_password;
		this.s_edu_institution=s_edu_institution;
		this.s_class=s_class;
		this.s_medium=s_medium;
		this.s_location=s_location;
		this.s_contact=s_contact;
		this.s_gender=s_gender;
		this.s_status= s_status;
	}
	
	public void setS_UserID(String s_userID){this.s_userID =s_userID;}
	public void setS_Name(String s_name){this.s_name=s_name;}
	public void setS_Email(String s_email){this.s_email=s_email;}
	public void setS_Password(String s_password){this.s_password=s_password;}
	public void setS_Edu_Institution(String s_edu_institution){this.s_edu_institution=s_edu_institution;}
	public void setS_Class(int s_class){this.s_class=s_class;}
	public void setS_Medium(String s_medium){this.s_medium=s_medium;}
	public void setS_Location(String s_location){this.s_location=s_location;}
	public void setS_Contact(int s_contact){this.s_contact=s_contact;}
	public void setS_Gender(String s_gender){this.s_gender=s_gender;}
	public void setS_Status(int s_status){this.s_status=s_status;}




public String getS_UserID(){return s_userID;}
	public String getS_Name(){return s_name;}
	public String getS_Email(){return s_email;}
	public String getS_Password(){return s_password;}
	public String getS_Edu_Institution(){return s_edu_institution;}
	public int getS_Class(){return s_class;}
public String getS_Medium(){return s_medium;}
public String getS_Location(){return s_location;}
public int getS_Contact(){return s_contact;}
public String getS_Gender(){return s_gender;}
public int getS_Status(){return s_status;}

}