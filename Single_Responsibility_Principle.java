package challanges;




public class Employee_salary{
	public  int salary(){
		int sum = 0;
		return sum ;
		
	}
}
protected double salary_counter(double base_salary, double interest) {
	// TODO Auto-generated method stub
double sum = base_salary + (base_salary * interest);
return sum;
}

public static void  main(String[] args){
	Employee_salary emp_1 = new Employee_salary();
	System.out.println("Salary for emp1 is:" + emp_1.salary_counter(50000 , 0.8) );
}

}
