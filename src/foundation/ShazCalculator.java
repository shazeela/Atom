package foundation;

public class ShazCalculator {
    public void addition(){
        double a=40;
        double b=36;
        double c=a+b;

        System.out.println("the result of the addition is" +c);
    }
    public void substraction(){
        double a=40;
        double b=36;
        double c=a-b;
        System.out.println("the result of the subtraction is" +c);
    }
    public void division(){
        double a=40;
        double b=36;
        double c=a/b;

        System.out.println("the result of the division is" +c);
    }
    public void multiplication(){
        double a=40;
        double b=36;
        double c=a*b;

        System.out.println("the result of the multiplication is" +c);
    }
    public static void main(String[] args) {
        ShazCalculator sc =new ShazCalculator();
        sc.multiplication();


    }

}
