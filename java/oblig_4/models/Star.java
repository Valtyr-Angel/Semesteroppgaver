package models;
public class Star extends CelestialBody {


    private double starEffectiveTemp;
    private static final double Msun=1.98892E30;
    private static final int Rsun=695700;

    public Star (String celestialBodyName, double celestialBodyRadius, double celestialBodyMass,double starEffectiveTemp)
    {
        super(celestialBodyName,celestialBodyRadius,celestialBodyMass);
        this.starEffectiveTemp=starEffectiveTemp;
    }

    public double getMassInKg(){
        return celestialBodyMass*Msun;
    }
    public double getRadiusInKm(){
        return celestialBodyRadius*Rsun;
    }
/////////////////   EFFECTIVE TEMP    ////////////////////////////////

public void setStarEffectiveTemp(double starEffectiveTemp)
{
    this.starEffectiveTemp=starEffectiveTemp;
}

public double getStarEffectiveTemp()
{
    return starEffectiveTemp;
}

    @Override
    public String toString()
        {
            return "stjernen "+celestialBodyName+" har en radius på "
            +getRadiusInKm()+" km og en masse på "+getMassInKg()+" kg\n";
        }
}
