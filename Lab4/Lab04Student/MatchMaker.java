import java.util.List;
/**
 * Defines an interface for an object that encapsulates a search algorithm.
 *
 * @author Franklin University
 * @version Winter 2014
 */

public interface MatchMaker
{
	/**
	 * Finds all the items in the list that matches the criterion.
	 *
	 * @param  criterion the string to be matched
	 * @param  items the list to be searched for a match
	 * @return	the list of matching items
	 */
	List<MediaItem> search(String criterion, List<MediaItem> items);
}
