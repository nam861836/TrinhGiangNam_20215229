import java.util.Scanner;

import static java.lang.Math.sqrt;

import javax.swing.JOptionPane;

class cal {
    //ex 2.2.5
    public static void main(String[] args){
        double num1, num2, sum, diff, prod, quot = 0;
        Scanner num = new Scanner(System.in);
        System.out.println("Enter num1 & num2: ");
        num1 = num.nextDouble();
        num2 = num.nextDouble();
        sum = num1 + num2;
        if (num1 > num2) diff = num1 - num2;
        else diff = num2 - num1;
        prod = num1 * num2;
        quot = num1 / num2;
        //else System.out.println("Error");
        System.out.println("Sum is: " + sum);
        System.out.println("Difference is: " + diff);
        System.out.println("Product is: " + prod);
        if(num2 != 0) System.out.println("Quotient is: " + quot);
        else System.out.println("No quotient!");
    }
}

class equation1 {
    //ex2.2.6
    public static void main(String[] args) {
        float a, b, x;
        Scanner num = new Scanner(System.in);
        System.out.println("Solution for ax + b = 0");
        System.out.println("Enter a & b: ");
        a = num.nextFloat();
        b = num.nextFloat();
        x = -b / a;
        if (a == 0) System.out.println("No solution");
        System.out.println("x = " + x);
    }
}
class equation2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        double a11, a12, b1, a21, a22, b2, det, det1, det2, x1, x2;
        System.out.println("Enter the coefficients of the first equation: ");
        a11 = num.nextDouble();
        a12 = num.nextDouble();
        b1 = num.nextDouble();
        System.out.println("Enter the coefficients of the second equation: ");
        a21 = num.nextDouble();
        a22 = num.nextDouble();
        b2 = num.nextDouble();
        det = a11 * a22 - a21 * a12;
        det1 = b1 * a22 - b2 * a12;
        det2 = a11 * b2 - a21 * b1;
        x1 = det1/det;
        x2 = det2/det;
        if (det == 0) {
                System.out.println("No solution!");
        } else {
            System.out.println("Root 1: " + x1);
            System.out.println("Root 2: " + x2);
        }
    }
}

class equation3{
    public static void main(String[] args){
        double a, b, c, delta, x1, x2;
        Scanner num = new Scanner(System.in);
        a = num.nextFloat();
        b = num.nextFloat();
        c = num.nextFloat();
        delta = b*b - 4*a*c;
        x1 = (-b-sqrt(delta))/(2*a);
        x2 = (-b+sqrt(delta))/(2*a);
        if (a == 0) System.out.println("Root = " + -c/b);
        if (delta < 0) System.out.println("No solution!");
        if (delta == 0) System.out.println("Root = " + -b/(2*a));
        if (delta > 0) {
            System.out.println("Root 1: " + x1);
            System.out.println("Root 2: " + x2);
        }
    }

}

