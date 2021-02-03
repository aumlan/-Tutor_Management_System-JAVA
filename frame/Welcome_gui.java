package frame;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.sql.*;

import repository.*;
import entity.*;

public class Welcome_gui extends JFrame implements ActionListener
{
	private JLabel user_display,user_ID,user_password, user_name, line;
	private JTextField user_IDTF;
	private JPasswordField user_passwordTF; 
	//private JComboBox combo_box;
	//private ButtonGroup bg;
	private JButton button_login,button_exit , button_student, button_teacher;
	private Color color;
	private Font myFont;
	private Font myFont1;
	private JPanel panel;

	public Welcome_gui()
	{
		super("Tutor Management System");
		this.setSize(800,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		color = new Color(255,255,255);
		myFont = new Font("Century", Font.BOLD, 13);
		myFont1 = new Font("Century", Font.BOLD, 25);		
		panel = new JPanel();
		panel.setLayout(null);
		//panel.setBackground(color);


		user_display = new JLabel("Welcome to FindYourTutor");
		user_display.setBounds(220,150,400,40);
		user_display.setFont(myFont1);
		//name.setBackground(Color.GRAY);
		user_display.setOpaque(true);
		panel.add(user_display);





////////////////////////////////////////

		user_ID = new JLabel("UserID: ");
		user_ID.setBounds(50,260,130,40);
		user_ID.setFont(myFont);
		//name.setBackground(Color.GRAY);
		user_ID.setOpaque(true);
		panel.add(user_ID);

		user_IDTF = new JTextField("");
		user_IDTF.setBounds(180,265,200,30);
		//name_field.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//name_field.setOpaque(true);
		panel.add(user_IDTF);


         /////////////////////////////////

		user_password = new JLabel("Password");
		user_password.setBounds(50,310,130,40);
		user_password.setFont(myFont);
		//name.setBackground(Color.GRAY);
		user_password.setOpaque(true);
		panel.add(user_password);

		user_passwordTF = new JPasswordField();
		user_passwordTF.setBounds(180,315,200,30);
		user_passwordTF.setEchoChar('*');
		//name_field.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//name_field.setOpaque(true);
		panel.add(user_passwordTF);

		button_login = new JButton("Login");
		button_login.setBounds(180, 370, 90, 30);
		button_login.addActionListener(this);
		panel.add(button_login);

		button_exit = new JButton("Exit");
		button_exit.setBounds(285, 370, 90, 30);
		button_exit.addActionListener(this);
		panel.add(button_exit);




		//////////////////////////////

		line = new JLabel(" | ");
		line.setBounds(420,240,10,15);
		line.setOpaque(true);
		panel.add(line);
		line = new JLabel(" | ");
		line.setBounds(420,255,10,15);
		line.setOpaque(true);
		panel.add(line);
		line = new JLabel(" | ");
		line.setBounds(420,270,10,15);
		line.setOpaque(true);
		panel.add(line);
		line = new JLabel(" | ");
		line.setBounds(420,285,10,15);
		line.setOpaque(true);
		panel.add(line);
		line = new JLabel(" | ");
		line.setBounds(420,300,10,15);
		line.setOpaque(true);
		panel.add(line);
		line = new JLabel(" | ");
		line.setBounds(420,315,10,15);
		line.setOpaque(true);
		panel.add(line);
		line = new JLabel(" | ");
		line.setBounds(420,330,10,15);
		line.setOpaque(true);
		panel.add(line);
		line = new JLabel(" | ");
		line.setBounds(420,345,10,15);
		line.setOpaque(true);
		panel.add(line);

		line = new JLabel(" | ");
		line.setBounds(420,360,10,15);
		line.setOpaque(true);
		panel.add(line);
		line = new JLabel(" | ");
		line.setBounds(420,375,10,15);
		line.setOpaque(true);
		panel.add(line);

		//////////////////////////////

		user_name = new JLabel("Don't Have an Account?");
		user_name.setBounds(480,270,400,15);
		user_name.setFont(myFont);
		//name.setBackground(Color.GRAY);
		user_name.setOpaque(true);
		panel.add(user_name);

		user_name = new JLabel("Sign Up!");
		user_name.setBounds(530,290,400,15);
		user_name.setFont(myFont);
		//name.setBackground(Color.GRAY);
		user_name.setOpaque(true);
		panel.add(user_name);

		//////////////////////////////


		button_student = new JButton("Student");
		button_student.setBounds(450, 330, 100, 30);
		button_student.addActionListener(this);
		panel.add(button_student);

		button_teacher = new JButton("Teacher");
		button_teacher.setBounds(570, 330, 110, 30);
		button_teacher.addActionListener(this);
		panel.add(button_teacher);

		/////////////////////////

		

		
		
/////////////////////////////
		this.add(panel);

}
		///////////////////////////////////////


	public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();
		//Calculation c = new Calculation();


		if (command.equals(button_login.getText())) 
		{
			
		TeacherRepo tr= new TeacherRepo();
		Teacher teacher = tr.getTeacher(user_IDTF.getText(),user_passwordTF.getText());

		StudentRepo sr= new StudentRepo();
		Student student = sr.getStudent(user_IDTF.getText(), user_passwordTF.getText());

		AdminRepo ar= new AdminRepo();
		Admin admin = ar.getAdmin(user_IDTF.getText(), user_passwordTF.getText());

			if(teacher != null )
				{
					if (teacher.getT_Status() == 2) 
					{
						
						String user = teacher.getT_UserID();
						//Teacher tch= tr.searchTeacher(user_nameTF.getText());
						Teacher_login_gui tl = new Teacher_login_gui(user);
						tl.setVisible(true);
						this.setVisible(false);

					}else{}
				}else{}
				
			if (student != null) 
			{
				if (student.getS_Status() == 1) 
				{
				
					String user = student.getS_UserID();
					//Student st = sr.searchStudent(user_nameTF.getText());
					Student_Login_gui sl = new Student_Login_gui(user);
					sl.setVisible(true);
					this.setVisible(false);	
				}else{}
			}
			if( admin != null)
			{
				if (admin.getA_Status() == 0) 
				{
				
					String user = admin.getA_UserID();
					//Admin ad = ar.searchStudent(user_nameTF.getText());
					Admin_login_gui sl = new Admin_login_gui(user);
					sl.setVisible(true);
					this.setVisible(false);	
				}
			}

			else{} 
			{
				JOptionPane.showMessageDialog(this, "Invaild Id or Password");
			}

		}


		else if(command.equals(button_exit.getText()))
		{
			System.exit(0);
		}

		else if (command.equals(button_student.getText())) 
		{
				Student_Sign_up_gui ss= new Student_Sign_up_gui();
			ss.setVisible(true);
			this.setVisible(false);
			
		}
		else if (command.equals(button_teacher.getText())) 
		{
				Teacher_Sign_up_gui ts= new Teacher_Sign_up_gui();
			ts.setVisible(true);
			this.setVisible(false);
			
		}
		else{}





	}




		
}


