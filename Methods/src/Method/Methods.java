package Method;

import java.util.Scanner;

public class Methods {

    public Methods() {
    }

    public static void add(int a, int b) {
        double c = (double) (a + b);
        System.out.println("" + a + "+" + b + " = " + c + "\n");
    }

    public static void subtract(int a, int b) {
        double c = (double) (a - b);
        System.out.println("" + a + "-" + b + " = " + c + "\n");
    }

    public static void multiply(int a, int b) {
        double c = (double) (a * b);
        System.out.println("" + a + "*" + b + " = " + c + "\n");
    }

    public static void divide(int a, int b) {
        double da = (double) a;
        double db = (double) b;
        double c = da / db;
        System.out.println("" + a + "/" + b + " = " + c + "\n");
    }

    public static void sinus(int a, int b) {
        System.out.print("Which number? (a)" + a + " or (b)" + b + ": ");
        Scanner sc = new Scanner(System.in);
        String sinChoice = sc.next();
        double db;
        double c;
        if (sinChoice.equals("a")) {
            db = Math.toRadians((double) a);
            c = Math.sin(db);
            System.out.println("sin(" + a + ") = " + c + "\n");
        }

        if (sinChoice.equals("b")) {
            db = Math.toRadians((double) b);
            c = Math.sin(db);
            System.out.println("sin(" + b + ") = " + c + "\n");
        }

    }

    public static void cosinus(int a, int b) {
        System.out.print("Which number? (a)" + a + " or (b)" + b + ": ");
        Scanner sc = new Scanner(System.in);
        String cosChoice = sc.next();
        double db;
        double c;
        if (cosChoice.equals("a")) {
            db = Math.toRadians((double) a);
            c = Math.cos(db);
            System.out.println("cos(" + a + ") = " + c + "\n");
        }

        if (cosChoice.equals("b")) {
            db = Math.toRadians((double) b);
            c = Math.cos(db);
            System.out.println("cos(" + b + ") = " + c + "\n");
        }

    }

    public static void tan(int a, int b) {
        System.out.print("Which number? (a)" + a + " or (b)" + b + ": ");
        Scanner sc = new Scanner(System.in);
        String tanChoice = sc.next();
        double db;
        double c;
        if (tanChoice.equals("a")) {
            db = Math.toRadians((double) a);
            c = Math.tan(db);
            System.out.println("tan(" + a + ") = " + c + "\n");
        }

        if (tanChoice.equals("b")) {
            db = Math.toRadians((double) b);
            c = Math.tan(db);
            System.out.println("tan(" + b + ") = " + c + "\n");
        }

    }

    public static void sqrt(int a, int b) {
        System.out.print("Which number? (a)" + a + " or (b)" + b + ": ");
        Scanner sc = new Scanner(System.in);
        String sqrtChoice = sc.next();
        double c;
        if (sqrtChoice.equals("a")) {
            c = Math.sqrt((double) a);
            System.out.println("sqrt(" + a + ") = " + c + "\n");
        }

        if (sqrtChoice.equals("b")) {
            c = Math.sqrt((double) b);
            System.out.println("sqrt(" + b + ") = " + c + "\n");
        }

    }

    public static void power(int a, int b) {
        System.out.print("Which number? (a)" + a + " or (b)" + b + ": ");
        Scanner sc = new Scanner(System.in);
        String powerChoice = sc.next();
        double c;
        if (powerChoice.equals("a")) {
            c = Math.pow((double) a, (double) b);
            System.out.println("" + a + "^" + b + " = " + c + "\n");
        }

        if (powerChoice.equals("b")) {
            c = Math.pow((double) b, (double) a);
            System.out.println("" + b + "^" + a + " = " + c + "\n");
        }

    }

    public static void mod(int a, int b) {
        System.out.print("Which number? (a)" + a + " or (b)" + b + ": ");
        Scanner sc = new Scanner(System.in);
        String modChoice = sc.next();
        double c;
        if (modChoice.equals("a")) {
            c = (double) (a % b);
            System.out.println("mod(" + a + "," + b + ") = " + c + "\n");
        }

        if (modChoice.equals("b")) {
            c = (double) (b % a);
            System.out.println("mod(" + b + "," + a + ") = " + c + "\n");
        }


    }
}
