package frame;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.sql.*;
import repository.*;
import entity.*;

public class Teacher_info_gui extends JFrame implements ActionListener
{
	private JLabel t_userId, t_name, t_email, t_contact, t_experience, t_location,t_edu_status, t_edu_institution, t_meduim, t_gender, t_salary, t_password ;

	private JTextField t_userIdTF, t_nameTF, t_emailTF, t_contactTF, t_experienceTF, t_locationTF,t_edu_statusTF, t_edu_institutionTF, t_meduimTF, t_genderTF, t_salaryTF;

	private JPasswordField t_passwordTF;

	private JTable table_teacher;
	private JScrollPane table_teacher_sp;

	private JRadioButton t_gender_male, t_gender_female;
	private JComboBox combo_box;
	private ButtonGroup bg;

	private JButton button_load, button_insert, button_delete, button_update, button_back, button_getAll;
	private Color color;
	private Font myFont;
	private JPanel panel;

	public Teacher_info_gui()
	{
		super("Manage Teacher");
		this.setSize(800,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		color = new Color(255,255,255);
myFont = new Font("Century", Font.BOLD, 13);		panel = new JPanel();
		panel.setLayout(null);
		//panel.setBackground(color);


		/*tTF = new JTextField();
		tTF.setBounds(20,40,295,50);
		tTF.setBackground(Color.BLUE);
		panel.add(tTF);*/

		t_userId = new JLabel("User ID   :");
		t_userId.setBounds(60,30,150,25);
		t_userId.setFont(myFont);
		//name.setBackground(Color.GRAY);
		t_userId.setOpaque(true);
		panel.add(t_userId);

		t_userIdTF = new JTextField("");
		t_userIdTF.setBounds(260,32,150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(t_userIdTF);


         /////////////////////////////////

		t_name = new JLabel("Name   : ");
		t_name.setBounds(60,60,150,25);
		t_name.setFont(myFont);
		//name.setBackground(Color.GRAY);
		t_name.setOpaque(true);
		panel.add(t_name);

		t_nameTF = new JTextField("");
		t_nameTF.setBounds(260,62,150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(t_nameTF);

		//////////////////////////////

		t_email = new JLabel("Email   : ");
		t_email.setBounds(60,90,150,25);
		t_email.setFont(myFont);
		//name.setBackground(Color.GRAY);
		t_email.setOpaque(true);
		panel.add(t_email);

		t_emailTF = new JTextField("");
		t_emailTF.setBounds(260,92,150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(t_emailTF);

		////////////////////////////

		t_password = new JLabel("Password   : ");
		t_password.setBounds(60,120,150,25);
		t_password.setFont(myFont);
		//name.setBackground(Color.GRAY);
		t_password.setOpaque(true);
		panel.add(t_password);

		t_passwordTF = new JPasswordField("");
		t_passwordTF.setBounds(260,122,150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(t_passwordTF);


        //////////////////////////////////////////

		t_edu_status = new JLabel("Educational Status  : ");
		t_edu_status.setBounds(60,150,180,25);
		t_edu_status.setFont(myFont);
		//name.setBackground(Color.GRAY);
		t_edu_status.setOpaque(true);
		panel.add(t_edu_status);

		t_edu_statusTF = new JTextField("");
		t_edu_statusTF.setBounds(260,152,150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(t_edu_statusTF);

        
		/////////////////////////////////////

		t_edu_institution = new JLabel("Educational Institution : ");
		t_edu_institution.setBounds(60,180,180,25);
		t_edu_institution.setFont(myFont);
		//name.setBackground(Color.GRAY);
		t_edu_institution.setOpaque(true);
		panel.add(t_edu_institution);

		t_edu_institutionTF = new JTextField("");
		t_edu_institutionTF.setBounds(260,182,150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(t_edu_institutionTF);
		
			////////////////////////////

		t_meduim = new JLabel("Meduim   :");
		t_meduim.setBounds(60,210,150,25);
		t_meduim.setFont(myFont);
		//name.setBackground(Color.GRAY);
		t_meduim.setOpaque(true);
		panel.add(t_meduim);

		t_meduimTF = new JTextField("");
		t_meduimTF.setBounds(260,212,150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(t_meduimTF);

		///////////////////////////////

		t_experience = new JLabel("Experience     :");
		t_experience.setBounds(60,240,150,25);
		t_experience.setFont(myFont);
		//name.setBackground(Color.GRAY);
		t_experience.setOpaque(true);
		panel.add(t_experience);

		t_experienceTF = new JTextField("");
		t_experienceTF.setBounds(260,242,150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(t_experienceTF);
		/////////////////////////////////

		t_salary = new JLabel("Salary :");
		t_salary.setBounds(60,270,150,25);
		t_salary.setFont(myFont);
		//name.setBackground(Color.GRAY);
		t_salary.setOpaque(true);
		panel.add(t_salary);

		String items[] = {"2000-5000", "5000-8000", "8000-12000", "12000-15000"};
		
		combo_box = new JComboBox(items);
		combo_box.setBounds(260,272, 150,25);
		panel.add(combo_box);

		//////////////////////////////

		t_location = new JLabel("Location :");
		t_location.setBounds(60,300,150,25);
		t_location.setFont(myFont);
		//name.setBackground(Color.GRAY);
		t_location.setOpaque(true);
		panel.add(t_location);

		t_locationTF = new JTextField("");
		t_locationTF.setBounds(260,302,150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(t_locationTF);


		//////////////////////////////

		t_contact = new JLabel("Contact Number  :");
		t_contact.setBounds(60,330,150,25);
		t_contact.setFont(myFont);
		//name.setBackground(Color.GRAY);
		t_contact.setOpaque(true);
		panel.add(t_contact);

		t_contactTF = new JTextField("");
		t_contactTF.setBounds(260,332,150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(t_contactTF);

		///////////////////////////

		

		////////////////////////

		t_gender = new JLabel("Gender     :");
		t_gender.setBounds(60,360,150,25);
		t_gender.setFont(myFont);
		//name.setBackground(Color.GRAY);
		t_gender.setOpaque(true);
		panel.add(t_gender);

		t_genderTF = new JTextField("");
		t_genderTF.setBounds(260,362,150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(t_genderTF);


		//////////////////////////
		
		button_getAll = new JButton("Get All");
		button_getAll.setBounds(555, 70, 100, 30);
		button_getAll.addActionListener(this);
		panel.add(button_getAll);


		button_load = new JButton("Load");
		button_load.setBounds(490, 120, 100, 30);
		button_load.addActionListener(this);
		panel.add(button_load);

		button_insert = new JButton("Insert");
		button_insert.setBounds(620, 120, 100, 30);
		button_insert.addActionListener(this);
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
		///////////////////////////////////////

		String data[][] = {{"", "", "", ""}};
		
		String head[] = {"Id", "Name", "Designation", "Salary"};
		
		table_teacher = new JTable(data,head);
		table_teacher_sp = new JScrollPane(table_teacher);
		table_teacher_sp.setBounds(60,400, 665, 200);
		table_teacher.setEnabled(true);
		panel.add(table_teacher_sp);





		
		
/////////////////////////////
		this.add(panel);

}
		///////////////////////////////////////


	public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();
		//Calculation c = new Calculation();

		
}
}

