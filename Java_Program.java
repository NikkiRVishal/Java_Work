import java.util.Scanner;

public class Java_Program {
    /*public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double amount = input.nextDouble();
        System.out.println("Enter the amount:");
        double interest = input.nextDouble();
    }*/
    public void calculate(int p, int t, double r, int n) {
        double amount = p * Math.pow(1 + (r / n), n * t);
        double cinterest = amount - p;
        System.out.println("Compound Interest after " + t + " years: "+cinterest);
        System.out.println("Amount after " + t + " years: "+amount);
    }
    public static void main(String args[]) {
        Java_Program obj = new Java_Program();
        obj.calculate(2000, 5, .08, 12);
    }
}
