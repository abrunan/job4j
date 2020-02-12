package ru.job4j.oop.ball;

public class BallStory {
    public static void main(String[] args) {
        Ball kolobok = new Ball();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        Hare hare = new Hare();

        hare.tryEat(kolobok);
        kolobok.escapeFrom(hare);
        wolf.tryEat(kolobok);
        kolobok.escapeFrom(wolf);
        fox.tryEat(kolobok);
        fox.trickAndEat(kolobok);
    }
}
