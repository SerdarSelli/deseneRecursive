import java.util.Scanner;

public class Main {
    static int f(int x,int xx){
        if (!(x <=0)) {
            System.out.print(" "+x);
            return f(x - 5, xx);
        }
            else {
                for (int i =5;!(x==xx);){
                    System.out.print(" "+x);
                    x+=i;
                }
            }
        System.out.print(" "+x);
        return x;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("sayı gir");
        int a = scan.nextInt();
        int aa=a;
        f(a,aa);

    }
}