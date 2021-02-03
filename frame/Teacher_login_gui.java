package frame;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.sql.*;
import repository.*;
import entity.*;

public class Teacher_login_gui extends JFrame implements ActionListener
{
	private JLabel t_userId, t_name, t_email, t_contact, t_experience, t_location,t_edu_status, t_edu_institution, t_meduim, t_gender, t_salary, t_password, t_welcome, t_subject ;

	private JTextField t_userIdTF, t_nameTF, t_emailTF, t_contactTF, t_experienceTF, t_locationTF,t_edu_statusTF, t_edu_institutionTF, t_meduimTF, t_genderTF, t_salaryTF;

	private JPasswordField t_passwordTF;

	private JRadioButton t_gender_male, t_gender_female;
	private JComboBox combo_box;
	private ButtonGroup bg;

	private JCheckBox s1, s2, s3, s4, s5, s6;
    
    private JButton  button_myInfo, button_update, button_delete,button_logout,button_searchT;
	private JButton button_reg, button_login;
	private Color color;
	private Font myFont;
	private Font myFont1;
	private String user;

	private TeacherRepo tr;
	//private 


//private Welcome_gui wg;

	private JPanel panel;
	

	public Teacher_login_gui(String user)
	{
		super("Teacher Login Form");
		this.setSize(800,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.user= user;
		System.out.println(user);
		//this.wg =wg;

		color = new Color(255,255,255);
myFont = new Font("Century", Font.BOLD, 13);		
panel = new JPanel();
		panel.setLayout(null);
		//panel.setBackground(color);


		/*tTF = new JTextField();
		tTF.setBounds(20,40,295,50);
		tTF.setBackground(Color.BLUE);
		panel.add(tTF);*/


        myFont1 = new Font("Century", Font.BOLD, 25);
        t_welcome = new JLabel("Welcome Teacher :)");
		t_welcome.setBounds(250,50,400,40);
		t_welcome.setFont(myFont1);
		//name.setBackground(Color.GRAY);
		t_welcome.setOpaque(true);
		panel.add(t_welcome);



		t_userId = new JLabel("User ID     :");
		t_userId.setBounds(200,140,150,25);
		t_userId.setFont(myFont);
		//name.setBackground(Color.GRAY);
		t_userId.setOpaque(true);
		panel.add(t_userId);

		t_userIdTF = new JTextField("");
		t_userIdTF.setBounds(380,142,150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(t_userIdTF);


         /////////////////////////////////

		t_name = new JLabel("Name   : ");
		t_name.setBounds(200,170,150,25);
		t_name.setFont(myFont);
		//name.setBackground(Color.GRAY);
		t_name.setOpaque(true);
		panel.add(t_name);

		t_nameTF = new JTextField("");
		t_nameTF.setBounds(380,172,150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(t_nameTF);

		//////////////////////////////

		t_email = new JLabel("Email   : ");
		t_email.setBounds(200,200,150,25);
		t_email.setFont(myFont);
		//name.setBackground(Color.GRAY);
		t_email.setOpaque(true);
		panel.add(t_email);

		t_emailTF = new JTextField("");
		t_emailTF.setBounds(380,202,150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(t_emailTF);

		////////////////////////////

		t_password = new JLabel("Password   : ");
		t_password.setBounds(200,230,150,25);
		t_password.setFont(myFont);
		//name.setBackground(Color.GRAY);
		t_password.setOpaque(true);
		panel.add(t_password);

		t_passwordTF = new JPasswordField();
		t_passwordTF.setBounds(380,232,150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(t_passwordTF);


        //////////////////////////////////////////

		t_edu_status = new JLabel("Educational Status  : ");
		t_edu_status.setBounds(200,260,180,25);
		t_edu_status.setFont(myFont);
		//name.setBackground(Color.GRAY);
		t_edu_status.setOpaque(true);
		panel.add(t_edu_status);

		t_edu_statusTF = new JTextField("");
		t_edu_statusTF.setBounds(380,262,150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(t_edu_statusTF);

        
		/////////////////////////////////////

		t_edu_institution = new JLabel("Educational Institution : ");
		t_edu_institution.setBounds(200,290,180,25);
		t_edu_institution.setFont(myFont);
		//name.setBackground(Color.GRAY);
		t_edu_institution.setOpaque(true);
		panel.add(t_edu_institution);

		t_edu_institutionTF = new JTextField("");
		t_edu_institutionTF.setBounds(380,292,150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(t_edu_institutionTF);
		
			////////////////////////////

		t_meduim = new JLabel("Meduim   :");
		t_meduim.setBounds(200,320,150,25);
		t_meduim.setFont(myFont);
		//name.setBackground(Color.GRAY);
		t_meduim.setOpaque(true);
		panel.add(t_meduim);

		t_meduimTF = new JTextField("");
		t_meduimTF.setBounds(380,322,150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(t_meduimTF);

		///////////////////////////////

		t_experience = new JLabel("Experience     :");
		t_experience.setBounds(200,350,150,25);
		t_experience.setFont(myFont);
		//name.setBackground(Color.GRAY);
		t_experience.setOpaque(true);
		panel.add(t_experience);

		t_experienceTF = new JTextField("");
		t_experienceTF.setBounds(380,352,150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(t_experienceTF);

		//////////////////////////////

		t_salary = new JLabel("Salary Range   :");
		t_salary.setBounds(200,380,150,25);
		t_salary.setFont(myFont);
		//name.setBackground(Color.GRAY);
		t_salary.setOpaque(true);
		panel.add(t_salary);

		/*String items[] = {"2000-5000", "5000-8000", "8000-12000", "12000-15000"};
		
		combo_box = new JComboBox(items);
		combo_box.setBounds(380,382,150,25);
		panel.add(combo_box);*/

		t_salaryTF = new JTextField("");
		t_salaryTF.setBounds(380,382,150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(t_salaryTF);

		///////////////////////////////////

		t_location = new JLabel("Location  :");
		t_location.setBounds(200,410,150,25);
		t_location.setFont(myFont);
		//name.setBackground(Color.GRAY);
		t_location.setOpaque(true);
		panel.add(t_location);

		t_locationTF = new JTextField("");
		t_locationTF.setBounds(380, 412, 150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(t_locationTF);


		/////////////////////////////

		t_contact = new JLabel("Contact Number  :");
		t_contact.setBounds(200,440,150,25);
		t_contact.setFont(myFont);
		//name.setBackground(Color.GRAY);
		t_contact.setOpaque(true);
		panel.add(t_contact);

		t_contactTF = new JTextField("");
		t_contactTF.setBounds(380, 442, 150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(t_contactTF);


		///////////////////////////

		t_gender = new JLabel("Gender     :");
		t_gender.setBounds(200,470,150,25);
		t_gender.setFont(myFont);
		//name.setBackground(Color.GRAY);
		t_gender.setOpaque(true);
		panel.add(t_gender);

		t_genderTF = new JTextField("");
		t_genderTF.setBounds(380,472,150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(t_genderTF);


		//////////////////////////

		t_subject = new JLabel("Subjects  :");
		t_subject.setBounds(200,500,150,25);
		t_subject.setFont(myFont);
		//name.setBackground(Color.GRAY);
		t_subject.setOpaque(true);
		panel.add(t_subject);

		s1 = new JCheckBox("Bangla");
		s1.setBounds(380,500, 90, 20);
		panel.add(s1);
		
		s2 = new JCheckBox("English");
		s2.setBounds(440, 500, 90, 20);
		panel.add(s2);
	
		s3 = new JCheckBox("Math");
		s3.setBounds(500, 500, 90, 20);
		panel.add(s3);

		s4 = new JCheckBox("Physics");
		s4.setBounds(560, 525, 90, 20);
		panel.add(s4);

		s5 = new JCheckBox("Chemistry");
		s5.setBounds(620, 525, 90, 20);
		panel.add(s5);

		s6 = new JCheckBox("Biology");
		s6.setBounds(620, 525, 90, 20);
		panel.add(s6);






		//////////////////////////////////////

		button_myInfo = new JButton("Show MyInfo");
		button_myInfo.setBounds(220, 520, 150, 30);
		button_myInfo.addActionListener(this);
		panel.add(button_myInfo);

		button_update = new JButton("Update");
		button_update.setBounds(380, 520, 150, 30);
		button_update.addActionListener(this);
		panel.add(button_update);

		button_delete = new JButton("Delete");
		button_delete.setBounds(220, 555, 150, 30);
		button_delete.addActionListener(this);
		panel.add(button_delete);

		button_logout = new JButton("Log Out");
		button_logout.setBounds(380, 555, 150, 30);
		button_logout.addActionListener(this);
		panel.add(button_logout);





		
		
/////////////////////////////
		this.add(panel);

}
		///////////////////////////////////////


	public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();
		//Calculation c = new Calculation();

		if (command.equals(button_myInfo.getText())) 
		{
			System.out.println(user);
			TeacherRepo tr= new TeacherRepo();
			Teacher t = tr.searchTeacher(user);


			if (t != null) 
			{

				String experience= Double.toString(t.getT_Experience());
				String salary= Double.toString(t.getT_Salary());
				String contact= String.valueOf(t.getT_Contact());


				t_userIdTF.setText(t.getT_UserID());
				t_nameTF.setText(t.getT_Name());
				t_emailTF.setText(t.getT_Email());
				t_passwordTF.setText(t.getT_Password());
				t_edu_statusTF.setText(t.getT_Edu_Status());
				t_edu_institutionTF.setText(t.getT_Edu_Institution());
				t_meduimTF.setText(t.getT_Medium());
				t_experienceTF.setText(experience);
				t_salaryTF.setText(salary);
				t_locationTF.setText(t.getT_Location());
				t_contactTF.setText(contact);
				t_genderTF.setText(t.getT_Gender());

				t_userIdTF.setEnabled(false);
				t_nameTF.setEnabled(true);
				t_emailTF.setEnabled(true);
				t_passwordTF.setEnabled(true);
				t_edu_statusTF.setEnabled(true);
				t_edu_institutionTF.setEnabled(true);
				t_meduimTF.setEnabled(true);
				t_experienceTF.setEnabled(true);
				t_salaryTF.setEnabled(true);
				t_locationTF.setEnabled(true);
				t_contactTF.setEnabled(true);
				t_genderTF.setEnabled(true);
				
			}
			else{}
		}

		else if (command.equals(button_update.getText())) 
		{
			TeacherRepo tr= new TeacherRepo();
			Teacher t= new Teacher();

			t_userIdTF.setEnabled(false);

			double experience= Double.parseDouble(t_experienceTF.getText());
			double salary= Double.parseDouble(t_salaryTF.getText());
			int contact= Integer.parseInt(t_contactTF.getText());

			t.setT_UserID(t_userIdTF.getText());
			t.setT_Name(t_nameTF.getText());
			t.setT_Email(t_emailTF.getText());
			t.setT_Password(t_passwordTF.getText());
			t.setT_Edu_Status(t_edu_statusTF.getText());
			t.setT_Edu_Institution(t_edu_institutionTF.getText());
			t.setT_Medium(t_meduimTF.getText());
			t.setT_Experience(experience);
			t.setT_Salary(salary);
			t.setT_Location(t_locationTF.getText());
			t.setT_Contact(contact);
			t.setT_Gender(t_genderTF.getText());

			System.out.println("user:" +user);
			tr.updateTeacher(t);

			JOptionPane.showMessageDialog(this, "Updated");

			t_userIdTF.setText("");
			t_nameTF.setText("");
			t_emailTF.setText("");
			t_passwordTF.setText("");
			t_edu_statusTF.setText("");
			t_edu_institutionTF.setText("");
			t_meduimTF.setText("");
			t_experienceTF.setText("");
			t_salaryTF.setText("");
			t_locationTF.setText("");
			t_contactTF.setText("");
			t_genderTF.setText("");

		}

		else if (command.equals(button_delete.getText())) 
		{
			tr.deleteTeacher(user);

			JOptionPane.showMessageDialog(this, "Deleted");

			t_userIdTF.setText("");
			t_nameTF.setText("");
			t_emailTF.setText("");
			t_passwordTF.setText("");
			t_edu_statusTF.setText("");
			t_edu_institutionTF.setText("");
			t_meduimTF.setText("");
			t_experienceTF.setText("");
			t_locationTF.setText("");
			t_contactTF.setText("");
			t_genderTF.setText("");

			button_myInfo.setEnabled(false);

		}
		else if (command.equals(button_logout.getText())) 
		{
			Welcome_gui wg= new Welcome_gui();
			wg.setVisible(true);
			this.setVisible(false);

		}
		else{}
	}


}