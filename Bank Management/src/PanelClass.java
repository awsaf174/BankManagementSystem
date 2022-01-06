import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
public class PanelClass extends JFrame implements ActionListener
{
	private	JTabbedPane tabbedPane;
	private	JPanel panel1;
	private	JPanel panel2;
	private JPanel panel3;
	private JPanel panel4;
	private Accounts a1;
	private Branch b1;
	private int temp = 0 ;
	final ArrayList<Accounts> acc = new ArrayList<Accounts>();
	final ArrayList<Branch> brn = new ArrayList<Branch>();
	
	public PanelClass()
	{
		setTitle( "Bank Management System" );
		setSize( 700, 700 );
		
		JPanel topPanel = new JPanel();
		topPanel.setLayout( new BorderLayout() );
		getContentPane().add( topPanel );
		
		accounts();
		branch();
		transactions();
		employees();
	
		tabbedPane = new JTabbedPane();
		tabbedPane.addTab( "Accounts", panel1 );
		tabbedPane.addTab( "Branch", panel2 );
		tabbedPane.addTab("Transactions", panel3);
		tabbedPane.addTab("Employees", panel4);
		topPanel.add( tabbedPane, BorderLayout.CENTER);
		
	}

	public void accounts()
	{
		panel1 = new JPanel();
		panel1.setLayout( null );
		
		JLabel label0 = new JLabel("Accounts Creation");
		label0.setBounds(250, 0, 220, 40);
		panel1.add(label0);
		
		JLabel label1 = new JLabel( "Account Holder" );
		label1.setBounds( 100, 100, 150, 25 );
		panel1.add( label1 );

		final JTextField field1 = new JTextField();
		field1.setBounds( 375, 100, 150, 25 );
		panel1.add( field1 );

		JLabel label2 = new JLabel( "Account Number" );
		label2.setBounds( 100, 150, 150, 25 );
		panel1.add( label2 );
		
		final JTextField field2 = new JTextField();
		field2.setBounds(375, 150, 150, 25);
		panel1.add(field2);
		
		JLabel label3 = new JLabel( "Initial Deposit" );
		label3.setBounds( 100, 200, 150, 25 );
		panel1.add( label3 );

		final JTextField field3 = new JTextField();
		field3.setBounds( 375, 200, 150, 25 );
		panel1.add( field3 );
		
		JLabel label4 = new JLabel( "Balance" );
		label4.setBounds( 100, 250, 150, 25 );
		panel1.add( label4 );

		final JTextField field4 = new JTextField();
		field4.setEditable(false);
		field4.setBounds( 375, 250, 150, 25 );
		panel1.add( field4 );
		
		JButton button1 = new JButton("Create Account");
		button1.setBounds(200, 320, 200, 35);
		panel1.add(button1);
		
		JButton button2 = new JButton("Clear Fields");
		button2.setBounds(200, 380, 200, 35);
		panel1.add(button2);
		
		button1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				try{
					Double f2 = Double.valueOf(field2.getText());
					Double f3 = Double.valueOf(field3.getText());
					a1 = new Accounts(f2, field1.getText(), f3);
					field4.setText(field3.getText());
					acc.add(a1);
					JOptionPane.showMessageDialog(null, "Account Created");
				}catch(NumberFormatException a){
					JOptionPane.showMessageDialog(null, "Empty fields");
					
				}
			}
		});
		button2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				field1.setText(null);
				field2.setText(null);
				field3.setText(null);
				field4.setText(null);
			}
		});
	}
	
	boolean search_account(ArrayList<Accounts> acc, Double num)
	{
		int flag = 0;
		for(int i=0;i<acc.size();i++)
		{
			if(acc.get(i).get_acc_num().equals(num))
			{
				temp = i;
				flag++;
				break;
			}
		}
		if(flag != 0)
		{
			flag = 0;
			return true;
		}
		else
		{
			flag = 0;
			return false;
		}
	}

	public void branch()
	{
		panel2 = new JPanel();
		panel2.setLayout( null );
		
		JLabel label0 = new JLabel("Branch Creation");
		label0.setBounds(250, 0, 220, 40);
		panel2.add(label0);

		JLabel label1 = new JLabel( "Branch Name" );
		label1.setBounds(  100, 100, 150, 25 );
		panel2.add( label1 );

		final JTextField field1 = new JTextField();
		field1.setBounds( 375, 100, 150, 25 );
		panel2.add( field1 );

		JLabel label2 = new JLabel( "Branch Location" );
		label2.setBounds( 100, 150, 150, 25);
		panel2.add( label2 );
		
		final JTextField field2 = new JTextField();
		field2.setBounds(375, 150, 150, 25);
		panel2.add(field2);
		
		JLabel label3 = new JLabel("Branch ID");
		label3.setBounds(100, 200, 150, 25);
		panel2.add(label3);
		
		final JTextField field3 = new JTextField();
		field3.setBounds(375, 200, 150, 25);
		panel2.add(field3);
		
		JButton button0 = new JButton("Branch Details");
		button0.setBounds(100, 250, 150, 25);
		panel2.add(button0);
		
		final JTextField field4 = new JTextField("Branch ID");
		field4.setBounds(375, 250, 150, 25);
		panel2.add(field4);
		field4.addMouseListener(new MouseListener()
		{
			@Override
			public void mouseClicked(MouseEvent arg0) {
				field4.setText(null);
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
				
			}
		});
		
		JButton button3 = new JButton("Search Employee");
		button3.setBounds(100, 320, 150, 25);
		panel2.add(button3);
		
		final JTextField field5 = new JTextField("Employee ID");
		field5.setBounds(375, 300, 150, 25);
		panel2.add(field5);
		field5.addMouseListener(new MouseListener()
		{
			@Override
			public void mouseClicked(MouseEvent arg0) {
				field5.setText(null);
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
				
			}
		});
		
		final JTextField field6 = new JTextField("Branch ID");
		field6.setBounds(375, 340, 150, 25);
		panel2.add(field6);
		field6.addMouseListener(new MouseListener()
		{
			@Override
			public void mouseClicked(MouseEvent arg0) {
				field6.setText(null);
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
				
			}
		});
		
		final JTextField field7 = new JTextField("OLD Branch ID");
		field7.setBounds(375, 380, 150, 25);
		panel2.add(field7);
		field7.addMouseListener(new MouseListener()
		{
			@Override
			public void mouseClicked(MouseEvent arg0) {
				field7.setText(null);
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
				
			}
		});
		
		final JTextField field8 = new JTextField("NEW Branch ID");
		field8.setBounds(375, 420, 150, 25);
		panel2.add(field8);
		field8.addMouseListener(new MouseListener()
		{
			@Override
			public void mouseClicked(MouseEvent arg0) {
				field8.setText(null);
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
				
			}
		});
		
		final JTextField field9 = new JTextField("Employee ID");
		field9.setBounds(375, 460, 150, 25);
		panel2.add(field9);
		field9.addMouseListener(new MouseListener()
		{
			@Override
			public void mouseClicked(MouseEvent arg0) {
				field9.setText(null);
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
				
			}
		});
		
		JButton button1 = new JButton("Create Branch");
		button1.setBounds(200, 520, 200, 35);
		panel2.add(button1);
		
		JButton button2 = new JButton("Clear Fields");
		button2.setBounds(200, 570, 200, 35);
		panel2.add(button2);
		
		button1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				try{
					Double f3 = Double.valueOf(field3.getText());
					b1 = new Branch(field1.getText(),field2.getText(),f3);
					brn.add(b1);
					JOptionPane.showMessageDialog(null, "Branch Created");
				}catch(NumberFormatException a)
				{
					JOptionPane.showMessageDialog(null, "Empty fields");
				}
			}	
		});
		
		button2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				field1.setText(null);
				field2.setText(null);
				field3.setText(null);
				field4.setText(null);
				field5.setText(null);
				field6.setText(null);
			}
		});
		
		button3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Double f5 = Double.valueOf(field5.getText());
				Double f6 = Double.valueOf(field6.getText());
				
				if(search_branch(brn,f6))
				{
					if(brn.get(temp).search_employee(f5))
					{
						JOptionPane.showMessageDialog(null, "Employee Found");
						brn.get(temp).show_emp(f5);
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Employee NOT Found");
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Branch NOT Found");
				}
				
			}
			
		});
		
		JButton button4 = new JButton("Change Employee Branch");
		button4.setBounds(100, 420, 180, 25);
		panel2.add(button4);
		
		button4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				int flag = 0;
				int stamp = 0;
				int count = 0;
				Double f7 = Double.valueOf(field7.getText());
				Double f8 = Double.valueOf(field8.getText());
				Double f9 = Double.valueOf(field9.getText());
				
				if(!search_branch(brn, f7))
				{
					JOptionPane.showMessageDialog(null, "OLD Branch NOT Found");
					
				}
				else
				{
					flag = temp;
					if(!brn.get(temp).search_employee(f9))
					{
						JOptionPane.showMessageDialog(null, "Employee NOT Found");
					}
					else
					{
						count = temp;
						if(!search_branch(brn, f8))
						{
							JOptionPane.showMessageDialog(null, "NEW Branch NOT Found");
							
						}
						else
						{
							stamp = temp;
							if(f7.equals(f8))
							{
								JOptionPane.showMessageDialog(null, "OLD/NEW Same Branch");
							}
							else
							{
								brn.get(flag).change_emp_branch(brn.get(stamp), count);
//								Employees e1 = new Employees();
//								e1 = brn.get(flag).get_emp(count);
//								e1.set_e_brn(brn.get(stamp));
//								JOptionPane.showMessageDialog(null, "Employee Branch Changed");
							}
						
						}
					}
					
				}	
			}
		});
		
		
		button0.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Double f4 = Double.valueOf(field4.getText());
				if(search_branch(brn,f4))
				{
					JOptionPane.showMessageDialog(null, "Branch Found");
					brn.get(temp).show_branch();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Branch NOT Found");
				}
			}
		});
	}
	
	boolean search_branch(ArrayList<Branch> brn, Double num)
	{
		int flag = 0;
		for(int i=0;i<brn.size();i++)
		{
			if(brn.get(i).get_brn_id().equals(num))
			{
				temp = i;
				flag++;
				break;
			}
		}
		if(flag != 0)
		{
			flag = 0;
			return true;
		}
		else
		{
			flag = 0;
			return false;
		}
	}
	
	public void transactions() 
	{
		panel3 = new JPanel();
		panel3.setLayout( null );
		
		JLabel label0 = new JLabel("Account Transactions");
		label0.setBounds(250, 20, 220, 40);
		panel3.add(label0);

		JButton button1 = new JButton( "Deposit" );
		button1.setBounds( 100, 100, 150, 35 );
		panel3.add( button1 );

		final JTextField field = new JTextField("Amount");
		field.setBounds( 375, 100, 150, 35 );
		panel3.add( field );
		field.addMouseListener(new MouseListener()
		{
			@Override
			public void mouseClicked(MouseEvent arg0) {
				field.setText(null);
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		final JTextField field1 = new JTextField("Account Number");
		field1.setBounds( 535, 100, 100, 35 );
		panel3.add( field1 );
		field1.addMouseListener(new MouseListener()
		{
			@Override
			public void mouseClicked(MouseEvent arg0) {
				field1.setText(null);
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		button1.addActionListener(new ActionListener()
		{
				public void actionPerformed(ActionEvent e)
				{
					try{
						Double f = Double.valueOf(field.getText());
						Double f1 = Double.valueOf(field1.getText());
						if(search_account(acc,f1))
						{
							acc.get(temp).deposit(f);
						}
					}catch(NumberFormatException a)
					{
						JOptionPane.showMessageDialog(null, "No amount entered");
						
					}
					finally
						{
						Double f1 = Double.valueOf(field1.getText());
						if(search_account(acc,f1)==false)
						{
						
							System.out.println("Account NOT Found");
						}
						}
				}
		});

		JButton button2 = new JButton( "Withdraw" );
		button2.setBounds( 100, 150, 150, 35);
		panel3.add( button2 );
		
		final JTextField field2 = new JTextField("Amount");
		field2.setBounds(375, 150, 150, 35);
		panel3.add(field2);
		field2.addMouseListener(new MouseListener()
		{
			@Override
			public void mouseClicked(MouseEvent arg0) {
				field2.setText(null);
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		final JTextField field3 = new JTextField("Account Number");
		field3.setBounds( 535, 150, 100, 35 );
		panel3.add( field3 );
		field3.addMouseListener(new MouseListener()
		{
			@Override
			public void mouseClicked(MouseEvent arg0) {
				field3.setText(null);
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		button2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Double f2 = Double.valueOf(field2.getText());
				Double f3 = Double.valueOf(field3.getText());
				if(search_account(acc,f3))
				{
					acc.get(temp).withdraw(f2);
				}
				else
				{
					System.out.println("Account NOT Found");
				}
			}
		});
		
		JButton button3 = new JButton("Search Account");
		button3.setBounds(100, 200, 150, 35);
		panel3.add(button3);
		
		final JTextField field4 = new JTextField("Account Number");
		field4.setBounds(375, 200, 150, 35);
		panel3.add(field4);
		field4.addMouseListener(new MouseListener()
		{
			@Override
			public void mouseClicked(MouseEvent arg0) {
				field4.setText(null);
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		button3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Double f4 = Double.valueOf(field4.getText());
				if(search_account(acc,f4))
				{
					System.out.println("Account Found");
					acc.get(temp).show_account();
				}
				else
				{
					System.out.println("Account NOT Found");
				}
			}
		});
		
		JButton button4 = new JButton("Delete Account");
		button4.setBounds(100, 250, 150, 35);
		panel3.add(button4);
		
		final JTextField field5 = new JTextField("Account Number");
		field5.setBounds(375, 250, 150, 35);
		panel3.add(field5);
		field5.addMouseListener(new MouseListener()
		{
			@Override
			public void mouseClicked(MouseEvent arg0) {
				field5.setText(null);
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		button4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Double f5 = Double.valueOf(field5.getText());
				if(search_account(acc,f5))
				{
					System.out.println("Account Found");
					acc.remove(acc.get(temp));
					if(!search_account(acc,f5))
					{
						System.out.println("Account Removed");
					}
					else
					{
						System.out.println("Account Removal FAILED");
					}
					
				}
				else
				{
					System.out.println("Account NOT Found");
				}
			}
		});
		
		JButton button5 = new JButton("Show Account");
		button5.setBounds(100, 300, 150, 35);
		panel3.add(button5);
		
		final JTextField field6 = new JTextField("Account Number");
		field6.setBounds(375, 300, 150, 35);
		panel3.add(field6);
		field6.addMouseListener(new MouseListener()
		{
			@Override
			public void mouseClicked(MouseEvent arg0) {
				field6.setText(null);
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		button5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Double f6 = Double.valueOf(field6.getText());
				if(search_account(acc,f6))
				{
					System.out.println("Account Found");
					acc.get(temp).show_account();
				}
				else
				{
					System.out.println("Account NOT Found");
				}
			}
		});
		
		JLabel label1 = new JLabel("Account to Account Balance Transfer");
		label1.setBounds(205, 375, 220, 40);
		panel3.add(label1);
		
		JLabel label2 = new JLabel("Account Number");
		label2.setBounds(100, 400, 220, 40);
		panel3.add(label2);
		
		final JTextField field7 = new JTextField("From");
		field7.setBounds(100, 435, 150, 35);
		panel3.add(field7);
		field7.addMouseListener(new MouseListener()
		{
			@Override
			public void mouseClicked(MouseEvent arg0) {
				field7.setText(null);
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		JLabel label3 = new JLabel("Account Number");
		label3.setBounds(375, 400, 220, 40);
		panel3.add(label3);
		
		final JTextField field8 = new JTextField("To");
		field8.setBounds(375, 435, 150, 35);
		panel3.add(field8);
		field8.addMouseListener(new MouseListener()
		{
			@Override
			public void mouseClicked(MouseEvent arg0) {
				field8.setText(null);
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		JButton button6 = new JButton("Transfer");
		button6.setBounds(205, 540, 220, 40);
		panel3.add(button6);
		
		JLabel label4 = new JLabel("Amount");
		label4.setBounds(225, 460, 220, 40);
		panel3.add(label4);
		
		final JTextField field9 = new JTextField("Amount");
		field9.setBounds(225, 490, 150, 40);
		panel3.add(field9);
		field9.addMouseListener(new MouseListener()
		{
			@Override
			public void mouseClicked(MouseEvent arg0) {
				field9.setText(null);
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		button6.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
			try{
				int flag = 0;
				int count = 0;
				int stamp = 0;
				Double f7 = Double.valueOf(field7.getText());
				Double f8 = Double.valueOf(field8.getText());
				Double f9 = Double.valueOf(field9.getText());
				if(search_account(acc,f7))
				{
					flag++;
					System.out.println("FROM Account Found");
					stamp = temp;
				}
				if(search_account(acc,f8))
				{
					count++;
					System.out.println("TO Account Found");
				}
				if(flag == 0)
				{
					System.out.println("FROM Account NOT Found");
				}
				if(count == 0)
				{
					System.out.println("TO Account NOT Found");
				}
				if((flag != 0) && (count != 0))
				{
					if(f7.equals(f8))
					{
						System.out.println("Same Account Numbers Found");
					}
					else 
					{
						if(acc.get(stamp).withdraw(f9))
						{
							acc.get(temp).deposit(f9);						
						}
						
					}
				}}
				catch(NumberFormatException a)
				{
					JOptionPane.showMessageDialog(null, "Empty fields");
					
				}
			}
		});
	}
	

	public void employees()
	{
		panel4 = new JPanel();
		panel4.setLayout(null);	
		
		JLabel label0 = new JLabel("Empoyee Assignment");
		label0.setBounds(250, 0, 220, 40);
		panel4.add(label0);

		JLabel label1 = new JLabel( "Employee Name" );
		label1.setBounds(  100, 100, 150, 25 );
		panel4.add( label1 );

		final JTextField field = new JTextField();
		field.setBounds( 375, 100, 150, 25 );
		panel4.add( field );

		JLabel label2 = new JLabel( "Emplyee ID" );
		label2.setBounds( 100, 150, 150, 25);
		panel4.add( label2 );
		
		final JTextField field2 = new JTextField();
		field2.setBounds(375, 150, 150, 25);
		panel4.add(field2);
		
		JLabel label3 = new JLabel("Hire Date");
		label3.setBounds(100, 200, 150, 25);
		panel4.add(label3);
		
		final JTextField field3 = new JTextField();
		field3.setBounds(375, 200, 150, 25);
		panel4.add(field3);
		
		JLabel label4 = new JLabel("Position");
		label4.setBounds(100, 250, 150, 25);
		panel4.add(label4);
		
		final JTextField field4 = new JTextField();
		field4.setBounds(375, 250, 150, 25);
		panel4.add(field4);
		
		JLabel label5 = new JLabel("Salary");
		label5.setBounds(100, 300, 150, 25);
		panel4.add(label5);
		
		final JTextField field5 = new JTextField();
		field5.setBounds(375, 300, 150, 25);
		panel4.add(field5);
		
		JLabel label6 = new JLabel("Phone Number");
		label6.setBounds(100, 350, 150, 25);
		panel4.add(label6);
		
		final JTextField field6 = new JTextField();
		field6.setBounds(375, 350, 150, 25);
		panel4.add(field6);
		
		JLabel label7 = new JLabel("Address");
		label7.setBounds(100, 400, 150, 25);
		panel4.add(label7);
		
		final JTextArea area1 = new JTextArea();
		area1.setBounds(375, 400, 200, 80);
		panel4.add(area1);
		
		JLabel label8 = new JLabel("Branch ID");
		label8.setBounds(100, 500, 150, 25);
		panel4.add(label8);
		
		final JTextField field7 = new JTextField();
		field7.setBounds(375, 500, 150, 25);
		panel4.add(field7);
		
		JButton button1 = new JButton("Assign Employee");
		button1.setBounds(200, 550, 200, 35);
		panel4.add(button1);
		
		button1.addActionListener(new ActionListener()
		{

			public void actionPerformed(ActionEvent e)
			{
				try{
					Double f2 = Double.valueOf(field2.getText());
					Double f5 = Double.valueOf(field5.getText());
					Double f7 = Double.valueOf(field7.getText());

					if(search_branch(brn,f7))
					{
							brn.get(temp).set_Employees(field.getText(), f2, field3.getText(),
									field4.getText(), f5, field6.getText(), area1.getText(),brn.get(temp));
							JOptionPane.showMessageDialog(null, "Employee Assigned");
					}
					}catch(NumberFormatException a)
					{
						JOptionPane.showMessageDialog(null, "No employee details entered");
						
					}finally
					{
						Double f7 = Double.valueOf(field7.getText());
						if(search_branch(brn,f7)==false)
						{
							JOptionPane.showMessageDialog(null, "Branch not found");
							
						}
					}
					
			}
			
		
		});
	}

	public void actionPerformed(ActionEvent e)
	{
		
	}

		

}
	