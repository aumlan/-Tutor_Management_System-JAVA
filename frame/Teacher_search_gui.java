package frame;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.sql.*;
import repository.*;
import entity.*;

public class Teacher_search_gui extends JFrame //implements ActionListener
{
	/*private JLabel ts_userId, ts_name, ts_email, ts_contact, ts_experience, ts_location,ts_edu_status, ts_edu_institution, ts_meduim, ts_gender, ts_salary, ts_password ;*/

	private JLabel ts_wellcome,ts_subject, ts_meduim, ts_experience, ts_gender, ts_location, ts_salary, ts_edu_institution;

	private JTextField ts_userId_field, ts_name_field, ts_email_field, ts_contacts_field, ts_experience_field, ts_location_field,ts_edu_status_field, ts_edu_institution_field, ts_meduim_field, ts_gender_field, ts_salary_field;

	private JPasswordField ts_password_field;

	private JRadioButton ts_gender_male, ts_gender_female;
	private JComboBox combo_box;
	private ButtonGroup bg;


private JTable table_tsearch;
	private JScrollPane table_tsearchSP;

	private JButton button_load, button_insert, button_delete, button_update, button_back, button_getAll;
	private Color color;
	private Font myFont;
	private Font myFont1;
	private JPanel panel;

	//private JCheckBox 




	public Teacher_search_gui()
	{
		super("Search Teacher");
		this.setSize(800,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		color = new Color(255,255,255);
myFont = new Font("Century", Font.BOLD, 13);
myFont1 = new Font("Century", Font.BOLD, 25);		
panel = new JPanel();
		panel.setLayout(null);
		//panel.setBackground(color);


		/*ts_field = new JTextField();
		ts_field.setBounds(20,40,295,50);
		ts_field.setBackground(Color.BLUE);
		panel.add(ts_field);*/

		/*ts_userId = new JLabel("User ID   :");
		ts_userId.setBounds(60,30,150,25);
		ts_userId.setFont(myFont);
		//name.setBackground(Color.GRAY);
		ts_userId.setOpaque(true);
		panel.add(ts_userId);

		ts_userId_field = new JTextField("");
		ts_userId_field.setBounds(260,32,150,25);
		//name_field.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//name_field.setOpaque(true);
		panel.add(ts_userId_field);*/

		ts_wellcome = new JLabel("Find Your Teacher");
		ts_wellcome.setBounds(20,30,150,25);
		ts_wellcome.setFont(myFont);
		//name.setBackground(Color.GRAY);
		ts_wellcome.setOpaque(true);
		panel.add(ts_wellcome);


         /////////////////////////////////

		ts_subject = new JLabel("Subject");
		ts_subject.setBounds(30,70,80,25);
		ts_subject.setFont(myFont);
		//name.setBackground(Color.GRAY);
		ts_subject.setOpaque(true);
		panel.add(ts_subject);

		/*ts_name_field = new JTextField("");
		ts_name_field.setBounds(250,62,150,25);
		//name_field.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//name_field.setOpaque(true);
		panel.add(ts_name_field);*/

		//////////////////////////////

		ts_meduim = new JLabel("Meduim  ");
		ts_meduim.setBounds(30,100,80,25);
		ts_meduim.setFont(myFont);
		//name.setBackground(Color.GRAY);
		ts_meduim.setOpaque(true);
		panel.add(ts_meduim);

		/*ts_email_field = new JTextField("");
		ts_email_field.setBounds(260,92,150,25);
		//name_field.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//name_field.setOpaque(true);
		panel.add(ts_email_field);*/

		////////////////////////////

		ts_edu_institution = new JLabel("Educational Institution:");
		ts_edu_institution.setBounds(30,130,190,25);
		ts_edu_institution.setFont(myFont);
		//name.setBackground(Color.GRAY);
		ts_edu_institution.setOpaque(true);
		panel.add(ts_edu_institution);


		////////////////////////////

		ts_experience = new JLabel("Experiyence(Year)  : ");
		ts_experience.setBounds(30,160,150,25);
		ts_experience.setFont(myFont);
		//name.setBackground(Color.GRAY);
		ts_experience.setOpaque(true);
		panel.add(ts_experience);

		/*ts_password_field = new JPasswordField("");
		ts_password_field.setBounds(260,122,150,25);
		//name_field.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//name_field.setOpaque(true);
		panel.add(ts_password_field);*/


        //////////////////////////////////////////

		ts_gender = new JLabel("Gender : ");
		ts_gender.setBounds(30,190,180,25);
		ts_gender.setFont(myFont);
		//name.setBackground(Color.GRAY);
		ts_gender.setOpaque(true);
		panel.add(ts_gender);

		/*ts_edu_status_field = new JTextField("");
		ts_edu_status_field.setBounds(260,152,150,25);
		//name_field.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//name_field.setOpaque(true);
		panel.add(ts_edu_status_field);*/

        
		/////////////////////////////////////

		ts_location = new JLabel("Location : ");
		ts_location.setBounds(30,220,180,25);
		ts_location.setFont(myFont);
		//name.setBackground(Color.GRAY);
		ts_location.setOpaque(true);
		panel.add(ts_location);

		/*ts_edu_institution_field = new JTextField("");
		ts_edu_institution_field.setBounds(260,182,150,25);
		//name_field.setFont(myFont);
		//name.setBackground(Color.GRAY);
		//name_field.setOpaque(true);
		panel.add(ts_edu_institution_field);*/
		
			////////////////////////////

		ts_salary = new JLabel("Salary Range :");
		ts_salary.setBounds(30,250,150,25);
		ts_salary.setFont(myFont);
		//name.setBackground(Color.GRAY);
		ts_salary.setOpaque(true);
		panel.add(ts_salary);

		//////////////////////////////

		ts_wellcome = new JLabel("Result: ");
		ts_wellcome.setBounds(30,320,150,25);
		ts_wellcome.setFont(myFont);
		//name.setBackground(Color.GRAY);
		ts_wellcome.setOpaque(true);
		panel.add(ts_wellcome);


///////////////////////////////
		String data[][] = {{""}};
		
		String head[] = {"Teachers ID"};
		
		table_tsearch = new JTable(data,head);
		table_tsearchSP = new JScrollPane(table_tsearch);
		table_tsearchSP.setBounds(40,360, 100, 200);
		table_tsearch.setEnabled(true);
		panel.add(table_tsearchSP);


		//////////////////////////
		
		ts_wellcome = new JLabel("Enter Teacher's ID: ");
		ts_wellcome.setBounds(160,360,150,25);
		ts_wellcome.setFont(myFont);
		//name.setBackground(Color.GRAY);
		ts_wellcome.setOpaque(true);
		panel.add(ts_wellcome);

		//////////////////////////////////

		/*button_load = new JButton("Load");
		button_load.setBounds(500, 120, 100, 30);
		panel.add(button_load);

		button_insert = new JButton("Insert");
		button_insert.setBounds(630, 120, 100, 30);
		panel.add(button_insert);

		button_update = new JButton("Update");
		button_update.setBounds(500, 170, 100, 30);
		panel.add(button_update);

		button_delete = new JButton("Delete");
		button_delete.setBounds(630, 170, 100, 30);
		panel.add(button_delete);

		button_back = new JButton("Back");
		button_back.setBounds(565, 220, 100, 30);
		panel.add(button_back);*/





		
		
/////////////////////////////
		this.add(panel);

}
		///////////////////////////////////////


	/*public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();
		//Calculation c = new Calculation();

		for (int i=0;i<butt.length;i++ ) 
		{
			if (command.equals(butt[i].getText())) 
			{
				display.setText(display.getText()+butt[i].getText());

					
			}
			else{}
		}	

		for (int i=0;i< arith.length ;i++ ) 
		{
			if (command.equals(arith[i].getText())) 
			{
				num1= Double.parseDouble(display.getText());
				//display.setText(display.getText()+arith[i].getText());
				display.setText("");
				res= arith[i].getText();			
			}
			else{}	
		}

		if (command.equals(bts_equal.getText())) 
			{
				num2= Double.parseDouble(display.getText());
				if("+".equals(res))
				{
					result= num1+num2;
				}
				else if ("-".equals(res)) 
				{
					result= num1-num2;	 		
				}
				else if ("*".equals(res)) 
				{
					result= num1*num2;	 		
				}
				else if ("/".equals(res)) 
				{
					result= num1/num2;	 		
				}
				display.setText(Double.toString(result));

			}

		if (command.equals(bts_ac.getText())) 
		{
			display.setText("");
			num1=0;
			num2=0;
		}
	}*/

}
