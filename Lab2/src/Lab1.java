import java.util.Scanner;
public class Lab1 {
    public static void main(String[] args) {
        /*for (int i = 0; i < args.length; i++) {
            String s = args[i];
            System.out.println(s + "\t" + isPalindrome(s));
        }*/
        System.out.print("Enter the x coordinate of the first point: ");
        Scanner scanX1 = new Scanner(System.in);
        double x1 = scanX1.nextInt();

        System.out.print("Enter the y coordinate of the first point: ");
        Scanner scanY1 = new Scanner(System.in);
        double y1 = scanY1.nextInt();

        System.out.print("Enter the z coordinate of the first point: ");
        Scanner scanZ1 = new Scanner(System.in);
        double z1 = scanZ1.nextInt();

        System.out.print("Enter the x coordinate of the second point: ");
        Scanner scanX2 = new Scanner(System.in);
        double x2 = scanX2.nextInt();

        System.out.print("Enter the y coordinate of the second point: ");
        Scanner scanY2 = new Scanner(System.in);
        double y2 = scanY2.nextInt();

        System.out.print("Enter the z coordinate of the second point: ");
        Scanner scanZ2 = new Scanner(System.in);
        double z2 = scanZ2.nextInt();

        System.out.print("Enter the x coordinate of the third point: ");
        Scanner scanX3 = new Scanner(System.in);
        double x3 = scanX3.nextInt();

        System.out.print("Enter the y coordinate of the third point: ");
        Scanner scanY3 = new Scanner(System.in);
        double y3 = scanY3.nextInt();

        System.out.print("Enter the z coordinate of the third point: ");
        Scanner scanZ3 = new Scanner(System.in);
        double z3 = scanZ3.nextInt();

        Point3d P1 = new Point3d(x1, y1, z1);
        Point3d P2 = new Point3d(x2, y2, z2);
        Point3d P3 = new Point3d(x3, y3, z3);

        if (P1.Equ(P2) || P1.Equ(P3) || P2.Equ(P3))
            System.out.println("The coordinates of the points are the same!");
        else
            System.out.println("The area of the triangle is: " + computeArea(P1, P2, P3));
    }

    public static double computeArea(Point3d p1, Point3d p2, Point3d p3) {
        double line1 = p1.distanceTo(p2);
        double line2 = p1.distanceTo(p3);
        double line3 = p2.distanceTo(p3);
        double per = (line1 + line2 + line3) / 2.0;
        return Math.sqrt(per * (per - line1) * (per - line2) * (per - line3));
    }
}
