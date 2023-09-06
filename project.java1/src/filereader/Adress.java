package filereader;

public class Adress {
    private String postadress;
    private String postort;
    private String postnummer;



    public Adress(String postadress,String postnummer,String postort) {

        this.postadress= postadress;
        this.postnummer= postnummer;
        this.postort=postort;
    }


    public String getPostadress() {
        return postadress;
    }

    public void setPostadress(String postadress) {
        this.postadress = postadress;
    }

    public String getPostort() {
        return postort;
    }

    public void setPostort(String postort) {
        this.postort = postort;
    }

    public String getPostnummer() {
        return postnummer;
    }

    public void setPostnummer(String postnummer) {
        this.postnummer = postnummer;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "postadress='" + postadress + '\'' +
                ", postort='" + postort + '\'' +
                ", postnummer='" + postnummer + '\'' +
                '}';
    }
}
