package blackBox.equivalenceClasses.date;

public class Date {

	private int day;

	private int month;

	private int year;

	private static final int[] DAY_LIMIT = { 31, 28, 31, 30, 31, 30, 31, 31,
			30, 31, 30, 31 };

	private static final int MONTH_LIMIT = DAY_LIMIT.length;

	public Date(int day, int month, int year) {
		assert new ClosedInterval(1, MONTH_LIMIT).includes(month);
		assert new ClosedInterval(1, DAY_LIMIT[month - 1]).includes(day);
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public Date next() {
		int day = this.day + 1;
		int month = this.month;
		int year = this.year;
		if (day > DAY_LIMIT[month]) {
			day = 1;
			month++;
			if (month > MONTH_LIMIT) {
				month = 0;
				year++;
			}
		}
		return new Date(day, month, year);
	}
}
