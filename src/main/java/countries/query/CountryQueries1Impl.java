package countries.query;

import countries.base.CountryRepository;
import countries.model.Country;
import countries.model.Region;
import lombok.NonNull;

import java.util.List;
import java.util.Optional;

/**
 * A feladatok megoldását tartalmazó osztály.
 */
public class CountryQueries1Impl implements CountryQueries1 {

    @Override
    public long getMaximumPopulation(@NonNull List<Country> countries) {
        return 0;
    }

    @Override
    public double getAveragePopulation(@NonNull List<Country> countries) {
        return 0;
    }

    @Override
    public long getCountOfEuropeanCountries(@NonNull List<Country> countries) {
        return 0;
    }

    @Override
    public long getCountOfCountriesFilterByRegion(@NonNull List<Country> countries, @NonNull Region region) {
        return 0;
    }

    @Override
    public long getPopulationByRegion(@NonNull List<Country> countries, @NonNull Region region) {
        return 0;
    }

    @Override
    public boolean isPopulationExists(@NonNull List<Country> countries, long population) {
        return false;
    }

    @Override
    public Country getCountryByCode(@NonNull List<Country> countries, @NonNull String code) {
        return null;
    }

    @Override
    public Optional<Country> getOptionalCountryByCode(@NonNull List<Country> countries, @NonNull String code) {
        return Optional.empty();
    }

    @Override
    public Optional<Country> getMostPopulousCountryByRegion(@NonNull List<Country> countries, @NonNull Region region) {
        return Optional.empty();
    }

    @Override
    public Optional<Country> getFirstCountryByStartingLetter(@NonNull List<Country> countries, char letter) {
        return Optional.empty();
    }

    public static void main(String[] args) {
        final CountryRepository repository = CountryRepository.getInstance();
        final List<Country> countries = repository.getAll();
        final CountryQueries1 queries = new CountryQueries1Impl();

        System.out.println("A dokumentum " + countries.size() + " országot tartalmaz.");

        // a megoldás itt tesztelhető
    }
}
