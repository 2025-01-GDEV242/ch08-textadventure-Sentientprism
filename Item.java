
/**
 * Write a description of class Item here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Item
{
    // instance variables - replace the example below with your own
    private String name;
    private String description;

    /**
     * Constructor for objects of class Item
     */
    public Item(String name,String description)
    {
        this.description = description;
        this.name = name;
    }
    
    public String getDescription()
    {
        return description;
    }
    public String getName()
    {
        return name;
    }
}
