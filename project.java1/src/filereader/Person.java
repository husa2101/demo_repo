package filereader;


public class Person extends Adress{


    private String firstname;
    private String lastname;
    private String signatur;
    private float lengt;
    private int index;

    public Person(){
        super("","","");

    }
    public Person(String postadress, String postnummer, String postort,String firstname, String lastname, float lengt,int index) {
        super(postadress, postnummer, postort);
        this.firstname = firstname;
        this.lastname = lastname;
        this.lengt = lengt;
        this.index = index;
        setSignatur(firstname, lastname);
    }



    public String getFirstname() {
        return firstname;
    }
    public String getLastname() { return lastname;}



    public void setIndex(int index) {
        this.index = index;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public void setLengt(float lengt) {this.lengt = lengt;}
    public void setSignatur(String firstname, String lastname) {
        String firstPart;
        if (firstname.length() >= 3){
            firstPart = firstname.substring(0, 3);
        }else{
            firstPart = firstname + "x";
        }
        String lastPart;
        if (lastname.length()>= 3){
            lastPart = lastname.substring(0, 3);
        }else{
            lastPart = lastname + "x";
        }
        this.signatur = firstPart + lastPart;
    }


   @Override
    public String toString() {
        re
       return String.format("%5s,%8S,%8S,%8S",index, signatur,firstname+lastname,lengt);
   }


}


