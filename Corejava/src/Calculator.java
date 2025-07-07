import java.util.Scanner;
public class Calculator {

    public void add(int e,int r){
        int c=e+r;
        System.out.println(c);
    }
    public void subtract(int e,int r){
        int d=e-r;
        System.out.println(d);
    }
    public void multiply(int e,int r){
        int f=e*r;
        System.out.println(f);
    }
    public void division(int e,int r){
        int g=e/r;
        System.out.println(g);
    }
    public static void main(String[]args){

        Calculator obj=new Calculator();
        Scanner sc=new Scanner(System.in);

System.out.println("enter a");
        int  a=sc.nextInt();
        System.out.println("enter b");
        int b=sc.nextInt();


        obj.add(a,b);
        obj.subtract(a,b);
        obj.multiply(a,b);
        obj.division(a,b);

    }
}
