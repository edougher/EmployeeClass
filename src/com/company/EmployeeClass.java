package com.company;


public class EmployeeClass {
    private double hoursIn;
    private String name;
    private String position;
    private boolean salary = true;
    private double payRate;
    private int shift;
    private String startDate;
    private double weeklyTotal = payRate*hoursIn;


    public EmployeeClass(String name, String position, boolean salary, double payRate, int shift, String startDate, double weeklyTotal) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.payRate = payRate;
        this.shift = shift;
        this.startDate = startDate;
        this.weeklyTotal = weeklyTotal;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isSalary() {
        return salary;
    }

    public void setSalary(boolean salary) {
        this.salary = salary;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        payRate = payRate;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
        
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    public double getWeeklyTotal(){
        return weeklyTotal;
    }
    public void setWeeklyTotal(double weeklyTotal) {
        this.weeklyTotal = weeklyTotal;
    }

   public double calculate (double hoursIn) {
        

        if (salary == false && hoursIn > 40) payRate = payRate * 1.5;

        if (shift == 2) {
            weeklyTotal = weeklyTotal + .05;
        } if (shift == 3) {
            weeklyTotal = weeklyTotal + .10;
        }
       return weeklyTotal;
    }
    public void display(double hoursIn) {
       double pay = payRate*hoursIn;
        System.out.println( name + "\n" + position + salary + payRate + shift + startDate + weeklyTotal);

    }
    
}


