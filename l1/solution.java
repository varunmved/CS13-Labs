import java.util.Scanner;


public class solution

{
    public static void main(String[] args) {
      Scanner b = new Scanner(System.in);

      System.out.println("what is the cl?\n");
      double cl = b.nextDouble();

      System.out.println("what is the cd?\n");
      double cd = b.nextDouble();

      System.out.println("what is the area?\n");
      double area = b.nextDouble();

      System.out.println("what is the rho?\n");
      double rho = b.nextDouble();

      System.out.println("what is the velocity?\n");
      double velocity = b.nextDouble();

      double lift = lift(cl,area,rho,velocity);
      lift = lift/2; //since i didn't multiply by .5 in the original eq
      double drag = drag(cd,area,rho,velocity);
      drag = drag/2; //since i didn't multiply by .5 in the original eq


      System.out.println("Lift = " + lift + ("\n"));
      System.out.println("Drag = " + drag + ("\n"));

    }

    public static double lift(double cl, double area, double rho, double velocity) {
      return (cl*area*rho*velocity*velocity);

    }

    public static double drag(double cd, double area, double rho, double velocity) {
      return (cd*area*rho*velocity*velocity);

    }
}
