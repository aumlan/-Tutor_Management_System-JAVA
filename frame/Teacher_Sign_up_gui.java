package frame;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.sql.*;
import repository.*;
import entity.*;


public class Teacher_Sign_up_gui extends JFrame implements ActionListener
{
	private JLabel t_userId, t_name, t_email, t_contact, t_experience, t_location,t_edu_status, t_edu_institution, t_medium, t_gender, t_salary, t_password ;

	private JTextField t_userIdTF, t_nameTF, t_emailTF, t_contactTF, t_experienceTF, t_locationTF,t_edu_statusTF, t_edu_institutionTF, t_mediumTF, t_genderTF, t_salaryTF;

	private JPasswordField t_passwordTF;

	private JRadioButton t_gender_male, t_gender_female;
	private JComboBox combo_box;
	private ButtonGroup bg;

	private JButton button_reg, button_login;
	private Color color;
	private Font myFont;
	private JPanel panel;

	private TeacherRepo tr;
	//private User ur;

	public Teacher_Sign_up_gui()
	{
		super("Teacher Sign-up Form");
		this.setSize(800,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		color = new Color(255,255,255);
myFont = new Font("Century", Font.BOLD, 13);		
panel = new JPanel();
		panel.setLayout(null);
		//TeacherRepo tr= new TeacherRepo();
		//panel.setBackground(color);


		/*tTF = new JTextField();
		tTF.setBounds(20,40,295,50);
		tTF.setBackground(Color.BLUE);
		panel.add(tTF);*/

		t_userId = new JLabel("User ID     :");
		t_userId.setBounds(200,110,150,25);
		t_userId.setFont(myFont);
		//name.setBackground(Color.GRAY);
		t_userId.setOpaque(true);
		panel.add(t_userId);

		t_userIdTF = new JTextField("");
		t_userIdTF.setBounds(380,112,150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(t_userIdTF);


         /////////////////////////////////

		t_name = new JLabel("Name   : ");
		t_name.setBounds(200,140,150,25);
		t_name.setFont(myFont);
		//name.setBackground(Color.GRAY);
		t_name.setOpaque(true);
		panel.add(t_name);

		t_nameTF = new JTextField("");
		t_nameTF.setBounds(380,142,150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(t_nameTF);

		//////////////////////////////

		t_email = new JLabel("Email   : ");
		t_email.setBounds(200,170,150,25);
		t_email.setFont(myFont);
		//name.setBackground(Color.GRAY);
		t_email.setOpaque(true);
		panel.add(t_email);

		t_emailTF = new JTextField("");
		t_emailTF.setBounds(380,172,150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(t_emailTF);

		////////////////////////////

		t_password = new JLabel("Password   : ");
		t_password.setBounds(200,200,150,25);
		t_password.setFont(myFont);
		//name.setBackground(Color.GRAY);
		t_password.setOpaque(true);
		panel.add(t_password);

		t_passwordTF = new JPasswordField();
		t_passwordTF.setBounds(380,202,150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(t_passwordTF);


        //////////////////////////////////////////

		t_edu_status = new JLabel("Educational Status  : ");
		t_edu_status.setBounds(200,230,180,25);
		t_edu_status.setFont(myFont);
		//name.setBackground(Color.GRAY);
		t_edu_status.setOpaque(true);
		panel.add(t_edu_status);

		t_edu_statusTF = new JTextField("");
		t_edu_statusTF.setBounds(380,232,150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(t_edu_statusTF);

        
		/////////////////////////////////////

		t_edu_institution = new JLabel("Educational Institution : ");
		t_edu_institution.setBounds(200,260,180,25);
		t_edu_institution.setFont(myFont);
		//name.setBackground(Color.GRAY);
		t_edu_institution.setOpaque(true);
		panel.add(t_edu_institution);

		t_edu_institutionTF = new JTextField("");
		t_edu_institutionTF.setBounds(380,262,150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(t_edu_institutionTF);
		
			////////////////////////////

		t_medium = new JLabel("medium   :");
		t_medium.setBounds(200,290,150,25);
		t_medium.setFont(myFont);
		//name.setBackground(Color.GRAY);
		t_medium.setOpaque(true);
		panel.add(t_medium);

		t_mediumTF = new JTextField("");
		t_mediumTF.setBounds(380,292,150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(t_mediumTF);

		///////////////////////////////

		t_experience = new JLabel("Experience     :");
		t_experience.setBounds(200,320,150,25);
		t_experience.setFont(myFont);
		//name.setBackground(Color.GRAY);
		t_experience.setOpaque(true);
		panel.add(t_experience);

		t_experienceTF = new JTextField("");
		t_experienceTF.setBounds(380,322,150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(t_experienceTF);

		//////////////////////////////


		t_location = new JLabel("Location    :");
		t_location.setBounds(200,350,150,25);
		t_location.setFont(myFont);
		//name.setBackground(Color.GRAY);
		t_location.setOpaque(true);
		panel.add(t_location);

		t_locationTF = new JTextField("");
		t_locationTF.setBounds(380,352,150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(t_locationTF);


		//////////////////////////////////////
		t_contact = new JLabel("Contact Number  :");
		t_contact.setBounds(200,380,150,25);
		t_contact.setFont(myFont);
		//name.setBackground(Color.GRAY);
		t_contact.setOpaque(true);
		panel.add(t_contact);

		t_contactTF = new JTextField("");
		t_contactTF.setBounds(380,382,150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(t_contactTF);

		///////////////////////////

		t_salary = new JLabel("Expected Salary :");
		t_salary.setBounds(200,410,150,25);
		t_salary.setFont(myFont);
		//name.setBackground(Color.GRAY);
		t_salary.setOpaque(true);
		panel.add(t_salary);

		/*String items[] = {"4000", "5000", "6000", "7000","8000"};
		
		combo_box = new JComboBox(items);
		combo_box.setBounds(380, 412, 150,25);
		panel.add(combo_box);*/

		t_salaryTF = new JTextField("");
		t_salaryTF.setBounds(380,412,150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(t_salaryTF);


		////////////////////////

		t_gender = new JLabel("Gender     :");
		t_gender.setBounds(200,440,150,25);
		t_gender.setFont(myFont);
		//name.setBackground(Color.GRAY);
		t_gender.setOpaque(true);
		panel.add(t_gender);

		t_gender_male = new JRadioButton("Male");
		t_gender_male.setBounds(380, 440, 80, 30);
		t_gender_male.setFont(myFont);
		panel.add(t_gender_male);
		
		
		t_gender_female = new JRadioButton("Female");
		t_gender_female.setBounds(460, 440, 80, 30);
		t_gender_female.setFont(myFont);
		panel.add(t_gender_female);

		bg = new ButtonGroup();
		bg.add(t_gender_male);
		bg.add(t_gender_female);


		//////////////////////////

		button_reg = new JButton("Registration");
		button_reg.setBounds(270, 500, 120, 30);
		button_reg.addActionListener(this);
		panel.add(button_reg);

		button_login = new JButton("Login");
		button_login.setBounds(400, 500, 120, 30);
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

			Teacher t= new Teacher();
			TeacherRepo tr = new TeacherRepo();
			//User u = new User();
			//Random rd = new Random();
			//int x = rd.nextInt(9999999)+10000000;

			String t_genderTF = null;

			if(t_gender_male.isSelected()){t_genderTF = t_gender_male.getText();}
			else if(t_gender_female.isSelected()){t_genderTF = t_gender_female.getText();}
			else{}

			
			int experience= Integer.parseInt(t_experienceTF.getText());
			double salary= Double.parseDouble(t_salaryTF.getText());
			int contact= Integer.parseInt(t_contactTF.getText());
			
			
			t.setT_UserID(t_userIdTF.getText());
			t.setT_Name(t_nameTF.getText());
			t.setT_Email(t_emailTF.getText());
			t.setT_Password(t_passwordTF.getText());
			t.setT_Edu_Status(t_edu_statusTF.getText());
			t.setT_Edu_Institution(t_edu_institutionTF.getText());
			t.setT_Medium(t_mediumTF.getText());
			t.setT_Experience(experience);
			t.setT_Salary(salary);
			t.setT_Location(t_locationTF.getText());
			t.setT_Contact(contact);
			t.setT_Gender(t_genderTF);
			t.setT_Status(2);

			System.out.println(t.getT_UserID());
			System.out.println(t.getT_Name());
			System.out.println(t.getT_Email());
			System.out.println(t.getT_Password());
			System.out.println(t.getT_Edu_Status());
			System.out.println(t.getT_Edu_Institution());
			System.out.println(t.getT_Medium());
			System.out.println(t.getT_Experience());
			System.out.println(t.getT_Salary());
			System.out.println(t.getT_Location());
			System.out.println(t.getT_Contact());
			System.out.println(t.getT_Gender());
			System.out.println(t.getT_Status());


			tr.insertTeacher(t);

			JOptionPane.showMessageDialog(this, "Registration Successfull");

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
