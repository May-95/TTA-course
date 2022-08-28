
public class Results {

	// variables holding exam results, exam total and percentage.
	static int biology = 120;
	static int chemistry = 99;
	static int physics = 80;
	static int total;
	static int percentage;

	// method calculating exam result
	public static void results(int biology, int chemistry, int physics) {
		// total mark for exams is calculated.
		total = biology + chemistry + physics;

		// exam results for each subject printed out to console.
		System.out.println("Your exam results are:");
		System.out.println("Biology: " + biology);
		System.out.println("Chemistry: " + chemistry);
		System.out.println("Physics: " + physics);
		System.out.println("Total mark: " + total + " out of 450.");
	}

	// method calculating exam percentage.
	public static void percentage(int total) {
		// percentage calculated.
		percentage = (total * 100) / 450;

		// overall result percentage printed to the console.
		System.out.println("Your overall exam result is " + percentage + "%.");
	}

	// main method calculating student's results and percentage.
	public static void main(String[] args) {
		results(biology, chemistry, physics);
		percentage(total);

		// if statement calculating if overall percentage is over 60%. Custom message
		// printed out to console depending on whether overall percentage is over 60%.
		if (percentage >= 60) {
			System.out.println("Congratulations, you have passed! Your overall exam results are over 60%.");
		} else {
			System.out.println("Unfortunately, you have failed. Your overall exam results are under 60%.");
		}
		;
	}
}
