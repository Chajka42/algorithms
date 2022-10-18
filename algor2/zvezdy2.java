import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class zvezdy2 {

    public static void main(String[] args) throws IOException  {


 
 String filename = "input.txt";
String counts = "";
       BufferedReader reader = new BufferedReader(new FileReader(filename));
            int Nchet = Integer.valueOf(reader.readLine());
            String line;
            int [][] aa = new int [Nchet][3];           
            for (int y = 0; y < Nchet; y++){
                line = reader.readLine();
                String[] arra = line.split(" ");
                aa[y][0] = (Integer.valueOf(arra[0])*1440) + (Integer.valueOf(arra[1])*60) + Integer.valueOf(arra[2]);
                aa[y][1] = Integer.valueOf(arra[3]);
                counts += arra[3] + ";";
                if (arra[4].equals("C") || arra[4].equals("S")){aa[y][2] = 0;} else {aa[y][2] = 1;}
            }

    

        
    Arrays.sort(aa, (a, b) -> Integer.compare(b[0],a[0]));
        
List<String> deduped = Arrays.asList(counts.split(";")).stream().distinct().collect(Collectors.toList());

List<Integer> newList = deduped.stream().map(s -> Integer.parseInt(s)).collect(Collectors.toList());
int[] names = newList.stream().mapToInt(Integer::intValue).toArray();

int[] fin = new int [newList.size()];
int[] lapse = new int [newList.size()];

Arrays.sort(names);
//System.out.println(newList.size());

for (int y = Nchet -1; y >= 0; y--){
            int numero = 0;
            for(int k = 0; k < names.length; k++){
                if (aa[y][1] == names[k]){numero = k; 
                } 
            }

    if (lapse[numero] == 0 && aa[y][2] != 0) { lapse[numero] = aa[y][0]; 
    } 

        if (lapse[numero] != 0 && aa[y][2] == 0) {fin[numero] = fin[numero] + aa[y][0] - lapse[numero]; lapse[numero] = 0; 
        }
    
}
String finalle = "";
for (int h = 0; h < fin.length; h++){
    finalle += fin[h] + " ";
}
finalle.substring(0, finalle.length() - 1);

FileWriter writer = new FileWriter("output.txt");
    writer.write(finalle);
    writer.flush();
























    }

    
}