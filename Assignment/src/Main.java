import model.Candidate;
import model.Experience;
import model.Fresher;
import model.Intern;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    static final ArrayList<Candidate> candidates = new ArrayList<>();
    static int candidateIdCounter = 1;

    public static void main(String[] args) {
        while (true) {
            System.out.println("----------MENU-----------");
            System.out.println("1. Experience");
            System.out.println("2. Fresher");
            System.out.println("3. Internship");
            System.out.println("4. Searching");
            System.out.println("5. Exit");
            System.out.println("-------------------------");
            System.out.print("Chon chuc nang: ");
            int chucNang = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (chucNang) {
                case 1:
                    createExperienceCandidate();
                    break;
                case 2:
                     createFresherCandidate();
                    break;
                case 3:
                    createInternshipCandidate(); // Implement similar to createExperienceCandidate
                    break;
                case 4:
                     searchCandidates(); // Implement search functionality
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void createExperienceCandidate() {
        while (true) {
            Candidate candidate = new Candidate();
            System.out.println("\nCreating Experience Candidate:");
            String firstName = getInput("First Name: ");
            String lastName = getInput("Last Name: ");
            String birthDate = getValidatedInput("Birth Date (YYYY): ", candidate.getBirthDateRegex() );
            String address = getInput("Address: ");
            String phone = getValidatedInput("Phone: ", candidate.getPhoneRegex());
            String email = getValidatedInput("Email: ", candidate.getEmailRegex());
            int expInYear = Integer.parseInt(getValidatedInput("Years of Experience: ", candidate.getExpInYearRegex()));
            String proSkill = getInput("Professional Skill: ");

            candidates.add(new Experience(candidateIdCounter++, firstName, lastName, birthDate, address, phone, email, Candidate.EXPERIENCE, expInYear, proSkill));
            if (!askContinue()) break;
        }
        System.out.println("\nExperience Candidate:");
        displayCandidates();
    }
    private static void createFresherCandidate() {
        while (true) {
            System.out.println("\nCreating Fresher Candidate:");
            Candidate candidate = new Candidate();
            String firstName = getInput("First Name: ");
            String lastName = getInput("Last Name: ");
            String birthDate = getValidatedInput("Birth Date (YYYY): ", candidate.getBirthDateRegex());
            String address = getInput("Address: ");
            String phone = getValidatedInput("Phone: ", candidate.getPhoneRegex());
            String email = getValidatedInput("Email: ", candidate.getEmailRegex());
            System.out.println("Nhap graduationDate");
            String graduationDate = getInput("Graduation Date: ");
            String graduationRank = getValidatedInput("Graduation Rank (Excellence, Good, Fair, Poor): ", candidate.getGraduationRankRegex());
            String education = getInput("Education: ");

            candidates.add(new Fresher(candidateIdCounter++, firstName, lastName, birthDate, address, phone, email, Candidate.FRESHER, graduationDate, graduationRank, education));
            if (!askContinue()) break;
        }
        displayCandidates();
    }
    private static void createInternshipCandidate() {
        while (true) {
            System.out.println("\nCreating Intern Candidate:");
            Candidate candidate = new Candidate();
            String firstName = getInput("First Name: ");
            String lastName = getInput("Last Name: ");
            String birthDate = getValidatedInput("Birth Date (YYYY): ", candidate.getBirthDateRegex());
            String address = getInput("Address: ");
            String phone = getValidatedInput("Phone: ", candidate.getPhoneRegex());
            String email = getValidatedInput("Email: ", candidate.getEmailRegex());
            System.out.println("Nhap graduationDate");
            String majors = getInput("Majors: ");
            String semester = getInput("Semester: ");
            String university = getInput("University: ");

            candidates.add(new Intern(candidateIdCounter++, firstName, lastName, birthDate, address, phone, email, Candidate.FRESHER, majors, semester, university));
            if (!askContinue()) break;
        }
        displayCandidates();
    }

    private static String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    private static String getValidatedInput(String prompt, String regex) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            if (Pattern.matches(regex, input)) {
                return input;
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }
    }

    private static boolean askContinue() {
        System.out.print("Do you want to continue (Y/N)? ");
        String choice = scanner.nextLine();
        return choice.equalsIgnoreCase("Y");
    }
    private static void searchCandidates() {
        System.out.print("Input Candidate name (First name or Last name): ");
        String name = scanner.nextLine().toLowerCase();
        System.out.print("Input type of candidate (0: Experience, 1: Fresher, 2: Intern): ");
        int type = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.println("\nThe candidates found:");
        for (Candidate candidate : candidates) {
            if ((candidate.getFirstName().toLowerCase().contains(name) || candidate.getLastName().toLowerCase().contains(name)) && candidate.getCandidateType() == type) {
                System.out.printf("%s %s | %s | %s | %s | %s | %d%n",
                        candidate.getFirstName(),
                        candidate.getLastName(),
                        candidate.getBirthDate(),
                        candidate.getAddress(),
                        candidate.getPhone(),
                        candidate.getEmail(),
                        candidate.getCandidateType());
            }
        }
    }
    private static void displayCandidates() {
        System.out.println("\nList of candidates:");
        System.out.println("===========EXPERIENCE CANDIDATE============");
        for (Candidate candidate : candidates) {
            if (candidate.getCandidateType() == Candidate.EXPERIENCE) {
                System.out.println(candidate.getFirstName() + " " + candidate.getLastName());
            }
        }
        System.out.println("==========FRESHER CANDIDATE===============");
        for (Candidate candidate : candidates) {
            if (candidate.getCandidateType() == Candidate.FRESHER) {
                System.out.println(candidate.getFirstName() + " " + candidate.getLastName());
            }
        }
        System.out.println("===========INTERN CANDIDATE===============");
        for (Candidate candidate : candidates) {
            if (candidate.getCandidateType() == Candidate.INTERN) {
                System.out.println(candidate.getFirstName() + " " + candidate.getLastName());
            }
        }
    }
}
