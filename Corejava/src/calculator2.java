import java.util.Scanner;
public class calculator2
{
    Scanner sc=new Scanner(System.in);


    int  a=sc.nextInt();

    int b=sc.nextInt();

    public void add(){
        int c=a+b;
        System.out.println(c);
    }
    public void subtract(){
        int d=a-b;
        System.out.println(d);
    }
    public void multiply(){
        int e=a*b;
        System.out.println(e);
    }
    public void division(){
        int f=a/b;
        System.out.println(f);
    }
    public static void main(String[]args){

        calculator2 obj=new calculator2();


        obj.add();
        obj.subtract();
        obj.multiply();
        obj.division();

    }
}
