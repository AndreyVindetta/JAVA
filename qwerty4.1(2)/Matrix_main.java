public class Matrix_main {
    public static void main(String[] args) {
        Matrix m = new Matrix(3, 4);
        Matrix m2 = new Matrix(3, 4);
        System.out.println("Первая матрица:");
        m.printMatrix();
        System.out.println("Вторая матрица:");
        m2.printMatrix();
        System.out.println("Сложение матриц:");
        m.plusMatrix(m2);
        m.printMatrix();
        System.out.println("Умножение (второй) матрицы на число:");
        m2.multiplyMatrix(2);
        m2.printMatrix();
    }
}
