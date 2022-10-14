
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular {
  private static final ArrayList<String> stringList = new ArrayList<>();
       public static void main(String[] args) throws Exception
       {
           FileReader input = new FileReader("input.txt");
           Scanner inputScanner = new Scanner(input);
           while (inputScanner.hasNextLine()){
               String line = inputScanner.nextLine();
               stringList.add(line);
           }
           input.close();
           Pattern pattern = Pattern.compile("^-?\\d+[.|,]?\\d+(?:[eE]-?\\d+)?$");
           FileWriter output = new FileWriter("output.txt");
           int count = 1;
          for (String item: stringList){
              Matcher mather = pattern.matcher(item);
              if (mather.find()) output.write(count + "." + item + " -- Correct\n");
              else output.write(count + "." + item + " -- Not correct\n");
              count++;
          }
          output.close();

       }
}
