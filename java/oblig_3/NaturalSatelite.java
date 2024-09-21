



abstract class NaturalSatelite extends CelestialBody {

    



protected double semiMajorAxis; 
protected double eccentricity;
protected int orbitalPeriod; 
protected CelestialBody centralCelestialBody; 








    
    //// ORBITAL MECHANICS
    

//keplers formula
    public double distanceToCentralBody(double degrees)
    
    {
       double aboveLine=semiMajorAxis*(1-(Math.pow(eccentricity, 2)));
       double belowLine= 1+eccentricity*(Math.cos(Math.toRadians(degrees)));
       double calculation= aboveLine/belowLine;
       double finalsum = calculation*AU;
       return finalsum;
    }

    public void distanceToCentralBodyPrintDescription(double degrees)
    {
       System.out.println( getCelestialBodyName()+" has a distance of "+
       noDecimals.format(distanceToCentralBody(degrees))+" km to the "+centralCelestialBody.getCelestialBodyName()+
       " at "+degrees+" degrees");
    }


     


public double getOrbitMovementPerday(){
    double circleDegrees=360;
    double orbitDays=getOrbitalPeriod();
    double orbitDegreesPerDay=circleDegrees/orbitDays;
    return  orbitDegreesPerDay;
}

public double getOrbitMovementByday(double day){
    
    double circleDegrees=360;
    double orbitDays=getOrbitalPeriod();
    double orbitDegreesPerDay=circleDegrees/orbitDays;
     if (orbitDays<day){
        day-=orbitDays;
    } 
    //System.out.println(day);
    return  (orbitDegreesPerDay*day);
}




// DISTANCE


public double getBiggestDistance(){
        
    double circleDegrees=360;
    double orbitDays=getOrbitalPeriod();
    double orbitDegreesPerDay=circleDegrees/orbitDays;

    //int dayValue=0;
    double distanceValue=0;
    //int dayCounter=-1;
    
     for (double i = orbitDegreesPerDay; i <= circleDegrees; i+=orbitDegreesPerDay) {
        //dayCounter+=1;

        if (distanceToCentralBody(i)>distanceValue){
            distanceValue=distanceToCentralBody(i);
            //dayValue=dayCounter;
      }  
        
}
 return distanceValue;
//System.out.println(dayValue); 

}

public void getBiggestDistancePrintDescription(){
    System.out.println((getCelestialBodyName()+" has a maximum distance of "+
    noDecimals.format(getBiggestDistance())+"km"));

}

public double getSmallestDistance(){
        
    double circleDegrees=360;
    double orbitDays=getOrbitalPeriod();
    double orbitDegreesPerDay=circleDegrees/orbitDays;

    //int dayValue=0;
    double distanceValue=distanceToCentralBody(0);
    //int dayCounter=-1;
        
     for (double i = orbitDegreesPerDay; i <= circleDegrees; i+=orbitDegreesPerDay) {
        //dayCounter+=1;
        
        if (distanceToCentralBody(i)<distanceValue){
            distanceValue=distanceToCentralBody(i);
            //dayValue=dayCounter;
      }   
}
 return distanceValue;
}

public void getSmallestDistancePrintDescription(){
    System.out.println((getCelestialBodyName()+" has a minimum distance of "+
    noDecimals.format(getSmallestDistance())+"km"));
}


//3.1

    public double orbitingVelocity(double distance)
    {
       double x= G*centralCelestialBody.getMassInKg();
       double z= x/(distance*1000);
       double root=Math.sqrt(z);
       return root/1000;
    }

    public double orbitingVelocityInMeter(double distance)
    {
       return orbitingVelocity(distance)*1000;
    }
    

    

    public void SurfaceGravityByOrbitPrintDescription(double degrees){
        System.out.println("at a distance of "+noDecimals.format(distanceToCentralBody(degrees))+" km "+
        getCelestialBodyName()+" has a velocity of "+
     
        twoDecimals.format(orbitingVelocity(distanceToCentralBody(degrees)))+"km/s");
        
    }


   //// GET AND SET

public void setSemiMajorAxis(double semiMajorAxis)
    {
        this.semiMajorAxis=semiMajorAxis;
    }

public double getSemiMajorAxis()
    {
        return semiMajorAxis;
    }

public void setEccentricity(double eccentricity)
    {
        this.eccentricity=eccentricity;
    }

public double getEccentricity ()
    {
        return eccentricity;
    }

public void setOrbitalPeriod(int orbitalPeriod)
    {
        this.orbitalPeriod=orbitalPeriod;
    }

public int getOrbitalPeriod()
    {
        return orbitalPeriod;
    }

public void setCentralCelestialBody(CelestialBody centralCelestialBody)
    {
        this.centralCelestialBody=centralCelestialBody;
    }

public CelestialBody getCentralCelestialBody()
    {
        return centralCelestialBody;
    }
 

    // CONSTRUCTORS

public NaturalSatelite(double semiMajorAxis, double eccentricity, 
                        int orbitalPeriod, CelestialBody centralCelestialBody,

                        String celestialBodyName,double celestialBodyRadius,double celestialBodyMass    
                        )
        {
            super(celestialBodyName,celestialBodyRadius,celestialBodyMass);
            this.semiMajorAxis=semiMajorAxis;
            this.eccentricity=eccentricity;
            this.orbitalPeriod=orbitalPeriod;
            this.centralCelestialBody=centralCelestialBody;
            
        }

        public NaturalSatelite()
        {
            
        }

        public NaturalSatelite(double semiMajorAxis, double eccentricity, 
        int orbitalPeriod,

        String celestialBodyName,double celestialBodyRadius,double celestialBodyMass    
        )
{
    super(celestialBodyName,celestialBodyRadius,celestialBodyMass);
    this.semiMajorAxis=semiMajorAxis;
    this.eccentricity=eccentricity;
    this.orbitalPeriod=orbitalPeriod;
    

}

}
