

import jdk.swing.interop.SwingInterOpUtils;
import java1.media.*;

import java.util.concurrent.Flow;

public class TestMedia {

    public static void main( String[] args){
       Media media = new Media("Vinter",123456);
       Dvd cd =new Dvd ("vinter",98765,16);
       Book author = new Book("12 rolls of life",878,"Jorden Petterson");
        Cd sale = new Cd("sommarTime",-85764,"DJ kaled");


        Publisher publish = new Publisher();
        publish.setName("Disny Production");
       String info = publish.toString();
        System.out.println("---------------------------------------------------");
        System.out.println(info);
        System.out.println("------------------------------------------------");

       media.print();

        System.out.println("Press enter to continue");
        try{System.in.read();}
        catch(Exception e){}

        cd.print();

        System.out.println("Press enter to continue");
        try{System.in.read();}
        catch(Exception e){}

        author.print();

        System.out.println("Press enter to continue");
        try{System.in.read();}
        catch(Exception e){}

        sale.print();








    }
}
