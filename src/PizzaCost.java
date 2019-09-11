
import java.util.Scanner;

public class PizzaCost {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final double labor = 1.50, utilities = 0.75;
        String toppings[] = {"pepper", "mushroom", "anchovies", "bacon", "pineapple", "ham", "sausage", "pepperoni", "olive"};
        int topnum=0;
        double size;
        double price = 0;
        String topchoice;
        System.out.println("𝓟𝓲𝔃𝔃𝓪 𝓒𝓸𝓼𝓽");
        System.out.println("-----------");
        System.out.println("                        ___\n"
                + "                        |  ~~--.\n"
                + "                        |%=@%%/\n"
                + "                        |o%%%/\n"
                + "                     __ |%%o/\n"
                + "               _,--~~ | |(_/ ._\n"
                + "            ,/'  m%%%%| |o/ /  `\\.\n"
                + "           /' m%%o(_)%| |/ /o%%m `\\\n"
                + "         /' %%@=%o%%%o|   /(_)o%%% `\\\n"
                + "        /  %o%%%%%=@%%|  /%%o%%@=%%  \\\n"
                + "       |  (_)%(_)%%o%%| /%%%=@(_)%%%  |\n"
                + "       | %%o%%%%o%%%(_|/%o%%o%%%%o%%% |\n"
                + "       | %%o%(_)%%%%%o%(_)%%%o%%o%o%% |\n"
                + "       |  (_)%%=@%(_)%o%o%%(_)%o(_)%  |\n"
                + "        \\ ~%%o%%%%%o%o%=@%%o%%@%%o%~ /\n"
                + "         \\. ~o%%(_)%%%o%(_)%%(_)o~ ,/\n"
                + "           \\_ ~o%=@%(_)%o%%(_)%~ _/\n"
                + "             `\\_~~o%%%o%%%%%~~_/'\n"
                + "                `--..____,,--'");
        while (true) {
            System.out.print("Enter a number for the diameter of the object in centimeters > ");
            size = scan.nextDouble();
            if (size < 10) {
                System.out.println("ERROR - SIZE TO SMALL");
            } else if (size > 100) {
                System.out.println("ERROR - SIZE TO LARGE");
            } else {
                System.out.println("\nTOPPINGS:");
                for (int i = 0; i < toppings.length; i++) {
                    System.out.println(toppings[i] + " - $0.75");
                }
                while (true) {
                    System.out.print("\nEnter a topping or type S to skip > ");
                    topchoice = scan.next();
                    if(topchoice.equals("S")) break;
                    if(topscan(topchoice)==true){
                        System.out.println("Added " + topchoice + " to order.");
                        topnum++;
                    }
                    if(topscan(topchoice)==false){
                        System.out.println("ERROR - " + topchoice + " IS AND INVALID TOPPING");
                    }
                    

                }
            }
            break;
        }
        price = (topnum * 0.75) + labor + utilities + (0.5*size);
        System.out.println("------------------------------------------------------------------------");
        System.out.format("For a %.2f centimeter pizza with %d toppings, the final price is $%.2f.\n",size,topnum,price);

    }

    public static boolean topscan(String top) {
        String toppings[] = {"pepper", "mushroom", "anchovies", "bacon", "pineapple", "ham", "sausage", "pepperoni", "olive"};
        for (int i = 0; i < toppings.length; i++) {
            if (toppings[i].equals(top)) {
                return true;
            }
        }
        return false;
    }
}
