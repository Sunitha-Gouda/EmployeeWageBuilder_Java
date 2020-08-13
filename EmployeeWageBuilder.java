
public class EmployeeWageBuilder
{
	public static void main(String[] args)
	{
		//Display welcome message
			System.out.println("Welcome To Employee Wage Computation Problem");
		//Constants
			int IS_FULL_TIME = 1, IS_PART_TIME = 2;
			int EMP_WAGE_PER_HR=20;
			int NUM_OF_WORKING_DAYS=20;
			int empHrs;
			int Salary,TotalSalary=0 ;
		//Computation
			for ( int days=0; days<NUM_OF_WORKING_DAYS; days++)
			{

				double empCheck = Math.floor(Math.random() * 10 ) % 3;

				if (empCheck == IS_FULL_TIME)
				{
					empHrs=8;
				System.out.println("Employee is  Full time Employee");

				}
				else if (empCheck == IS_PART_TIME)
				{
					empHrs=4;
				System.out.println("Employee is Part time Employee");
				}
     			else
				{
					empHrs=0;
				System.out.println("Employee Is Absent");
				}

				Salary=(NUM_OF_WORKING_DAYS * empHrs);
				System.out.println("Salary=" +Salary);
				TotalSalary=( TotalSalary+Salary);
				System.out.println("TotalSalary = " +TotalSalary );
			}
	}

}

