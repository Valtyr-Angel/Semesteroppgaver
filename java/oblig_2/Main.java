public class Main {
    public static void main(String[] args) {


        Star solen =new Star("Sun", 1.0, 1.0, 5777);

        Planet planet1 = new Planet("Mercury", 0.03412549655905556, 1.7297154899894627E-4 );
        Planet planet2 = new Planet("Venus", 0.08465003077267387, 0.002564278187565859);
        Planet planet3 = new Planet("Earth", 0.08911486599899289, 0.003146469968387777);
        Planet planet4 = new Planet("Mars", 0.04741089912158004, 3.3667017913593256E-4);
        Planet planet5 = new Planet("Jupiter", 1.0, 1.0);
        //Planet planet5clone = new Planet("Jupiter2", 1.0, 2.0);
        Planet planet6 = new Planet("Saturn", 0.8145247020645666, 0.2994204425711275);
        Planet planet7 = new Planet("Uranus", 0.35475297935433336, 0.04573761854583773);
        Planet planet8 = new Planet("Neptune", 0.34440217087226543, 0.05395152792413066);
        //Planet small   =new Planet("small", 0.00000000000000001, 0.00000000000000000000001);



        PlanetSystem SolarSystem= new PlanetSystem("Solar System", solen);

        SolarSystem.addPlanet(planet1);
        SolarSystem.addPlanet(planet2);
        SolarSystem.addPlanet(planet3);
        SolarSystem.addPlanet(planet4);
        SolarSystem.addPlanet(planet5);
        SolarSystem.addPlanet(planet6);
        SolarSystem.addPlanet(planet7);
        SolarSystem.addPlanet(planet8);
        //SolarSystem.addPlanet(planet5clone);
        //SolarSystem.addPlanet(small);

            ////2.3////
        System.out.println("oppgave 2.3");
        System.out.println();
        System.out.println(SolarSystem);
        System.out.println();
     
 

        /////2.4 Saturn//////
        System.out.println("oppgave 2.4 Saturn:");
        System.out.println();
        System.out.println("saturn radius:");
        System.out.println(planet6.getPlanetRadiusKm()+" Km");
        System.out.println();
        System.out.println("saturn mass:");
        System.out.println(planet6.getPlanetMassKg()+" Kg");
        System.out.println();

        ////2.4 Sun/////
        System.out.println("oppgave 2.4 Sun");
        System.out.println();
        System.out.println("sun radius");
        System.out.println(solen.getStarRadiusKm()+" Km");
        System.out.println();
        System.out.println("sun mass");
        System.out.println(solen.getStarMassKg()+" Kg");
        System.out.println();


        /////2.5 Neptune//////
        System.out.println("oppgave 2.5 Neptune");
        System.out.println();
        System.out.println("Neptune surface gravity:");
        System.out.println(planet8.getPlanetSurfaceGravity()+" m/s2");
        System.out.println();

        //////3.2///////
        System.out.println("oppgave 3.2");
        System.out.println();
        System.out.println("mars mass by mearth:");
        System.out.println(planet4.getPlanetMassMearth());

        System.out.println();
        System.out.println("mars radius by rearth:");
        System.out.println(planet4.getPlanetRadiusRearth());
        System.out.println();

        
        /////3.1//////


        System.out.println("oppgave 3.1");
        System.out.println();
        System.out.println("smallest planet:");
        System.out.println(SolarSystem.getSmallesPlanet());
        System.out.println();
        System.out.println("biggest planet:");
        System.out.println(SolarSystem.getBiggestPlanet());  

        
        
        
        
        //formelsjekking//


        /* System.out.println(planet5.getPlanetRadius());
        System.out.println(planet5.getPlanetMass());
        System.out.println();
        System.out.println(planet2.getPlanetMassKg());
        System.out.println(planet2.getPlanetRadiusKm());
        System.out.println();

        System.out.println(planet3.getPlanetMassMearth());
        System.out.println(planet3.getPlanetRadiusRearth());
        System.out.println(planet3.getPlanetSurfaceGravity()); */


        



        
    }

}
