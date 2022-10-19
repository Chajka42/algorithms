import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException  {
        long startTime = System.nanoTime(); // Получить время начала  
String filename = "input.txt";

        BufferedReader reader = new BufferedReader(new FileReader(filename));
            int N = Integer.valueOf(reader.readLine());
            String line; 
            long endTime = System.nanoTime(); // Получить время окончания  
            System.out.println ("time = "+ (endTime-startTime) +" ms "); 
int [][] data = new int [N][3];           
            for (int y = 0; y < N; y++){
                line = reader.readLine();
                String[] arra = line.split(" ");
                data[y][0] = Integer.valueOf(arra[0]);
                data[y][1] = Integer.valueOf(arra[1]);
                data[y][2] = Integer.valueOf(arra[2]);
            }
            
           endTime = System.nanoTime(); // Получить время окончания  
            System.out.println ("time = "+ (endTime-startTime) +" ms "); 

           
           
      int N2 = Integer.valueOf(reader.readLine());
      int[] fin = new int [N2];   
      ArrayList<String> log = new ArrayList<String>();     
      for (int y = 0; y < N2; y++){
          line = reader.readLine();
          String[] arra = line.split(" ");
          

          if (log.contains(line)) {
            fin[y] += fin[log.indexOf(line)]; log.add(line); 
          } else {
            log.add(line);
    if (Integer.valueOf(arra[2]) == 1) {
        for (int j = 0; j < N; j++){
            if (data[j][0] >= Integer.valueOf(arra[0]) && data[j][0] <= Integer.valueOf(arra[1])) {fin[y] += data[j][2]; }
        }
    } else {
        for (int k = 0; k < N; k++){
            if (data[k][1] >= Integer.valueOf(arra[0]) && data[k][1] <= Integer.valueOf(arra[1])) {fin[y] += (data[k][1] - data[k][0]);}
        }
    } }
      }

String finalle = "";
for (int h = 0; h < fin.length; h++){
    finalle += fin[h] + " ";
}
finalle.substring(0, finalle.length() - 1);

FileWriter writer = new FileWriter("output.txt");
    writer.write(finalle);
    writer.flush();

   endTime = System.nanoTime(); // Получить время окончания  
    System.out.println ("time = "+ (endTime-startTime) +" ms ");  

        }}
    
