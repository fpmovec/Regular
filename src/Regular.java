
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
           FileWriter output = new FileWriter("output.txt");
          for (String item: stringList){
              if (RegularMatch(item)) output.write(item + " -- Correct\n");
              else output.write(item + " -- Not correct\n");
          }
          output.close();

       }
       public static boolean RegularMatch(String item) throws IOException {
           Pattern pattern = Pattern.compile("^-?\\d+[.|,]?\\d+(?:[eE]-?\\d+)?$");
           Matcher mather = pattern.matcher(item);
           if (mather.find()) return true;
           else return false;

       }
}
