package at.ac.fhcampuswien.lecture11.bb13122024;

import java.io.*;

public class App {
    public static void main(String[] args) {
        triggerRuntimeException();


        writeToFile("build/resources/main");
        readFromFile("build/resources/main/data.txt");

        Elephant dumbo = new Elephant("Dumbo", 1, 200, 60, "circus");
        serializeDumbo("build/resources/main/", dumbo);
        deserializeDumbo("build/resources/main/" + dumbo.getName() + ".ser");


    }

    public static void triggerRuntimeException() {
        int[] myArr = new int[3];

        try {
            myArr[3] = 2;   // ArrayIndexOutOfBoundsException
        }catch (Exception e){
            System.out.println("handle exception...");
        }
        // int result = 20/0; // ArithmeticException

        // TODO handle exception with try/catch block

        System.out.println("rest of program...");
    }

    private static void writeToFile(String path) {
        String fileName = "data.txt";
        File file = new File(path, fileName);

        // check if directory exists - create if not
        File directory = new File(path);
        if (!directory.exists()) {
            if (directory.mkdirs()) {
                System.out.println("Created directory: " + path);
            } else {
                System.out.println("Failed to create directory.");
                return;
            }
        }

        try {
            FileWriter writer = new FileWriter(file);
            writer.write("hello world!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void readFromFile(String path){
        System.out.println("Reading from file: " + path);
        BufferedReader reader = null;
        try{
            reader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist...");
        } catch (IOException e) {
            System.out.println("other IOException happened...");
        } finally {
            if (reader != null){
                try {
                    reader.close(); // explicitly close the reader
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

        // try with resources => assurance that resource will be closed after execution
        try(BufferedReader reader2 = new BufferedReader(new FileReader(path))){
            String line;
            while ((line = reader2.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e){
            System.out.println("IOException occurred..");
        }
    }

    public static void serializeDumbo(String path, Elephant e){
        try(FileOutputStream fileOut = new FileOutputStream(path + e.getName() + ".ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut)){

            out.writeObject(e);
            System.out.println("serialized data is saved in " + e.getName() + ".ser");
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public static void deserializeDumbo(String path){
        Elephant dumbo = null;

        try(FileInputStream fileIn = new FileInputStream(path);
        ObjectInputStream in = new ObjectInputStream(fileIn)){
            dumbo = (Elephant) in.readObject();
        } catch (FileNotFoundException e){
            System.out.println("IOException...");
            e.printStackTrace();
        } catch (ClassNotFoundException e){

        } catch (IOException e){

        }

        System.out.println(dumbo);
    }


}
