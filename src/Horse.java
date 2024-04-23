/**
 * Write a description of class Horse here.
 * 
 * @author Blake 
 * @version 1
 */
class Horse{
    //Fields of class Horse
    private char horseSymbol;
    private String horseName;
    private double confidence;//
    private int distance;//distance travel by horse. If less than total distacne,then it fail the match
    private boolean flag;//true means finished;false mean faild
      
    //Constructor of class Horse
    /**
     * Constructor for objects of class Horse
     */
    public Horse(char horseSymbol, String horseName, double horseConfidence)
    {
        this.horseSymbol = horseSymbol;
        this.horseName = horseName;
        this.confidence = horseConfidence;
        this.distance = 0;
        this.flag = true;
    }
    
    
    
    //Other methods of class Horse
    public void fall()
    {
        this.confidence = this.getConfidence() - 0.1;
        this.flag = false;
        
    }
    
    public double getConfidence()
    {
        return this.confidence;
    }
    
    public int getDistanceTravelled()
    {
        return this.distance;
    }
    
    public String getName()
    {
        return this.horseName;
    }
    
    public char getSymbol()
    {
        return this.horseSymbol;
    }
    
    public void goBackToStart()
    {
        this.distance = 0;
    }
    
    public boolean hasFallen()
    {
        return !this.flag;
    }

    public void moveForward()
    {
        this.distance++;
    }

    public void setConfidence(double newConfidence)
    {
        this.confidence = newConfidence;
    }
    
    public void setSymbol(char newSymbol)
    {
        this.horseSymbol = newSymbol;
    }
    
}