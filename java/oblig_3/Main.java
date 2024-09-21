

public class Main {
    public static void main(String[] args) {
      

        Star solen =new Star("Sun", 1.0, 1.0, 5777);

        Planet planet1 = new Planet("Mercury", 0.03412549655905556, 1.7297154899894627E-4, 0.387, 0.206, 88,solen );
        Planet planet2 = new Planet("Venus", 0.08465003077267387, 0.002564278187565859, 0.723, 0.007, 225,solen);
        Planet planet3 = new Planet("Earth", 0.08911486599899289, 0.003146469968387777, 1, 0.017, 365,solen);
        Planet planet4 = new Planet("Mars", 0.04741089912158004, 3.3667017913593256E-4, 1.524, 0.093, 687,solen);
        Planet planet5 = new Planet("Jupiter", 1.0, 1.0, 5.20440, 0.049, 4380,solen);
        Planet planet6 = new Planet("Saturn", 0.8145247020645666, 0.2994204425711275, 9.5826, 0.057, 10585,solen);
        Planet planet7 = new Planet("Uranus", 0.35475297935433336, 0.04573761854583773, 19.2184, 0.046, 30660,solen);
        Planet planet8 = new Planet("Neptune", 0.34440217087226543, 0.05395152792413066, 30.11, 0.010, 60225,solen); 
        
        



        PlanetSystem SolarSystem= new PlanetSystem("Solar System", solen);

        SolarSystem.addPlanet(planet1);
        SolarSystem.addPlanet(planet2);
        SolarSystem.addPlanet(planet3);
        SolarSystem.addPlanet(planet4);
        SolarSystem.addPlanet(planet5);
        SolarSystem.addPlanet(planet6);
        SolarSystem.addPlanet(planet7);
        SolarSystem.addPlanet(planet8); 
        
        
      //oppgave 2.2
      System.out.println();
      System.out.println("oppgave 2.2");

      System.out.println();
      SolarSystem.findCelestialBody("saturn");
      System.out.println(SolarSystem.findCelestialBody("saturn"));



      //oppgave 2.6b

      System.out.println();
      System.out.println("oppgave2.6b");
      System.out.println();
      planet3.distanceToCentralBodyPrintDescription(0);
      planet3.distanceToCentralBodyPrintDescription(90);
      planet3.distanceToCentralBodyPrintDescription(180);
      planet3.distanceToCentralBodyPrintDescription(270);
      planet3.distanceToCentralBodyPrintDescription(360);
      System.out.println();



      //oppgave 2.7

      System.out.println("oppgave 2.7b");
      System.out.println();

        planet3.SurfaceGravityByOrbitPrintDescription(0);
        planet3.SurfaceGravityByOrbitPrintDescription(45);
        planet3.SurfaceGravityByOrbitPrintDescription(90);
        planet3.SurfaceGravityByOrbitPrintDescription(136);
        planet3.SurfaceGravityByOrbitPrintDescription(180);
        System.out.println();


        //oppgave 3.1

        System.out.println();
        System.out.println("oppgave 3.1");
        System.out.println();

        System.out.println(planet3.orbitingVelocity(planet3.distanceToCentralBody(0)));
        System.out.println(planet3.orbitingVelocityInMeter(planet3.distanceToCentralBody(0)));

        System.out.println();

        //oppgave 3.2 
        System.out.println();
        System.out.println("oppgave 3.2");

     
      planet3.getSmallestDistancePrintDescription();
      planet3.getBiggestDistancePrintDescription();
        System.out.println();


        //oppgave 3.3
        System.out.println("oppgave 3.3");
        


SolarSystem.getDistanceBetweenTwoPlanetsByDayPrintDescription(planet4, planet6, 180);
 System.out.println();






  /* SolarSystem.getDistanceBetweenTwoPlanetsByDayPrintDescription(planet6, planet3, 180);
System.out.println(); 
 System.out.println(planet3.getOrbitMovementByday(366));
System.out.println(planet3.getOrbitMovementByday(1)); */






















        
    }

}
