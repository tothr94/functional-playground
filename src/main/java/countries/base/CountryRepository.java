package countries.base;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import countries.model.Country;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/**
 * Az országok adatait beolvasó osztály.
 */
public final class CountryRepository {
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper().registerModule(new JavaTimeModule());
    private static CountryRepository instance;
    private List<Country> countries;

    private CountryRepository() {
        try {
            loadCountries(this.getClass()
                    .getClassLoader()
                    .getResourceAsStream("countries.json"));
        } catch (IOException e) {
            throw new AssertionError("Failed to load resource countries.json", e); // Can't happen
        }
    }

    /**
     * Az osztály egyetlen példányát visszaadó metódus.
     *
     * @return a {@link CountryRepository} objektum
     */
    public static CountryRepository getInstance() {
        if (instance == null) {
            instance = new CountryRepository();
        }
        return instance;
    }

    private void loadCountries(InputStream is) throws IOException {
        countries = OBJECT_MAPPER.readValue(is, new TypeReference<List<Country>>() {
        });
    }

    /**
     * Visszaadja az országokat tartalmazó, módosíthatatlan listát.
     *
     * @return az országok listája
     */
    public List<Country> getAll() {
        return Collections.unmodifiableList(countries);
    }

}
