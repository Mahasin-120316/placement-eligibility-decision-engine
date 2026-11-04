import java.util.Scanner;

class GraduationYearRule extends EligibilityRule {
    @Override
    public String getRuleName() {
        return "Graduation Year";
    }

    @Override
    public boolean check(Candidate candidate, Job job) {
        return candidate.getGraduationYear() == job.getRequiredGraduationYear();
    }
}

public class Check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        double percentage = scanner.nextDouble();
        int backlogs = scanner.nextInt();
        int graduationYear = scanner.nextInt();

        Candidate candidate = new Candidate(
                name,
                percentage,
                backlogs,
                graduationYear);

        Job job = new Job(
                "Infosys",
                "Java Developer",
                65.0,
                0,
                2026);

        // Instantiate rule objects
        EligibilityRule percentageRule = new PercentageRule();
        EligibilityRule backlogRule = new BacklogRule();
        EligibilityRule yearRule = new GraduationYearRule();

        // Check rules
        boolean percentagePass = percentageRule.check(candidate, job);
        boolean backlogPass = backlogRule.check(candidate, job);
        boolean yearPass = yearRule.check(candidate, job);

        boolean eligible = percentagePass && backlogPass && yearPass;

        System.out.println("===================================");
        System.out.println("PLACEMENT ELIGIBILITY RESULT");
        System.out.println("===================================");
        System.out.println();

        System.out.println("Candidate : " + candidate.getName());
        System.out.println("Company : " + job.getCompany());
        System.out.println("Role : " + job.getRole());
        System.out.println();

        if (percentagePass) {
            System.out.println(percentageRule.getRuleName() + ": PASS");
        } else {
            System.out.println(percentageRule.getRuleName() + ": FAIL");
        }

        if (backlogPass) {
            System.out.println(backlogRule.getRuleName() + ": PASS");
        } else {
            System.out.println(backlogRule.getRuleName() + ": FAIL");
        }

        if (yearPass) {
            System.out.println(yearRule.getRuleName() + " : PASS");
        } else {
            System.out.println(yearRule.getRuleName() + " : FAIL");
        }

        System.out.println();

        if (eligible) {
            System.out.println("Final Result : ELIGIBLE");
        } else {
            System.out.println("Final Result : NOT ELIGIBLE");
        }
        System.out.println();

        scanner.close();
    }
}
