package filereader;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.out;

public class Contactlist {


     ArrayList<Person> list= new ArrayList<>();
    Scanner input = new Scanner(System.in);
    int count = 0;

    public void addcontact() {
try {

    Person person = new Person();

    System.out.println("enter first name ");
    person.setFirstname(input.nextLine());

    System.out.println("enter last name");
    person.setLastname(input.nextLine());

    System.out.println(" enter langht");
    person.setLengt(Float.parseFloat(input.nextLine()));

    person.setSignatur(person.getLastname(), person.getFirstname());

    System.out.println(" ange post adress");
    person.setPostadress(input.nextLine());

    System.out.println(" ange post nummer");
    person.setPostnummer(input.nextLine());

    System.out.println("ange post ort");
    person.setPostort(input.nextLine());

    for (Person s : list) {
        System.out.println(s);
        System.out.println(" Person has Successfully created");
        count++;

    }

    person.setIndex(count);
    list.add(person);

} catch ( NumberFormatException e) {
    e.printStackTrace();
}

    }


    public void display(){
    for (Person s:list){
        out.println(s);
    }



    }

    public void search() {
        out.println(" ange namn som du vill ta söka");
        String namnToFind = input.nextLine();
        int maches = 0;
        for (Person s: list){
            if (s.getFirstname().equals(namnToFind)){
                out.println(s);
                maches++;
            }
        }
        if (maches>=0){
            out.println(" personen finns inte ");
        }


    }

    public void erease() {
        out.println(" ange namn som du vill tar bort from listan ");
        String nameToErease = input.nextLine();
        list.removeIf(s -> s.getFirstname().equals(nameToErease));
        out.println(" personen är raderad from listan ");

    }

    public void readfile(){
        try {
        Scanner input = new Scanner(System.in);
        out.println(" ange fil namn som du vill läsa ifrån: ");
        String filename = input.nextLine();

        FileReader in = new FileReader(filename);
       BufferedReader file = new BufferedReader(in);

        String name;
            while ((name = file.readLine()) != null){

              System.out.println(name);
          }



        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void write() throws IOException {
        out.println("ange file namn som du vill spara till");
        String filename = input.nextLine();
        FileWriter infile = new FileWriter(filename);
        BufferedWriter out = new BufferedWriter(infile);

        for (Person s: list){
            out.write(String.valueOf(s));
            System.out.println(s);
        }

        out.close();

    }

    public void sortName() {
    }

    public void sortSign() {
    }

    public void sortLenght() {
    }

    public void slumpaOrdningen() {
    }
}
