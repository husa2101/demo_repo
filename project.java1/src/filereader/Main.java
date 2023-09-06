package filereader;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static  void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        Contactlist call = new Contactlist();

        while(true) {

            int option;
            System.out.println("-----------------------------------------------");
            System.out.println("     velkomen till contact list meny                  ");
            System.out.println("-------------------------------------------------");
            System.out.println("välj:  en alternativ bland menyn");
            System.out.println(" 1) lägga till en person ");
            System.out.println(" 2) skriv ut listan med personer på skärmen ");
            System.out.println(" 3) söka en person i listan ");
            System.out.println(" 4) ta bort en person from listan ");
            System.out.println(" 5) sortera på namn ");
            System.out.println(" 6) sortera på signature ");
            System.out.println(" 7) sortera på längd  ");
            System.out.println(" 8) slumpa ordningen ");
            System.out.println(" 9) läsa från txt.fil ");
            System.out.println(" 10) skriva til en txt.file");
            System.out.println(" 11) exit                    ");

            option = input.nextInt();

            if (option == 1) {
                call.addcontact();

            }
            if (option == 2) {
                System.out.println("element som finns i listan är ");
                call.display();
            }
            if (option == 3) {
                call.search();

            }
            if (option == 4){
                call.erease();
            }

            if (option == 5){
                call.sortName();
            }
            if (option==6){
                call.sortSign();
            }if (option == 7){
                call.sortLenght();
            }
            if (option==8){
                call.slumpaOrdningen();
            }
            if (option==9){
                call.readfile();
            }
            if (option == 10){
                call.write();
            }
            if (option == 11) {
                System.exit(0);
                break;
            }


        }










    }



}
