package ma.ensa.mysoapservice;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CountryRepository {
    private static final Map<String, Country> countries = new HashMap<>();

    @PostConstruct
    public void initData() {
        // Initialize countries map with sample data
        Country france = new Country();
        france.setName("France");
        france.setPopulation(67000000);
        france.setCapital("Paris");
        france.setCurrency(Currency.EUR);

        Country morocco = new Country();
        morocco.setName("Morocco");
        morocco.setPopulation(36000000);
        morocco.setCapital("Rabat");
        morocco.setCurrency(Currency.DH);

        Country poland = new Country();
        poland.setName("Poland");
        poland.setPopulation(38000000);
        poland.setCapital("Warsaw");
        poland.setCurrency(Currency.PLN);

        countries.put(france.getName(), france);
        countries.put(morocco.getName(), morocco);
        countries.put(poland.getName(), poland);
    }

    public Country findCountry(String name) {
        try {
            Thread.sleep(200); // Simuler l'accès réseau
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return countries.get(name); // Retourne le pays correspondant au nom
    }
}

