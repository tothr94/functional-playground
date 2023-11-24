package countries.query;

import countries.model.Country;
import countries.model.Region;
import lombok.NonNull;

import java.util.Optional;

/**
 * Defines query methods for {@link Country} objects.
 */
public interface CountryQueries1 {

    /**
     * Returns the value of the maximum population.
     *
     * @return the maximum population
     */
    long getMaximumPopulation();

    /**
     * Returns the value of the average population.
     *
     * @return the average population
     */
    double getAveragePopulation();

    /**
     * Returns the count of European countries.
     *
     * @return the count of countries
     */
    long getCountOfEuropeanCountries();

    /**
     * Returns the count of countries that are located in the given continent.
     *
     * @param region the continent
     * @return the count of countries
     */
    long getCountOfCountriesFilterByRegion(
            @NonNull Region region);

    /**
     * Returns the population of the given continent.
     *
     * @param region the continent
     * @return the population
     */
    long getPopulationByRegion(
            @NonNull Region region);

    /**
     * Returns whether a country exists having the given population.
     *
     * @param population the population
     * @return the result
     */
    boolean isPopulationExists(
            long population);

    /**
     * Returns the country which has the given code.
     *
     * @param code the country code
     * @return the result
     */
    Country getCountryByCode(
            @NonNull String code);

    /**
     * Returns the country which has the given code.
     *
     * @param code the country code
     * @return the result
     */
    Optional<Country> getOptionalCountryByCode(
            @NonNull String code);

    /**
     * Returns the country which has the greatest population of its continent.
     *
     * @param region the continent
     * @return the most populous country
     */
    Optional<Country> getMostPopulousCountryByRegion(
            @NonNull Region region);

    /**
     * Returns the first country which name starts with the given letter.
     *
     * @param letter the letter
     * @return the country
     */
    Optional<Country> getFirstCountryByStartingLetter(
            char letter);
}
