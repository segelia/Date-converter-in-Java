package package1;

public class MyData {

    int day;
    int month;
    int year;
    String dayOfTheWeek;

    MyData(int day, int month, int year, String dayOfTheWeek) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.dayOfTheWeek = dayOfTheWeek;
    }

    public String toString() {
        return "day = " + this.day + ", month = " + this.month + ", year = " + this.year + ", weekday = "
                + this.dayOfTheWeek;
    }

}
