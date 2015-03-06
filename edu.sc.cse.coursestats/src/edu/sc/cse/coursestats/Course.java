package edu.sc.cse.coursestats;

public class Course {
	 public String dept;
	 public int number;
	 public String instructor;
	 WeekTime starttime;
	 WeekTime finishtime;
	 public Course(String d, int num, String instr){
		 dept = d;
		 number = num;
		 instructor = instr;
		 
	 }
	 
	 public Course(String d, int num, String instr,WeekTime start,WeekTime finish){
		 dept = d;
		 number = num;
		 instructor = instr;
		 starttime=start;
		 finishtime=finish;
	 }
	 public String toString(){
		 String  str;
		 str = dept + Integer.toString(number)+instructor;
		 return str;
	 }


public String compare(Course c1,Course c2){
	
		if((c1.starttime.day==c2.starttime.day) && (c1.finishtime.day==c2.finishtime.day)){

	if(((((c1.starttime.hour)*60)+(c1.starttime.minute) <= ((c2.starttime.hour)*60)+(c2.starttime.minute)) && (((c2.starttime.hour)*60)+(c2.starttime.minute)<= ((c1.finishtime.hour)*60)+(c1.finishtime.minute))) || (((c2.finishtime.hour)*60)+(c2.finishtime.minute) >= ((c1.starttime.hour)*60)+(c1.starttime.minute))&&(((c2.finishtime.hour)*60)+(c2.finishtime.minute)<=((c1.finishtime.hour)*60)+(c1.finishtime.minute)))
	{
return "Denied Course";
}
else
{
return "Course Approved!";
}
}
else{
return "Course Approved!";
}
}}