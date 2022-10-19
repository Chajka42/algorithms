import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException  {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            String file = "";
            String line;
            while ((line = reader.readLine()) != null) {
                file = file + line + " ";
             }

String[] nums = file.split(" "); 
String[] gg = new String[Integer.valueOf(nums[0]) + 1];

gg[0] = null;
gg[1] = "x1";
for (int i = 2; i < gg.length; i++){
    if (i % 2 == 0) {if (i == 2) {gg[i] = "l2";} else {gg[i] = gg[i/2]; gg[i] += "l" + (i);}} 
    else {if (i == 3) {gg[i] = "r3" ;} else {gg[i] = gg[(i-1)/2]; gg[i] += "r" + (i);}}
}



   for (int i = 2; i < Integer.valueOf(nums[1])+2; i++){
        String timed, changed;
            
         changed = gg[Integer.valueOf(nums[(i)])];
         if (changed != "x1"){
         timed = gg[Integer.valueOf(nums[(i)])].substring(0, gg[Integer.valueOf(nums[(i)])].length() - (nums[(i)].length()+1));
         if (timed == "") {

            for (int j = 1; j < gg.length; j++){
                
                if (gg[j].contains(changed) == false) {if (gg[j].contains("x1") == true) {gg[j] = changed;} else {gg[j] = changed + gg[j];}} 
            }
            gg[Integer.valueOf(nums[(i)])] = "x1"; 
         } 
         else{ 
        for (int j = 1; j < gg.length; j++){
            if (gg[j].contains(timed) == true) {
                if (gg[j].contains(changed) == false) {gg[j] = gg[j].replaceFirst(timed, changed);} 
                   else { 
                    if (gg[j].equals(changed)) {gg[j] = gg[j].replaceFirst(changed, timed);} else {
                 
                    if (gg[j].substring(changed.length() , changed.length() +1).equals(changed.substring(timed.length(), timed.length()+1)) == false) {

                    gg[j] = gg[j].replaceFirst(changed, timed);}}}
                }
                 
        }}}
    }
 

    String fin = "";
for (int j = 1; j < gg.length; j++){
  gg[j] = gg[j].replaceAll("([0-9])", ""); 
   if (gg[j].equals("x")) {gg[j] = "a";}
}




int[] bye = new int [11];

for (int k = 1; k < gg.length; k++){
    for (int h = 0; h < gg[k].length(); h++){
        if (gg[k].length() > 0){
if (gg[k].charAt(h) == 'l') {bye[k] += 200*h;} else {bye[k] += 50*h;}
    }
    bye[k] /= gg[k].length();}
}


 int biggest = 0;
 for (int i = 1; i < gg.length; i++){
    if (gg[i] != null) {if (gg[i].length() > biggest) {biggest = gg[i].length();}
 }} 

   for (int i = 1; i <= gg.length - 1; i++){
    gg[i] = gg[i].replaceAll("l", "b");
    gg[i] = gg[i].replaceAll("r", "d");
     while (gg[i].length() < biggest) {gg[i] += "c";}
    }



        String[] cA = Arrays.copyOf(gg, gg.length);
        cA[0] = "";
        Arrays.sort(cA);

        for (int g = 0; g < cA.length; g++){
           for (int c = 0; c < cA.length; c++){
            if (cA[g].equals(gg[c])) {fin += " " + c;}
           }
        }


try (FileWriter writer = new FileWriter("output.txt")) {
    writer.write(fin.substring(1));
    writer.flush();
}

    }}}




