/*
Nitin Gupta

Homework 05
Peanut Butter and Jelly Sandwich
 */

public class Bread {

    //Instance variables
    private String name;
    private int calories;
    private String type;

    //default constructor
    public Bread()
    {
        this.name = "none";
        this.calories = 50;
        this.type = "Whole Grain";
    }

    // parametrized constructor
    public Bread(String aN, int aC, String aT)
    {
        this.setName(aN);
        this.setCalories(aC);
        this.setType(aT);
    }

    //accessors
    public String getName()
    {
        return this.name;
    }
    public int getCalories()
    {
        return this.calories;
    }
    public String getType()
    {
        return this.type;
    }

    //mutators
    public void setName(String aN)
    {
        if (aN != null)
        {
            this.name = aN;
        }
        else
        {
            this.name = "none";
        }
    }
    public void setCalories(int aC)
    {
        if (aC >= 50 && aC <= 250)
        {
            this.calories = aC;
        }
        else
        {
            this.calories = 50;
        }
    }
    public void setType(String aT)
    {
        if (aT == null)
        {
            this.type = "Whole Grain";
        }
        else if (aT.equals("Honey Wheat"))
        {
            this.type = "Honey Wheat";
        }
        else if (aT.equals("White"))
        {
            this.type = "White";
        }
        else if (aT.equals("Whole Wheat"))
        {
            this.type = "Whole Wheat";
        }
        else
        {
            this.type = "Whole Grain";
        }
    }

    public boolean equals(Bread aB)
    {
        return aB != null &&
                aB.getName().equalsIgnoreCase( this.name ) &&
                aB.getType().equalsIgnoreCase( this.type ) &&
                aB.getCalories() == this.calories;
    }
    public String toString()
    {
        return "[Bread] Name: " + this.name
                + ", Calories: " + this.calories
                + ", Type:  " + this.type;
    }

}
