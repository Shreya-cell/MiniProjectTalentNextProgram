/*Project number := PR-1 , Topic name := Employee Information*/
import java.util.*;
class EmployeeInformation{  				//creating a class named as employee.
	int empId;
	String empName;
	String joinDate;
	char DA;
	String depart;
	int basic;
	int HRA;
	int IT;
	int salary;
	int da;
}
public class P1 {
	static Employee[] er = new Employee[100];			//array to store employee information.
	static int i=0;
	static int c=0;										//used to count the number of employee.
	public P1(int emp, String ename, String date,char da,String depart, int basic, int hra, int it) {
		Employee e = new Employee();
		e.empId= emp;
		e.empName = ename;
		e.joinDate = date;
		e.DA = da;
		e.depart= depart;
		e.basic = basic;
		e.HRA = hra;
		e.IT =it;
		er[i] = e;
		i++;
		c++;
	}
	public static void main(String[] args) {
		P1 p1= new P1(1001,"Ashish","01/04/2009",'e',"R&D",20000,8000,3000);
		p1 = new P1(1002,"Sushma","23/08/2012",'c',"PM",30000,12000,9000);
		p1 = new P1(1003, "Rahul","12/11/2008",'k',"Acct",10000,8000,1000);
		p1= new P1(1004,"Chahat","29/01/2013",'r',"Front Desk",12000,6000,2000);
		p1 = new P1(1005,"Ranjan","16/07/2005",'m',"Engg",50000,20000,20000);
		p1 = new P1(1006,"Suman","1/1/2000",'e',"Manufacture",23000,9000,4400);
		p1 = new P1(1007,"Tanmay","12/06/2006",'c',"PM",29000,12000,10000);
		int id = Integer.parseInt(args[0]);
		int found=0;				//used to check whether there is an employee of given id or not.
		for(int i=0;i<c;i++)
		{
			if(er[i].empId == id) {
				found++;
				char ch = er[i].DA;
				int da = 0;
				String Designation="";
				switch(ch) {
				case 'e':
					da = 20000;
					Designation = "Engineer";
					break;
				case 'c': 
					da = 32000;
					Designation = "Consultant";
					break;
				case 'k': 
					da = 12000;
					Designation = "Clerk";
					break;
				case 'r':
					da= 15000;
					Designation = "Receptionist";
					break;
				case 'm': 
					da = 40000;
					Designation = "Manager";
					break;
				}
				int salary = (er[i].basic+er[i].HRA+da)-er[i].IT;
				System.out.printf("%-10s%-10s%-15s%-15s%-10s\n", "Emp No", "Emp Name", "Department", "Designation", "Salary");
				System.out.printf("%-10s%-10s%-15s%-15s%-10s", er[i].empId, er[i].empName,er[i].depart, Designation, salary);
				break;
			}
				
		}
		if(found==0)
			System.out.println("There is no employee with empid : "+id);
		
		
		
	}
	
}
