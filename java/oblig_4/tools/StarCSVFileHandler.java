package tools;
import java.util.ArrayList;
import models.*;
import java.io.*;


public class StarCSVFileHandler implements ObjectFileHandler<ArrayList<Star>> {
 
    public void writeObjectsToFile(String fileName, ArrayList<Star> starArray) {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))) {

            for (Star starX : starArray) {
                bufferedWriter.write(starX.getCelestialBodyName() + ";" + starX.getCelestialBodyRadius()
                                    + ";" +starX.getCelestialBodyMass()+ ";" +starX.getStarEffectiveTemp());
                bufferedWriter.newLine();
            }
        }
        catch (IOException e) {
            System.err.println(e.getMessage());
        }
    } 

    public ArrayList<Star> readObjectsFromFile(String fileName){
        {
        ArrayList<Star> fetchedStars = new ArrayList<Star>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ( (line = bufferedReader.readLine()) != null ) {

                String[] values = line.split(";");

                Star starX = new Star(values[0], Double.parseDouble(values[1]),Double.parseDouble(values[2]),Double.parseDouble(values[3]));
                fetchedStars.add(starX);
            }
        }
        catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
        catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return fetchedStars;
        }
    }
}


    



    

