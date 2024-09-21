public class Planet {
 
    private String planetName; 
    private double planetRadius;
    private double planetMass; 
    //////////////////////////////////////////////////////
    private double Mjup=1.898E27;
    private int Rjup=71492;

    private double G=6.67408E-11;

    private double Mearth=5.972E24;
    private double Rearth=6371;

    //////////////    NAME     ////////////////////
    public void setPlanetName (String planetName)
    {
        this.planetName=planetName;
    }

    public String getPlanetName ()
    {
        return planetName;
    }


/////////////////    RADIUS     ///////////////////
    public void setPlanetRadius (int planetRadius)
    {
        this.planetRadius=planetRadius;
    }

    public double getPlanetRadius ()
    {
        return planetRadius;
    }

    public double getPlanetRadiusKm()
    {  
        return planetRadius*Rjup;
    }

    public double getPlanetRadiusRearth()
    {
        return getPlanetRadiusKm()/Rearth;
    }


/////////////     MASS     / /////////////////
    public void SetPlanetMass (double planetMass)
    {
        this.planetMass=planetMass;
    }

    public double getPlanetMass ()
    {
        return planetMass;
    }

    public double getPlanetMassKg()
    {  
        double x=planetMass*Mjup;
        return x;
    }

    public double getPlanetMassMearth()
    {
        return getPlanetMassKg()/Mearth;
    }



    ////////////   GRAVITY   ///////////////
    public double getPlanetSurfaceGravity()
        {
            return(( G * getPlanetMassKg())/ (getPlanetRadiusKm()*1000*getPlanetRadiusKm()*1000));
        }

        


public Planet (String planetName,double planetRadius,double planetMass){
    this.planetName=planetName;
    this.planetRadius=planetRadius;
    this.planetMass=planetMass;
    
}


@Override
public String toString()
    {
        return "Planeten "+planetName+" har en radius på "
        +getPlanetRadiusKm()+" km og en masse på "+getPlanetMassKg()+" kg\n";
    }
    
    


    






}

