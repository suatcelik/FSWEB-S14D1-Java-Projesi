package com.workintech.circle;

public class HRManeger extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManeger(int id, String name, double salary, JuniorDeveloper[] juniorDevelopers, MidDeveloper[] midDevelopers, SeniorDeveloper[] seniorDevelopers) {
        super(id, name, salary);
        this.juniorDevelopers = juniorDevelopers;
        this.midDevelopers = midDevelopers;
        this.seniorDevelopers = seniorDevelopers;
    }

    public JuniorDeveloper[] getJuniorDevelopers() {
        return juniorDevelopers;
    }

    public void setJuniorDevelopers(JuniorDeveloper[] juniorDevelopers) {
        this.juniorDevelopers = juniorDevelopers;
    }

    public MidDeveloper[] getMidDevelopers() {
        return midDevelopers;
    }

    public void setMidDevelopers(MidDeveloper[] midDevelopers) {
        this.midDevelopers = midDevelopers;
    }

    public SeniorDeveloper[] getSeniorDevelopers() {
        return seniorDevelopers;
    }

    public void setSeniorDevelopers(SeniorDeveloper[] seniorDevelopers) {
        this.seniorDevelopers = seniorDevelopers;
    }

    public void addEmployee(JuniorDeveloper developer) {

        int size = juniorDevelopers.length;
        int lastIndex = size - 1;
        if (juniorDevelopers[lastIndex] != null) {
            System.out.println("JuniorDevelopers array is full. Cannot add more developers.");
        } else {
            juniorDevelopers[lastIndex] = developer;
            System.out.println("JuniorDeveloper " + developer.getName() + " is added to the JuniorDevelopers array.");
        }
    }


    public void addEmployee(MidDeveloper developer) {
        int size = midDevelopers.length;
        int lastIndex = size - 1;
        if (midDevelopers[lastIndex] != null) {
            System.out.println("MidDevelopers array is full. Cannot add more developers.");
        } else {
            midDevelopers[lastIndex] = developer;
            System.out.println("MidDeveloper " + developer.getName() + " is added to the MidDevelopers array.");
        }
    }


    public void addEmployee(SeniorDeveloper developer) {

        int size = seniorDevelopers.length;
        int lastIndex = size - 1;
        if (seniorDevelopers[lastIndex] != null) {
            System.out.println("SeniorDevelopers array is full. Cannot add more developers.");
        } else {
            seniorDevelopers[lastIndex] = developer;
            System.out.println("SeniorDeveloper " + developer.getName() + " is added to the SeniorDevelopers array.");
        }
    }


    @Override
    public void work() {
        System.out.println("HRManager " + getName() + " starts to managing the developers");
        setSalary(getSalary() * 1.1);


    }
}