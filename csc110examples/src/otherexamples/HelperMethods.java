package otherexamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Utility class containing helper methods for positive-number counting, student
 * pass/fail checks, and username validation.
 */
public class HelperMethods {

	/**
	 * Determines whether the given integer is strictly positive.
	 *
	 * @param n the integer to test
	 * @return {@code true} if {@code n > 0}, otherwise {@code false}
	 */
	public static boolean isPositive(int n) {
		return n > 0;
	}

	/**
	 * Counts how many elements in the supplied array are strictly positive.
	 *
	 * @param nums the array of integers to examine (must not be {@code null})
	 * @return the number of positive values in {@code nums}
	 */
	public static int countPositive(int[] nums) {
		int count = 0;
		for (int n : nums) {
			if (isPositive(n)) {
				count++;
			}
		}
		return count;
	}

	/**
	 * Checks whether a student meets the criteria to pass the course.
	 * <p>
	 * A student passes when all of the following are true:
	 * <ul>
	 * <li>score is at least 70</li>
	 * <li>at least 8 assignments have been completed</li>
	 * <li>the student does not have an academic hold</li>
	 * </ul>
	 *
	 * @param s the student to evaluate (must not be {@code null})
	 * @return {@code true} if the student passes, otherwise {@code false}
	 */
	public static boolean passed(Student s) {
		return s.getScore() >= 70 && s.getAssignmentsCompleted() >= 8 && !s.hasAcademicHold();
	}

	/**
	 * Returns a new list containing only the students who pass the course.
	 *
	 * @param students the list of students to filter (must not be {@code null})
	 * @return a list of students who satisfy the pass criteria
	 */
	public static List<Student> passingStudents(List<Student> students) {
		List<Student> result = new ArrayList<>();
		for (Student s : students) {
			if (passed(s)) {
				result.add(s);
			}
		}
		return result;
	}

	/**
	 * Validates a username according to the following rules:
	 * <ul>
	 * <li>length is between 3 and 16 characters inclusive</li>
	 * <li>contains only alphanumeric characters</li>
	 * <li>does not start with a digit</li>
	 * </ul>
	 *
	 * @param name the username to validate (must not be {@code null})
	 * @return {@code true} if the username is valid, otherwise {@code false}
	 */
	public static boolean isValidUsername(String name) {
		return name.length() >= 3 && name.length() <= 16 && name.matches("[a-zA-Z0-9]+")
				&& !Character.isDigit(name.charAt(0));
	}

	/**
	 * Returns a new list containing only the usernames that pass validation.
	 *
	 * @param names the list of usernames to filter (must not be {@code null})
	 * @return a list of valid usernames
	 */
	public static List<String> filterValidUsernames(List<String> names) {
		List<String> result = new ArrayList<>();
		for (String name : names) {
			if (isValidUsername(name)) {
				result.add(name);
			}
		}
		return result;
	}

	/**
	 * Demonstrates the helper methods with sample data.
	 *
	 * @param args command-line arguments (ignored)
	 */
	public static void main(String[] args) {
		// ----- countPositive -----
		int[] numbers = { -3, 0, 5, 12, -1, 7 };
		System.out.println("Positive count: " + countPositive(numbers)); // 3

		// ----- passingStudents -----
		List<Student> students = Arrays.asList(new Student("Alice", 85, 10, false), new Student("Bob", 62, 9, false),
				new Student("Carol", 78, 7, false), new Student("Dave", 91, 12, true));
		List<Student> passers = passingStudents(students);
		System.out.println("Passing students:");
		for (Student s : passers) {
			System.out.println("  " + s.getName());
		}

		// ----- filterValidUsernames -----
		List<String> usernames = Arrays.asList("alice", "Bob123", "1start", "ab", "thisIsWayTooLongUsername",
				"valid_user");
		List<String> valid = filterValidUsernames(usernames);
		System.out.println("Valid usernames: " + valid);
	}
}

/**
 * Simple student model used by the helper methods.
 */
class Student {
	private final String name;
	private final int score;
	private final int assignmentsCompleted;
	private final boolean academicHold;

	public Student(String name, int score, int assignmentsCompleted, boolean academicHold) {
		this.name = name;
		this.score = score;
		this.assignmentsCompleted = assignmentsCompleted;
		this.academicHold = academicHold;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	public int getAssignmentsCompleted() {
		return assignmentsCompleted;
	}

	public boolean hasAcademicHold() {
		return academicHold;
	}
}