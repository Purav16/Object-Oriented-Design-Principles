import java.util.Scanner;


public class Single_RP {
	
	public static void main(String[] args){
		System.out.println("Please enter maximum number of days");
		Scanner sc = new Scanner(System.in);
		int days = sc.nextInt();
		System.out.println("Enter temprature readings for " + days + " number of days");
		double[] tempratures = new double[days];
		for ( int i = 0 ; i < days ; i++ ){
			tempratures[i] = sc.nextInt();
		}
		
		System.out.println("Average temprature for the " + days + "days is" + average(tempratures,days));
		System.out.println("Minimum temprature during the" + days + "days is" + minimum(tempratures,days));
		System.out.println("Maximum temprature during the" + days + "days is" + maximum(tempratures,days));
		//System.out.println("Days at which Temprature higher than average is: " + higher(tempratures,days));
		//System.out.println("Days at which Temprature higher than average is: " + lower(tempratures,days));
	}

	private static double maximum(double[] tempratures, int days) {
		// TODO Auto-generated method stub
		double max = tempratures[0];
		for(int i = 0; i < days; i++){
			if ( tempratures[i] > max){
				max = tempratures[i];
			}
		}
		return max;
	}

	private static double minimum(double[] tempratures, int days) {
		// TODO Auto-generated method stub
		double min = tempratures[0];
		for(int i = 0; i < days; i++){
			if(tempratures[i] < min){
				min  = tempratures[i];
			}
		}
		return min;
	}

	private static double average(double[] tempratures,int days) {
		// TODO Auto-generated method stub
		double sum = 0;
		for ( int i = 0 ; i < days ; i++ ){
			sum = sum + tempratures[i];
		}
		double avg = sum/days;
		return avg;
	}

}

