package ru.job4j.condition;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point a, Point b, Point c) {
        this.first = a;
        this.second = b;
        this.third = c;
    }

    /**
     * Calculate semi-perimeter by triangle's sides.
     * Formula:
     * (a + b + c) / 2
     *
     * @param a distance between points A and B
     * @param b distance between points A and C
     * @param c distance between points B and C
     * @return semi-perimeter
     */
    public double semiperim(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    /**
     * Check if a triangle with such sides exists
     *
     * @param a distance between points A and B
     * @param b distance between points A and C
     * @param c distance between points B and C
     * @return true if it does
     */
    public boolean exist(double a, double b, double c) {
        return (a + b > c) && (b + c > a) && (a + c > b);
    }

    /**
     * Calculate triangle's area by Heron's formula
     *
     * @return triangle's area if it exists, -1 if not
     */
    public double area() {
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        double p = semiperim(a, b, c);
        return this.exist(a, b, c)
                ? Math.sqrt(p * (p - a) * (p - b) * (p - c))
                : -1;
    }
}
