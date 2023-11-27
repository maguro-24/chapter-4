import java.util.Scanner;

public class CoinDriver {
    public static void main(String[] args) {
        Coin coin = new Coin();
        Scanner scan = new Scanner(System.in);
        int t, h =0;
        double p;
        
        System.out.println("Times the coin with flip:");
        t = scan.nextInt();
  
        for (int i = 0; i < t; i++) {
              System.out.println(coin);
              if (coin.isHeads())
              {
                 h++;
              }
              coin.flip();
                      
        }
        p =((double) h/ (double)t) *100;
        
        System.out.println("% of the times heads:  " + p + "%");
        
    }

}
