package frame;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.sql.*;
import repository.*;
import entity.*;

public class Student_info_gui extends JFrame implements ActionListener
{
	private JLabel s_userId, s_name, s_email, s_contact, s_experience, s_location,s_class, s_edu_institution, s_meduim, s_gender, s_salary, s_password ;

	private JTextField s_userId_field, s_name_field, s_email_field, s_contacs_field, s_experience_field, s_location_field,s_class_field, s_edu_institution_field, s_meduim_field, s_gender_field, s_salary_field;

	private JPasswordField s_password_field;

	private JTable table_student;
	private JScrollPane table_student_sp;

	private JRadioButton s_gender_male, s_gender_female;
	private JComboBox combo_box;
	private ButtonGroup bg;

	private JButton button_load, button_insert, button_delete, button_update, button_back,button_getAll;
	private Color color;
	private Font myFont;
	private JPanel panel;

	public Student_info_gui()
	{
		super("Manage Student");
		this.setSize(800,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		color = new Color(255,255,255);
myFont = new Font("Century", Font.BOLD, 13);		
panel = new JPanel();
		panel.setLayout(null);
		//panel.setBackground(color);


		/*s_field = new JTextField();
		s_field.setBounds(20,40,295,50);
		s_field.setBackground(Color.BLUE);
		panel.add(s_field);*/

		s_userId = new JLabel("User ID     :");
		s_userId.setBounds(60,30,150,25);
		s_userId.setFont(myFont);
		//name.setBackground(Color.GRAY);
		s_userId.setOpaque(true);
		panel.add(s_userId);

		s_userId_field = new JTextField("");
		s_userId_field.setBounds(260,32,150,25);
		//name_field.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//name_field.setOpaque(true);
		panel.add(s_userId_field);


         /////////////////////////////////

		s_name = new JLabel("Name   : ");
		s_name.setBounds(60,60,150,25);
		s_name.setFont(myFont);
		//name.setBackground(Color.GRAY);
		s_name.setOpaque(true);
		panel.add(s_name);

		s_name_field = new JTextField("");
		s_name_field.setBounds(260,62,150,25);
		//name_field.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//name_field.setOpaque(true);
		panel.add(s_name_field);

		//////////////////////////////

		s_email = new JLabel("Email   : ");
		s_email.setBounds(60,90,150,25);
		s_email.setFont(myFont);
		//name.setBackground(Color.GRAY);
		s_email.setOpaque(true);
		panel.add(s_email);

		s_email_field = new JTextField("");
		s_email_field.setBounds(260,92,150,25);
		//name_field.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//name_field.setOpaque(true);
		panel.add(s_email_field);

		////////////////////////////

		s_password = new JLabel("Password   : ");
		s_password.setBounds(60,120,150,25);
		s_password.setFont(myFont);
		//name.setBackground(Color.GRAY);
		s_password.setOpaque(true);
		panel.add(s_password);

		s_password_field = new JPasswordField("");
		s_password_field.setBounds(260,122,150,25);
		//name_field.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//name_field.setOpaque(true);
		panel.add(s_password_field);


        //////////////////////////////////////////

		s_edu_institution = new JLabel("Educational Institution  : ");
		s_edu_institution.setBounds(60,150,190,25);
		s_edu_institution.setFont(myFont);
		//name.setBackground(Color.GRAY);
		s_edu_institution.setOpaque(true);
		panel.add(s_edu_institution);

		s_edu_institution_field = new JTextField("");
		s_edu_institution_field.setBounds(260,152,150,25);
		//name_field.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//name_field.setOpaque(true);
		panel.add(s_edu_institution_field);

        
		/////////////////////////////////////

		s_class = new JLabel("Class  : ");
		s_class.setBounds(60,180,180,25);
		s_class.setFont(myFont);
		//name.setBackground(Color.GRAY);
		s_class.setOpaque(true);
		panel.add(s_class);

		s_class_field = new JTextField("");
		s_class_field.setBounds(260,182,150,25);
		//name_field.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//name_field.setOpaque(true);
		panel.add(s_class_field);
		
			////////////////////////////

		s_meduim = new JLabel("Meduim   :");
		s_meduim.setBounds(60,210,150,25);
		s_meduim.setFont(myFont);
		//name.setBackground(Color.GRAY);
		s_meduim.setOpaque(true);
		panel.add(s_meduim);

		s_meduim_field = new JTextField("");
		s_meduim_field.setBounds(260,212,150,25);
		//name_field.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//name_field.setOpaque(true);
		panel.add(s_meduim_field);

		///////////////////////////////

		s_location = new JLabel("Location     :");
		s_location.setBounds(60,240,150,25);
		s_location.setFont(myFont);
		//name.setBackground(Color.GRAY);
		s_location.setOpaque(true);
		panel.add(s_location);

		s_location_field = new JTextField("");
		s_location_field.setBounds(260,242,150,25);
		//name_field.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//name_field.setOpaque(true);
		panel.add(s_location_field);

		//////////////////////////////

		s_contact = new JLabel("Contact Number  :");
		s_contact.setBounds(60,270,150,25);
		s_contact.setFont(myFont);
		//name.setBackground(Color.GRAY);
		s_contact.setOpaque(true);
		panel.add(s_contact);

		s_contacs_field = new JTextField("");
		s_contacs_field.setBounds(260,272,150,25);
		//name_field.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//name_field.setOpaque(true);
		panel.add(s_contacs_field);

		///////////////////////////

		s_gender = new JLabel("Gender     :");
		s_gender.setBounds(60,300,150,25);
		s_gender.setFont(myFont);
		//name.setBackground(Color.GRAY);
		s_gender.setOpaque(true);
		panel.add(s_gender);

		s_gender_field = new JTextField("");
		s_gender_field.setBounds(260,302,150,25);
		//name_field.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//name_field.setOpaque(true);
		panel.add(s_gender_field);


		


		//////////////////////////

		button_getAll = new JButton("Get All");
		button_getAll.setBounds(555, 70, 100, 30);
		button_getAll.addActionListener(this);
		panel.add(button_getAll);

		button_load = new JButton("Load");
		button_load.setBounds(490, 120, 100, 30);
		button_load.addActionListener(this);
		panel.add(button_insert);

		button_update = new JButton("Update");
		button_update.setBounds(490, 170, 100, 30);
		button_update.addActionListener(this);
		panel.add(button_update);

		button_delete = new JButton("Delete");
		button_delete.setBounds(620, 170, 100, 30);
		button_delete.addActionListener(this);
		panel.add(button_delete);

		button_back = new JButton("Back");
		button_back.setBounds(555, 220, 100, 30);
		button_back.addActionListener(this);
		panel.add(button_back);

//////////////////////////////////////


		String data[][] = {{"", "", "", ""}};
		
		String head[] = {"Id", "Name", "Designation", "Salary"};
		
		table_student = new JTable(data,head);
		table_student_sp = new JScrollPane(table_student);
		table_student_sp.setBounds(60,360, 665, 200);
		table_student.setEnabled(true);
		panel.add(table_student_sp);



		
		
/////////////////////////////
		this.add(panel);

}
		///////////////////////////////////////


	public void actionPerformed(ActionEvent ae)
	{
		/*String command = ae.getActionCommand();
		
		if(command.equals(button_load.getText()))
		{
			if(!s_userId_field.getText().equals("") || !s_userId_field.getText().equals(null))
			{
				Student s = 


			}*/
		






			
		
	}

}
