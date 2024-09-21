import java.text.DecimalFormat;

abstract class CelestialBody {

    protected String celestialBodyName;
    protected double celestialBodyRadius;
    protected double celestialBodyMass;
    

////////////////////////////////////////////////////
//2.3

    protected static final double Mjup=1.898E27;
    protected static final int Rjup=71492;
    protected static final double  G=6.67408E-11;
    protected static final double Mearth=5.972E24;
    protected static final double Rearth=6371;
    protected static final int AU=149597871;



    
//////////////////      NAME        ///////////////////////////
public void setCelestialBodyName (String celestialBodyName)
{
    this.celestialBodyName=celestialBodyName;
}

public String getCelestialBodyName ()
{
    return celestialBodyName;
}
//////////////      RADIUS        /////////////////////////
public void setCelestialBodyRadius (double celestialBodyRadius)
{
    this.celestialBodyRadius=celestialBodyRadius;
}

public double getCelestialBodyRadius ()
{
    return celestialBodyRadius;
}


abstract double getRadiusInKm();



/////////////////       MASS       ////////////////////////
public void setCelestialBodyMass (double celestialBodyMass)
{
    this.celestialBodyMass=celestialBodyMass;
}

public double getCelestialBodyMass ()
{
    return celestialBodyMass;
}
   

abstract double getMassInKg();
        
    
//MISC

public DecimalFormat twoDecimals = new DecimalFormat("###.##");
public DecimalFormat noDecimals = new DecimalFormat("0");

    //CONSTRUCTORS
public CelestialBody(String celestialBodyName,
double celestialBodyRadius,double celestialBodyMass)
    {
        this.celestialBodyName=celestialBodyName;
        this.celestialBodyRadius=celestialBodyRadius;
        this.celestialBodyMass=celestialBodyMass;
    }

public CelestialBody()
    {
        
    }








}