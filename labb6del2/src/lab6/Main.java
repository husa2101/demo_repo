package lab6;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        try {

            File file = new File("wordlist1.txt");
            long start = System.currentTimeMillis();
            if (args.length > 0) {
                file = new File(args[0]);
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;


            Scanner inputfile = new Scanner(System.in);
            System.out.println("enter the word you are looking for >>");
            String newWord = inputfile.nextLine();

            int count = 0;

            while ((line = br.readLine()) != null){

                count++;

                if (line.equals(newWord)){
                    System.out.println(" the word "+  line  +" exist in this file  ");
                }

            }

            System.out.println("the file "+ file+" contain " + count);

            long end = System.currentTimeMillis();
            long time = end - start;
            System.out.println("the search took " + time + " ms");


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }









}
