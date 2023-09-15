import java.sql.SQLOutput;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int a = 30;
        int b = a++;
        int c = --b;
        int d = a--;
        System.out.println("--prefix\tpostfix--");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println("--multipication--");
        System.out.println(a*b);
        System.out.println(b*d);
        System.out.println(d*a);
        System.out.println("--division--");
        System.out.println(a/b);
        System.out.println(c/d);
        System.out.println("--addition--");
        System.out.println(a+b);
        System.out.println("--substraction--");
        System.out.println(b-d);
        System.out.println(c-a);
        System.out.println("-relation--");
        System.out.println(d>c);
        System.out.println(a<d);
        System.out.println(b<=d);
        System.out.println(c>=a);
        System.out.println(c==a);
        System.out.println(a!=d);
        System.out.println("--logic--");
        System.out.println(a==b && c>d);
        System.out.println(a>b && c<d);
        System.out.println(a==b || d!=c);



    }
}
