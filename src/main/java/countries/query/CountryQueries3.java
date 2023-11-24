package countries.query;

import countries.model.Country;
import countries.model.Region;
import lombok.NonNull;

import java.util.List;
import java.util.Set;

/**
 * Defines query methods for {@link Country} objects.
 */
public interface CountryQueries3 {
    /**
     * Returns the name of each country.
     *
     * @return the set of names
     */
    Set<String> getCountryNames();

    /**
     * Returns the capital of each country in ascending order.
     *
     * @return the list of capitals
     */
    List<String> getCapitalsOrderByName();

    /**
     * Returns the capital of each country in descending order.
     *
     * @return the list of capitals
     */
    List<String> getCapitalsOrderByNameDesc();

    /**
     * Returns the name of each European country.
     *
     * @return the set of country names
     */
    Set<String> getNamesOfEuropeanCountries();

    /**
     * Returns the name of each country which is located in the given continent.
     *
     * @param region the region
     * @return the set of country names
     */
    Set<String> getNamesOfCountriesFilterByContinent(
            @NonNull Region region);

    /**
     * Returns the set of countries which population is less than the given limit.
     *
     * @param limit the limit
     * @return the set of countries
     */
    Set<Country> getCountriesBelowPopulationLimit(
            int limit);

    /**
     * Returns all the population values that belong to the given continent.
     *
     * @param region the continent
     * @return the set of populations
     */
    Set<Long> getPopulationsByRegion(
            @NonNull Region region);

    /**
     * Returns each country which has the given population.
     *
     * @param population the population
     * @return the set of countries
     */
    Set<Country> getCountriesByPopulation(
            long population);

    /**
     * Returns each country which has a population which is between the given bounds (inclusive).
     *
     * @param lowerBound the lower bound
     * @param upperBound the upper bound
     * @return the set of countries
     */
    Set<Country> getCountriesByPopulation(
            long lowerBound,
            long upperBound);
}
