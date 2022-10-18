import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
      String filename = "input.txt";

      try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
        int re = Integer.valueOf(reader.readLine());
  
          String out = "";
  
          for (int i = 0; i < re; i++) {
              

              String a2 = reader.readLine();
              String [] a2splt = a2.split(",");
              String fio = a2splt[0] + a2splt[1] + a2splt[2];
              int n1 = (int) fio.chars().distinct().count();
              int n2 = 0;
              int in1 = Integer.valueOf(a2splt[3]);
              int in2 = Integer.valueOf(a2splt[4]);
              while(in1 != 0){
                   n2 += (in1 % 10);
                   in1/=10;
              }
              while(in2 != 0){
              n2 += (in2 % 10);
              in2/=10;
              }
  
              
              n2 *= 64;
              char l = a2splt[0].charAt(0);
              l = Character.toLowerCase(l);  
              int n3 = 0;
              if (l >= 'a' && l <= 'z') {
              n3 = (int) l - 'a' + 1;}
              n3 *= 256;
              int tot = n1 + n2 + n3;
            
              String hex = Integer.toHexString(tot);
             
              if (hex.length() == 3) {
                  out += hex + " ";
                } else if (hex.length() > 3) {
                  out += hex.substring(hex.length() - 3) + " ";
                } else {
                  if (hex.length() == 2) {out += "0" + hex + " ";} 
                  else {out += "00" + hex + " ";}
                }
  
  
          }
              out = out.toUpperCase();  
              try (FileWriter writer = new FileWriter("output.txt")) {
                writer.write(out.substring(0, out.length() - 1));
                writer.flush();
                }
} catch (NumberFormatException e) {
 
  e.printStackTrace();
}

    }
}
