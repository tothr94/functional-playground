package countries.query;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface BasicQueries {
    /**
     * Returns the set of odd numbers between start and end (inclusive).
     *
     * @param start the start of the interval
     * @param end   the end of the interval
     * @return the set of numbers
     */
    Set<Integer> getOddNumberSetBetween(int start, int end);

    /**
     * Returns the sorted list of odd numbers between start and end (inclusive).
     *
     * @param start the start of the interval
     * @param end   the end of the interval
     * @return the list of numbers
     */
    List<Integer> getOddNumberListBetween(int start, int end);

    /**
     * Returns the set of prime numbers between start and end (inclusive).
     *
     * @param start the start of the interval
     * @param end   the end of the interval
     * @return the set of numbers
     */
    Set<Integer> getPrimeNumberSetBetween(int start, int end);

    /**
     * Returns the sorted list of prime numbers between start and end (inclusive).
     *
     * @param start the start of the interval
     * @param end   the end of the interval
     * @return the list of numbers
     */
    List<Integer> getPrimeNumberListBetween(int start, int end);

    /**
     * Returns a dictionary which maps the numbers of interval [start, end] to their squares.
     *
     * @param start the start of the interval
     * @param end   the end of the interval
     * @return the map of numbers
     */
    Map<Integer, Integer> getSquaresBetween(int start, int end);

    /**
     * Returns a set which contains the prime numbers from the given set.
     *
     * @param numbers the numbers
     * @return the prime numbers
     */
    Set<Integer> filterPrimes(Set<Integer> numbers);

    /**
     * Returns the unique values of the given list.
     *
     * @param numbers the numbers
     * @return the unique values
     */
    Set<Integer> getUniqueNumbers(List<Integer> numbers);

    /**
     * Returns a merged list which contains all the values of the given lists.
     *
     * @param first  the first list
     * @param second the second list
     * @return the merged list
     */
    List<Integer> mergeLists(List<Integer> first, List<Integer> second);
}
