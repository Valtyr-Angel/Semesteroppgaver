import java.util.ArrayList;


public class PlanetSystem {
    private String planetSystemName;
    private Star centerStar;
    private ArrayList<Planet> planets = new ArrayList<>();

///////////////     NAME    /////////////////////

public void setPlanetSystemName(String planetSystemName)
{
    this.planetSystemName=planetSystemName;
}

public String getPlanetSystemName ()
{
    return planetSystemName;
}

///////////////////   BIG AND SMALL PLANETS    /////////////////////////////
public Planet getBiggestPlanet()
{
    Planet tempPlanet= new Planet("temporary", 0, 0);
    for(Planet xPlanet:planets)
    {
        if (xPlanet.getPlanetRadius()>tempPlanet.getPlanetRadius()){
            tempPlanet=xPlanet;
            }

        if (xPlanet.getPlanetRadius()==tempPlanet.getPlanetRadius() && 
            xPlanet.getPlanetMass()>tempPlanet.getPlanetMass()
            ) {
            tempPlanet=xPlanet;
            }       
    }
    return tempPlanet;
}

public Planet getSmallesPlanet()
{
    Planet tempPlanet= new Planet("temporary2", 999999999, 99999999);
    for(Planet xPlanet:planets)
    {
        if (xPlanet.getPlanetRadius()<tempPlanet.getPlanetRadius()){
            tempPlanet=xPlanet;
            }

        if (xPlanet.getPlanetRadius()==tempPlanet.getPlanetRadius() && 
            xPlanet.getPlanetMass()<tempPlanet.getPlanetMass()
            ) {
            tempPlanet=xPlanet;
            }       
    }
    return tempPlanet;
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

//////////////   MISC    ////////////////////////////

public void addPlanet(Planet planetObject) {
    planets.add(planetObject);
}

public PlanetSystem (String planetSystemName,Star centerStar) {
    this.planetSystemName=planetSystemName;
    this.centerStar=centerStar;
}



@Override
public String toString()
    {
        return "Planetsystemets navn er "+planetSystemName+" med \n"
        +centerStar+" \n og inneholder planetene \n \n"+planets+" ";
    }

    
}
