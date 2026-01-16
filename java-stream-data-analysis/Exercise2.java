import java.util.Comparator;
import java.util.Optional;
public class Exercise2 {

    public static void main(String[] args) {

        CountryDao Dao = InMemoryWorldDao.getInstance();
    

        Dao.getAllContinents().stream().forEach(c -> {

          Optional<City> maxCity =   Dao.findCountriesByContinent(c).stream().map(country -> 
                {

             return country.getCities().stream().max(Comparator.comparingInt(city -> city.getPopulation()));



            } 
            ).findFirst().get();

            if(!maxCity.isEmpty()){
                System.out.println(c + "-> " + maxCity.get());
            }


        });
        
    }
}