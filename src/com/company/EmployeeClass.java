package com.company;


public class EmployeeClass {

    private String name;
    private PositionTitle position;
    private boolean salary = true;
    private double payRate;
    private int shift;
    private String startDate;
    private double weeklyTotal;

    /**
     * Class Constructor
     * @param name
     * @param position
     * @param salary
     * @param payRate
     * @param shift
     * @param startDate
     */

    public EmployeeClass(String name, PositionTitle position, boolean salary, double payRate, int shift, String startDate) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.payRate = payRate;
        this.shift = shift;
        this.startDate = startDate;

    }

    /**
     *  Getters and setters
     * @return
     */

    public PositionTitle getPosition() {
        return position;
    }

    public void setPosition(PositionTitle position) {
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

    public void setShift(int shift) { this.shift = shift; }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }


    /**
     * Still need to play around with this Method to get it to work
     * @param hoursIn
     * @return
     */

    public double calculate(double hoursIn){
        double overTimePay = 0;
        double overTimeHrs = hoursIn - 40;
        double overTimeTotal = overTimeHrs*overTimePay;
        if (hoursIn > 40 && salary == false) {
            overTimePay = payRate*1.5;
        }



        switch (getShift())
        {
            case 1:
                return weeklyTotal = payRate * (hoursIn + overTimeHrs);
            case 2:
                return weeklyTotal = payRate * hoursIn + .05;
            case 3:
                return weeklyTotal = payRate * hoursIn + .10;
        }



        return weeklyTotal;
    }



    public void display() {

        System.out.println(weeklyTotal);
    }


}


