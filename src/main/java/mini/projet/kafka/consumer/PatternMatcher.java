package mini.projet.kafka.consumer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import mini.projet.main.Conf;

public class PatternMatcher {
	private static Pattern pattern;
	private static Matcher matcher;

	public static boolean matchFacture(String line) {
		pattern = Pattern.compile(Conf.REGEX_PATTERN_FACTUR);
		matcher = pattern.matcher(line);
		if (matcher.find())
			return matcher.matches() && !(matcher.group(2).split("\\|").length == 11);
		return false;
	}
}
