package gui;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.util.*;
public class Foody {
	
	//Method for taking in the Customer data from the text file
	public static ArrayList<Customer1> textfileCustomer(ArrayList<Customer1> CustomerLista)
	{
		
		
		try
		{
			//Finds files for data
	   		  FileInputStream fstream = new FileInputStream("C:\\Users\\Brian\\eclipse-workspace\\Customer.txt");
	   		  DataInputStream in = new DataInputStream(fstream);
	   		  BufferedReader br = new BufferedReader(new InputStreamReader(in));
	   		  String strLine;
	   		  int count = 0;
	   		  
		do {
	        strLine = br.readLine();
	        CustomerLista.add(new Customer1());
	        CustomerLista.get(count).Username = strLine;
	        strLine=br.readLine();
	        CustomerLista.get(count).EmailID = Integer.parseInt(strLine);
	        strLine=br.readLine();
	        CustomerLista.get(count).BankDetailID = Integer.parseInt(strLine);
	        strLine=br.readLine();
	        count++;
	    }while(strLine!=null);
		
		 //Close the input stream
			  in.close();
			    }catch (Exception e){//Catch exception if any
			  System.err.println("Error: " + e.getMessage());
			  }
		return CustomerLista;
	}
	//Method for taking in the Food data from the text file
	public static ArrayList<Food> textfileFood(ArrayList<Food> FoodLista)
	{
		try
		{
			//Finds files for data
	   		  FileInputStream fstream = new FileInputStream("C:\\Users\\Brian\\eclipse-workspace\\Food.txt");
	   		  DataInputStream in = new DataInputStream(fstream);
	   		  BufferedReader br = new BufferedReader(new InputStreamReader(in));
	   		  String strLine;
	   		  int count = 0;
	   		  
		do {
	        strLine = br.readLine();
	        FoodLista.add(new Food());
	        FoodLista.get(count).resturantname = strLine;
	        strLine=br.readLine();
	        FoodLista.get(count).cheeseburger = Integer.parseInt(strLine);
	        strLine=br.readLine();
	        FoodLista.get(count).hotdog = Integer.parseInt(strLine);
	        strLine=br.readLine();
	        FoodLista.get(count).pizza = Integer.parseInt(strLine);
	        strLine=br.readLine();
	        FoodLista.get(count).chickentenders = Integer.parseInt(strLine);
	        strLine=br.readLine();
	        FoodLista.get(count).salad = Integer.parseInt(strLine);
	        strLine=br.readLine();
	        FoodLista.get(count).pasta = Integer.parseInt(strLine);
	        strLine=br.readLine();
	        FoodLista.get(count).steak = Integer.parseInt(strLine);
	        strLine=br.readLine();
	        count++;
	    }while(strLine!=null);
		 //Close the input stream
			  in.close();
			    }catch (Exception e){//Catch exception if any
			  System.err.println("Error: " + e.getMessage());
			  }
		return FoodLista;
	}
	//Method for taking in the Order data from the text file
	public static ArrayList<Order> textfileOrder(ArrayList<Order> OrderLista)
	{
		try
		{
			//Finds files for data
	   		  FileInputStream fstream = new FileInputStream("C:\\Users\\Brian\\eclipse-workspace\\Order.txt");
	   		  DataInputStream in = new DataInputStream(fstream);
	   		  BufferedReader br = new BufferedReader(new InputStreamReader(in));
	   		  String strLine;
	   		  int count = 0;
	    
		do {
	        strLine = br.readLine();
	        OrderLista.add(new Order());
	        OrderLista.get(count).ordernumber = Integer.parseInt(strLine);
	        strLine=br.readLine();
	        OrderLista.get(count).resturantname = strLine;
	        strLine=br.readLine();
	        OrderLista.get(count).PersonOrdering = strLine;
	        strLine=br.readLine();
	        OrderLista.get(count).cheeseburger = Integer.parseInt(strLine);
	        strLine=br.readLine();
	        OrderLista.get(count).hotdog = Integer.parseInt(strLine);
	        strLine=br.readLine();
	        OrderLista.get(count).pizza = Integer.parseInt(strLine);
	        strLine=br.readLine();
	        OrderLista.get(count).chickentenders = Integer.parseInt(strLine);
	        strLine=br.readLine();
	        OrderLista.get(count).salad = Integer.parseInt(strLine);
	        strLine=br.readLine();
	        OrderLista.get(count).pasta = Integer.parseInt(strLine);
	        strLine=br.readLine();
	        OrderLista.get(count).steak = Integer.parseInt(strLine);
	        strLine=br.readLine();
	        count++;
	    }while(strLine!=null);
		
		 //Close the input stream
			  in.close();
			    }catch (Exception e){//Catch exception if any
			  System.err.println("Error: " + e.getMessage());
			  }
		return OrderLista;
	}
	//Method for taking in the Employee data from the text file
	public static ArrayList<Employee> textfileEmployee(ArrayList<Employee> EmployeeLista)
	{
		try
		{
			//Finds files for data
	   		  FileInputStream fstream = new FileInputStream("C:\\Users\\Brian\\eclipse-workspace\\Employee.txt");
	   		  DataInputStream in = new DataInputStream(fstream);
	   		  BufferedReader br = new BufferedReader(new InputStreamReader(in));
	   		  String strLine;
	   		  int count = 0;
	   		   
		do {
	        strLine = br.readLine();
	        EmployeeLista.add(new Employee());
	        EmployeeLista.get(count).EmployeeNumber = Integer.parseInt(strLine);
	        strLine=br.readLine();
	        EmployeeLista.get(count).EmployeeName = strLine;
	        strLine=br.readLine();
	        count++;
	    }while(strLine!=null);
		
		 //Close the input stream
			  in.close();
			    }catch (Exception e){//Catch exception if any
			  System.err.println("Error: " + e.getMessage());
			  
		}
		return EmployeeLista;
	}
	//Method for taking in the Feedback data from the text file
	public static ArrayList<Feedback> textfileFeedback(ArrayList<Feedback> FeedbackLista)
	{
		try
		{
			//Finds files for data
	   		  FileInputStream fstream = new FileInputStream("C:\\Users\\Brian\\eclipse-workspace\\Feedback.txt");
	   		  DataInputStream in = new DataInputStream(fstream);
	   		  BufferedReader br = new BufferedReader(new InputStreamReader(in));
	   		  String strLine;
	   		  int count = 0;
	   		 
		do {
	        strLine = br.readLine();
	        FeedbackLista.add(new Feedback());
	        FeedbackLista.get(count).resturantname = strLine;
	        strLine=br.readLine();
	        FeedbackLista.get(count).ordernumber = Integer.parseInt(strLine);
	        strLine=br.readLine();
	        FeedbackLista.get(count).feedback = strLine;
	        strLine=br.readLine();
	        count++;
	    }while(strLine!=null);
		
		 //Close the input stream
			  in.close();
			    }catch (Exception e){//Catch exception if any
			  System.err.println("Error: " + e.getMessage());
			  
		}
		return FeedbackLista;
	}
	//Method for creating the password screen
	public static JPanel passwordpanel(JPanel passwordscreen, JPanel cards)
	{
		JLabel passwordlabel = new JLabel("Please enter your password and restaurant");
		JTextField passwordtext = new JTextField();
		JTextField usernametext = new JTextField();
		JButton passwordbutton  = new JButton("Enter");
		passwordscreen.setLayout(null);
		passwordlabel.setBounds(120, 20, 600, 60);
		passwordlabel.setFont(new Font("Arial", Font.PLAIN, 30));
		passwordtext.setBounds(290, 140, 200, 50);
		passwordtext.setFont(new Font("Arial", Font.PLAIN, 30));
		usernametext.setBounds(290, 80, 200, 50);
		usernametext.setFont(new Font("Arial", Font.PLAIN, 30));
		passwordbutton.setBounds(315, 200, 150, 40);
		passwordscreen.add(passwordlabel);
		passwordscreen.add(passwordbutton);
		passwordscreen.add(usernametext);
		passwordscreen.add(passwordtext);
		
		passwordbutton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
					String password = passwordtext.getText();
					String username = usernametext.getText();
					if(password.equals("A") && username.equals("admin"))
					{
						CardLayout cardLayout = (CardLayout)(cards.getLayout());
			               cardLayout.show(cards, "ResturantAdmin");    
					}
					else if(password.equals("B") && username.equals("admin"))
					{
						CardLayout cardLayout = (CardLayout)(cards.getLayout());
						cardLayout.show(cards, "ResturantAdmin");
					}
					else if(password.equals("A") && username.equals("customer"))
					{
						CardLayout cardLayout = (CardLayout)(cards.getLayout());
						cardLayout.show(cards, "ResturantACustomer");
					}
					else if(password.equals("B") && username.equals("customer"))
					{
						CardLayout cardLayout = (CardLayout)(cards.getLayout());
						cardLayout.show(cards, "ResturantBCustomer");
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Please enter a correct username and password");
					}
			}
		});
		return passwordscreen;
	}
	//Method for creating the customer for resturant a screen
	public static JPanel resturantacustomer(JPanel ResturantACustomer, JPanel cards , ArrayList<Order> OrderLista, ArrayList<Employee> EmployeeLista, ArrayList<Food> FoodLista)
	{
		//Customer Screen Resturant A
				JLabel ResturantALabel = new JLabel("Restaurant A");
				ResturantALabel.setBounds(300, 10, 400, 60);
				ResturantALabel.setFont(new Font("Arial", Font.PLAIN, 30));
				
				JLabel ResturantALabel1 = new JLabel("Cheeseburger");
				ResturantALabel1.setBounds(30, 70, 400, 50);
				ResturantALabel1.setFont(new Font("Arial", Font.PLAIN, 20));
				JTextField ResturantATextField1 = new JTextField();
				ResturantATextField1.setBounds(20, 120, 150, 50);
				ResturantATextField1.setFont(new Font("Arial", Font.PLAIN, 30));
				
				JLabel ResturantALabel2 = new JLabel("Hotdog");
				ResturantALabel2.setBounds(260, 70, 400, 50);
				ResturantALabel2.setFont(new Font("Arial", Font.PLAIN, 20));
				JTextField ResturantATextField2 = new JTextField();
				ResturantATextField2.setBounds(220, 120, 150, 50);
				ResturantATextField2.setFont(new Font("Arial", Font.PLAIN, 30));
				
				JLabel ResturantALabel3 = new JLabel("Pizza");
				ResturantALabel3.setBounds(470, 70, 400, 50);
				ResturantALabel3.setFont(new Font("Arial", Font.PLAIN, 20));
				JTextField ResturantATextField3 = new JTextField();
				ResturantATextField3.setBounds(420, 120, 150, 50);
				ResturantATextField3.setFont(new Font("Arial", Font.PLAIN, 30));
				
				JLabel ResturantALabel4 = new JLabel("Chickentenders");
				ResturantALabel4.setBounds(618, 70, 400, 50);
				ResturantALabel4.setFont(new Font("Arial", Font.PLAIN, 20));
				JTextField ResturantATextField4 = new JTextField();
				ResturantATextField4.setBounds(610, 120, 150, 50);
				ResturantATextField4.setFont(new Font("Arial", Font.PLAIN, 30));
				
				JButton ResturantAOrderButton = new JButton("Order");
				ResturantAOrderButton.setBounds(295, 200, 150, 40);
				ResturantAOrderButton.setFont(new Font("Arial", Font.PLAIN, 20));
				
				ResturantATextField1.setText("0");
				ResturantATextField2.setText("0");
				ResturantATextField3.setText("0");
				ResturantATextField4.setText("0");
				
				ResturantAOrderButton.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent f)
					{
						int j = OrderLista.size();
						int k = EmployeeLista.size();
						OrderLista.add(new Order());
						
						String EnteredOrderA1 = ResturantATextField1.getText();
						String EnteredOrderA2 = ResturantATextField2.getText();
						String EnteredOrderA3 = ResturantATextField3.getText();
						String EnteredOrderA4 = ResturantATextField4.getText();
						OrderLista.get(j).ordernumber = OrderLista.size();
						OrderLista.get(j).resturantname = "A";
						OrderLista.get(j).PersonOrdering = EmployeeLista.get(j).EmployeeName;
						OrderLista.get(j).cheeseburger = Integer.parseInt(EnteredOrderA1);
						OrderLista.get(j).hotdog = Integer.parseInt(EnteredOrderA2);
						OrderLista.get(j).pizza = Integer.parseInt(EnteredOrderA3);
						OrderLista.get(j).chickentenders = Integer.parseInt(EnteredOrderA4);
						OrderLista.get(j).salad = 0;
						OrderLista.get(j).pasta = 0;
						OrderLista.get(j).steak = 0;
						FoodLista.get(0).cheeseburger = FoodLista.get(0).cheeseburger - OrderLista.get(j).cheeseburger;
						FoodLista.get(0).hotdog = FoodLista.get(0).hotdog - OrderLista.get(j).hotdog;
						FoodLista.get(0).pizza = FoodLista.get(0).pizza - OrderLista.get(j).pizza;
						FoodLista.get(0).chickentenders = FoodLista.get(0).chickentenders - OrderLista.get(j).chickentenders;
						
									
						
						try {
				            FileWriter writer = new FileWriter("C:\\Users\\Brian\\eclipse-workspace\\Order.txt", false);
				            for(int o = 0; o < OrderLista.size(); o++)
				            {
				            	writer.write(OrderLista.get(o).ordernumber + "\r\n");
				            	writer.write(OrderLista.get(o).resturantname + "\r\n");
				            	writer.write(OrderLista.get(o).PersonOrdering + "\r\n");
				            	writer.write(OrderLista.get(o).cheeseburger + "\r\n");
				            	writer.write(OrderLista.get(o).hotdog + "\r\n");
				            	writer.write(OrderLista.get(o).pizza + "\r\n");
				            	writer.write(OrderLista.get(o).chickentenders + "\r\n");
				            	
				            	
				            }
				            writer.close();
				        } catch (IOException e) {
				            e.printStackTrace();
				        }
						
						try {
				            FileWriter writer = new FileWriter("C:\\Users\\Brian\\eclipse-workspace\\Food.txt", false);
				            for(int o = 0; o < FoodLista.size(); o++)
				            {
				            	writer.write(FoodLista.get(o).resturantname + "\r\n");
				            	writer.write(FoodLista.get(o).cheeseburger + "\r\n");
				            	writer.write(FoodLista.get(o).hotdog + "\r\n");
				            	writer.write(FoodLista.get(o).pizza + "\r\n");
				            	writer.write(FoodLista.get(o).chickentenders + "\r\n");
				            	writer.write(FoodLista.get(o).salad + "\r\n");
				            	writer.write(FoodLista.get(o).pasta + "\r\n");
				            	writer.write(FoodLista.get(o).steak + "\r\n");
				            	
				            	
				            	
				            }
				            writer.close();
				        } catch (IOException e) {
				            e.printStackTrace();
				        }
						
						if(!EnteredOrderA1.equals("0") || !EnteredOrderA2.equals("0") || !EnteredOrderA3.equals("0") || !EnteredOrderA4.equals("0"))
						{
						CardLayout cardLayout = (CardLayout)(cards.getLayout());
						cardLayout.show(cards, "ResturantFeedBack");
						}
						
					}
				});
				
				ResturantACustomer.setLayout(null);
				ResturantACustomer.add(ResturantAOrderButton);
				ResturantACustomer.add(ResturantATextField1);
				ResturantACustomer.add(ResturantATextField2);
				ResturantACustomer.add(ResturantATextField3);
				ResturantACustomer.add(ResturantATextField4);
				ResturantACustomer.add(ResturantALabel);
				ResturantACustomer.add(ResturantALabel1);
				ResturantACustomer.add(ResturantALabel2);
				ResturantACustomer.add(ResturantALabel3);
				ResturantACustomer.add(ResturantALabel4);
				
				return ResturantACustomer;
	}
	//Method for creating the customer for resturant b screen
	public static JPanel resturantbcustomer(JPanel ResturantBCustomer, JPanel cards , ArrayList<Order> OrderLista , ArrayList<Employee> EmployeeLista , ArrayList<Food> FoodLista)
	{
		//Customer Screen Resturant B
				JLabel ResturantBLabel = new JLabel("Restaurant B");
				ResturantBLabel.setBounds(300, 10, 400, 60);
				ResturantBLabel.setFont(new Font("Arial", Font.PLAIN, 30));
				
				JLabel ResturantBLabel1 = new JLabel("Salad");
				ResturantBLabel1.setBounds(110, 70, 400, 50);
				ResturantBLabel1.setFont(new Font("Arial", Font.PLAIN, 20));
				JTextField ResturantBTextField1 = new JTextField();
				ResturantBTextField1.setBounds(60, 120, 150, 50);
				ResturantBTextField1.setFont(new Font("Arial", Font.PLAIN, 30));
				
				JLabel ResturantBLabel2 = new JLabel("Pasta");
				ResturantBLabel2.setBounds(350, 70, 400, 50);
				ResturantBLabel2.setFont(new Font("Arial", Font.PLAIN, 20));
				JTextField ResturantBTextField2 = new JTextField();
				ResturantBTextField2.setBounds(300, 120, 150, 50);
				ResturantBTextField2.setFont(new Font("Arial", Font.PLAIN, 30));
				
				JLabel ResturantBLabel3 = new JLabel("Steak");
				ResturantBLabel3.setBounds(600, 70, 400, 50);
				ResturantBLabel3.setFont(new Font("Arial", Font.PLAIN, 20));
				JTextField ResturantBTextField3 = new JTextField();
				ResturantBTextField3.setBounds(550, 120, 150, 50);
				ResturantBTextField3.setFont(new Font("Arial", Font.PLAIN, 30));
				
				JButton ResturantBOrderButton = new JButton("Order");
				ResturantBOrderButton.setBounds(295, 200, 150, 40);
				ResturantBOrderButton.setFont(new Font("Arial", Font.PLAIN, 20));
				
				ResturantBTextField1.setText("0");
				ResturantBTextField2.setText("0");
				ResturantBTextField3.setText("0");
				
				ResturantBOrderButton.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent f)
					{
						
						int j = OrderLista.size();
						int k = EmployeeLista.size();
						OrderLista.add(new Order());
						
						String EnteredOrderA1 = ResturantBTextField1.getText();
						String EnteredOrderA2 = ResturantBTextField2.getText();
						String EnteredOrderA3 = ResturantBTextField3.getText();
						OrderLista.get(j).ordernumber = OrderLista.size();
						OrderLista.get(j).resturantname = "B";
						OrderLista.get(j).PersonOrdering = EmployeeLista.get(k).EmployeeName;
						OrderLista.get(j).cheeseburger = 0;
						OrderLista.get(j).hotdog = 0;
						OrderLista.get(j).pizza = 0;
						OrderLista.get(j).chickentenders = 0;
						OrderLista.get(j).salad = Integer.parseInt(EnteredOrderA1);
						OrderLista.get(j).pasta = Integer.parseInt(EnteredOrderA2);
						OrderLista.get(j).steak = Integer.parseInt(EnteredOrderA3);
						FoodLista.get(1).salad = FoodLista.get(1).salad - OrderLista.get(j).salad;
						FoodLista.get(1).pasta = FoodLista.get(1).pasta - OrderLista.get(j).pasta;
						FoodLista.get(1).steak = FoodLista.get(1).steak - OrderLista.get(j).steak;
									
						
						try {
				            FileWriter writer = new FileWriter("C:\\Users\\Brian\\eclipse-workspace\\Order.txt", false);
				            for(int o = 0; o < OrderLista.size(); o++)
				            {
				            	writer.write(OrderLista.get(o).ordernumber + "\r\n");
				            	writer.write(OrderLista.get(o).resturantname + "\r\n");
				            	writer.write(OrderLista.get(o).PersonOrdering + "\r\n");
				            	writer.write(OrderLista.get(o).cheeseburger + "\r\n");
				            	writer.write(OrderLista.get(o).hotdog + "\r\n");
				            	writer.write(OrderLista.get(o).pizza + "\r\n");
				            	writer.write(OrderLista.get(o).chickentenders + "\r\n");
				            	
				            	
				            }
				            writer.close();
				        } catch (IOException e) {
				            e.printStackTrace();
				        }
						
						try {
				            FileWriter writer = new FileWriter("C:\\Users\\Brian\\eclipse-workspace\\Food.txt", false);
				            for(int o = 0; o < FoodLista.size(); o++)
				            {
				            	writer.write(FoodLista.get(o).resturantname + "\r\n");
				            	writer.write(FoodLista.get(o).cheeseburger + "\r\n");
				            	writer.write(FoodLista.get(o).hotdog + "\r\n");
				            	writer.write(FoodLista.get(o).pizza + "\r\n");
				            	writer.write(FoodLista.get(o).chickentenders + "\r\n");
				            	writer.write(FoodLista.get(o).salad + "\r\n");
				            	writer.write(FoodLista.get(o).pasta + "\r\n");
				            	writer.write(FoodLista.get(o).steak + "\r\n");
				            	
				            	
				            	
				            }
				            writer.close();
				        } catch (IOException e) {
				            e.printStackTrace();
				        }
						
						if(!EnteredOrderA1.equals("0") || !EnteredOrderA2.equals("0") || !EnteredOrderA3.equals("0"))
						{
						CardLayout cardLayout = (CardLayout)(cards.getLayout());
						cardLayout.show(cards, "ResturantFeedBack");
						}
						
					}
				});
				
				ResturantBCustomer.add(ResturantBOrderButton);
				ResturantBCustomer.add(ResturantBTextField1);
				ResturantBCustomer.add(ResturantBTextField2);
				ResturantBCustomer.add(ResturantBTextField3);
				ResturantBCustomer.add(ResturantBLabel1);
				ResturantBCustomer.add(ResturantBLabel2);
				ResturantBCustomer.add(ResturantBLabel3);
				ResturantBCustomer.setLayout(null);
				ResturantBCustomer.add(ResturantBLabel);
				
				return ResturantBCustomer;
	}
	//Method for creating the admin screen
	public static JPanel resturantadmin(JPanel ResturantAdmin, JPanel cards , ArrayList<Order> OrderLista, ArrayList<Food> FoodLista, ArrayList<Employee> EmployeeLista, ArrayList<Feedback> FeedbackLista, ArrayList<Customer1> CustomerLista)
	{
				//Admin Screen
				String OptionsArray[] = {"Food","Order","Employee","Feedback","Customer"};
				JLabel ResturantAdminLabel = new JLabel("Admin");
				ResturantAdminLabel.setBounds(350, 10, 400, 60);
				ResturantAdminLabel.setFont(new Font("Arial", Font.PLAIN, 30));
				JTextField NumberField = new JTextField();
				NumberField.setBounds(350, 80, 100, 50);
				NumberField.setFont(new Font("Arial", Font.PLAIN, 20));
				JTextArea AdminTextArea = new JTextArea();
				AdminTextArea.setBounds(300, 160, 400, 300);
				AdminTextArea.setFont(new Font("Arial", Font.PLAIN, 20));
				JComboBox AdminList = new JComboBox(OptionsArray);
				AdminList.setBounds(50, 160, 200, 30);
				AdminList.setFont(new Font("Arial", Font.PLAIN, 20));
				
				AdminList.addActionListener(new ActionListener() {
					 
				    public void actionPerformed(ActionEvent event) 
				    	{
				    	AdminTextArea.setEditable(false);
				    	int count = Integer.parseInt(NumberField.getText());
				    	String selectedInfo = (String) AdminList.getSelectedItem();
				    	if(selectedInfo.equals("Food"))
				        {
				        	AdminTextArea.setText("Restaurant Name: " + FoodLista.get(count).resturantname + "\r\n" + "Cheeseburgers: " + FoodLista.get(count).cheeseburger + "\r\n" + "Hotdogs: " + FoodLista.get(count).hotdog + "\r\n" + "Pizza: " + FoodLista.get(count).pizza + "\r\n" + "Chickentenders: " + FoodLista.get(count).chickentenders + "\r\n" + "Salads: " + FoodLista.get(count).salad + "\r\n" + "Pasta: " + FoodLista.get(count).pasta + "\r\n" + "Steaks: " + FoodLista.get(count).steak);
				        }
				    	else if(selectedInfo.equals("Order"))
				        {
				        	AdminTextArea.setText("Order Number: " + OrderLista.get(count).ordernumber + "\r\n" + "Restaurant Name: " + OrderLista.get(count).resturantname + "\r\n" + "Person Ordering: " + OrderLista.get(count).PersonOrdering + "\r\n" + "Cheeseburgers: " + OrderLista.get(count).cheeseburger + "\r\n" + "Hotdogs: " + OrderLista.get(count).hotdog + "\r\n" + "Pizza: " + OrderLista.get(count).pizza + "\r\n" + "Chicken tenders: " + OrderLista.get(count).chickentenders + "\r\n" + "Salad: " + OrderLista.get(count).salad + "\r\n" + "Pasta: " + OrderLista.get(count).pasta + "\r\n" + "Steak: " + OrderLista.get(count).steak);
				        }
				    	else if(selectedInfo.equals("Employee"))
				        {
				        	AdminTextArea.setText("Employee Number:" + EmployeeLista.get(count).EmployeeNumber + "\r\n" + "Employee Name: " + EmployeeLista.get(count).EmployeeName);
				        }
				    	else if(selectedInfo.equals("Feedback"))
				        {
				    		AdminTextArea.setText("Restaurant Name: " + FeedbackLista.get(count).resturantname + "\r\n" + "Order Number: " + FeedbackLista.get(count).ordernumber + "\r\n" + "Feedback: " + FeedbackLista.get(count).feedback);
				        }
				    	else if(selectedInfo.equals("Customer"))
				    	{
				    		AdminTextArea.setText("User Name: " + CustomerLista.get(count).Username + "\r\n" + "Email ID: " + CustomerLista.get(count).EmailID + "\r\n" + "Bank ID: " + CustomerLista.get(count).BankDetailID);
				    	}
						}
				    
				});
				
				ResturantAdmin.add(AdminTextArea);
				ResturantAdmin.add(NumberField);
				ResturantAdmin.add(ResturantAdminLabel);
				ResturantAdmin.setLayout(null);
				ResturantAdmin.add(AdminList);
				return ResturantAdmin;
	}
	public static JPanel feedback(JPanel ResturantFeedBack, ArrayList<Feedback> FeedbackLista, ArrayList<Order> OrderLista)
	{
		//Customer Feedback 
				JLabel ResturantFeedBackLabel = new JLabel("Feedback");
				ResturantFeedBackLabel.setBounds(310, 10, 400, 60);
				ResturantFeedBackLabel.setFont(new Font("Arial", Font.PLAIN, 30));
				
				JLabel ResturantNameLabel = new JLabel("Enter restaurant name");
				ResturantNameLabel.setBounds(280, 50, 400 ,60);
				ResturantNameLabel.setFont(new Font("Arial", Font.PLAIN,20));
				
				JTextField ResturantName = new JTextField();
				ResturantName.setBounds(300, 100, 150, 40);
				ResturantName.setFont(new Font("Arial", Font.PLAIN, 20));
				
				JTextArea FeedBack = new JTextArea();
				FeedBack.setBounds(175, 200, 400, 200);
				FeedBack.setFont(new Font("Arial", Font.PLAIN, 20));
				
				JButton SaveFeedBack = new JButton("Save");
				SaveFeedBack.setBounds(270, 430, 200, 50);
				SaveFeedBack.setFont(new Font("Arial", Font.PLAIN, 20));
				
				SaveFeedBack.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent f)
					{
						int j = FeedbackLista.size();
						System.out.println(j);
						FeedbackLista.add(new Feedback());
						int k = FeedbackLista.size();
						System.out.println(k);
						FeedbackLista.get(j).resturantname = ResturantName.getText();
						FeedbackLista.get(j).ordernumber = OrderLista.size();
						FeedbackLista.get(j).feedback = FeedBack.getText();
						
						try {
				            FileWriter writer = new FileWriter("C:\\Users\\Brian\\eclipse-workspace\\Feedback.txt", false);
				            for(int o = 0; o < FeedbackLista.size(); o++)
				            {
				            	writer.write(FeedbackLista.get(o).resturantname + "\r\n");
				            	writer.write(FeedbackLista.get(o).ordernumber + "\r\n");
				            	writer.write(FeedbackLista.get(o).feedback + "\r\n");
				            	
				            }
				            writer.close();
				        } catch (IOException e) {
				            e.printStackTrace();
				        }
					}
				});
				
				ResturantFeedBack.add(SaveFeedBack);
				ResturantFeedBack.add(FeedBack);
				ResturantFeedBack.add(ResturantNameLabel);
				ResturantFeedBack.add(ResturantName);
				ResturantFeedBack.add(ResturantFeedBackLabel);
				ResturantFeedBack.setLayout(null);
				return ResturantFeedBack;
	}
	public static void main(String[] args)
	{
			ArrayList<Customer1> CustomerLista = new ArrayList<>();
			Foody.textfileCustomer(CustomerLista);
			ArrayList<Food> FoodLista = new ArrayList<>();
			Foody.textfileFood(FoodLista);
			ArrayList<Order> OrderLista = new ArrayList<>();
			Foody.textfileOrder(OrderLista);
			ArrayList<Employee> EmployeeLista = new ArrayList<>();
			Foody.textfileEmployee(EmployeeLista);
			ArrayList<Feedback> FeedbackLista = new ArrayList<>();
			Foody.textfileFeedback(FeedbackLista);
		

		JFrame Fooody = new JFrame("Foody");
		JPanel passwordscreen = new JPanel();
		JPanel Admin = new JPanel();
		JPanel Customer = new JPanel();
		JPanel ResturantACustomer = new JPanel();
		JPanel ResturantBCustomer = new JPanel();
		JPanel ResturantAdmin = new JPanel();
		JPanel ResturantFeedBack = new JPanel();
		//Creates Cardlayout
		JPanel cards = new JPanel(new CardLayout());
		cards.add(passwordscreen);
		cards.add(ResturantFeedBack, "ResturantFeedBack");
		cards.add(ResturantACustomer, "ResturantACustomer");
		cards.add(ResturantBCustomer, "ResturantBCustomer");
		cards.add(ResturantAdmin, "ResturantAdmin");
		cards.add(Admin, "Admin");
		cards.add(Customer, "Customer");
		Foody.passwordpanel(passwordscreen, cards);
		Foody.resturantacustomer(ResturantACustomer, cards, OrderLista, EmployeeLista, FoodLista);
		Foody.resturantbcustomer(ResturantBCustomer, cards, OrderLista, EmployeeLista, FoodLista);
		Foody.resturantadmin(ResturantAdmin, cards, OrderLista, FoodLista, EmployeeLista, FeedbackLista, CustomerLista);
		Foody.feedback(ResturantFeedBack, FeedbackLista, OrderLista);
		
		
		Fooody.add(cards);
		Fooody.setSize(800, 600);
		Fooody.setLocationRelativeTo(null);
		Fooody.setVisible(true);
		
		
	}
}
