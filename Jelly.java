/*
Nitin Gupta

Homework 05
Peanut Butter and Jelly Sandwich
 */

public class Jelly {

    //Instance variables
    private String name;
    private int calories;
    private String fruitType;

    //default constructor
    public Jelly()
    {
        this.name = "none";
        this.calories = 50;
        this.fruitType = "none";
    }

    // parametrized constructor
    public Jelly(String aN, int aC, String aF)
    {
        this.setName(aN);
        this.setCalories(aC);
        this.setFruitType(aF);
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
    public String getFruitType()
    {
        return this.fruitType;
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
        if (aC >= 50 && aC <= 200)
        {
            this.calories = aC;
        }
        else
        {
            this.calories = 50;
        }
    }
    public void setFruitType(String aT)
    {
        if (aT == null)
        {
            this.fruitType = "none";
        }
        else if (aT.equals("Apple"))
        {
            this.fruitType = "Apple";
        }
        else if (aT.equals("Blackberry"))
        {
            this.fruitType = "Blackberry";
        }
        else if (aT.equals("Grape"))
        {
            this.fruitType = "Grape";
        }
        else if (aT.equals("Mango"))
        {
            this.fruitType = "Mango";
        }
        else if (aT.equals("Tomato"))
        {
            this.fruitType = "Tomato";
        }
        else
        {
            this.fruitType = "none";
        }
    }

    public boolean equals(Jelly aJ)
    {
        return aJ != null &&
                aJ.getName().equalsIgnoreCase( this.name ) &&
                aJ.getFruitType().equalsIgnoreCase( this.fruitType) &&
                aJ.getCalories() == this.calories;
    }
    public String toString()
    {
        return "[Jelly] Name: " + this.name
                + ", Calories: " + this.calories
                + ", Fruit Type:  " + this.fruitType;
    }

}
