/*

Claire McDermott
18 fEB 2021

*/


//data memebers
//constructor
//setters
//prcess
//getters


public class WeeklyWage{


	private int daysWorked;
	private double dailyPay;
	private double weeklyPay;


	//Constructor
	public WeeklyWage(){
		daysWorked=0;
		dailyPay=0.0;
		weeklyPay=0.0;

		}



	public void setDaysWorked(int daysWorked){
	this.daysWorked=daysWorked;
	}


	public void setDailyPay(double dailyPay){
	this.dailyPay=dailyPay;
	}


	//Process
	public void compute(){
	weeklyPay=daysWorked*dailyPay;
	}


	//getters
	public double getTotalPay(){
		return weeklyPay;
		}

}
















