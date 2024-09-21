package models;
public class Planet extends NaturalSatelite {
// CONSTRUCTORS

public Planet (String celestialBodyName,double celestialBodyRadius,double celestialBodyMass,
double semiMajorAxis, double eccentricity, 
int orbitalPeriod, CelestialBody centralCelestialBody)
    {
        super(semiMajorAxis,eccentricity,orbitalPeriod,centralCelestialBody,
        celestialBodyName,celestialBodyRadius,celestialBodyMass);
    }

public Planet()
    {

    }

public Planet(String celestialBodyName,double celestialBodyRadius,double celestialBodyMass,
    double semiMajorAxis, double eccentricity, 
    int orbitalPeriod)
    {
        super(semiMajorAxis,eccentricity,orbitalPeriod,
        celestialBodyName,celestialBodyRadius,celestialBodyMass);
    }
    // GET N SET
    
    public double getRadiusInKm()
    {  
        return celestialBodyRadius*Rjup;
    }

    public double getMassInKg(){
        return celestialBodyMass*Mjup;
    }

    public double getPlanetRadiusRearth()
    {
        return getRadiusInKm()/Rearth;
    }

    public double getMassInMearth()
    {
        return getMassInKg()/Mearth;
    }
////////////   GRAVITY   ///////////////
    public double getPlanetSurfaceGravity()
        {
            return(( G * getMassInKg())/     
            (getRadiusInKm()*1000*getRadiusInKm()*1000));
        }
@Override
public String toString()
    {
        return "Planeten "+celestialBodyName+" har en radius på "
        +getMassInKg()+" km og en masse på "+getMassInKg()+" kg "
        +" en semimajoraxis på "+getSemiMajorAxis()+" en eccentricity på "+getEccentricity()
        +" en orbitalPeriod på "+getOrbitalPeriod()+"\n";
    }
    
    


    






}

