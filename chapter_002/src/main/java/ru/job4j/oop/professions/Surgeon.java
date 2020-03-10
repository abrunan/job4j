package ru.job4j.oop.professions;

public class Surgeon extends Doctor {
    public String getName() {
        return super.getName();
    }

    @Override
    public void makeDiagnose(Patient patient) {
        super.makeDiagnose(patient);
    }

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
