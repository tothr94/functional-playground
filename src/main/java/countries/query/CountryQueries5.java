package countries.query;

import countries.model.Country;
import countries.model.Region;

import java.time.ZoneId;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface CountryQueries5 {
    /**
     * Determines whether there is at least one country with the word "island" in its name ignoring case.
     *
     * @param countries the list of countries
     * @return the result
     */
    boolean doesIslandExist(List<Country> countries);

    /**
     * Returns the first country name that contains the word "island" ignoring case.
     *
     * @param countries the list of countries
     * @return the result
     */
    Optional<Country> getFirstIsland(List<Country> countries);

    /**
     * Returns each country name in which the first and the last letters are the same ignoring case.
     *
     * @param countries the list of countries
     * @return the result
     */
    Set<String> getNamesWithSameBounds(List<Country> countries);

    /**
     * Returns the populations of the first ten least populous countries.
     *
     * @param countries the list of countries
     * @return the result
     */
    Set<Long> getSmallestPopulations(List<Country> countries);

    /**
     * Returns the names of the first ten least populous countries.
     *
     * @param countries the list of countries
     * @return the result
     */
    Set<String> getNamesOfLeastPopulousCountries(List<Country> countries);

    /**
     * Returns summary statistics about the number of country name translations associated with each country.
     *
     * @param countries the list of countries
     * @return the result
     */
    IntSummaryStatistics getTranslationsStatistics(List<Country> countries);

    /**
     * Returns the names of countries in the ascending order of the number of timezones.
     *
     * @param countries the list of countries
     * @return the result
     */
    Set<String> getNamesOrderByNumberOfTimezones(List<Country> countries);

    /**
     * Returns the number of timezones for each country in the form name:timezones, in the ascending order of the number of timezones.
     *
     * @param countries the list of countries
     * @return the result
     */
    List<String> getNamesAndTimeZoneOrderByNumberOfTimezones(List<Country> countries);

    /**
     * Returns the number of countries with no Spanish country name translation (the Spanish language is identified by the language code "es").
     *
     * @param countries the list of countries
     * @return the result
     */
    long countCountriesWithoutSpanishTranslation(List<Country> countries);

    /**
     * Returns the names of countries with null area.
     *
     * @param countries the list of countries
     * @return the result
     */
    List<Country> getCountriesWithUnknownArea(List<Country> countries);

    /**
     * Returns all distinct language tags of country name translations sorted in alphabetical order.
     *
     * @param countries the list of countries
     * @return the result
     */
    Set<String> getDistinctLanguageTags(List<Country> countries);

    /**
     * Returns the average length of country names.
     *
     * @param countries the list of countries
     * @return the result
     */
    Optional<Double> getAverageLengthOfCountryNames(List<Country> countries);

    /**
     * Returns all distinct regions of the countries with null area.
     *
     * @param countries the list of countries
     * @return the result
     */
    Set<Region> getRegionsHavingUnknownAreas(List<Country> countries);

    /**
     * Returns the names of countries with a non-`null` area below 1.
     *
     * @param countries the list of countries
     * @return the result
     */
    Set<String> getNamesHavingKnownAreBelowOne(List<Country> countries);

    /**
     * Returns all distinct timezones of European and Asian countries (required intermediate operation.
     *
     * @param countries the list of countries
     * @return the result
     */
    Set<ZoneId> getDistinctAsianAndEuropeanTimeZones(List<Country> countries);
}
