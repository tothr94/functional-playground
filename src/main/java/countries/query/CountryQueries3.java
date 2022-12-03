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
     * @param countries the list of countries
     * @return the set of names
     */
    Set<String> getCountryNames(
            @NonNull List<Country> countries);

    /**
     * Returns the capital of each country in ascending order.
     *
     * @param countries the list of countries
     * @return the list of capitals
     */
    List<String> getCapitalsOrderByName(
            @NonNull List<Country> countries);

    /**
     * Returns the capital of each country in descending order.
     *
     * @param countries the list of countries
     * @return the list of capitals
     */
    List<String> getCapitalsOrderByNameDesc(
            @NonNull List<Country> countries);

    /**
     * Returns the name of each European country.
     *
     * @param countries the list of countries
     * @return the set of country names
     */
    Set<String> getNamesOfEuropeanCountries(
            @NonNull List<Country> countries);

    /**
     * Returns the name of each country which is located in the given continent.
     *
     * @param countries the list of countries
     * @param region    the region
     * @return the set of country names
     */
    Set<String> getNamesOfCountriesFilterByContinent(
            @NonNull List<Country> countries,
            @NonNull Region region);

    /**
     * Returns the set of countries which population is less than the given limit.
     *
     * @param countries the list of countries
     * @param limit     the limit
     * @return the set of countries
     */
    Set<Country> getCountriesBelowPopulationLimit(
            @NonNull List<Country> countries,
            int limit);

    /**
     * Returns all the population values that belong to the given continent.
     *
     * @param countries the list of countries
     * @param region    the continent
     * @return the set of populations
     */
    Set<Long> getPopulationsByRegion(
            @NonNull List<Country> countries,
            @NonNull Region region);

    /**
     * Returns each country which has the given population.
     *
     * @param countries  the list of countries
     * @param population the population
     * @return the set of countries
     */
    Set<Country> getCountriesByPopulation(
            @NonNull List<Country> countries,
            long population);

    /**
     * Returns each country which has a population which is between the given bounds (inclusive).
     *
     * @param countries  the list of countries
     * @param lowerBound the lower bound
     * @param upperBound the upper bound
     * @return the set of countries
     */
    Set<Country> getCountriesByPopulation(
            @NonNull List<Country> countries,
            long lowerBound,
            long upperBound);
}
