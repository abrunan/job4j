package ru.job4j.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        JSONReport jsr = new JSONReport();
        System.out.println(jsr.generate("head", "body"));
    }
}
