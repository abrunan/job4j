package ru.job4j.oop.professions;

public class Doctor extends Profession {
    public String getName() {return super.getName();}

    public void makeDiagnose(Patient patient) {
        if (!patient.isDiagnosed) {
            patient.setDiagnose(new Diagnose());
        }
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
