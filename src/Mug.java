

public class Mug {
    
    private String bev;
    private boolean open;
    private int amount;
    private int capacity;
    
    public Mug(String b, int a, int c)
    {
        bev = b;
        amount = a;
        capacity = c;
        open = false;
               
    }
    
    public void open()
    {
        open = true;
    }
    
    public void close()
    {
        open = false;
    }
    
    public void drink()
    {
        if(open = true)
        {
            amount--;
            System.out.println("Ahhhhhhh...delicious");
            close();
            if(amount <= 0)
            {
                refill(capacity);

            } 
            else
            System.out.println("open lid to drink.");
        }
       
        
    }
    
    public void refill(int a)
    {
        amount = a;
    }
}
