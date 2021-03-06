package edu.sc.cse.coursestats;

import java.io.*;
import java.util.Date;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CourseStats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Course Stats program 1");
		Course c = new Course("CSCe", 110, "MatthewsA");
		System.out.println(c.toString());
		CourseMeeting meeting = new CourseMeeting("SWGN 3A01", "TR", "8:30-9:45", c);
		System.out.println(meeting.toString());
		
		System.out.println("Starting to read csv file sched.csv");
		
		String filename = "data/sched.csv";
		File infile = null;
		try{
			infile = new File(filename);
			Scanner scanner = new Scanner(infile);	
			String header = scanner.nextLine();
			System.out.println("Header Line='"+ header + "'");
			String line;
			int linecounter = 0;
			String dept="";
			String num="";
			String sect="";
			String instructor="";
			String room="";
			String days="";
			String timeOfDay="";
			String cap="";
			String enrolled="";
			
			while ((line = scanner.nextLine()) != null) {
				linecounter++;
				String[] field = line.split("	");
				if (field.length == 18){
					if (field[2].length() > 2){
						dept = field[2];
						num = field[3];	
						sect = field[4];
						cap= field[11];
						enrolled=field[12];
					}
					days = field[9];
					timeOfDay = field[10];
					instructor= field[14];
					//15 = dates
					room= field[16];
					//enrolled=field[12];
					
					System.out.print(dept + num + " , sec=" + sect+"time="+timeOfDay);
					System.out.println("cap="+cap+"enrolled="+enrolled+"room="+room+ "days="+days );
				}else{
					System.out.println("Data error line=" +  linecounter + "["+ line + "]");
					System.out.println(field.length);
				}
		}
			
		} catch (FileNotFoundException e){
			System.out.println("Error opening file='" + filename+"'");
			e.printStackTrace();
			System.exit(0);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		

	}
}
