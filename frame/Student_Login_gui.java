package frame;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.sql.*;
import repository.*;
import entity.*;

public class Student_Login_gui extends JFrame implements ActionListener
{
	private JLabel s_userId, s_name, s_email, s_contact, s_experience, s_location,s_class, s_edu_institution, s_medium, s_gender, s_salary, s_password, s_welcome ;

	private JTextField s_userIdTF, s_nameTF, s_emailTF, s_contactTF, s_experienceTF, s_locationTF,s_classTF, s_edu_institutionTF, s_mediumTF, s_genderTF, s_salaryTF;

	private JPasswordField s_passwordTF;

	private JRadioButton s_gender_male, s_gender_female;
	private JComboBox combo_box;
	private ButtonGroup bg;
    private JButton button_myInfo ,button_update, button_delete,button_logout,button_searchT;

    private Welcome_gui wg;
	private Color color;
	private Font myFont;
	private Font myFont1;
	private String user;

	private StudentRepo sr; 

	private JPanel panel;

	public Student_Login_gui()
	{
		
	}

	public Student_Login_gui(String user)
	{
		super("Student Login Form");
		this.setSize(800,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.wg= wg;
		this.user= user;

		sr= new StudentRepo();
		
		color = new Color(255,255,255);
        panel = new JPanel();
		panel.setLayout(null);
		//panel.setBackground(color);


		/*sTF = new JTextField();
		sTF.setBounds(20,40,295,50);
		sTF.setBackground(Color.BLUE);
		panel.add(sTF);*/


        myFont1 = new Font("Century", Font.BOLD, 25);
        s_welcome = new JLabel("Welcome Student :)");
		s_welcome.setBounds(250,50,400,40);
		s_welcome.setFont(myFont1);
		//name.setBackground(Color.GRAY);
		s_welcome.setOpaque(true);
		panel.add(s_welcome);



		s_userId = new JLabel("User ID     :");
		s_userId.setBounds(200,150,150,25);
		s_userId.setFont(myFont);
		//name.setBackground(Color.GRAY);
		s_userId.setOpaque(true);
		panel.add(s_userId);

		s_userIdTF = new JTextField("");
		s_userIdTF.setBounds(380,152,150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(s_userIdTF);


         /////////////////////////////////

		s_name = new JLabel("Name   : ");
		s_name.setBounds(200,180,150,25);
		s_name.setFont(myFont);
		//name.setBackground(Color.GRAY);
		s_name.setOpaque(true);
		panel.add(s_name);

		s_nameTF = new JTextField("");
		s_nameTF.setBounds(380,182,150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(s_nameTF);

		//////////////////////////////

		s_email = new JLabel("Email   : ");
		s_email.setBounds(200,210,150,25);
		s_email.setFont(myFont);
		//name.setBackground(Color.GRAY);
		s_email.setOpaque(true);
		panel.add(s_email);

		s_emailTF = new JTextField("");
		s_emailTF.setBounds(380,212,150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(s_emailTF);

		////////////////////////////

		s_password = new JLabel("Password   : ");
		s_password.setBounds(200,240,150,25);
		s_password.setFont(myFont);
		//name.setBackground(Color.GRAY);
		s_password.setOpaque(true);
		panel.add(s_password);

		s_passwordTF = new JPasswordField();
		s_passwordTF.setBounds(380,242,150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(s_passwordTF);


        //////////////////////////////////////////

		s_edu_institution = new JLabel("Educational Institution  : ");
		s_edu_institution.setBounds(200,270,180,25);
		s_edu_institution.setFont(myFont);
		//name.setBackground(Color.GRAY);
		s_edu_institution.setOpaque(true);
		panel.add(s_edu_institution);

		s_edu_institutionTF = new JTextField("");
		s_edu_institutionTF.setBounds(380,272,150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(s_edu_institutionTF);

        
		/////////////////////////////////////

		s_class = new JLabel("Class  : ");
		s_class.setBounds(200,300,180,25);
		s_class.setFont(myFont);
		//name.setBackground(Color.GRAY);
		s_class.setOpaque(true);
		panel.add(s_class);

		s_classTF = new JTextField("");
		s_classTF.setBounds(380,302,150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(s_classTF);
		
			////////////////////////////

		s_medium = new JLabel("medium   :");
		s_medium.setBounds(200,330,150,25);
		s_medium.setFont(myFont);
		//name.setBackground(Color.GRAY);
		s_medium.setOpaque(true);
		panel.add(s_medium);

		s_mediumTF = new JTextField("");
		s_mediumTF.setBounds(380,332,150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(s_mediumTF);

		///////////////////////////////

		s_location = new JLabel("Location     :");
		s_location.setBounds(200,360,150,25);
		s_location.setFont(myFont);
		//name.setBackground(Color.GRAY);
		s_location.setOpaque(true);
		panel.add(s_location);

		s_locationTF = new JTextField("");
		s_locationTF.setBounds(380,362,150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(s_locationTF);

		//////////////////////////////

		s_contact = new JLabel("Contact Number  :");
		s_contact.setBounds(200,390,150,25);
		s_contact.setFont(myFont);
		//name.setBackground(Color.GRAY);
		s_contact.setOpaque(true);
		panel.add(s_contact);

		s_contactTF = new JTextField("");
		s_contactTF.setBounds(380,392,150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(s_contactTF);

		///////////////////////////

		s_gender = new JLabel("Gender     :");
		s_gender.setBounds(200,420,150,25);
		s_gender.setFont(myFont);
		//name.setBackground(Color.GRAY);
		s_gender.setOpaque(true);
		panel.add(s_gender);

		s_genderTF = new JTextField("");
		s_genderTF.setBounds(380,422,150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(s_genderTF);


		


		//////////////////////////

		button_update = new JButton("Update");
		button_update.setBounds(220, 480, 150, 30);
		button_update.addActionListener(this);
		panel.add(button_update);

		button_delete = new JButton("Delete");
		button_delete.setBounds(380, 480, 150, 30);
		button_delete.addActionListener(this);
		panel.add(button_delete);

		button_logout = new JButton("Log Out");
		button_logout.setBounds(220, 515, 150, 30);
		button_logout.addActionListener(this);
		panel.add(button_logout);

		button_searchT = new JButton("Search Teacher");
		button_searchT.setBounds(380, 515, 150, 30);
		button_searchT.addActionListener(this);
		panel.add(button_searchT);

		button_myInfo = new JButton("Show My Info");
		button_myInfo.setBounds(420, 550, 150, 30);
		button_myInfo.addActionListener(this);
		panel.add(button_myInfo);







		
		
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
			Student s = sr.searchStudent(user);
			if (s != null) 
			{

				String clss= Integer.toString(s.getS_Class());
				//String salary= Double.toString(t.getT_Salary());
				String cntact= Integer.toString(s.getS_Contact());


				s_userIdTF.setText(s.getS_UserID());
				s_nameTF.setText(s.getS_Name());
				s_emailTF.setText(s.getS_Email());
				s_passwordTF.setText(s.getS_Password());
				//t_edu_statusTF.setText(t.getT_Edu_Status());
				s_edu_institutionTF.setText(s.getS_Edu_Institution());
				s_classTF.setText(clss);
				s_mediumTF.setText(s.getS_Medium());
				//t_experienceTF.setText(t.getT_Experience());
				s_locationTF.setText(s.getS_Location());
				s_contactTF.setText(cntact);
				s_genderTF.setText(s.getS_Gender());


				s_userIdTF.setEnabled(false);
				s_nameTF.setEnabled(true);
				s_emailTF.setEnabled(true);
				s_passwordTF.setEnabled(true);
				//t_edu_statusTF.setEnabled(true);
				s_edu_institutionTF.setEnabled(true);
				s_classTF.setEnabled(true);
				s_mediumTF.setEnabled(true);
				//s_experienceTF.setEnabled(true);
				s_locationTF.setEnabled(true);
				s_contactTF.setEnabled(true);
				s_genderTF.setEnabled(true);
				
			}else{}
		}
		else if (command.equals(button_update.getText())) 
		{
			Student s= new Student();

			s_userId.setEnabled(false);

			System.out.println("Update button");

			int cls = Integer.valueOf(s_classTF.getText());
			int ctct = Integer.valueOf(s_contactTF.getText());


			s.setS_UserID(s_userIdTF.getText());
			s.setS_Name(s_nameTF.getText());
			s.setS_Email(s_emailTF.getText());
			s.setS_Password(s_passwordTF.getText());
			//s.setT_Edu_Status(s_edu_statusTF.getText());
			s.setS_Edu_Institution(s_edu_institutionTF.getText());
			s.setS_Class(cls);
			s.setS_Medium(s_mediumTF.getText());
			//s.setT_Salary(s_salaryTF.getText());
			s.setS_Location(s_locationTF.getText());
			s.setS_Contact(ctct);
			s.setS_Gender(s_genderTF.getText());

			sr.updateStudent(s);

			JOptionPane.showMessageDialog(this, "Updated");

			s_userIdTF.setText("");
			s_nameTF.setText("");
			s_emailTF.setText("");
			s_passwordTF.setText("");
			//s_edu_statusTF.setText("");
			s_edu_institutionTF.setText("");
			s_classTF.setText("");
			s_mediumTF.setText("");
			//s_experienceTF.setText("");
			s_locationTF.setText("");
			s_contactTF.setText("");
			s_genderTF.setText("");

		}
		else if (command.equals(button_delete.getText())) 
		{
			sr.deleteStudent(user);

			JOptionPane.showMessageDialog(this, "Deleted");

			s_userIdTF.setText("");
			s_nameTF.setText("");
			s_emailTF.setText("");
			s_passwordTF.setText("");
			//s_edu_statusTF.setText("");
			s_edu_institutionTF.setText("");
			s_classTF.setText("");
			s_mediumTF.setText("");
			//s_experienceTF.setText("");
			s_locationTF.setText("");
			s_contactTF.setText("");
			s_genderTF.setText("");

			button_myInfo.setEnabled(false);

		}

		else if (command.equals(button_logout.getText())) {
			
			Welcome_gui wg= new Welcome_gui();
			wg.setVisible(true);
			this.setVisible(false);

		}
	}

}
