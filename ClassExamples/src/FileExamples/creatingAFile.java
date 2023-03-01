package FileExamples;
//this example is from the slides 

import java.io. * ;

public class creatingAFile {
 public static void main(String[] args) {
   try {
    File f = new File("C:\\Users\\Jessica Yeager\\Desktop\\code2datafile.txt");
     if (f.createNewFile()) {
       System.out.println("New File created!");
     } else {
       System.out.println("The file already exists.");
     }
   } catch(IOException e) {
     e.printStackTrace();
   }
 }
}

