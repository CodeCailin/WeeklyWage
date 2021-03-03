/*
WeeklyWageApp
Claire McDermott
18 Feb 2021

*/
import java.util.*;


public class WeeklyWageApp{
	public static void main(String[]args){


	//variables
	String name;
	int daysWorked;
	double dailyPay;
	double weeklyPay;

	//objects
	WeeklyWage myWeeklyWage = new WeeklyWage();
	Scanner keyboard = new Scanner(System.in);


	//ask for input
	System.out.println("What is your name?");
	name=keyboard.nextLine();


	//ask for input
	System.out.println("How many days have you worked?");
	daysWorked=keyboard.nextInt();
	myWeeklyWage.setDaysWorked(daysWorked);


	//ask for input
	System.out.println("What is your daily pay?");
	dailyPay=keyboard.nextDouble();
	myWeeklyWage.setDailyPay(dailyPay);



	//Pr0cess
	myWeeklyWage.compute();



	//output
	weeklyPay=myWeeklyWage.getTotalPay();
	System.out.println(name +" your weekly wage= "+ weeklyPay);



}


}