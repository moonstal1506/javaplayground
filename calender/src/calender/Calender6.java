package calender;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class Calender6 {


	private static final int[] DAYS = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final int[] YDAYS = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final String SAVE_FILE="calendar.dat";
	private HashMap <Date,PlanItem> planMap;
	
	public Calender6() {
		planMap = new HashMap<Date, PlanItem>();
		File f = new File(SAVE_FILE);
		if(!f.exists()) return;
		try {
			Scanner s= new Scanner(f);
			while(s.hasNext()) {
				String line = s.nextLine();
				String[] words = line.split(",");
				String date = words[0];
				String detail = words[1].replaceAll("\"", "");
				System.out.println(date+":"+detail);
				PlanItem planItem = new PlanItem(date, detail);
				planMap.put(planItem.getPlanDate(), planItem);
				
			}
			s.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void registerPlan(String strDate,String plan){
		PlanItem planItem = new PlanItem(strDate, plan);
		planMap.put(planItem.getPlanDate(), planItem);
		File f = new File(SAVE_FILE);
		String item = planItem.saveString();
		
		try {
			FileWriter fw = new FileWriter(f,true);
			fw.write(item);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public PlanItem searchPlan(String strDate) {
		Date date = PlanItem.getDateFromString(strDate);
		return planMap.get(date);
	}
	
	public static boolean isLeapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			return true;
		}
		return false;
	}

	public static int getMaxDaysOfMonth(int year, int month) {
		if(isLeapYear(year)) {
			return YDAYS[month];
		}
		return DAYS[month];
	}
	
	

	public void printCal(int year, int month) {
		
		System.out.printf("     %4d³â %3d¿ù\n", year, month);
		System.out.printf(" su mo tu we th fr sa");
		System.out.println();
		System.out.println("--------------------");
		
		

		int weekday =getWeekDay(year,month, 1);
		for(int i=0;i<weekday;i++) {
			System.out.print("   ");
		}
		
		
		
		int maxDay  = getMaxDaysOfMonth(year,month);
		int count = 7 - weekday;
		int delim = (count < 7) ? count : 0;
		
		for (int i = 1; i <= count; i++) {
			System.out.printf("%3d", i);
			
		}
		System.out.println();
		count++;
		for(int i = count; i <= maxDay; i++) {
			System.out.printf("%3d",i);
			if (i % 7 == delim) 
				System.out.println();
		}
		System.out.println();
	}
	
	private int getWeekDay(int year,int month,int day) {

		int syear = 1970;
		final int STANDARD_WEEKDAY = 4;
		
		int count = 0;
		
		for(int i=syear; i<year;i++) {
			int delta= isLeapYear(i) ? 366:356;
			count +=delta;
		}
		
		for(int i=1; i<month;i++) {
			int delta= getMaxDaysOfMonth(year,i);
			count +=delta;
		}
		count+=day;
		int weekday =(count +STANDARD_WEEKDAY)%7;
		
		return weekday ;
	}
}