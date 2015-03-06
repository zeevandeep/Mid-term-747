package edu.sc.cse.coursestats;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.object.HasToString.hasToString;
import org.junit.Test;

public class TestTime {
	@Test
	public void test_success_equalTime() {
	WeekTime start_Time=new WeekTime("Tue",4,45,"pm");
	WeekTime finish_Time=new WeekTime("Tue",4,45,"pm");
	WeekTime weekTime= new WeekTime();
	assertThat("equal",is(equalTo(weekTime.compare(start_Time, finish_Time))));
	}
	@Test
	public void test_failure_equalTime() {
	//fail("Not yet implemented");
		WeekTime start_Time=new WeekTime("Tue",4,45,"pm");
		WeekTime finish_Time=new WeekTime("Tue",4,45,"pm");
		WeekTime weekTime= new WeekTime();
	assertThat("less",is(equalTo(weekTime.compare(start_Time, finish_Time))));
	}
	@Test
	public void test_success_lessTime() {
	
		WeekTime start_Time=new WeekTime("Tue",4,15,"pm");
		WeekTime finish_Time=new WeekTime("Tue",5,45,"pm");
	WeekTime weekTime= new WeekTime();
	assertThat("less",is(equalTo(weekTime.compare(start_Time, finish_Time))));
	}
	@Test
	public void test_failure_lessTime() {
	//fail("Not yet implemented");
		WeekTime start_Time=new WeekTime("Tue",4,15,"pm");
		WeekTime finish_Time=new WeekTime("Tue",5,45,"pm");
	WeekTime weekTime= new WeekTime();
	assertThat("equal",is(equalTo(weekTime.compare(start_Time, finish_Time))));
	}
	@Test
	public void test_success_moreTime() {
	//fail("Not yet implemented");
		WeekTime start_Time=new WeekTime("Tue",4,15,"pm");
		WeekTime finish_Time=new WeekTime("Tue",5,45,"pm");
	WeekTime weekTime= new WeekTime();
	assertThat("less",is(equalTo(weekTime.compare(start_Time, finish_Time))));
	}
	@Test
	public void test_failure_moreTime() {
		//fail("Not yet implemented");
		WeekTime start_Time=new WeekTime("Tue",4,15,"pm");
		WeekTime finish_Time=new WeekTime("Tue",5,45,"pm");
		WeekTime weekTime= new WeekTime();
		assertThat("more",is(equalTo(weekTime.compare(start_Time, finish_Time))));
		}
	
		//Checking toString Methods
		@Test
		public void test_EmptyString(){
		WeekTime weektime = new WeekTime("Tue",4,15,"pm");
		assertThat("",is(equalTo(weektime.toString())));
		}
		@Test
		public void test_success_toString(){
		WeekTime weektime = new WeekTime("Tue",4,45,"pm");
		assertThat("Checks Spaces","Tue 16 45 pm",is(equalTo(weektime.toString())));
		}
		@Test
		public void test_failure_toString(){
		WeekTime weektime = new WeekTime("Tue",4,45,"pm");
		assertThat("Tue245pm",is(equalTo(weektime.toString())));
		}
		
		
// Checking hasToString
		@Test
public void test_emptyString_hasToString(){
WeekTime weektime=new WeekTime("Tue",2,45,"pm");
assertThat("Checks Empty string",weektime,hasToString(""));
}
@Test
public void test_success_hasToString(){
WeekTime weektime=new WeekTime("Tue",2,45,"pm");
assertThat(weektime,hasToString("Tue 14 45 pm"));
}
@Test
public void test_failure_hasToString(){
WeekTime weektime=new WeekTime("Tue",2,45,"pm");
assertThat(weektime,hasToString("mon245pm"));
}
}