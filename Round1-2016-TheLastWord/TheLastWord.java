import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;

public class TheLastWord {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = in.nextInt(); // Scanner has functions to read ints, longs,
								// strings, chars, etc.
		in.nextLine();
		for (int i = 1; i <= t; ++i) {

			String input = in.nextLine();
			String finalString = input.charAt(0) + "";

			if (input.length() == 1) {
				System.out.println("Case #" + i + ": " + finalString);
				continue;
			}

			for (int k = 1; k < input.length(); k++) {
				if (input.charAt(k) >= finalString.charAt(0)) {
					finalString = input.charAt(k) + finalString;
				} else {
					finalString = finalString + input.charAt(k);
				}
			}
			System.out.println("Case #" + i + ": " + finalString);
		}
	}
}