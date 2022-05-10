/*
Nitin Gupta

Homework 05
Peanut Butter and Jelly Sandwich
 */

public class PBJSandwich {

    //instance variables
    private Bread topSlice;
    private PeanutButter peanutButter;
    private Jelly jelly;
    private Bread bottomSlice;

    //default constructor
    public PBJSandwich()
    {
        this.topSlice = new Bread();
        this.peanutButter = new PeanutButter();
        this.jelly = new Jelly();
        this.bottomSlice = new Bread();
    }

    //parametrized constructor
    public PBJSandwich(Bread aTS, PeanutButter aPB, Jelly aJ, Bread aBS)
    {
        this.setTopSlice(aTS);
        this.setPeanutButter(aPB);
        this.setJelly(aJ);
        this.setBottomSlice(aBS);
    }

    //accessors
    public Bread getTopSlice()
    {
        return this.topSlice;
    }
    public PeanutButter getPeanutButter()
    {
        return this.peanutButter;
    }
    public Jelly getJelly()
    {
        return this.jelly;
    }
    public Bread getBottomSlice()
    {
        return this.bottomSlice;
    }

    //mutators
    public void setTopSlice(Bread aTS)
    {
        if (aTS == null) // if it does not exist
        {
            this.topSlice = new Bread(); // assign default
        }
        else
        {
            this.topSlice = aTS;
        }
    }
    public void setPeanutButter(PeanutButter aPB)
    {
        if (aPB == null) // if it does not exist
        {
            this.peanutButter = new PeanutButter(); // assign default
        }
        else
        {
            this.peanutButter = aPB;
        }
    }
    public void setJelly(Jelly aJ)
    {
        if (aJ == null) // if it does not exist
        {
            this.jelly = new Jelly(); // assign default
        }
        else
        {
            this.jelly = aJ;
        }
    }
    public void setBottomSlice(Bread aBS)
    {
        if (aBS == null) // if it does not exist
        {
            this.bottomSlice = new Bread(); // assign default
        }
        else
        {
            this.bottomSlice = aBS;
        }
    }

    public boolean equals(PBJSandwich aPBJ)
    {
        return aPBJ != null &&
                aPBJ.getTopSlice().equals( this.topSlice ) &&
                aPBJ.getPeanutButter().equals( this.peanutButter ) &&
                aPBJ.getJelly().equals( this.jelly ) &&
                aPBJ.getBottomSlice().equals( this.bottomSlice );
    }

    public String toString()
    {
        return "[PBJSandwich] \nTopSlice: " + this.topSlice +
                ", \nPeanutButter: " + this.peanutButter +
                ", \nJelly: " + this.jelly +
                ", \nBottomSlice: " + this.bottomSlice;
    }

}
