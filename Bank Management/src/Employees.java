public class Employees 
{
	private String e_name;
	private Double e_id;
	private String hiredate;
	private String position;
	private Double salary;
	private String phone;
	private String e_add;
	private Branch b1;
	
	void Employees(String en, Double ei, String hd, String pos, Double sal, String phn, String add, Branch b)
	{
		this.e_name = en;
		this.e_id = ei;
		this.hiredate = hd;
		this.position = pos;
		this.salary = sal;
		this.phone = phn;
		this.e_add = add;
		this.b1 = b;	
	}
	
	Double get_e_id()
	{
		return this.e_id;
	}
	
	
	void set_e_brn(Branch b)
	{
		this.b1 = b;
	}
	void show_emp()
	{
		System.out.println("Employee Name: "+this.e_name);
		System.out.println("Employee ID: "+this.e_id);
		System.out.println("Employee Hire_Date: "+this.hiredate);
		System.out.println("Employee Position: "+this.position);
		System.out.println("Employee Salary: "+this.salary);
		System.out.println("Employee Phone_Number: "+this.phone);
		System.out.println("Employee Address: "+this.e_add);
		System.out.println("Employee Branch - ");
		this.b1.show_branch();
	}

}
