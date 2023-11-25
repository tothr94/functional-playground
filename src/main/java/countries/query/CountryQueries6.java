package countries.query;

import countries.model.Country;

import java.math.BigInteger;
import java.util.DoubleSummaryStatistics;
import java.util.Optional;

/**
 * Defines query methods for Country objects.
 */
public interface CountryQueries6 {
    /**
     * Returns the largest country (care must be taken with area because it may be null).
     *
     * @return the result
     */
    Optional<Country> getTheGreatestCountry();

    /**
     * Returns summary statistics about the area field.
     *
     * @return the result
     */
    DoubleSummaryStatistics getStatisticsOfAreas();

    /**
     * Returns the total area.
     *
     * @return the result
     */
    Optional<BigInteger> getTotalAreaAsOptional();

    /**
     * Returns the total area.
     *
     * @return the result
     */
    BigInteger getTotalAreaAsBigInteger();
}
