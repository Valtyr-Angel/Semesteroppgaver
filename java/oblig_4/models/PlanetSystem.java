package models;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;


public class PlanetSystem implements Comparable<PlanetSystem>{
    private String planetSystemName;
    private Star centerStar;
    private ArrayList<Planet> planets = new ArrayList<>();

    public PlanetSystem (String planetSystemName,Star centerStar) {
        this.planetSystemName=planetSystemName;
        this.centerStar=centerStar;
    }
///////////////     NAME    /////////////////////

public void setPlanetSystemName(String planetSystemName)
{
    this.planetSystemName=planetSystemName;
}

public String getPlanetSystemName ()
{
    return planetSystemName;
}
//////////////////   CENTERSTAR   ///////////////////////////////////
public void setCenterStar(Star centerStar)
{
    this.centerStar=centerStar;
}

public Star getCenterStar()
{
    return centerStar;
}
//MISC
public DecimalFormat twoDecimals = new DecimalFormat("###.##");
public DecimalFormat noDecimals = new DecimalFormat("0");
///////////////////   BIG AND SMALL PLANETS    /////////////////////////////
public Planet getBiggestPlanet(){
    Planet tempPlanet= new Planet();
    for(Planet xPlanet:planets)
    {
        if (xPlanet.getCelestialBodyRadius()>tempPlanet.getCelestialBodyRadius()){
            tempPlanet=xPlanet;
            }

        if (xPlanet.getCelestialBodyRadius()==tempPlanet.getCelestialBodyRadius() && 
            xPlanet.getCelestialBodyMass()>tempPlanet.getCelestialBodyMass()
            ) {
            tempPlanet=xPlanet;
            }       
    }
    return tempPlanet;
}
public Planet getSmallesPlanet()
{
    Planet tempPlanet= new Planet();
    for(Planet xPlanet:planets)
    {
        if (xPlanet.getCelestialBodyRadius()<tempPlanet.getCelestialBodyRadius()){
            tempPlanet=xPlanet;
            }

        if (xPlanet.getCelestialBodyRadius()==tempPlanet.getCelestialBodyRadius() && 
            xPlanet.getCelestialBodyMass()<tempPlanet.getCelestialBodyMass()
            ) {
            tempPlanet=xPlanet;
            }       
    }
    return tempPlanet;
}
//////////////   MISC    ////////////////////////////

public Planet findCelestialBody(String target){
    Planet tempPlanet= new Planet();
    for(Planet xPlanet:planets)
            {    
            if(xPlanet.getCelestialBodyName().equalsIgnoreCase(target))
                {
                tempPlanet=xPlanet;
                }
            }
            
            return tempPlanet;     
        }

public double getDistanceBetweenTwoPlanetsByDay(Planet planetX,Planet planetY, int day){
            double orbitDifference=planetX.getOrbitMovementByday(day)-planetY.getOrbitMovementByday(day);
            System.out.println(orbitDifference);
               if (orbitDifference>180){
                orbitDifference=360-orbitDifference;
            }   
            System.out.println(orbitDifference);
            double planetXDistanceFromSun=planetX.distanceToCentralBody(planetX.getOrbitMovementByday(day));
            double planetYDistanceFromSun=planetY.distanceToCentralBody(planetY.getOrbitMovementByday(day));
        
            //law of cosines equation
            double answer=Math.pow(planetYDistanceFromSun, 2)+Math.pow(planetXDistanceFromSun, 2);
            double minus=(2*planetXDistanceFromSun*planetYDistanceFromSun)*Math.cos(Math.toRadians(orbitDifference));
            double summation=answer-minus;
            double distanceBetween=Math.sqrt(summation);
            
            return distanceBetween;
        }

        public void getDistanceBetweenTwoPlanetsByDayPrintDescription(Planet planetX,Planet planetY, int day){
            System.out.println((" the distance between "+planetX.getCelestialBodyName()+" and "+planetY.getCelestialBodyName()+
            " at day "+day+" is "+noDecimals.format(getDistanceBetweenTwoPlanetsByDay(planetX, planetY, day))+" km"));
              
        }

public void addPlanet(Planet planetObject) {
    planets.add(planetObject);
}

//2.1
public int compareTo(PlanetSystem X) {
    return Double.compare(this.getCenterStar().getCelestialBodyMass(), X.getCenterStar().getCelestialBodyMass());
}   

public ArrayList<Planet> getPlanetList ()
{
return planets;
}

@Override
public String toString()
    {
        return "Planetsystemets navn er "+planetSystemName+" med \n"
        +centerStar+" \n og inneholder planetene \n \n"+planets+"\n ";
    }

    
}
