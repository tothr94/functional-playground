package countries.query;

import countries.model.Country;
import countries.model.Region;
import lombok.NonNull;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

/**
 * Defines query methods for Country objects.
 */
public interface CountryQueries4 {

    /**
     * Returns a dictionary which maps each country code to the corresponding country.
     *
     * @param countries the list of countries
     * @return the dictionary
     */
    Map<String, Country> getCountriesByCodes(
            @NonNull List<Country> countries);

    /**
     * Returns a dictionary which maps each region to the count of its countries.
     *
     * @param countries the list of countries
     * @return the dictionary
     */
    Map<Region, Long> getCountOfCountriesByRegions(
            @NonNull List<Country> countries);

    /**
     * Returns a dictionary which maps each region to its countries.
     *
     * @param countries the list of countries
     * @return the dictionary
     */
    Map<Region, Set<Country>> getCountriesByRegions(
            @NonNull List<Country> countries);

    /**
     * Returns a dictionary which maps each region to its most populous country.
     *
     * @param countries the list of countries
     * @return the dictionary
     */
    Map<Region, Optional<Country>> getMostPopulousCountryByRegions(
            @NonNull List<Country> countries);

    /**
     * Returns a dictionary which maps each region the list of its countries ordered by their capital names to their continent.
     *
     * @param countries the list of countries
     * @return the dictionary
     */
    Map<Region, List<Country>> getCountriesByRegionsOrderByCapitals(
            @NonNull List<Country> countries);

    /**
     * Returns a dictionary which maps each region to the corresponding countries which population is between the given bounds (inclusive) to their continent.
     *
     * @param countries  the list of countries
     * @param lowerBound the lower bound
     * @param upperBound the upper bound
     * @return the dictionary
     */
    Map<Region, Set<Country>> getCountriesByRegionsFilterByPopulation(
            @NonNull List<Country> countries,
            long lowerBound,
            long upperBound);

    /**
     * Returns a dictionary which maps each region to the corresponding country codes, then each country code to the corresponding country.
     *
     * @param countries the list of countries
     * @return the dictionary
     */
    Map<Region, Map<String, Country>> getCountriesByRegionsAndCodes(
            @NonNull List<Country> countries);

    /**
     * Returns a dictionary which maps region to the letters that occur in the first place of corresponding
     * country names, then each letter to the corresponding countries.
     *
     * @param countries the list of countries
     * @return the dictionary
     */
    Map<Region, Map<String, Set<Country>>> getCountriesByRegionsAndFirstLetters(
            @NonNull List<Country> countries);

    /**
     * Returns a dictionary which maps the letters that occur in the first place of corresponding
     * country names to regions, then each letter to the corresponding countries.
     *
     * @param countries the list of countries
     * @return the dictionary
     */
    Map<String, Map<Region, Set<Country>>> getCountriesByFirstLettersAndRegions(
            @NonNull List<Country> countries);

    /**
     * Returns a dictionary which maps each region to the set of country names, using the given locale.
     *
     * @param countries the list of countries
     * @param locale    the locale
     * @return the dictionary
     */
    Map<Region, Set<String>> getLocalizedCountryNamesByRegions(
            @NonNull List<Country> countries,
            @NonNull String locale);

    /**
     * Returns a dictionary which maps each locale to the corresponding country names.
     *
     * @param countries the list of countries
     * @return the dictionary
     */
    Map<String, Set<String>> getCountryNamesByLocales(
            @NonNull List<Country> countries);

    /**
     * Returns a dictionary which maps each locale to the corresponding country names which countries are located in the given region.
     *
     * @param countries the list of countries
     * @param region    the region
     * @return the dictionary
     */
    Map<String, Set<String>> getCountryNamesByLocales(
            @NonNull List<Country> countries,
            @NonNull Region region);

    /**
     * Returns a dictionary which maps each region to the country name which is the first in the given locale.
     *
     * @param countries the list of countries
     * @param locale    the locale
     * @return the dictionary
     */
    Map<Region, Optional<String>> getFirstLocalizedCountryNamesByRegions(
            @NonNull List<Country> countries,
            @NonNull String locale);

    /**
     * Returns a dictionary which maps each region to the country which name is the first in the given locale.
     *
     * @param countries the list of countries
     * @param locale    the locale
     * @return the dictionary
     */
    Map<Region, Optional<Country>> getFirstLocalizedCountriesByRegions(
            @NonNull List<Country> countries,
            @NonNull String locale);
}
