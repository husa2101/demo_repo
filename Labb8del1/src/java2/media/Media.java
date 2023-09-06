package java2.media;



public class Media {

    protected String title;
    protected int lenght;

    public Media(String title,int lenght){

        this.title = title;
        setLenght(lenght);
        }
    public Media() {
    }

    public double getLenght() {
        return lenght;
    }
    public String getTitle() {
        return title;
    }


   public void setLenght(int lenght) {
   if (lenght>0) {
    this.lenght = lenght;
        }
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void print(){

        System.out.println(" titles name\t"+ title);
        System.out.println("lenght=\t"+ lenght);
        System.out.println(getLenghtAsString());

    }

    @Override
    public String toString() {
        return title;
    }

    public String getLenghtAsString() {
        int sek = (int) lenght;
        int tim = (int) (sek / 3600);
        int min = (int) (sek / 60 % 60);
        sek = sek % 60;

        return "the lenght is =" + String.format("%02d", tim) + ":" + String.format("%02d", min) + ":" + String.format("%02d", sek);
    }
}

