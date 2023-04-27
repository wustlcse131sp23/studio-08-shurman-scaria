package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
	private int month;
	private int day;
	private int year;
	private boolean isHoliday;
	
	public Date(int initMonth, int initDay, int initYear, boolean initHoliday) {
		month = initMonth;
		day = initDay;
		year = initYear;
		isHoliday = initHoliday;
	}
	
    @Override
	public String toString() {
		return "Date [month=" + month + ", day=" + day + ", year=" + year + ", isHoliday=" + isHoliday + "]";
	}

    




	@Override
	public int hashCode() {
		return Objects.hash(day, isHoliday, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && isHoliday == other.isHoliday && month == other.month && year == other.year;
	}

	public static void main(String[] args) {
		Date date1 = new Date(10, 4, 2017, false);
		Date date2 = new Date(1, 1, 2000, true);
		Date date3 = new Date(10, 4, 2017, false);
		Date date4 = new Date(8, 29, 2003, true);
		Date date5 = new Date(4, 5, 2023, true);
		System.out.println(date1.equals(date3));
		System.out.println(date1.equals(date4));
		LinkedList<Date> list = new LinkedList<Date>();
		list.add(date1);
		list.add(date2);
		list.add(date3);
		list.add(date4);
		list.add(date5);
		
		System.out.println("List:" + list);
		HashSet<Date> set = new HashSet<Date>();
		set.add(date1);
		set.add(date2);
		set.add(date3);
		set.add(date4);
		set.add(date5);
		System.out.println("Set:" + set);

    }

}
