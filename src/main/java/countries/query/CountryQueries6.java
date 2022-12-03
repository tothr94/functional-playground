package countries.query;

import countries.model.Country;

import java.math.BigInteger;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Optional;

public interface CountryQueries6 {
    /**
     * Returns the largest country (care must be taken with area because it may be null).
     *
     * @param countries the list of countries
     * @return the result
     */
    Optional<Country> getTheGreatestCountry(List<Country> countries);

    /**
     * Returns summary statistics about the area field.
     *
     * @param countries the list of countries
     * @return the result
     */
    DoubleSummaryStatistics getStatisticsOfAreas(List<Country> countries);

    /**
     * Returns the total area.
     *
     * @param countries the list of countries
     * @return the result
     */
    Optional<BigInteger> getTotalAreaAsOptional(List<Country> countries);

    /**
     * Returns the total area.
     *
     * @param countries the list of countries
     * @return the result
     */
    BigInteger getTotalAreaAsBiginteger(List<Country> countries);

    /**
     * Returns a comma separated string of country names sorted alphabetically.
     *
     * @param countries the list of countries
     * @return the result
     */
    String getCommaSeparatedOrderedCountryNames(List<Country> countries);
}
