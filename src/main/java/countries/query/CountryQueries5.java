package countries.query;

import countries.model.Country;
import countries.model.Region;

import java.time.ZoneId;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * Defines query methods for Country objects.
 */
public interface CountryQueries5 {
    /**
     * Determines whether there is at least one country with the word "island" in its name ignoring case.
     *
     * @return the result
     */
    boolean doesIslandExist();

    /**
     * Returns the first country name that contains the word "island" ignoring case.
     *
     * @return the result
     */
    Optional<Country> getFirstIsland();

    /**
     * Returns each country name in which the first and the last letters are the same ignoring case.
     *
     * @return the result
     */
    Set<String> getNamesWithSameBounds();

    /**
     * Returns the populations of the first ten least populous countries.
     *
     * @return the result
     */
    Set<Long> getSmallestPopulations();

    /**
     * Returns the names of the first ten least populous countries.
     *
     * @return the result
     */
    Set<String> getNamesOfLeastPopulousCountries();

    /**
     * Returns summary statistics about the number of country name translations associated with each country.
     *
     * @return the result
     */
    IntSummaryStatistics getTranslationsStatistics();

    /**
     * Returns the names of countries in the ascending order of the number of timezones.
     *
     * @return the result
     */
    Set<String> getNamesOrderByNumberOfTimezones();

    /**
     * Returns the number of timezones for each country in the form name:timezones, in the ascending order of the number of timezones.
     *
     * @return the result
     */
    List<String> getNamesAndTimeZoneOrderByNumberOfTimezones();

    /**
     * Returns the number of countries with no Spanish country name translation (the Spanish language is identified by the language code "es").
     *
     * @return the result
     */
    long countCountriesWithoutSpanishTranslation();

    /**
     * Returns the names of countries with null area.
     *
     * @return the result
     */
    List<Country> getCountriesWithUnknownArea();

    /**
     * Returns all distinct language tags of country name translations sorted in alphabetical order.
     *
     * @return the result
     */
    Set<String> getDistinctLanguageTags();

    /**
     * Returns the average length of country names.
     *
     * @return the result
     */
    Optional<Double> getAverageLengthOfCountryNames();

    /**
     * Returns all distinct regions of the countries with null area.
     *
     * @return the result
     */
    Set<Region> getRegionsHavingUnknownAreas();

    /**
     * Returns the names of countries with a non-`null` area below 1.
     *
     * @return the result
     */
    Set<String> getNamesHavingKnownAreBelowOne();

    /**
     * Returns all distinct timezones of European and Asian countries (required intermediate operation.
     *
     * @return the result
     */
    Set<ZoneId> getDistinctAsianAndEuropeanTimeZones();
}
