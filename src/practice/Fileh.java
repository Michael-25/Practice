package practice;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

class FileOperations{

    
    public static void createFile() throws IOException {

        System.out.println("Performing create file operation");

        String data = "Java uses class and object";

    
        FileOutputStream out = new FileOutputStream("d://Java//testFile2.txt");

     
        out.write(data.getBytes());

       
        out.close();

        System.out.println("New file is created..");
        System.out.println();
    }

    
    public static void readFile(String fileName) throws IOException {

        System.out.println("Performing read file operation");

        System.out.println("Content in File "+fileName+": ");

        
        BufferedReader reader = new BufferedReader(new FileReader(fileName));

       
        String line = reader.readLine();

        
        while (line != null) {
            System.out.println(line);
            line = reader.readLine();
        }
        reader.close(); 

        System.out.println();
    }

 
    public static void writingInFile() throws IOException {

        System.out.println("Performing writing in file operation");

       
        List<String> lines = Arrays.asList("class", "object", "Inheritance", "Data hiding");

        
        Files.write(Paths.get("d://Java//testFile4.txt"),
                lines,
                StandardCharsets.UTF_8,
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND);

        System.out.println("Writing in the file is done...");

        System.out.println();
    }

    
    public static void appendInFile() throws IOException {

        System.out.println("Performing append file operation");

       
        File file = new File("d://Java//testFile3.txt");

        
        String content = "Hello from Java...";

       
        if (file.createNewFile()) {
            System.out.println("File created successfully");
        } else {
            System.out.println("File is already exist"); 
        }

        
        FileWriter writer = new FileWriter(file);

      
        writer.append(content);

    
        writer.close();

        System.out.println("Adding contents in existed file is done...");
    }
}

public class Fileh {
        public static void main(String[] args) throws IOException {

            System.out.println("File Handling operations is performing");
            System.out.println();

           
            FileOperations.createFile();

            
            FileOperations.readFile("d://Java//testFile1.txt");

          
            FileOperations.writingInFile();

           
            FileOperations.appendInFile();
        }
}