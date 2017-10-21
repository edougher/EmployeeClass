package com.company;

public class Main {
    public static void main(String[] args) {


        EmployeeClass emp1 = new EmployeeClass("aaron", PositionTitle.Administration, false, 27.00, 3, "12/12/12");


        emp1.display();
        emp1.calculate( 40);

    }
}
