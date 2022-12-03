package countries.query;

import countries.model.Country;
import countries.model.Region;
import lombok.NonNull;

import java.util.List;
import java.util.Optional;

/**
 * Defines query methods for {@link Country} objects.
 */
public interface CountryQueries1 {

    /**
     * Returns the value of the maximum population.
     *
     * @param countries the list of countries
     * @return the maximum population
     */
    long getMaximumPopulation(
            @NonNull List<Country> countries);

    /**
     * Returns the value of the average population.
     *
     * @param countries the list of countries
     * @return the average population
     */
    double getAveragePopulation(
            @NonNull List<Country> countries);

    /**
     * Returns the count of European countries.
     *
     * @param countries the list of countries
     * @return the count of countries
     */
    long getCountOfEuropeanCountries(
            @NonNull List<Country> countries);

    /**
     * Returns the count of countries that are located in the given continent.
     *
     * @param countries the list of countries
     * @param region    the continent
     * @return the count of countries
     */
    long getCountOfCountriesFilterByRegion(
            @NonNull List<Country> countries,
            @NonNull Region region);

    /**
     * Returns the population of the given continent.
     *
     * @param countries the list of countries
     * @param region    the continent
     * @return the population
     */
    long getPopulationByRegion(
            @NonNull List<Country> countries,
            @NonNull Region region);

    /**
     * Returns whether a country exists having the given population.
     *
     * @param countries  the list of countries
     * @param population the population
     * @return the result
     */
    boolean isPopulationExists(
            @NonNull List<Country> countries,
            long population);

    /**
     * Returns the country which has the given code.
     *
     * @param countries the list of countries
     * @param code      the country code
     * @return the result
     */
    Country getCountryByCode(
            @NonNull List<Country> countries,
            @NonNull String code);

    /**
     * Returns the country which has the given code.
     *
     * @param countries the list of countries
     * @param code      the country code
     * @return the result
     */
    Optional<Country> getOptionalCountryByCode(
            @NonNull List<Country> countries,
            @NonNull String code);

    /**
     * Returns the country which has the greatest population of its continent.
     *
     * @param countries the list of countries
     * @param region    the continent
     * @return the most populous country
     */
    Optional<Country> getMostPopulousCountryByRegion(
            @NonNull List<Country> countries,
            @NonNull Region region);

    /**
     * Returns the first country which name starts with the given letter.
     *
     * @param countries the list of countries
     * @param letter    the letter
     * @return the country
     */
    Optional<Country> getFirstCountryByStartingLetter(
            @NonNull List<Country> countries,
            char letter);
}
