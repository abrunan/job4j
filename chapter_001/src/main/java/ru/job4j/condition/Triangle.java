package ru.job4j.condition;

public class Triangle {
    /**
     * Calculate semi-perimeter by triangle's sides.
     *
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
     * @param x1, y1, ..., x3,g y3 - coordinates of points
     * @return triangle's area if it exists, -1 if not
     */
    public double area(int x1, int y1, int x2, int y2, int x3, int y3) {
        double a = new Point().distance(x1, y1, x2, y2);
        double b = new Point().distance(x1, y1, x3, y3);
        double c = new Point().distance(x2, y2, x3, y3);
        double p = semiperim(a, b, c);

        return this.exist(a, b, c) ?
                Math.sqrt(p * (p - a) * (p - b) * (p - c)) :
                -1;
    }
}
