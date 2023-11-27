

public class Coin {
    //instance Data
    private int face;
    
    //constructor
    public Coin()
    {
        flip();
    }
    
    //methods
    public void flip()
    {
        face = (int) (Math.random()*2);
    }
    
    public boolean isHeads()
    {
        if (face == 0)
            return true;
        else
            return false;
    }
    
    public String toString()
    {
        if (isHeads())
            return "heads";
        else
             return "tails";
    }
            
    
}
