package countries.query;

import countries.model.Country;
import lombok.NonNull;

import java.util.List;

/**
 * Defines query methods for Country objects.
 */
public interface CountryQueries2 {

    /**
     * Returns the list of countries ordered by:
     *
     * <ol>
     *     <li>their populations in descending order</li>
     * </ol>
     *
     * @param countries the list of countries
     * @return the sorted list of countries
     */
    List<Country> getCountriesOrderByPopulationDesc(
            @NonNull List<Country> countries);

    /**
     * Returns the list of countries ordered by:
     *
     * <ol>
     *     <li>the names of their capitals</li>
     *     <li>their population in descending order</li>
     * </ol>
     *
     * @param countries the list of countries
     * @return the sorted list of countries
     */
    List<Country> getCountriesOrderByLengthOfCapitalThenByPopulationDesc(
            @NonNull List<Country> countries);

    /**
     * Returns the list of countries ordered by:
     *
     * <ol>
     *     <li>the length of the names of their capitals</li>
     *     <li>their capitals</li>
     * </ol>
     *
     * @param countries the list of countries
     * @return the sorted list of countries
     */
    List<Country> getCountriesOrderByLengthOfCapitalThenByCapital(
            @NonNull List<Country> countries);
}
