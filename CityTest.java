package Encapsulation;

public class CityTest {
    public static void main(String[] args) {

        City city = new City();
        city.setName("Chicago");
        city.setPopulation(5_000_000);
        System.out.println(city.getName());
        System.out.println(city.getPopulation());


    }
}
