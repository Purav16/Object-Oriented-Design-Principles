import java.util.Scanner;


public class Single_RP {
	
	public static void main(String[] args){
		System.out.println("Please enter maximum number of days");
		Scanner sc = new Scanner(System.in);
		int days = sc.nextInt();
		System.out.println("Enter temprature readings for " + days + " number of days");
		double[] temperatures  = new double[days];
		for ( int i = 0 ; i < days ; i++ ){
			temperatures[i] = sc.nextInt();
		}
		
		System.out.println("Average temprature for the " + days + "days is" + average(temperatures,days));
		System.out.println("Minimum temprature during the" + days + "days is" + minimum(temperatures,days));
		System.out.println("Maximum temprature during the" + days + "days is" + maximum(temperatures,days));
		System.out.println("Days at which Temprature higher than average is: " + higher(temperatures,days,average(temperatures,days)));
		System.out.println("Days at which Temprature higher than average is: " + lower(temperatures,days,average(temperatures,days)));
		System.out.println("Maximum temprature during the" + days + "days is" + season(higher(temperatures,days,average(temperatures,days)),lower(temperatures,days,average(temperatures,days))));
	
		sc.close();
	}

	private static String season(double higher, double lower) {
		// TODO Auto-generated method stub
		String season = "";
		if ( higher < lower){
			season = "Summer";
		}
		else if (lower < higher){
			season = "Winter";
		}
		
		return season;
	}

	private static double lower(double[] temperatures, int days, double average) {
		// TODO Auto-generated method stub
		int count = 0;
		for (double temp : temperatures) {
			if (temp > average){
				count++;
			}
		}
		return count;
	}

	private static double higher(double[] temperatures, int days, double average) {
		// TODO Auto-generated method stub
		int count = 0;
		for ( double temp : temperatures){
			if (temp < average){
				count++;
			}
		}
		return count;
	}

	private static double maximum(double[] temperatures, int days) {
		// TODO Auto-generated method stub
		double max = temperatures[0];
		for(int i = 0; i < days; i++){
			if ( temperatures[i] > max){
				max = temperatures[i];
			}
		}
		return max;
	}

	private static double minimum(double[] temperatures, int days) {
		// TODO Auto-generated method stub
		double min = temperatures[0];
		for(int i = 0; i < days; i++){
			if(temperatures[i] < min){
				min  = temperatures[i];
			}
		}
		return min;
	}

	private static double average(double[] temperatures,int days) {
		// TODO Auto-generated method stub
		double sum = 0;
		for ( int i = 0 ; i < days ; i++ ){
			sum = sum + temperatures[i];
		}
		double avg = sum/days;
		return avg;
	}

}

