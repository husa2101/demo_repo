package java2.media;

public class Publisher {
    private String name;

    //konstruktor
    public void publisher(String name){

        this.name = name;
    }
    // set metoder
    public void setName(String name) {this.name = name;}


    // get metoder för att retunera data
    public String getName() {return name;}


    // metod för att skriva ut
    @Override
    public String toString() {
        return "Publisher{" +
                "name='" + name + '\'' +
                '}';
    }
}



