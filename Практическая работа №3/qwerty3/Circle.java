public class Circle {
    final double PI = 3.14; //константа
    private Point point;
    private double r;
    private double S;
    private double l;

    public Circle(double x, double y) {
        this.point = new Point(x, y);
        r = (int)(Math.random() * 10 + 5);//рандомный радиус
        S = PI * r * r;
        l = 2 * PI * r;
        System.out.print("Координаты центра: " + point + "\nРадиус: " + r + "\nДлина окр-ти: " + l + "\nПлощадь окр-ти: " + S);
    }
}
