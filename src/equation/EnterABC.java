package equation;

import java.util.Scanner;

class EnterABC {
    public static void inputABC(String[] args) {  //нужны args вообще?
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = in.nextInt();
        System.out.println("Enter b:");
        int b = in.nextInt();
        System.out.println("Enter c:");
        int c = in.nextInt();
        InputFactory inputFactory = new InputFactory(a, b, c);
        EquationTest.solve(inputFactory);
    }
}

