package BaiTap_20_04;

import java.util.ArrayList;
import java.util.Scanner;

public class Staff {
    private double hardSalary, bonus, punish, realWages;
    private final Scanner SC = new Scanner(System.in);
    private final ArrayList<TeacherStaff> array = new ArrayList<>();

    public void enterEmployeeInformation() {
        enterInformationS();
        sumSalary();
        array.add(new TeacherStaff(hardSalary, bonus, punish, realWages));
    }

    private void enterInformationS() {
        System.out.println(" Enter hardSalary : ");
        this.hardSalary = SC.nextDouble();
        System.out.println(" Enter bonus : ");
        this.bonus = SC.nextDouble();
        System.out.println(" Enter punish : ");
        this.punish = SC.nextDouble();
    }

    public void display() {
        for (TeacherStaff k : array) {
            System.out.println(k);
        }
    }

    //    public String findName(){
//        System.out.println(" Enter Name : ");
//        String name = SC.nextLine();
//        for (int i=0;i<array.size();i++){
//            if (array.get(i).)
//        }
//    }
    public void sumSalary() {
        this.realWages = hardSalary + bonus - punish;
    }
    public void displayHighSalary() {
        for (TeacherStaff k : array) {
            if (k.getRealWages() >= 8000000) {
                System.out.println(k);
            }
        }
    }
    public void menu(){
        System.out.println(" Enter Number ! ");
        System.out.println("1. Enter Employee In formation ! ");
        System.out.println("2. Enter display ! ");
        System.out.println("3. Enter display High Salary ! ");
        System.out.println("0. Enter Exit ! ");
    }
    public void switchCase(){
        int choice;
        do {
            menu();
            choice = SC.nextInt();
            switch (choice){
                case 1-> enterEmployeeInformation();
                case 2-> display();
                case 3-> displayHighSalary();
            }
        }while (choice!=0);
    }

}
