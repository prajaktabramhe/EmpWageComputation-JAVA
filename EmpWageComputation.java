

public class EmpWageComputation {

	public static void main(String[] args) {
			System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION");
		// Constants
		int IS_FULL_TIME = 1;
		// Computation
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_FULL_TIME)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
		}
}
