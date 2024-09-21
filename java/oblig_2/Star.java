public class Star {

    
    private String starName;
    private double starRadius;
    private double starMass;
    private int starEffectiveTemp;

    private double Msun=1.98892E30;
    private int Rsun=695700;

/////////////////    NAME    //////////////////////////////////
    public void setStarName (String starName)
    {
        this.starName=starName;
    }

    public String getStarName()
    {
        return starName;
    }
////////////////   STAR RADIUS   ///////////////////////////////

    public void setStarRadius(double starRadius)
    {
        this.starRadius=starRadius;
    }

    public double getStarRadius()
    {
        return starRadius;
    }

    public double getStarRadiusKm()
    {
        return starRadius*Rsun;
    }
//////////////    STAR MASS   //////////////////////////////

public void setStarMass(double starMass)
{
    this.starMass=starMass;
}


public double getStarMass()
{
    return starMass;
}

public double getStarMassKg()
    {
        return starMass*Msun;
    }
/////////////////   EFFECTIVE TEMP    ////////////////////////////////

public void setStarEffectiveTemp(int starEffectiveTemp)
{
    this.starEffectiveTemp=starEffectiveTemp;
}

public int getStarEffectiveTemp()
{
    return starEffectiveTemp;
}




//////////////////   MISC  ///////////////////////////
    public Star (String starName,double starRadius,double starMass, int starEffectiveTemp)
    {
        this.starName=starName;
        this.starRadius=starRadius;
        this.starMass=starMass;
        this.starEffectiveTemp=starEffectiveTemp;
    }

    public void printDescription() {
        System.out.println("Stjernen "+starName+" har en radius på "
        +starRadius+" km og en masse på "+starMass+" kg og en effectiv temperatur på"+starEffectiveTemp+" " );
    }
    @Override
    public String toString()
        {
            return "stjernen "+starName+" har en radius på "
            +getStarRadiusKm()+" km og en masse på "+getStarMassKg()+" kg\n";
        }
}
