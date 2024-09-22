import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите коэффициенты a, b и c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        solveMain(a, b, c);
    }
    public static void solveMain(double a, double b, double c)
    {
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0)
        {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("Корни: %.2f, %.2f%n", root1, root2);
        }
        else if (discriminant == 0)
        {
            double root = -b / (2 * a);
            System.out.printf("Единственный корень: %.2f%n", root);
        }
        else
        {
            System.out.println("нет вещественных корней");
        }
    }
}