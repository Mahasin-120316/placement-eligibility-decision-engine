import java.util.Arrays;
import java.util.Scanner;

public class Job {
    private String company;
    private String role;
    private double minimumPercentage;
    private int maximumBacklogs;
    private int requiredGraduationYear;
    private String[] requiredSkills;

    // 6-parameter constructor
    public Job(
            String company,
            String role,
            double minimumPercentage,
            int maximumBacklogs,
            int requiredGraduationYear,
            String[] requiredSkills) {
        this.company = company;
        this.role = role;
        this.minimumPercentage = minimumPercentage;
        this.maximumBacklogs = maximumBacklogs;
        this.requiredGraduationYear = requiredGraduationYear;
        this.requiredSkills = requiredSkills;
    }

    public String getCompany() {
        return company;
    }

    public String getRole() {
        return role;
    }

    public double getMinimumPercentage() {
        return minimumPercentage;
    }

    public int getMaximumBacklogs() {
        return maximumBacklogs;
    }

    public int getRequiredGraduationYear() {
        return requiredGraduationYear;
    }

    public String[] getRequiredSkills() {
        return requiredSkills;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        double percentage = scanner.nextDouble();
        int backlogs = scanner.nextInt();
        int graduationYear = scanner.nextInt();
        int skillCount = scanner.nextInt();
        String[] skills = new String[skillCount];
        for (int i = 0; i < skillCount; i++) {
            skills[i] = scanner.next();
        }
        String[] requiredSkills = {"Java", "SQL"};

        Candidate candidate = new Candidate(
                name,
                percentage,
                backlogs,
                graduationYear,
                skills);

        Job job = new Job(
                "Infosys",
                "Java Developer",
                65.0,
                0,
                2026,
                requiredSkills);

        System.out.println("Candidate: " + candidate.getName());
        System.out.println("Company: " + job.getCompany());
        System.out.println("Role: " + job.getRole());
        System.out.println("Minimum Percentage: " + job.getMinimumPercentage());
        System.out.println("Maximum Backlogs: " + job.getMaximumBacklogs());
        System.out.println("Required Graduation Year: " + job.getRequiredGraduationYear());
        System.out.println("Required Skills: " + Arrays.toString(job.getRequiredSkills()));

        scanner.close();
    }
}
