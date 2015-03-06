package edu.sc.cse.coursestats;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
public class TestCourse {
@Test
public void test_returnEmpty() {
//fail("Not yet implemented");
WeekTime start_Time1=new WeekTime("Mon",4,30,"pm");
WeekTime finish_Time1=new WeekTime("Mon",5,45,"pm");
WeekTime start_Time2=new WeekTime("Wed",2,30,"pm");
WeekTime finish_Time2=new WeekTime("Wed",3,15,"pm");
Course c1=new Course("CSCE",824,"Farkas",start_Time1,finish_Time1);
Course c2=new Course("CSCE",747,"Matthews",start_Time2,finish_Time2);
//Course c=new Course();
assertThat("Checks Empty String","",is(equalTo(c1.compare(c1,c2))));
}
@Test
public void testsucess_CourseApproved() {

WeekTime start_Time1=new WeekTime("Mon",4,30,"pm");
WeekTime finish_Time1=new WeekTime("Mon",5,45,"pm");
WeekTime start_Time2=new WeekTime("Wed",2,30,"pm");
WeekTime finish_Time2=new WeekTime("Wed",3,15,"pm");
Course c1=new Course("CSCE",824,"Farkas",start_Time1,finish_Time1);
Course c2=new Course("CSCE",747,"Matthews",start_Time2,finish_Time2);
//Course c=new Course();
assertThat("Course Approved!",is(equalTo(c1.compare(c1,c2))));
}
@Test
public void testfailure_CourseApproved(){
WeekTime start_Time1=new WeekTime("Mon",4,30,"pm");
WeekTime finish_Time1=new WeekTime("Mon",5,45,"pm");
WeekTime start_Time2=new WeekTime("Wed",4,30,"pm");
WeekTime finish_Time2=new WeekTime("Wed",5,15,"pm");
Course c1=new Course("CSCE",824,"Farkas",start_Time1,finish_Time1);
Course c2=new Course("CSCE",747,"Matthews",start_Time2,finish_Time2);
assertThat("Denied Course",is(equalTo(c1.compare(c1,c2))));
}
@Test
public void testsucess_DeniedCourse() {
WeekTime start_Time1=new WeekTime("Wed",4,30,"pm");
WeekTime finish_Time1=new WeekTime("Wed",5,45,"pm");
WeekTime start_Time2=new WeekTime("Wed",5,30,"pm");
WeekTime finish_Time2=new WeekTime("Wed",6,15,"pm");
Course c1=new Course("CSCE",824,"Farkas",start_Time1,finish_Time1);
Course c2=new Course("CSCE",747,"Matthews",start_Time2,finish_Time2);

assertThat("Denied Course",is(equalTo(c1.compare(c1,c2))));
}
@Test
public void testfailure_DeniedCourse() {

WeekTime start_Time1=new WeekTime("Mon",4,30,"pm");
WeekTime finish_Time1=new WeekTime("Mon",5,45,"pm");
WeekTime start_Time2=new WeekTime("Mon",4,45,"pm");
WeekTime finish_Time2=new WeekTime("Mon",6,00,"pm");
Course c1=new Course("CSCE",824,"Farkas",start_Time1,finish_Time1);
Course c2=new Course("CSCE",747,"Matthews",start_Time2,finish_Time2);

assertThat("Course Approved!",is(equalTo(c1.compare(c1,c2))));
}
@Test
public void test_Sucess_Constructor_dept() {
WeekTime starttime=new WeekTime("Mon",4,30,"pm");
WeekTime finishtime=new WeekTime("Mon",5,45,"pm");
Course c=new Course("CSCE",824,"Farkas",starttime,finishtime);
assertTrue("Same Department",c.dept=="CSCE");
}
@Test
public void test_Failure_Constructor_dept() {

WeekTime starttime=new WeekTime("Mon",4,30,"pm");
WeekTime finishtime=new WeekTime("Mon",5,45,"pm");
Course c=new Course("CSCE",824,"Farkas",starttime,finishtime);
assertTrue("Different Department",c.dept=="CSE");
}
@Test
public void test_Success_number() {

WeekTime starttime=new WeekTime("Mon",4,30,"pm");
WeekTime finishtime=new WeekTime("Mon",5,45,"pm");
Course c=new Course("CSCE",747,"Matthews",starttime,finishtime);
assertTrue("Same Course",c.number==747);
}
@Test
public void test_failure_Const_number() {

WeekTime starttime=new WeekTime("Mon",4,30,"pm");
WeekTime finishtime=new WeekTime("Mon",5,45,"pm");
Course c=new Course("CSCE",747,"Matthews",starttime,finishtime);
assertTrue("Different Course No.",c.number==708);
}
@Test
public void test_Success_instructor() {

WeekTime starttime=new WeekTime("Mon",4,30,"pm");
WeekTime finishtime=new WeekTime("Mon",5,45,"pm");
Course c=new Course("CSCE",747,"Farkas",starttime,finishtime);
assertTrue("Same Instructor",c.instructor=="Farkas");
}
@Test
public void test_failure_instructor() {

WeekTime starttime=new WeekTime("Mon",4,30,"pm");
WeekTime finishtime=new WeekTime("Mon",5,45,"pm");
Course c=new Course("CSCE",747,"Matthews",starttime,finishtime);
assertTrue("Different",c.instructor=="hope");
}
}
