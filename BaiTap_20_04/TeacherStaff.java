package BaiTap_20_04;


import java.util.Scanner;

public class TeacherStaff {
    private final Scanner SC = new Scanner(System.in);
    private String name,age,homTown;
    private double hardSalary,bonus,punish,realWages;
    private CanBO canBO;
    public TeacherStaff() {
    }
    public void canBO(){
        enterInformation();
        canBO =  new CanBO(name,age,homTown);
    }
    public void enterInformation(){
        System.out.println(" Enter Name : ");
        this.name = SC.nextLine();
        System.out.println(" Enter age : ");
        this.age = SC.nextLine();
        System.out.println(" Enter homTown : ");
        this.homTown = SC.nextLine();
    }
    public TeacherStaff(double hardSalary, double bonus, double punish,double realWages) {
        this.canBO();
        this.hardSalary = hardSalary;
        this.bonus = bonus;
        this.punish = punish;
        this.realWages = realWages;
    }

    public double getHardSalary() {
        return hardSalary;
    }

    public void setHardSalary(double hardSalary) {
        this.hardSalary = hardSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getPunish() {
        return punish;
    }

    public void setPunish(double punish) {
        this.punish = punish;
    }

    public double getRealWages() {
        return realWages;
    }

    public void setRealWages(double realWages) {
        this.realWages = realWages;
    }

    @Override
    public String toString() {
        return " hardSalary : " + hardSalary +
                " , bonus : " + bonus +
                " , punish : " + punish + canBO.toString();
    }
}
