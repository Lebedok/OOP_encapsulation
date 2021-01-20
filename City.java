package Encapsulation;

public class City {

    private String name;
    private long population;
    private String state;
    private String date;


    // GETTER --> It doesn't take any parameter
    // It will return the value from instance variable
    // Method naming convention for getters is starting with 'get
    // All getters and setters has public access modifier

    public String getName(){
        return name;
    }

    public long getPopulation(){
        return population;
    }

    public void setName(String name){
        this.name = name;

    }

    public void setPopulation(long population){
        this.population = population;
    }




}
