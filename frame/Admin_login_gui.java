package frame;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.sql.*;
import repository.*;
import entity.*;


public class Admin_login_gui extends JFrame implements ActionListener
{
	private JLabel a_userId, a_name, a_email, a_contact, a_experience, a_location,a_edu_status, a_edu_institution, a_meduim, a_gender, a_salary, a_password ;

	private JLabel admin_welcome;

	private JTextField a_userIdTF, a_nameTF, a_emailTF, a_contactTF, a_experienceTF, a_locationTF,a_edu_statusTF, a_edu_institutionTF, a_meduimTF, a_genderTF, a_salaryTF;

	private JPasswordField a_passwordTF;

	private JRadioButton a_gender_male, a_gender_female;
	private JComboBox combo_box;
	private ButtonGroup bg;

	private JButton button_myInfo ,button_mng_student,button_update , button_mng_teacher, button_changePassword, button_logout;
	private Color color;
	private Font myFont;
	private Font myFont1;
	private String user;

	private AdminRepo ar;

	private JPanel panel;

	public Admin_login_gui()
	{

	}

	public Admin_login_gui(String user)
	{
		super("Admin Login Form");
		this.setSize(800,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.user=user;
		
		color = new Color(255,255,255);
myFont = new Font("Century", Font.BOLD, 13);		
panel = new JPanel();
myFont1 = new Font("Century", Font.BOLD, 25);
		panel.setLayout(null);
		this.user=user;
		//panel.setBackground(color);


		admin_welcome = new JLabel("Welcome Admin :)");
		admin_welcome.setBounds(270,80,400,40);
		admin_welcome.setFont(myFont1);
		//name.setBackground(Color.GRAY);
		admin_welcome.setOpaque(true);
		panel.add(admin_welcome);

		///////////////////////////////////////


		a_userId = new JLabel("User ID     :");
		a_userId.setBounds(200,140,100,25);
		a_userId.setFont(myFont);
		//name.setBackground(Color.GRAY);
		a_userId.setOpaque(true);
		panel.add(a_userId);

		a_userIdTF = new JTextField("");
		a_userIdTF.setBounds(350,142,150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(a_userIdTF);


         /////////////////////////////////

		a_name = new JLabel("Name   : ");
		a_name.setBounds(200,170,100,25);
		a_name.setFont(myFont);
		//name.setBackground(Color.GRAY);
		a_name.setOpaque(true);
		panel.add(a_name);

		a_nameTF = new JTextField("");
		a_nameTF.setBounds(350,172,150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(a_nameTF);

		//////////////////////////////

		a_email = new JLabel("Email   : ");
		a_email.setBounds(200,200,100,25);
		a_email.setFont(myFont);
		//name.setBackground(Color.GRAY);
		a_email.setOpaque(true);
		panel.add(a_email);

		a_emailTF = new JTextField("");
		a_emailTF.setBounds(350,202,150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(a_emailTF);

		////////////////////////////

		a_password = new JLabel("Password   : ");
		a_password.setBounds(200,230,100,25);
		a_password.setFont(myFont);
		//name.setBackground(Color.GRAY);
		a_password.setOpaque(true);
		panel.add(a_password);

		a_passwordTF = new JPasswordField();
		a_passwordTF.setBounds(350,232,150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(a_passwordTF);

		//////////////////////////////

		a_contact = new JLabel("Contact Number :");
		a_contact.setBounds(200,260,100,25);
		a_contact.setFont(myFont);
		//name.setBackground(Color.GRAY);
		a_contact.setOpaque(true);
		panel.add(a_contact);

		a_contactTF = new JTextField("");
		a_contactTF.setBounds(350,262,150,25);
		//nameTF.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//nameTF.setOpaque(true);
		panel.add(a_contactTF);




		//////////////////////////////

		button_mng_student = new JButton("Manage Student");
		button_mng_student.setBounds(180, 365, 150, 30);
		button_mng_student.addActionListener(this);
		panel.add(button_mng_student);

		button_mng_teacher = new JButton("Manage Teacher");
		button_mng_teacher.setBounds(360, 365, 150, 30);
		button_mng_teacher.addActionListener(this);
		panel.add(button_mng_teacher);


		button_changePassword = new JButton("Change Password");
		button_changePassword.setBounds(180, 415, 150, 30);
		button_changePassword.addActionListener(this);
		panel.add(button_changePassword);

		button_logout = new JButton("Logout");
		button_logout.setBounds(360, 410, 150, 30);
		button_logout.addActionListener(this);
		panel.add(button_logout);

		button_myInfo = new JButton("Show My Info");
		button_myInfo.setBounds(180, 320, 150, 30);
		button_myInfo.addActionListener(this);;
		panel.add(button_myInfo);

		button_update = new JButton("Update");
		button_update.setBounds(360, 320, 150, 30);
		button_update.addActionListener(this);
		panel.add(button_update);









		/*tTF = new JTextField();
		tTF.setBounds(20,40,295,50);
		tTF.setBackground(Color.BLUE);
		panel.add(tTF);*/

		




		
		
/////////////////////////////
		this.add(panel);

}
		///////////////////////////////////////


	public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();
		//Calculation c = new Calculation();

		if (command.equals(button_mng_student.getText())) {
			
			Student_info_gui si = new Student_info_gui();
			si.setVisible(true);
			this.setVisible(false);
		}
		else if (command.equals(button_mng_teacher.getText())) {
			
			Teacher_info_gui ti = new Teacher_info_gui();
			ti.setVisible(true);
			this.setVisible(false);
		}
		else if (command.equals(button_logout.getText())) {
			
			Welcome_gui wg = new Welcome_gui();
			wg.setVisible(true);
			this.setVisible(false);
		}
		else if (command.equals(button_myInfo.getText())) 
		{
			Admin a = ar.searchAdmin(user);
			if (a != null) 
			{

				//String experience= Double.toString(a.getT_Experience());
				//String salary= Double.toString(a.getT_Salary());
				String cntact= Integer.toString(a.getA_Contact());



				a_userIdTF.setText(a.getA_UserID());
				a_nameTF.setText(a.getA_Name());
				a_emailTF.setText(a.getA_Email());
				a_passwordTF.setText(a.getA_Password());
				//a_edu_statusTF.setText(t.getT_Edu_Status());
				//a_edu_institutionTF.setText(t.getT_Edu_Institution());
				//a_meduimTF.setText(t.getT_Medium());
				//a_experienceTF.setText(t.getT_Experience());
				//a_locationTF.setText(t.getT_Location());
				a_contactTF.setText(cntact);
				//a_genderTF.setText(t.getT_Gender());

				a_userIdTF.setEnabled(false);
				a_nameTF.setEnabled(true);
				a_emailTF.setEnabled(true);
				a_passwordTF.setEnabled(true);
				//a_edu_statusTF.setEnabled(true);
				//a_edu_institutionTF.setEnabled(true);
				//a_meduimTF.setEnabled(true);
				//a_experienceTF.setEnabled(true);
				//a_locationTF.setEnabled(true);
				a_contactTF.setEnabled(true);
				//a_genderTF.setEnabled(true);
				
			}else{}
		}
		else if (command.equals(button_update.getText())) 
		{
			Admin a = new Admin();

			a_userId.setEnabled(false);

			int cntct = Integer.valueOf(a_contactTF.getText());

			a.setA_UserID(a_userIdTF.getText());
			a.setA_Name(a_nameTF.getText());
			a.setA_Email(a_emailTF.getText());
			a.setA_Password(a_passwordTF.getText());
			//t.setT_Edu_Status(t_edu_statusTF.getText());
			//t.setT_Edu_Institution(t_edu_institutionTF.getText());
			//t.setT_Medium(t_meduimTF.getText());
			//t.setT_Salary(t_salaryTF.getText());
			//t.setT_Location(t_locationTF.getText());
			a.setA_Contact(cntct);
			//t.setT_Gender(t_genderTF.getText());

			ar.updateAdmin(a);

			JOptionPane.showMessageDialog(this, "Updated");

			a_userIdTF.setText("");
			a_nameTF.setText("");
			a_emailTF.setText("");
			a_passwordTF.setText("");
			//t_edu_statusTF.setText("");
		//	t_edu_institutionTF.setText("");
		//	t_meduimTF.setText("");
		//	t_experienceTF.setText("");
			//a_locationTF.setText("");
			a_contactTF.setText("");
		//	t_genderTF.setText("");

			
		}
		else{}


}
}

