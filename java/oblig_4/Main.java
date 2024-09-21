import tools.*;
import java.util.ArrayList;
import java.util.Collections;
import models.*;


public class Main {
    public static void main(String[] args) {
      
        Star star1 =new Star("Sun", 1.0, 1.0, 5777);
        Star star2 =new Star("MU Cas",4.192,4.657,14750.0);
        Star star3 =new Star("V69-47", 1.316, 0.876, 5945.0);
        Star star4 =new Star("YZ Cas", 2.547, 2.308, 9200.0);
        Star star5 =new Star("NGC188", 1.425, 1.102, 5900.0);
        Star star6 =new Star("zet Phe", 2.853, 3.922, 14550.0);
        Star solen =new Star("Sun", 1.0, 1.0, 5777);

        Planet planet1 = new Planet("Mercury", 0.03412549655905556, 1.7297154899894627E-4, 0.387, 0.206, 88,solen );
        Planet planet2 = new Planet("Venus", 0.08465003077267387, 0.002564278187565859, 0.723, 0.007, 225,solen);
        Planet planet3 = new Planet("Earth", 0.08911486599899289, 0.003146469968387777, 1, 0.017, 365,solen);
        Planet planet4 = new Planet("Mars", 0.04741089912158004, 3.3667017913593256E-4, 1.524, 0.093, 687,solen);
        Planet planet5 = new Planet("Jupiter", 1.0, 1.0, 5.20440, 0.049, 4380,solen);
        Planet planet6 = new Planet("Saturn", 0.8145247020645666, 0.2994204425711275, 9.5826, 0.057, 10585,solen);
        Planet planet7 = new Planet("Uranus", 0.35475297935433336, 0.04573761854583773, 19.2184, 0.046, 30660,solen);
        Planet planet8 = new Planet("Neptune", 0.34440217087226543, 0.05395152792413066, 30.11, 0.010, 60225,solen); 

        Planet planet9 = new Planet("Planet P", 0.34440217087226543, 0.05395152792413066, 30.11, 0.010, 60225,star2);
        Planet planet10 = new Planet("Cadia", 0.34440217087226543, 0.05395152792413066, 30.11, 0.010, 60225,star3);
        
        PlanetSystem Klendathu= new PlanetSystem("Klendathu",star2);
        PlanetSystem Cadian_system= new PlanetSystem("Cadian system",star3);
        PlanetSystem SolarSystem= new PlanetSystem("Solar System", solen);

        SolarSystem.addPlanet(planet1);
        SolarSystem.addPlanet(planet2);
        SolarSystem.addPlanet(planet3);
        SolarSystem.addPlanet(planet4);
        SolarSystem.addPlanet(planet5);
        SolarSystem.addPlanet(planet6);
        SolarSystem.addPlanet(planet7);
        SolarSystem.addPlanet(planet8);  

        Klendathu.addPlanet(planet9);
        Cadian_system.addPlanet(planet10);

        ArrayList<Star> starList = new ArrayList<Star>();
        ArrayList<PlanetSystem> PSList= new ArrayList<PlanetSystem>();

      starList.add(star1);
      starList.add(star2);
      starList.add(star3);
      starList.add(star4);
      starList.add(star5);
      starList.add(star6);

      PSList.add(SolarSystem);
      PSList.add(Klendathu);
      PSList.add(Cadian_system);
      
        //2.1
        System.out.println("oppgave 2.1");
         //sortert etter getMassInKg
         Collections.sort(SolarSystem.getPlanetList());
        System.out.println(SolarSystem.getPlanetList());  


        // sortert på senterstjernens masse
        System.out.println();
        System.out.println("sortering av planetsystemer");
         Collections.sort(PSList);
         System.out.println(PSList); 

         //2.2
         System.out.println("oppgave 2.2");
       StarCSVFileHandler StarCSVFileHandler =new StarCSVFileHandler();
      StarCSVFileHandler.writeObjectsToFile("proof.csv",starList);


      StarCSVFileHandler.writeObjectsToFile("proof_duplicate.csv", StarCSVFileHandler.readObjectsFromFile("proof.csv")); 
      StarCSVFileHandler.readObjectsFromFile("proof_duplicate.csv"); 
     System.out.println(StarCSVFileHandler.readObjectsFromFile("proof_duplicate.csv")); 
       

      


     



































        
    }

}
