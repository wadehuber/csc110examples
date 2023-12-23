package videoexamples.exceptions.creatingexcept;

/**
 * ElementNotFoundException represents the situation in which a target element 
 * is not present in a collection
 *
 * @author Java Foundations
 * @version 4.0
 */
public class YouDidTheWrongThingException extends RuntimeException
{
	/**
	 * Sets up this exception with an appropriate message.
	 */
	public YouDidTheWrongThingException (String message)
	{
		super ("OOPS! You did the wrong thing : " + message);
	}
}
