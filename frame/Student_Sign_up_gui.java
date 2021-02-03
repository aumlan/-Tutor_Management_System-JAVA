package frame;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.sql.*;
import repository.*;
import entity.*;


public class Student_Sign_up_gui extends JFrame implements ActionListener
{
	private JLabel s_userId, s_name, s_email, s_contact, s_experience, s_location,s_class, s_edu_institution, s_medium, s_gender, s_salary, s_password ;

	private JTextField s_userIdTF, s_nameTF, s_emailTF, s_contactTF, s_experienceTF, s_locationTF,s_classTF, s_edu_institutionTF, s_mediumTF, s_genderTF, s_salaryTF;

	private JPasswordField s_passwordTF;

	private JRadioButton s_gender_male, s_gender_female;
	private JComboBox combo_box;
	private ButtonGroup bg;

	private JButton button_reg, button_login;
	private Color color;
	private Font myFont;
	private JPanel panel;

	private StudentRepo sr;


	public Student_Sign_up_gui()
	{
		super("Student Sign-up Form");
		this.setSize(800,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		color = new Color(255,255,255);
myFont = new Font("Century", Font.BOLD, 13);		
panel = new JPanel();
		panel.setLayout(null);
		StudentRepo sr = new StudentRepo();
		//panel.setBackground(color);


		/*sTF = new JTextField();
		sTF.setBounds(20,40,295,50);
		sTF.setBackground(Color.BLUE);
		panel.add(sTF);*/

		s_userId = new JLabel("User ID     :");
		s_userId.setBounds(200,140,150,25);
		s_userId.setFont(myFont);
		//name.setBackground(Color.GRAY);
		s_userId.setOpaque(true);
		panel.add(s_userId);

		s_userIdTF = new JTextField("");
		s_userIdTF.setBounds(380,142,150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(s_userIdTF);


         /////////////////////////////////

		s_name = new JLabel("Name   : ");
		s_name.setBounds(200,170,150,25);
		s_name.setFont(myFont);
		//name.setBackground(Color.GRAY);
		s_name.setOpaque(true);
		panel.add(s_name);

		s_nameTF = new JTextField("");
		s_nameTF.setBounds(380,172,150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(s_nameTF);

		//////////////////////////////

		s_email = new JLabel("Email   : ");
		s_email.setBounds(200,200,150,25);
		s_email.setFont(myFont);
		//name.setBackground(Color.GRAY);
		s_email.setOpaque(true);
		panel.add(s_email);

		s_emailTF = new JTextField("");
		s_emailTF.setBounds(380,202,150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(s_emailTF);

		////////////////////////////

		s_password = new JLabel("Password   : ");
		s_password.setBounds(200,230,150,25);
		s_password.setFont(myFont);
		//name.setBackground(Color.GRAY);
		s_password.setOpaque(true);
		panel.add(s_password);

		s_passwordTF = new JPasswordField();
		s_passwordTF.setBounds(380,232,150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(s_passwordTF);


        //////////////////////////////////////////

		s_edu_institution = new JLabel("Educational Institution  : ");
		s_edu_institution.setBounds(200,260,180,25);
		s_edu_institution.setFont(myFont);
		//name.setBackground(Color.GRAY);
		s_edu_institution.setOpaque(true);
		panel.add(s_edu_institution);

		s_edu_institutionTF = new JTextField("");
		s_edu_institutionTF.setBounds(380,262,150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(s_edu_institutionTF);

        
		/////////////////////////////////////

		s_class = new JLabel("Class  : ");
		s_class.setBounds(200,290,180,25);
		s_class.setFont(myFont);
		//name.setBackground(Color.GRAY);
		s_class.setOpaque(true);
		panel.add(s_class);

		s_classTF = new JTextField("");
		s_classTF.setBounds(380,292,150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(s_classTF);
		
			////////////////////////////

		s_medium = new JLabel("medium   :");
		s_medium.setBounds(200,320,150,25);
		s_medium.setFont(myFont);
		//name.setBackground(Color.GRAY);
		s_medium.setOpaque(true);
		panel.add(s_medium);

		s_mediumTF = new JTextField("");
		s_mediumTF.setBounds(380,322,150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(s_mediumTF);

		///////////////////////////////

		s_location = new JLabel("Location     :");
		s_location.setBounds(200,350,150,25);
		s_location.setFont(myFont);
		//name.setBackground(Color.GRAY);
		s_location.setOpaque(true);
		panel.add(s_location);

		s_locationTF = new JTextField("");
		s_locationTF.setBounds(380,352,150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(s_locationTF);

		//////////////////////////////

		s_contact = new JLabel("Contact Number  :");
		s_contact.setBounds(200,380,150,25);
		s_contact.setFont(myFont);
		//name.setBackground(Color.GRAY);
		s_contact.setOpaque(true);
		panel.add(s_contact);

		s_contactTF = new JTextField("");
		s_contactTF.setBounds(380,382,150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(s_contactTF);

		///////////////////////////

		s_gender = new JLabel("Gender     :");
		s_gender.setBounds(200,410,150,25);
		s_gender.setFont(myFont);
		//name.setBackground(Color.GRAY);
		s_gender.setOpaque(true);
		panel.add(s_gender);

		s_gender_male = new JRadioButton("Male");
		s_gender_male.setBounds(380, 412, 80,25);
		s_gender_male.setFont(myFont);
		panel.add(s_gender_male);
		
		
		s_gender_female = new JRadioButton("Female");
		s_gender_female.setBounds(460, 412, 150, 25);
		s_gender_female.setFont(myFont);
		panel.add(s_gender_female);

		bg = new ButtonGroup();
		bg.add(s_gender_male);
		bg.add(s_gender_female);


		//////////////////////////

		button_reg = new JButton("Registration");
		button_reg.setBounds(270, 480, 100, 30);
		button_reg.addActionListener(this);
		panel.add(button_reg);

		button_login = new JButton("Login");
		button_login.setBounds(380, 480, 100, 30);
		button_login.addActionListener(this);
		panel.add(button_login);





		
		
/////////////////////////////
		this.add(panel);

}
		///////////////////////////////////////


	public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();
		//Calculation c = new Calculation();

		if(command.equals(button_reg.getText()))
		{
			
			Student s = new Student();
			//User u = new User();
			//Random rd = new Random();
			//int x = rd.nextInt(9999999)+10000000;

			String s_genderTF = null;

			if(s_gender_male.isSelected()){s_genderTF = s_gender_male.getText();}
			else if(s_gender_female.isSelected()){s_genderTF = s_gender_female.getText();}
			else{}
			
			//String experience= Double.parseDouble(t_experienceTF.getText());
			int cl = Integer.parseInt(s_classTF.getText());
			int cn = Integer.parseInt(s_contactTF.getText());
			
			s.setS_UserID(s_userIdTF.getText());
			s.setS_Name(s_nameTF.getText());
			s.setS_Email(s_emailTF.getText());
			s.setS_Password(s_passwordTF.getText());
			s.setS_Edu_Institution(s_edu_institutionTF.getText());
			s.setS_Class(cl);
			s.setS_Medium(s_mediumTF.getText());
			s.setS_Location(s_locationTF.getText());
			s.setS_Contact(cn);
			s.setS_Gender(s_genderTF);
			s.setS_Status(1);

			sr.insertStudent(s);

			JOptionPane.showMessageDialog(this, "Registration Successfull");

			s_userIdTF.setText("");
			s_nameTF.setText("");
			s_emailTF.setText("");
			s_passwordTF.setText("");
			s_edu_institutionTF.setText("");
			s_classTF.setText("");
			s_mediumTF.setText("");
			s_locationTF.setText("");
			s_contactTF.setText("");

		}

		else if(command.equals(button_login.getText()))
		{
			Welcome_gui wg= new Welcome_gui();
			wg.setVisible(true);
			this.setVisible(false);
			
		}
		else{}
	}





}
