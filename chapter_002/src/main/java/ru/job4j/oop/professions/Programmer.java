package ru.job4j.oop.professions;

public class Programmer extends Engineer {
    public String getName() {return super.getName();}

    @Override
    public String getsurName() {
        return super.getsurName();
    }

    @Override
    public String getEducation() {
        return super.getEducation();
    }

    @Override
    public String getBirthday() {
        return super.getBirthday();
    }
}
