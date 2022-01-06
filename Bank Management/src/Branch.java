import java.util.*;
public class Branch 
{
	private String branch_name;
	private String branch_loc;
	private Double branch_id;
	private int temp = 0;
	ArrayList<Employees> emp = new ArrayList<Employees>();
	private Employees e1;
	public Branch(String b_name, String b_loc, Double b_id)
	{
		this.branch_name = b_name;
		this.branch_loc = b_loc;
		this.branch_id = b_id;
	}

	Double get_brn_id()
	{
		return this.branch_id;
	}
	
	void show_branch() 
	{
		System.out.println("Branch Name: "+this.branch_name);
		System.out.println("Branch Location: "+this.branch_loc);
		System.out.println("Branch ID: "+this.branch_id);
		System.out.println();
	}
	
	void set_Employees(String en, Double ei, String hd, String pos, Double sal, String phn, String add, Branch b)
	{
		e1 = new Employees();
		e1.Employees(en, ei, hd, pos, sal, phn, add, b);
		emp.add(e1);
	}
	
	boolean search_employee(Double num)
	{
		int flag = 0;
		for(int i=0;i<emp.size();i++)
		{
			if(emp.get(i).get_e_id().equals(num))
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
	
	void show_emp(Double num)
	{
		search_employee(num);
		emp.get(temp).show_emp();
	}
	
	Employees get_emp(int num)
	{
		return emp.get(num);
	}
	void change_emp_branch(Branch b, int num)
	{
		emp.get(num).set_e_brn(b); 
	}


}
