import java.util.*;

public class letsroll {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount of sides:");
        int a = scan.nextInt();
        
        Die die = new Die(a);
        die.roll();
        System.out.println("side on die: "+a);
        System.out.println("side rolled: " +die);
    }

}
