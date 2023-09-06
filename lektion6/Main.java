package lektion6;



import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main( String [] arge) {
        int antalord = 0;
        int sentenceCount = 0;

         boolean run = true;
        while(run) {

        System.out.println(" write some sentences......");
        // object för att läsa från tangentbord.
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        // räknar antal character
        int i;
        for (i = 0; i < name.length(); i++) {
            if (Character.isLetterOrDigit(name.charAt(i))) ;
            antalord++;
        }
        // räknar antal mening
        if (!name.isEmpty()){
            String[] sentenceList = name.split("[!?.:]+");
            sentenceCount+= sentenceList.length;

        }
        // räknar antal ord
        if (!name.isEmpty()) {
            // bryter ned meningen
            StringTokenizer wordCount = new StringTokenizer(name);

            System.out.println("antal Character " + antalord);
            System.out.println("antal ord är  " + wordCount.countTokens());
            System.out.println("antal mening är " + sentenceCount);
        }
        }

    }
}
