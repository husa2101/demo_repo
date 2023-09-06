package java1.media;

public class Cd extends Media {
    protected String Artist;
    public Cd(String title, int lenght,String Artist) {

        super(title, lenght);
        this.Artist = Artist;
    }
    public Cd(){
        this("unknown",-1,"unknown");
    }

    public String getArtist() {
        return Artist;
    }

    public void setArtist(String artist) {
        Artist = artist;
    }
    @Override
    public void print() {
        super.print();
        System.out.println("artist name is "+Artist);
        System.out.println(getLenghtAsString());

    }

    @Override
    public String toString() {
        return String.format(Artist);
    }

    public String getLenghtAsString() {
        int sek = (int) lenght;
        int tim = (int) (sek /3600);
        int min = (int) (sek / 60 % 60);
        sek = sek % 60;

        return "the lenght is ="+ String.format("%02d",tim) + ":" + String.format("%02d", min) + ":" + String.format("%02d", sek);
    }
}
