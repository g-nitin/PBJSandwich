/*
Nitin Gupta

Homework 05
Peanut Butter and Jelly Sandwich
 */

public class PeanutButter {

    //Instance variables
    private String name;
    private int calories;
    private boolean IsCrunchy;

    //default constructor
    public PeanutButter()
    {
        this.name = "none";
        this.calories = 100;
        this.IsCrunchy = false;
    }

    // parametrized constructor
    public PeanutButter(String aN, int aC, boolean aI)
    {
        this.setName(aN);
        this.setCalories(aC);
        this.setIsCrunchy(aI);
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
    public boolean getIsCrunchy()
    {
        return this.IsCrunchy;
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
        if (aC >= 100 && aC <= 300)
        {
            this.calories = aC;
        }
        else
        {
            this.calories = 100;
        }
    }
    public void setIsCrunchy(boolean aIC)
    {
        this.IsCrunchy = aIC;
    }

    public boolean equals(PeanutButter aPb)
    {
        return aPb != null &&
                aPb.getName().equalsIgnoreCase( this.name ) &&
                aPb.getCalories() == this.calories &&
                aPb.getIsCrunchy() == this.getIsCrunchy();
    }
    public String toString()
    {
        return "[PeanutButter] Name: " + this.name
                + ", Calories: " + this.calories
                + ", Is crunchy?:  " + this.IsCrunchy;
    }

}
