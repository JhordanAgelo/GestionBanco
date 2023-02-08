
package paquete;

import java.util.Calendar;
public class Fecha {
    
    private int day;
    private int month;
    private int year;

    public Fecha(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }
    
    public Fecha() {
        day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        month= Calendar.getInstance().get(Calendar.MONTH)+1;
        year = Calendar.getInstance().get(Calendar.YEAR);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    
}
