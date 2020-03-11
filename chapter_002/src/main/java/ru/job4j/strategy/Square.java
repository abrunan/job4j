package ru.job4j.strategy;

import java.util.StringJoiner;

public class Square implements Shape {
    @Override
    public String draw() {
        StringJoiner sj = new StringJoiner(System.lineSeparator());
        sj.add("*********");
        sj.add("*       *");
        sj.add("*       *");
        sj.add("*       *");
        sj.add("*********");
        return sj.toString();
    }
}
