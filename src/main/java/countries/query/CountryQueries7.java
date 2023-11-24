package countries.query;

import countries.model.Region;

import java.util.Map;
import java.util.Optional;

/**
 * Defines query methods for Country objects.
 */
public interface CountryQueries7 {
    /**
     * Returns the longest country name translation.
     *
     * @return the result
     */
    Optional<String> getLongestTranslation();

    /**
     * Returns the longest Italian (i.e., `"it"`) country name translation.
     *
     * @return the result
     */
    Optional<String> getLongestItalianTranslation();

    /**
     * Returns the longest country name translation together with its language code in the form language=translation.
     *
     * @return the result
     */
    Optional<String> getLongestTranslationWithLanguageCode();

    /**
     * Returns the country name with the most number of `'e'` characters ignoring case.
     *
     * @return the result
     */
    Optional<String> getCountryNameHavingMostOfELettersIgnoringCase();

    /**
     * Returns the capital with the most number of English vowels (i.e., `'a'`, `'e'`, `'i'`, `'o'`, `'u'`).
     *
     * @return the result
     */
    Optional<String> getCapitalHavingMostOfVowels();

    /**
     * Returns the list of capitals by region whose name is the same is the same as the name of their country.
     *
     * @return the result
     */
    Map<Region, String> getCapitalsThatAreAlsoCountryNamesByRegions();
}
