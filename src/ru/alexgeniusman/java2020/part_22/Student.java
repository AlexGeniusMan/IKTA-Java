package ru.alexgeniusman.java2020.part_22;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Student {
    private int ID;
    private double average;
    private String birthDate;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Student(int ID, double average, String birthDate) {
        this.ID = ID;
        this.average = average;
        this.birthDate = birthDate;
    }

    public void dataToStr(String format) throws ParseException {
        String br = this.getBirthDate();
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date date = sdf.parse(br);
        System.out.println(date);
    }

    @Override
    public String toString() {
        return "Student{" +
                "birthDate='" + birthDate + '\'' +
                '}';
    }

    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        Student student = new Student(4,4,"12.12.2001");
        System.out.println("Enter the data format");
        String format = in.nextLine();
        student.dataToStr(format);

        String data = in.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm");
        Date date = sdf.parse(data);
        System.out.println(date);

        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        System.out.println(sdf.format(calendar.getTime()));

        System.out.println("Enter the second name of developer");
        String name = in.nextLine();
        Date date1 = sdf.parse("2020.11.06 10:00");
        Date date2 = new Date();
        System.out.println("Powered by " + name);
        System.out.println("Time of receiving: " + date1);
        System.out.println("Time of validating: " + date2);
    }
}