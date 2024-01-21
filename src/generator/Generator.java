package generator;

public class Generator {
    /**
     * Generates a key for the check for understanding.
     */
    public static void generateAssessmentKey() {
        System.out.println("\n*********************************************************");
        int code = "Moving on to Sprint 1!".hashCode() % 9999;
        System.out.println("You will verify this project ran correctly in the");
        System.out.println("\"Environment Setup: Check for understanding\" task.");
        System.out.println();
        System.out.println("If you are prompted in that task for the key,");
        System.out.println("the JDK11 Environment Setup key is:  " + code);
        System.out.println("*********************************************************");
    }
}
