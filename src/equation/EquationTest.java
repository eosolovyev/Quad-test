package equation;


class EquationTest {
    public static void solve(InputFactory data) {
        int a = data.a;
        int b = data.b;
        int c = data.c;
        double x1;
        double x2;
        double D = (b * b - 4 * a * c);
        if (D > 0) {
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Уравнение " + a + "x^2 + " + b + "x + " + c + " = 0 | " + "D больше нуля. Уравнение имеет два корня");
            System.out.println("D = " + D);
            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);
        } else if (D == 0) {
            x1 = -b / (2 * a);
            System.out.println("Уравнение " + a + "x^2 + " + b + "x + " + c + " = 0 | " + "D равно нулю. Уравнение имеет один корень");
            System.out.println("D = " + D);
            System.out.println("X1 = " + x1);
        } else {
            System.out.println("D меньше нуля. Уравнение не имеет корней");
        }
    }
}


