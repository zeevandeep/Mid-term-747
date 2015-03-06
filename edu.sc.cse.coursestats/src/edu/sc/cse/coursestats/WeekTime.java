package edu.sc.cse.coursestats;

public class WeekTime 
{
public String day;
public int hour;
public int minute;
public String ampm;
public WeekTime(){
}
public  WeekTime(String day,int hour,int minute,String ampm)
{
this.day=day;
this.hour=hour;
this.minute=minute;
this.ampm=ampm;

if(this.ampm=="pm")
{
this.hour=this.hour+12;
}

}

	public String toString()
{
	String str;
	str = day+" "+Integer.toString(hour)+" "+Integer.toString(minute)+" "+ampm;
	return str;
}
	

	public String compare(WeekTime start_Time,WeekTime finish_Time)
{
		start_Time.minute+=start_Time.hour*60;
		finish_Time.minute+=finish_Time.hour*60;
	
	String ans;
	
	if(start_Time.minute==finish_Time.minute)
	{
	ans = "equal"; 
	}
	else if(start_Time.minute < finish_Time.minute)
	{
	ans = "less"; 
	}
	else
	{
	ans = "more" ;
	}
	return ans;

}}

