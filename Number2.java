package Lab10;

public class Number2 {
	private int month;
	private int day;
	private int year;
	public Number2() {
		this.month=0;
		this.day=0;
		this.year=0;
	}
	public Number2(int month, int day, int year) {
		this.month=month;
		this.day=day;
		this.year=year;
	}
	public int getmonth() {
		return month;
	}
	public int getday() {
		return day;
	}
	public int getyear() {
		return year;
	}
	public void setmonth(int month) {
		this.month=month;
	}
	public void setday(int day) {
		this.day=day;
	}
	public void setyear(int year) {
		this.year=year;
	}
	public void date() {
		this.month=1;
		this.day=1;
		this.year=1900;
	}
	public static void main(String[] args) {
		Number2 Date = new Number2(11,10,2022);
		System.out.println("Todays month is: " + Date.getmonth());
		System.out.println("Todays day is: " + Date.getday());
		System.out.println("Todays year is: " + Date.getyear());
	}

}
