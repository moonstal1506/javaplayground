package calender;


import java.util.Date;
import java.util.HashMap;

public class Calender6 {


	private static final int[] DAYS = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final int[] YDAYS = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
	private HashMap <Date,PlanItem> planMap;
	
	public Calender6() {
		planMap = new HashMap<Date, PlanItem>();
	}
	
	public void registerPlan(String strDate,String plan){
//		Date date = new SimpleDateFormat("yyyy-MM-dd").parse(strDate);
		
		PlanItem planItem = new PlanItem(strDate, plan);
		planMap.put(planItem.getPlanDate(), planItem);
	}
	
	public PlanItem searchPlan(String strDate) {
//		Date date = new SimpleDateFormat("yyyy-MM-dd").parse(strDate);
		
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