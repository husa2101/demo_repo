package java2.media;

public class Dvd extends Media {

    protected int ageLimit;


    public Dvd(String title, int lenght, int ageLimit) {
      super(title,lenght);

        setAgeLimit(ageLimit);
    }
    public Dvd(){
        this("unknown", -1, -1);
    }

    public int getAgeLimit() {
        return ageLimit;
    }

    public int setAgeLimit(int ageLimit) {
        if (ageLimit>0){
            this.ageLimit = ageLimit;
            }
        return ageLimit;
    }


    @Override
    public void print() {
        super.print();
        System.out.println(" age limit for this dvd is  =  " + ageLimit);
        System.out.println(getLenghtAsString());

    }

    @Override
    public String toString() {
        return String.format(String.valueOf(ageLimit));
    }

    public String getLenghtAsString() {
        int sek = (int) lenght;
        int tim = (int) (sek /3600);
        int min = (int) (sek / 60 % 60);
        sek = sek % 60;

        return"the lenght is ="+ String.format("%02d",tim) + ":" + String.format("%02d", min) + ":" + String.format("%02d", sek);
    }

}
