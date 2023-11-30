

public class BoxCars {
    public static void main(String[] args) {
        int boxcars =0;
        PairOfDice dice = new PairOfDice();
        for (int i = 0; i <= 1000; i++) {
            dice.roll();
            System.out.println(dice);
            if (dice.isBoxCar())
            {
                boxcars++;
            }
            
        }
        System.out.println(boxcars);
    }
}
