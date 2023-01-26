import java.util.Scanner;
public class ArchimedesPiMethod {
    public static void main(String[] args) {
        //Ask the user to enter the number of sides to a polygon
        System.out.println("Enter Polygon Sides: ");
        //Accept the number "s" and pass it to the program as "n"
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Do math
        double b = 360.0/n;
        double a = b / 2;
        double s = 2 * Math.sin(Math.toRadians(a));
        double p = n * s;
        double pi = p / 2;
        //Sout to the console so I can see what's going on
        System.out.printf("The estimated value of pi is %f%n", pi);
        System.out.println("--------------------------------------------------");
        System.out.println("This is number of sides(N) = " + n);
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("SC = " + sc);
        System.out.println("S = " + s);
        System.out.println("P = " + p);


    }
}
