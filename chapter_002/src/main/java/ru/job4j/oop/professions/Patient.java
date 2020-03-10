package ru.job4j.oop.professions;

import java.util.HashSet;

public class Patient {
    public boolean isDiagnosed = false;
    private String name;
    private String surName;
    private Diagnose diagnose;
    private HashSet<String> symptoms = new HashSet<>();

    public void addSymptom(String sym) {
        this.symptoms.add(sym);
    }

    public HashSet<String> getSymptoms() {
        return symptoms;
    }

    public void setDiagnose(Diagnose d) {
        this.diagnose = d;
        this.isDiagnosed = true;
    }
}
