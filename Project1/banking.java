package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
public class banking{
	public static void main(String args[])
	{
		//Creates ArrayList to hold customer's data
		ArrayList<Customer> CustomerLista = new ArrayList<>();
		try
		{
			//Finds files for data
	   		  FileInputStream fstream = new FileInputStream("C:\\Users\\Brian\\eclipse-workspace\\data.txt");
	   		  DataInputStream in = new DataInputStream(fstream);
	   		  BufferedReader br = new BufferedReader(new InputStreamReader(in));
	   		  String strLine;
	   		  int count = 0;
	   		  //Reads in every twelve lines of data as a customer 
		do {
            strLine = br.readLine();
            CustomerLista.add(new Customer());
            CustomerLista.get(count).firstname = strLine;
            strLine=br.readLine();
            CustomerLista.get(count).lastname = strLine;
            strLine=br.readLine();
            CustomerLista.get(count).streetaddress = strLine;
            strLine=br.readLine();
            CustomerLista.get(count).city = strLine;
            strLine=br.readLine();
            CustomerLista.get(count).state = strLine;
            strLine=br.readLine();
            CustomerLista.get(count).branch = strLine;
            strLine=br.readLine();
            CustomerLista.get(count).loanbalance = Double.parseDouble(strLine);
            strLine=br.readLine();
            CustomerLista.get(count).email = Integer.parseInt(strLine);
            strLine=br.readLine();
            CustomerLista.get(count).zipcode = Integer.parseInt(strLine);
            strLine=br.readLine();
            CustomerLista.get(count).accountnumber = Integer.parseInt(strLine);
            strLine=br.readLine();
            CustomerLista.get(count).aptnumber = Integer.parseInt(strLine);
            strLine=br.readLine();
            CustomerLista.get(count).phonenumber = Long.parseLong(strLine);
            strLine=br.readLine();
            count++;
        }while(strLine!=null);
		
		 //Close the input stream
 		  in.close();
 		    }catch (Exception e){//Catch exception if any
 		  System.err.println("Error: " + e.getMessage());
 		  }
		

		//Creation of the Option Array
		String OptionsArray[] = {"First Name","Last Name","Street Address","City","State","Branch","Phone Number","Email ID", "Appartment Number", "Zipcode", "Account Number","Loan Amount"};
		
		//Creation of JFrame and all the Various JPanels
		JFrame BankSystem = new JFrame("Banking System");
		JPanel passwordscreen = new JPanel();
		JPanel Admin = new JPanel();
		JPanel BankEmployee = new JPanel();
		JPanel AccountNumber = new JPanel();
		JPanel Customer = new JPanel();
		//Creates Cardlayout
		JPanel cards = new JPanel(new CardLayout());
		cards.add(passwordscreen);
		cards.add(AccountNumber, "AccountNumber");
		cards.add(Admin, "Admin");
		cards.add(BankEmployee, "BankEmployee");
		cards.add(Customer, "Customer");
		
		
		//Creation of Password Screen
		JLabel passwordlabel = new JLabel("Please enter your password");
		JTextField passwordtext = new JTextField();
		JButton passwordbutton  = new JButton("Enter");
		passwordscreen.setLayout(null);
		passwordlabel.setBounds(210, 20, 400, 60);
		passwordlabel.setFont(new Font("Arial", Font.PLAIN, 30));
		passwordtext.setBounds(290, 80, 200, 50);
		passwordtext.setFont(new Font("Arial", Font.PLAIN, 30));
		passwordbutton.setBounds(315, 140, 150, 40);
		passwordscreen.add(passwordlabel);
		passwordscreen.add(passwordtext);
		
		//Creation of Password Check Button
		passwordbutton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
					String password = passwordtext.getText();
					if(password.equals("admin"))
					{
						CardLayout cardLayout = (CardLayout)(cards.getLayout());
			               cardLayout.show(cards, "AccountNumber");    
					}
					else if(password.equals("employee"))
					{
						CardLayout cardLayout = (CardLayout)(cards.getLayout());
			               cardLayout.show(cards, "AccountNumber"); 
					}
					else if(password.equals("customer"))
					{
						CardLayout cardLayout = (CardLayout)(cards.getLayout());
						cardLayout.show(cards, "AccountNumber");
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Please enter a correct password");
					}
			}
		});
		
				//Creation of AccountNumber Screen
				JLabel AccountNumberLabel = new JLabel("Account Number");
				AccountNumberLabel.setBounds(275, 15, 400, 60);
				AccountNumberLabel.setFont(new Font("Arial", Font.PLAIN, 30));
				JTextField AccountNumberEntry = new JTextField();
				AccountNumberEntry.setBounds(237, 80, 300, 50);
				AccountNumberEntry.setFont(new Font("Arial", Font.PLAIN, 30));
				JButton AccountNumberButton = new JButton("Enter");
				AccountNumberButton.setBounds(280, 150, 200, 50);
				AccountNumberButton.setFont(new Font("Arial", Font.PLAIN, 20));
				AccountNumber.setLayout(null);
				AccountNumber.add(AccountNumberLabel);
				AccountNumber.add(AccountNumberEntry);
				AccountNumber.add(AccountNumberButton);
				
				//Creation of Account Number Checker Button
				AccountNumberButton.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent f)
					{
						String password = passwordtext.getText();
						String AccountNumber = AccountNumberEntry.getText();
						int AccountNumberInt = Integer.parseInt(AccountNumber);
						int AccountNumberStored = 0;
						for(int i = 0; i < CustomerLista.size(); i++)
						{
							if(AccountNumberInt == CustomerLista.get(i).accountnumber)
							{
								AccountNumberStored = AccountNumberInt;
							}
							
						}
						String AccountNumberInput = Integer.toString(AccountNumberStored);
				if(password.equals("admin") && AccountNumber.equals(AccountNumberInput))
				{
					CardLayout cardLayout = (CardLayout)(cards.getLayout());
		               cardLayout.show(cards, "Admin");    
				}
				else if(password.equals("employee") && AccountNumber.equals(AccountNumberInput))
				{
					CardLayout cardLayout = (CardLayout)(cards.getLayout());
		               cardLayout.show(cards, "BankEmployee"); 
				}
				else if(password.equals("customer") && AccountNumber.equals(AccountNumberInput))
				{
					CardLayout cardLayout = (CardLayout)(cards.getLayout());
					cardLayout.show(cards, "Customer");
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Please enter a correct account number");
				}
					}
				});
		
				//Creation of Admin Screen
				JLabel AdminLabel = new JLabel("Admin");
				AdminLabel.setBounds(350, 15, 400, 60);
				AdminLabel.setFont(new Font("Arial", Font.PLAIN, 30));
				JComboBox AdminList = new JComboBox(OptionsArray);
				AdminList.setBounds(50, 80, 200, 30);
				AdminList.setFont(new Font("Arial", Font.PLAIN, 20));
				JTextField AdminEntry = new JTextField();
				AdminEntry.setFont(new Font("Arial", Font.PLAIN, 20));
				AdminEntry.setBounds(275, 80, 200, 30);
				JButton AdminAdd = new JButton("Edit");
				AdminAdd.setFont(new Font("Arial", Font.PLAIN, 20));
				AdminAdd.setBounds(500, 80, 100, 30);
				JButton AdminDelete = new JButton("Delete");
				AdminDelete.setFont(new Font("Arial", Font.PLAIN, 20));
				AdminDelete.setBounds(500, 120, 100, 30);
				JButton AdminExit = new JButton("Exit");
				AdminExit.setFont(new Font("Arial", Font.PLAIN, 20));
				AdminExit.setBounds(500, 160, 100, 30);
				Admin.add(AdminEntry);
				Admin.add(AdminExit);
				Admin.add(AdminAdd);
				Admin.add(AdminDelete);
				Admin.setLayout(null);
				Admin.add(AdminLabel);
				Admin.add(AdminList);
				
				
				AdminExit.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent y) {
						
						try {
				            FileWriter writer = new FileWriter("C:\\Users\\Brian\\eclipse-workspace\\data.txt", false);
				            for(int o = 0; o < CustomerLista.size(); o++)
				            {
				            	writer.write(CustomerLista.get(o).firstname + "\r\n");
				            	writer.write(CustomerLista.get(o).lastname + "\r\n");
				            	writer.write(CustomerLista.get(o).streetaddress + "\r\n");
				            	writer.write(CustomerLista.get(o).city + "\r\n");
				            	writer.write(CustomerLista.get(o).state + "\r\n");
				            	writer.write(CustomerLista.get(o).branch + "\r\n");
				            	writer.write(CustomerLista.get(o).loanbalance + "\r\n");
				            	writer.write(CustomerLista.get(o).email + "\r\n");
				            	writer.write(CustomerLista.get(o).zipcode + "\r\n");
				            	writer.write(CustomerLista.get(o).accountnumber + "\r\n");
				            	writer.write(CustomerLista.get(o).aptnumber + "\r\n");
				            	writer.write(CustomerLista.get(o).phonenumber + "\r\n");
				            }
				            writer.close();
				        } catch (IOException e) {
				            e.printStackTrace();
				        }
					}
				});
				
				
				//Creation of Admin Bring Up Data Button
				AdminList.addActionListener(new ActionListener() {
					 
				    public void actionPerformed(ActionEvent event) {
				    	int number = 0;
				    	String AccountNumber = AccountNumberEntry.getText();
				    	int AccountNumberInt = Integer.parseInt(AccountNumber);
						for(int a = 0; a < CustomerLista.size(); a++)
						{
							if(AccountNumberInt == CustomerLista.get(a).accountnumber)
							{
								number = a;
							}
						}
				        String selectedInfo = (String) AdminList.getSelectedItem();
				 
				        if(selectedInfo.equals("First Name"))
				        {
				        	AdminEntry.setText(CustomerLista.get(number).firstname);
				        }
				        else if(selectedInfo.equals("Last Name"))
				        {
				        	AdminEntry.setText(CustomerLista.get(number).lastname);
				        }
				        else if(selectedInfo.equals("Street Address"))
				        {
				        	AdminEntry.setText(CustomerLista.get(number).streetaddress);
				        }
				        else if(selectedInfo.equals("City"))
				        {
				        	AdminEntry.setText(CustomerLista.get(number).city);
				        }
				        else if(selectedInfo.equals("State"))
				        {
				        	AdminEntry.setText(CustomerLista.get(number).state);
				        }
				        else if(selectedInfo.equals("Branch"))
				        {
				        	AdminEntry.setText(CustomerLista.get(number).branch);
				        }
				        else if(selectedInfo.equals("Phone Number"))
				        {
				        	AdminEntry.setText(String.valueOf(CustomerLista.get(number).phonenumber));
				        }
				        else if(selectedInfo.equals("Email ID"))
				        {
				        	AdminEntry.setText(String.valueOf(CustomerLista.get(number).email));
				        }
				        else if(selectedInfo.equals("Appartment Number"))
				        {
				        	AdminEntry.setText(String.valueOf(CustomerLista.get(number).aptnumber));
				        }
				        else if(selectedInfo.equals("Zipcode"))
				        {
				        	AdminEntry.setText(String.valueOf(CustomerLista.get(number).zipcode));
				        }
				        else if(selectedInfo.equals("Account Number"))
				        {
				        	AdminEntry.setText(String.valueOf(CustomerLista.get(number).accountnumber));
				        }
				        else if(selectedInfo.equals("Loan Amount"))
				        {
				        	AdminEntry.setText(String.valueOf(CustomerLista.get(number).loanbalance));
				        }
						}
				    
				});
				
				//Creation of Admin Save Button
				AdminAdd.addActionListener(new ActionListener()
						{
						public void actionPerformed(ActionEvent a)
						{
							int number = 0;
					    	String AccountNumber = AccountNumberEntry.getText();
					    	int AccountNumberInt = Integer.parseInt(AccountNumber);
							for(int b = 0; b < CustomerLista.size(); b++)
							{
								if(AccountNumberInt == CustomerLista.get(b).accountnumber)
								{
									number = b;
									
								}
							}
							String EmployeeEnteredData = AdminEntry.getText();
							
					        String selectedInfo = (String) AdminList.getSelectedItem();
					        
							if(selectedInfo.equals("First Name"))
					        {
					        	CustomerLista.get(number).firstname = EmployeeEnteredData;
					        }
					        else if(selectedInfo.equals("Last Name"))
					        {
					        	CustomerLista.get(number).lastname = EmployeeEnteredData;
					        }
					        else if(selectedInfo.equals("Street Address"))
					        {
					        	CustomerLista.get(number).streetaddress = EmployeeEnteredData;
					        }
					        else if(selectedInfo.equals("City"))
					        {
					        	CustomerLista.get(number).city = EmployeeEnteredData;
					        }
					        else if(selectedInfo.equals("State"))
					        {
					        	CustomerLista.get(number).state = EmployeeEnteredData;
					        }
					        else if(selectedInfo.equals("Branch"))
					        {
					        	CustomerLista.get(number).branch = EmployeeEnteredData;
					        }
					        else if(selectedInfo.equals("Phone Number"))
					        {
					        	CustomerLista.get(number).phonenumber = Integer.parseInt(EmployeeEnteredData);
					        }
					        else if(selectedInfo.equals("Email ID"))
					        {
					        	CustomerLista.get(number).email = Integer.parseInt(EmployeeEnteredData);
					        }
					        else if(selectedInfo.equals("Appartment Number"))
					        {
					        	CustomerLista.get(number).aptnumber = Integer.parseInt(EmployeeEnteredData);
					        }
					        else if(selectedInfo.equals("Zipcode"))
					        {
					        	CustomerLista.get(number).zipcode = Integer.parseInt(EmployeeEnteredData);
					        }
					        else if(selectedInfo.equals("Account Number"))
					        {
					        	CustomerLista.get(number).accountnumber = Integer.parseInt(EmployeeEnteredData);
					        }
					        else if(selectedInfo.equals("Loan Amount"))
					        {
					        	CustomerLista.get(number).loanbalance = Integer.parseInt(EmployeeEnteredData);
					        }
						}
					
						});
				
				//Creation of Admin Data Delete Button
				AdminDelete.addActionListener(new ActionListener()
				{
				public void actionPerformed(ActionEvent c)
				{
					int number = 0;
			    	String AccountNumber = AccountNumberEntry.getText();
			    	int AccountNumberInt = Integer.parseInt(AccountNumber);
					for(int b = 0; b < CustomerLista.size(); b++)
					{
						if(AccountNumberInt == CustomerLista.get(b).accountnumber)
						{
							number = b;
							
						}
					}
					
			        String selectedInfo = (String) AdminList.getSelectedItem();
			        
					if(selectedInfo.equals("First Name"))
			        {
			        	CustomerLista.get(number).firstname = "default";
			        }
			        else if(selectedInfo.equals("Last Name"))
			        {
			        	CustomerLista.get(number).lastname = "default";
			        }
			        else if(selectedInfo.equals("Street Address"))
			        {
			        	CustomerLista.get(number).streetaddress = "default";
			        }
			        else if(selectedInfo.equals("City"))
			        {
			        	CustomerLista.get(number).city = "default";
			        }
			        else if(selectedInfo.equals("State"))
			        {
			        	CustomerLista.get(number).state = "default";
			        }
			        else if(selectedInfo.equals("Branch"))
			        {
			        	CustomerLista.get(number).branch = "default";
			        }
			        else if(selectedInfo.equals("Phone Number"))
			        {
			        	CustomerLista.get(number).phonenumber = 0;
			        }
			        else if(selectedInfo.equals("Email ID"))
			        {
			        	CustomerLista.get(number).email = 0;
			        }
			        else if(selectedInfo.equals("Appartment Number"))
			        {
			        	CustomerLista.get(number).aptnumber = 0;
			        }
			        else if(selectedInfo.equals("Zipcode"))
			        {
			        	CustomerLista.get(number).zipcode = 0;
			        }
			        else if(selectedInfo.equals("Account Number"))
			        {
			        	CustomerLista.get(number).accountnumber = 0;
			        }
			        else if(selectedInfo.equals("Loan Amount"))
			        {
			        	CustomerLista.get(number).loanbalance = 0;
			        }
				}
			
				});
				
				//Creation of Bank Employee Screen
				
				JLabel BankEmployeeLabel = new JLabel("Bank Employee");
				BankEmployeeLabel.setBounds(300, 15, 400, 60);
				BankEmployeeLabel.setFont(new Font("Arial", Font.PLAIN, 30));
				JComboBox EmployeeList = new JComboBox(OptionsArray);
				EmployeeList.setBounds(50, 80, 200, 30);
				EmployeeList.setFont(new Font("Arial", Font.PLAIN, 20));
				JTextField EmployeeEntry = new JTextField();
				EmployeeEntry.setFont(new Font("Arial", Font.PLAIN, 20));
				EmployeeEntry.setBounds(275, 80, 200, 30);
				JButton EmployeeAdd = new JButton("Add");
				EmployeeAdd.setFont(new Font("Arial", Font.PLAIN, 20));
				EmployeeAdd.setBounds(500, 80, 100, 30);
				JButton EmployeeExit = new JButton("Exit");
				EmployeeExit.setFont(new Font("Arial", Font.PLAIN, 20));
				EmployeeExit.setBounds(500, 120, 100, 30);
				BankEmployee.setLayout(null);
				BankEmployee.add(EmployeeExit);
				BankEmployee.add(BankEmployeeLabel);
				BankEmployee.add(EmployeeList);
				BankEmployee.add(EmployeeEntry);
				BankEmployee.add(EmployeeAdd);
				
				
				//Creation of Employee Bring Up Data Button
				EmployeeList.addActionListener(new ActionListener() {
					 
				    public void actionPerformed(ActionEvent event) {
				    	int number = 0;
				    	String AccountNumber = AccountNumberEntry.getText();
				    	int AccountNumberInt = Integer.parseInt(AccountNumber);
						for(int a = 0; a < CustomerLista.size(); a++)
						{
							if(AccountNumberInt == CustomerLista.get(a).accountnumber)
							{
								number = a;
							}
						}
				        String selectedInfo = (String) EmployeeList.getSelectedItem();
				 
				        if(selectedInfo.equals("First Name"))
				        {
				        	EmployeeEntry.setText(CustomerLista.get(number).firstname);
				        	if(CustomerLista.get(number).firstname.equals("default") ^ CustomerLista.get(number).firstname.equals(""))
				        	{
				        		EmployeeEntry.setEditable(true);
				        	}
				        	else
				        	{
				        		EmployeeEntry.setEditable(false);
				        	}
				        }
				        
				        if(selectedInfo.equals("Last Name"))
				        {
				        	EmployeeEntry.setText(CustomerLista.get(number).lastname);
				        	
				        	if(CustomerLista.get(number).lastname.equals("default") ^ CustomerLista.get(number).lastname.equals(""))
				        	{
				        		EmployeeEntry.setEditable(true);
				        	}
				        	else
				        	{
				        		EmployeeEntry.setEditable(false);
				        	}
				        	
				        }
				        if(selectedInfo.equals("Street Address"))
				        {
				        	
				        	EmployeeEntry.setText(CustomerLista.get(number).streetaddress);
				        	if(CustomerLista.get(number).streetaddress.equals("default") ^ CustomerLista.get(number).streetaddress.equals(""))
				        	{
				        		EmployeeEntry.setEditable(true);
				        	}
				        	else
				        	{
				        		EmployeeEntry.setEditable(false);
				        	}
				        }
				        if(selectedInfo.equals("City"))
				        {
				        	
				        	EmployeeEntry.setText(CustomerLista.get(number).city);
				        	if(CustomerLista.get(number).city.equals("default") ^ CustomerLista.get(number).city.equals(""))
				        	{
				        		EmployeeEntry.setEditable(true);
				        	}
				        	else
				        	{
				        		EmployeeEntry.setEditable(false);
				        	}
				        }
				        if(selectedInfo.equals("State"))
				        {
				     
				        	EmployeeEntry.setText(CustomerLista.get(number).state);
				        	if(CustomerLista.get(number).state.equals("default") ^ CustomerLista.get(number).state.equals(""))
				        	{
				        		EmployeeEntry.setEditable(true);
				        	}
				        	else
				        	{
				        		EmployeeEntry.setEditable(false);
				        	}
				        }
				        if(selectedInfo.equals("Branch"))
				        {
				        	EmployeeEntry.setText(CustomerLista.get(number).branch);
				        	if(CustomerLista.get(number).branch.equals("default") ^ CustomerLista.get(number).branch.equals(""))
				        	{
				        		EmployeeEntry.setEditable(true);
				        	}
				        	else
				        	{
				        		EmployeeEntry.setEditable(false);
				        	}
				        }
				        if(selectedInfo.equals("Phone Number"))
				        {
				        	EmployeeEntry.setText(String.valueOf(CustomerLista.get(number).phonenumber));
				        	if(CustomerLista.get(number).phonenumber != 0)
				        	{
				        		EmployeeEntry.setEditable(false);
				        	}
				        	else
				        	{
				        		EmployeeEntry.setEditable(true);
				        	}
				        }
				        if(selectedInfo.equals("Email ID"))
				        {
				        	EmployeeEntry.setText(String.valueOf(CustomerLista.get(number).email));
				        	if(CustomerLista.get(number).email != 0)
				        	{
				        		EmployeeEntry.setEditable(false);
				        	}
				        	else
				        	{
				        		EmployeeEntry.setEditable(true);
				        	}
				        	
				        }
				        if(selectedInfo.equals("Appartment Number"))
				        {
				        	EmployeeEntry.setText(String.valueOf(CustomerLista.get(number).aptnumber));
				        	if(CustomerLista.get(number).aptnumber != 0)
				        	{
				        		EmployeeEntry.setEditable(false);
				        	}
				        	else
				        	{
				        		EmployeeEntry.setEditable(true);
				        	}
				        	
				        }
				        if(selectedInfo.equals("Zipcode"))
				        {
				        	EmployeeEntry.setText(String.valueOf(CustomerLista.get(number).zipcode));
				        	if(CustomerLista.get(number).zipcode != 0)
				        	{
				        		EmployeeEntry.setEditable(false);
				        	}
				        	else
				        	{
				        		EmployeeEntry.setEditable(true);
				        	}
				        	
				        }
				        if(selectedInfo.equals("Account Number"))
				        {
				        	EmployeeEntry.setText(String.valueOf(CustomerLista.get(number).accountnumber));
				        	if(CustomerLista.get(number).accountnumber != 0)
				        	{
				        		EmployeeEntry.setEditable(false);
				        	}
				        	else
				        	{
				        		EmployeeEntry.setEditable(true);
				        	}
				        	
				        }
				        if(selectedInfo.equals("Loan Amount"))
				        {
				        	EmployeeEntry.setText(String.valueOf(CustomerLista.get(number).loanbalance));
				        	if(CustomerLista.get(number).loanbalance != 0)
				        	{
				        		EmployeeEntry.setEditable(false);
				        	}
				        	else
				        	{
				        		EmployeeEntry.setEditable(true);
				        	}
				        	
				        }
						}
				    
				});
				
				//Creation of Employee Change Data Button
				EmployeeAdd.addActionListener(new ActionListener()
						{
						public void actionPerformed(ActionEvent a)
						{
							int number = 0;
					    	String AccountNumber = AccountNumberEntry.getText();
					    	int AccountNumberInt = Integer.parseInt(AccountNumber);
							for(int b = 0; b < CustomerLista.size(); b++)
							{
								if(AccountNumberInt == CustomerLista.get(b).accountnumber)
								{
									number = b;
									
								}
							}
							String EmployeeEnteredData = EmployeeEntry.getText();
							
					        String selectedInfo = (String) EmployeeList.getSelectedItem();
					        
							if(selectedInfo.equals("First Name"))
					        {
					        	CustomerLista.get(number).firstname = EmployeeEnteredData;
					        }
					        else if(selectedInfo.equals("Last Name"))
					        {
					        	CustomerLista.get(number).lastname = EmployeeEnteredData;
					        }
					        else if(selectedInfo.equals("Street Address"))
					        {
					        	CustomerLista.get(number).streetaddress = EmployeeEnteredData;
					        }
					        else if(selectedInfo.equals("City"))
					        {
					        	CustomerLista.get(number).city = EmployeeEnteredData;
					        }
					        else if(selectedInfo.equals("State"))
					        {
					        	CustomerLista.get(number).state = EmployeeEnteredData;
					        }
					        else if(selectedInfo.equals("Branch"))
					        {
					        	CustomerLista.get(number).branch = EmployeeEnteredData;
					        }
					        else if(selectedInfo.equals("Phone Number"))
					        {
					        	CustomerLista.get(number).phonenumber = Integer.parseInt(EmployeeEnteredData);
					        }
					        else if(selectedInfo.equals("Email ID"))
					        {
					        	CustomerLista.get(number).email = Integer.parseInt(EmployeeEnteredData);
					        }
					        else if(selectedInfo.equals("Appartment Number"))
					        {
					        	CustomerLista.get(number).aptnumber = Integer.parseInt(EmployeeEnteredData);
					        }
					        else if(selectedInfo.equals("Zipcode"))
					        {
					        	CustomerLista.get(number).zipcode = Integer.parseInt(EmployeeEnteredData);
					        }
					        else if(selectedInfo.equals("Account Number"))
					        {
					        	CustomerLista.get(number).accountnumber = Integer.parseInt(EmployeeEnteredData);
					        }
					        else if(selectedInfo.equals("Loan Amount"))
					        {
					        	CustomerLista.get(number).loanbalance = Integer.parseInt(EmployeeEnteredData);
					        }
						}
					
						});
				
				EmployeeExit.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent y) {
					
						try {
				            FileWriter writer = new FileWriter("C:\\Users\\Brian\\eclipse-workspace\\data.txt", false);
				            for(int o = 0; o < CustomerLista.size(); o++)
				            {
				            	writer.write(CustomerLista.get(o).firstname + "\r\n");
				            	writer.write(CustomerLista.get(o).lastname + "\r\n");
				            	writer.write(CustomerLista.get(o).streetaddress + "\r\n");
				            	writer.write(CustomerLista.get(o).city + "\r\n");
				            	writer.write(CustomerLista.get(o).state + "\r\n");
				            	writer.write(CustomerLista.get(o).branch + "\r\n");
				            	writer.write(CustomerLista.get(o).loanbalance + "\r\n");
				            	writer.write(CustomerLista.get(o).email + "\r\n");
				            	writer.write(CustomerLista.get(o).zipcode + "\r\n");
				            	writer.write(CustomerLista.get(o).accountnumber + "\r\n");
				            	writer.write(CustomerLista.get(o).aptnumber + "\r\n");
				            	writer.write(CustomerLista.get(o).phonenumber + "\r\n");
				            }
				            writer.close();
				        } catch (IOException e) {
				            e.printStackTrace();
				        }
					}
				});
					
				
				//Creation of Customer Screen
				JLabel CustomerLabel = new JLabel("Customer");
				CustomerLabel.setBounds(300, 15, 400, 60);
				CustomerLabel.setFont(new Font("Arial", Font.PLAIN, 30));
				JComboBox CustomerList = new JComboBox(OptionsArray);
				CustomerList.setBounds(50, 80, 200, 30);
				CustomerList.setFont(new Font("Arial", Font.PLAIN, 20));
				JTextField CustomerEntry = new JTextField();
				CustomerEntry.setFont(new Font("Arial", Font.PLAIN, 20));
				CustomerEntry.setBounds(275, 80, 200, 30);
				Customer.setLayout(null);
				Customer.add(CustomerLabel);
				Customer.add(CustomerEntry);
				Customer.add(CustomerList);
				
				//Creation of Customer Bring up Data Button
				CustomerList.addActionListener(new ActionListener() {
					 
				    public void actionPerformed(ActionEvent event) {
				    	int number = 0;
				    	String AccountNumber = AccountNumberEntry.getText();
				    	int AccountNumberInt = Integer.parseInt(AccountNumber);
						for(int a = 0; a < CustomerLista.size(); a++)
						{
							if(AccountNumberInt == CustomerLista.get(a).accountnumber)
							{
								number = a;
							}
						}
				        String selectedInfo = (String) CustomerList.getSelectedItem();
				        CustomerEntry.setEditable(false);
				 
				        if(selectedInfo.equals("First Name"))
				        {
				        	CustomerEntry.setText(CustomerLista.get(number).firstname);
				        }
				        else if(selectedInfo.equals("Last Name"))
				        {
				        	CustomerEntry.setText(CustomerLista.get(number).lastname);
				        }
				        else if(selectedInfo.equals("Street Address"))
				        {
				        	CustomerEntry.setText(CustomerLista.get(number).streetaddress);
				        }
				        else if(selectedInfo.equals("City"))
				        {
				        	CustomerEntry.setText(CustomerLista.get(number).city);
				        }
				        else if(selectedInfo.equals("State"))
				        {
				        	CustomerEntry.setText(CustomerLista.get(number).state);
				        }
				        else if(selectedInfo.equals("Branch"))
				        {
				        	CustomerEntry.setText(CustomerLista.get(number).branch);
				        }
				        else if(selectedInfo.equals("Phone Number"))
				        {
				        	CustomerEntry.setText(String.valueOf(CustomerLista.get(number).phonenumber));
				        }
				        else if(selectedInfo.equals("Email ID"))
				        {
				        	CustomerEntry.setText(String.valueOf(CustomerLista.get(number).email));
				        }
				        else if(selectedInfo.equals("Appartment Number"))
				        {
				        	CustomerEntry.setText(String.valueOf(CustomerLista.get(number).aptnumber));
				        }
				        else if(selectedInfo.equals("Zipcode"))
				        {
				        	CustomerEntry.setText(String.valueOf(CustomerLista.get(number).zipcode));
				        }
				        else if(selectedInfo.equals("Account Number"))
				        {
				        	CustomerEntry.setText(String.valueOf(CustomerLista.get(number).accountnumber));
				        }
				        else if(selectedInfo.equals("Loan Amount"))
				        {
				        	CustomerEntry.setText(String.valueOf(CustomerLista.get(number).loanbalance));
				        }
						}
				    
				});
				
				
		//Adding JPanels to JFrame
		passwordscreen.add(passwordbutton);
		BankSystem.add(cards);
		BankSystem.setSize(800, 400);
		BankSystem.setLocationRelativeTo(null);
		BankSystem.setVisible(true);
		
		
}

	}
