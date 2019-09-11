import java.util.Scanner;
public class Momentum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mass, velocity, momentum;
        System.out.println("MOMENTUM CALCULATOR");
        System.out.println("-------------------");
        System.out.println("Enter a number for the mass of the object in kilograms> ");
        mass = scan.nextDouble();
        System.out.println("Enter a number for the velocity of the object in meters per second > ");
        velocity = scan.nextDouble();
        momentum = mass*velocity;
        System.out.format("With a mass of %.2f kgs and a velocity of %.2f mps, the momentum of the object is %.2f kg/m².\n", mass,velocity,momentum);
    }
    
}
