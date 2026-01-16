import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Exercise1 {

   public static void main(String[] args) {
      CountryDao Dao = InMemoryWorldDao.getInstance();
      
      List<Country> countries = Dao.findAllCountries();
      
      for (Country country : countries) {
         List<City> cities = country.getCities();
         
            Optional<City> maxCity = cities.stream()
                  .max(Comparator.comparingInt(city -> city.getPopulation()));
            
               System.out.println(country.getName() + " -> " + maxCity.get());
         
      }
   }
}