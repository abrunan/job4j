package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setAdmission(new Date());
        student.setName("Harry Potter");
        student.setGroup(119);

        System.out.println("On "
                + student.getAdmission()
                + " "
                + student.getName()
                + " has entered the group "
                + student.getGroup()
                + " of the College."
        );
    }
}
