package countries.query;

import countries.model.Country;
import countries.model.Region;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface CountryQueries7 {
    /**
     * Returns the longest country name translation.
     *
     * @param countries the list of countries
     * @return the result
     */
    Optional<String> getLongestTranslation(List<Country> countries);

    /**
     * Returns the longest Italian (i.e., `"it"`) country name translation.
     *
     * @param countries the list of countries
     * @return the result
     */
    Optional<String> getLongestItalianTranslation(List<Country> countries);

    /**
     * Returns the longest country name translation together with its language code in the form language=translation.
     *
     * @param countries the list of countries
     * @return the result
     */
    Optional<String> getLongestTranslationWithLanguageCode(List<Country> countries);

    /**
     * Returns the country name with the most number of `'e'` characters ignoring case.
     *
     * @param countries the list of countries
     * @return the result
     */
    Optional<String> getCountryNameHavingMostOfELettersIgnoringCase(List<Country> countries);

    /**
     * Returns the capital with the most number of English vowels (i.e., `'a'`, `'e'`, `'i'`, `'o'`, `'u'`).
     *
     * @param countries the list of countries
     * @return the result
     */
    Optional<String> getCapitalHavingMostOfVowels(List<Country> countries);

    /**
     * Returns the list of capitals by region whose name is the same is the same as the name of their country.
     *
     * @param countries the list of countries
     * @return the result
     */
    Map<Region, String> getCapitalsThatAreAlsoCountryNamesByRegions(List<Country> countries);
}
