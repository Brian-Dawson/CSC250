import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.*;
public class quiz {
	private static int count = 0;
	public static void main(String args[])
	{
		int answerarray[] = new int[5];
		
		String questionarray[] = new String[5];
		
			String question1 = "In New Jersey, you must be at least __ years old to register a motor vehicle.";
			questionarray[0] = question1;
			String question2 = "As you drive, you're required to stop your vehicle";
			questionarray[1] = question2;
			String question3 = "As you drive, you must turn your headlights on";
			questionarray[2] = question3;
			String question4 = "You must yield for emergency vehicles";
			questionarray[3] = question4;
			String question5 = "It is important to slow down";
			questionarray[4] = question5;
		
		String responsearray[] = new String[20];
		
			String q1a = "17";
			responsearray[0] = q1a;
			String q1b = "16";
			responsearray[1] = q1b;
			String q1c = "15";
			responsearray[2] = q1c;
			String q1d = "21";
			responsearray[3] = q1d;
			
			String q2a = "At an intersection with a stop sign ";
			responsearray[4] = q2a;
			String q2b = "Where there is a red light";
			responsearray[5] = q2b;
			String q2c = "When a traffic officer orders you to stop";
			responsearray[6] = q2c;
			String q2d = "All of the above";
			responsearray[7] = q2d;
			
			String q3a = "When you turn your wipers on";
			responsearray[8] = q3a;
			String q3b = "One-half hour after sunset";
			responsearray[9] = q3b;
			String q3c = "One-half hour before sunrise";
			responsearray[10] = q3c;
			String q3d = "All of the above";
			responsearray[11] = q3d;
			
			String q4a = "Never";
			responsearray[12] = q4a;
			String q4b = "When you see a flashing red or blue light or hear a siren";
			responsearray[13] = q4b;
			String q4c = "Only when other vehicles yield";
			responsearray[14] = q4c;
			String q4d = " None of the above";
			
			String q5a = "On narrow or winding roads";
			responsearray[15] = q5a;
			String q5b = "At intersections or railroad crossings";
			responsearray[16] = q5b;
			String q5c = "When the road is wet or slippery";
			responsearray[17] = q5c;
			String q5d = "All of the above";
			responsearray[18] = q5d;
		
		
		JFrame a = new JFrame("Quiz");
			a.setLayout(new BorderLayout());
			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
			a.setLocation(dim.width/2-a.getSize().width/2, dim.height/2-a.getSize().height/2);
		JRadioButton a1,b1,c1,d1;
			ButtonGroup buttonGroup = new ButtonGroup();
		
		
		JPanel panel1 = new JPanel();
			panel1.setLayout(new GridLayout(0, 1, 2, 1));
			
		JLabel label1 = new JLabel(question1);
			label1.setFont(new Font("Arial", Font.PLAIN, 30));
			panel1.add(label1);
		a1 = new JRadioButton(q1a);
		a1.setFont(new Font("Arial", Font.PLAIN, 30));
		a1.setBackground(Color.lightGray);
		buttonGroup.add(a1);
		panel1.add(a1);
		b1 = new JRadioButton(q1b);
		b1.setFont(new Font("Arial", Font.PLAIN, 30));
		b1.setBackground(Color.lightGray);
		buttonGroup.add(b1);
		panel1.add(b1);
		c1 = new JRadioButton(q1c);
		c1.setFont(new Font("Arial", Font.PLAIN, 30));
		c1.setBackground(Color.lightGray);
		buttonGroup.add(c1);
		panel1.add(c1);
		d1 = new JRadioButton(q1d);
		d1.setFont(new Font("Arial", Font.PLAIN, 30));
		d1.setBackground(Color.lightGray);
		buttonGroup.add(d1);
		panel1.add(d1);
		panel1.setBackground(Color.lightGray);
		
		JButton question1button = new JButton("Next Question");
		question1button.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						boolean a1bool;
						a1bool = a1.isSelected();
						boolean b1bool;
						b1bool = b1.isSelected();
						boolean c1bool;
						c1bool = c1.isSelected();
						boolean d1bool;
						d1bool = d1.isSelected();
						
						if(count == 0)
						{
							if(a1bool == true)
							{
								answerarray[0] = 1;
							}
							else if(b1bool == true)
							{
								answerarray[0] = 0;
							}
							else if(c1bool == true)
							{
								answerarray[0] = 0;
							}
							else if(d1bool == true)
							{
								answerarray[0] = 0;
							}
						}
						else if(count == 1)
						{
							if(a1bool == true)
							{
								answerarray[1] = 0;
							}
							else if(b1bool == true)
							{
								answerarray[1] = 0;
							}
							else if(c1bool == true)
							{
								answerarray[1] = 0;
							}
							else if(d1bool == true)
							{
								answerarray[1] = 1;
							}
						}
						else if(count == 2)
						{
							if(a1bool == true)
							{
								answerarray[2] = 0;
							}
							else if(b1bool == true)
							{
								answerarray[2] = 0;
							}
							else if(c1bool == true)
							{
								answerarray[2] = 0;
							}
							else if(d1bool == true)
							{
								answerarray[2] = 1;
							}
						}
						else if(count == 3)
						{
							if(a1bool == true)
							{
								answerarray[3] = 0;
							}
							else if(b1bool == true)
							{
								answerarray[3] = 1;
							}
							else if(c1bool == true)
							{
								answerarray[3] = 0;
							}
							else if(d1bool == true)
							{
								answerarray[3] = 0;
							}
						}
						else if(count == 4)
						{
							if(a1bool == true)
							{
								answerarray[4] = 0;
							}
							else if(b1bool == true)
							{
								answerarray[4] = 0;
							}
							else if(c1bool == true)
							{
								answerarray[4] = 0;
							}
							else if(d1bool == true)
							{
								answerarray[4] = 1;
							}
						}
							count ++;
							if(count == 1)
							{
							label1.setText(question2);
							a1.setText(q2a);
							b1.setText(q2b);
							c1.setText(q2c);
							d1.setText(q2d);
							
							}
							else if(count == 2)
							{
								label1.setText(question3);
								a1.setText(q3a);
								b1.setText(q3b);
								c1.setText(q3c);
								d1.setText(q3d);
							}
							else if(count == 3)
							{
								label1.setText(question4);
								a1.setText(q4a);
								b1.setText(q4b);
								c1.setText(q4c);
								d1.setText(q4d);
							}
							else if(count == 4)
							{
								label1.setText(question5);
								a1.setText(q5a);
								b1.setText(q5b);
								c1.setText(q5c);
								d1.setText(q5d);
							}
							else if(count == 5)
							{
								label1.setText("Your score is:");
								panel1.remove(a1);
								panel1.remove(b1);
								panel1.remove(c1);
								panel1.remove(d1);
								panel1.remove(question1button);
								int finalcount = answerarray[0] + answerarray[1] + answerarray[2] + answerarray[3] + answerarray[4];
								JLabel finalscore = new JLabel(finalcount + " Out of 5");
								finalscore.setFont(new Font("Arial", Font.PLAIN, 50));
								panel1.add(finalscore);
							}
					}
				});
		question1button.setFont(new Font("Arial", Font.PLAIN, 30));
		panel1.add(question1button);
		a.add(panel1);
		a.setSize(1200,1200);
		a.setVisible(true);
	}
}