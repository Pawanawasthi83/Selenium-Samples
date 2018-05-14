package com.selenium.myproject;
import java.util.Calendar;



public class TestingHandlingCalender {

	static int targetDay =0,
			targetMonth=0,
			targetyear=0;
	
	static int currentDay =0,
			currentMonth=0,
			currentyear=0;
	
	static int jumpMonthsBy=0;
	static boolean increment = true;
	
	public static void main(String[] args) {
		
		String dateToSet = "16/08/2016";
		
		//Get Current Date
		SetCurrentDateMonthAndYear();
		System.out.println(currentDay +" "+currentMonth+"  "+currentyear	);
		
		//Get Target Year
		GetTargetDateMonthAndYear(dateToSet);
		System.out.println(targetDay +" "+targetMonth+"  "+targetyear	);
		
		//Get Jump Month
		MonthsToJunms();
		System.out.println(jumpMonthsBy);
		System.out.println(increment);
	}

	public static void SetCurrentDateMonthAndYear(){
		
				Calendar cal = Calendar.getInstance();
				currentDay = cal.get(Calendar.DAY_OF_MONTH);
				currentMonth = cal.get(Calendar.MONTH)+1;
				currentyear = cal.get(Calendar.YEAR);
						
	}	
	public static void GetTargetDateMonthAndYear(String date) {
		
		int firstIndex = date.indexOf("/");
		int lastIndex = date.lastIndexOf("/");
		
		String day = date.substring(0, firstIndex);
		targetDay=Integer.parseInt(day);
		String month = date.substring(firstIndex+1, lastIndex);
		targetMonth=Integer.parseInt(month);
		String year = date.substring(lastIndex+1, date.length());
		targetyear=Integer.parseInt(year);
		
	}
	
	public static void MonthsToJunms(){
		
		if((targetMonth-currentMonth)>0){
			jumpMonthsBy = targetMonth-currentMonth;
			
		}else{
			jumpMonthsBy = currentMonth-targetMonth;
			increment=false;
		}
		
		
	}
	
}

