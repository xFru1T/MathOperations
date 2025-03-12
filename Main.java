// 2. Перегрузка методов
// Создать класс MathOperations с методами sum, который складывает:
// 1) Два целых числа
// 2) Два числа с плавающей точкой
// 3) Три целых числа
import java.util.*;
class MathOperations {
    public static int sum(int a, int b) {
        return a + b;
    }
    public static double sum(double a, double b) {
        return a + b;
    }
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        System.out.println("Sum 2 int numbers: " + sum(2, 3));
        System.out.println("Sum 2 double numbers: " + sum(2.5, 3.5));
        System.out.println("Sum 3 int numbers: " + sum(1, 2, 3));
    }
}