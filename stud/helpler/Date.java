package stud.helpler;
import java.io.Serializable;
public class Date implements Serializable {
    private int day;
    private int month;
    private int year;
    public Date(int day,int month,int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public Date(String day,String month,String year){
        this.day = Integer.valueOf(day);
        this.month = Integer.valueOf(month);
        this.year =Integer.valueOf(year);
    }
    public Date(Date date){
        this.day = date.getDay();
        this.month = date.getMonth();
        this.year = date.getYear();
    }
    public void setDate(Date date){
        this.day = date.getDay();
        this.month = date.getMonth();
        this.year = date.getYear();
    }
    public void setDay(int day){
        this.day = day;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getDay(){
        return this.day;
    }
    public int getMonth(){
        return this.month;
    }
    public int getYear(){
        return this.year;
    }
    public Date getDate(){
        return new Date(this.day,this.month,this.year);
    }
    public String toString(){
        return new String(this.day+"/"+this.month+"/"+this.year);
    }
}
