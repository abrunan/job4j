package ru.job4j.calculate;

/**
 * Класс расчёта идеального веса
 */
public class Fit {

    /**
     * Идеальный вес для мужчины
     * @param height Рост
     * @return идеальнвй вес
     */
    public double manWeight(double height) {
        return (height - 100) * 1.15;
    }

    /**
     * Идеальный вес для женщины
     * @param height Рост
     * @return идеальнвй вес
     */
    public double womanWeight(double height) {
        return (height - 110) * 1.15;
    }

}
