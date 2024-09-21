public class Star extends CelestialBody {

    
    
    private int starEffectiveTemp;

    private static final double Msun=1.98892E30;
    private static final int Rsun=695700;



    
   
    public double getMassInKg(){
        return celestialBodyMass*Msun;
    }

    public double getRadiusInKm(){
        return celestialBodyRadius*Rsun;
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

    public Star (String celestialBodyName, double celestialBodyRadius, double celestialBodyMass,int starEffectiveTemp)
    {
        super(celestialBodyName,celestialBodyRadius,celestialBodyMass);
        this.starEffectiveTemp=starEffectiveTemp;
    }

    /* public void printDescription() {
        System.out.println("Stjernen "+starName+" har en radius på "
        +starRadius+" km og en masse på "+starMass+" kg og en effectiv temperatur på"+starEffectiveTemp+" " );
    } */
    @Override
    public String toString()
        {
            return "stjernen "+celestialBodyName+" har en radius på "
            +getRadiusInKm()+" km og en masse på "+getMassInKg()+" kg\n";
        }
}
