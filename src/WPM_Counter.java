import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class WPM_Counter {

	public static void main(String[] args) throws InterruptedException
	{
		String[] words = {"algorithm","brain","convert","decorate","earth","fabulous","green",
				          "hash","introduction","jackpot","knight","label","machine","newsletter",
				          "object","piano","queue","radiation","syntax","technology","umbrella",
				          "valid","whistle","xerox","yellow","zombie"};

		System.out.println("You can start typing after 3 seconds");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("3");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("2");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("1");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("\nLet's Go..");
		
		Random rand = new Random();
		for(int i=0;i<12;i++) {
			System.out.print(words[rand.nextInt(25)] + " ");
		}
		System.out.println();
		
		double start = LocalTime.now().toNanoOfDay();
		
		Scanner scan = new Scanner(System.in);
		String typedWords = scan.nextLine();
		
		double end = LocalTime.now().toNanoOfDay();
		double elapsedTime = end - start;
		double seconds = elapsedTime / 1000000000.0;
		int numChars = typedWords.length();
		int words_per_minute = (int)((((double) numChars/5) / seconds)*60);
		System.out.println("Your words per minute is "+ words_per_minute + "..!");
		scan.close();
	}
}
