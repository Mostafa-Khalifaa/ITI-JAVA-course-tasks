import java.util.Comparator;
import java.util.Optional;

public class Exercise3 {

    public static void main(String[] args) {
        CountryDao countryDao = InMemoryWorldDao.getInstance();
        CityDao cityDao = InMemoryWorldDao.getInstance();

        Optional<City> maxCity  = countryDao.findAllCountries()
        .stream()
        .map(country -> {
            int id = country.getCapital();
            return cityDao.findCityById(id);
        }).filter( city -> city != null )
        .max(Comparator.comparingInt(city -> city.getPopulation()));

        if(!maxCity.isEmpty()){
            System.out.println(maxCity.get());

        }

        

    }
}