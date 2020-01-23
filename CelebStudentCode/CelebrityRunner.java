/**
 * Starts the Celebrity Game application
 * @author cody.henrichsen
 *
 */
public class CelebrityRunner
{
	/**
	 * The entry point of the Java application.
	 * @param args Unused parameter as it is a GUI based program.
	 */
	public static void main(String [] args)
	{
	    Celebrity ping = new Celebrity("Xi Jinping", "President of China");
	    System.out.println(ping.getClue());
	    System.out.println(ping.getAnswer());
	    ping.setClue("Crusty Boi");
	    ping.setAnswer("Xiping");
	    System.out.println(ping.getClue());
	    System.out.println(ping.getAnswer());
	}
}
