package model;

import java.util.regex.Pattern;

public class Candidate {
    private int candidateId;
    private String firstName;
    private String lastName;
    private String birthDate;
    private String address;
    private String phone;
    private String email;
    private int candidateType;

    final String emailRegex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
    // Birth date regex for years between 1900 and the current year
    final String birthDateRegex = "^(19\\d{2}|20[01]\\d|202[0-4])$";
    // Phone number regex (exactly 10 digits)
    final String phoneRegex = "^\\d{10}$";
    // Year of experience regex (0 to 100)
    final String expInYearRegex = "^\\d{1,2}$|^100$";
    // Graduation rank regex (one of the predefined values)
    final String graduationRankRegex = "^(Excellence|Good|Fair|Poor)$";

    public String getEmailRegex() {
        return emailRegex;
    }

    public String getBirthDateRegex() {
        return birthDateRegex;
    }

    public String getPhoneRegex() {
        return phoneRegex;
    }

    public String getExpInYearRegex() {
        return expInYearRegex;
    }

    public String getGraduationRankRegex() {
        return graduationRankRegex;
    }


    // Constants for candidate types
    public static final int EXPERIENCE = 0;
    public static final int FRESHER = 1;
    public static final int INTERN = 2;

    public int getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(int candidateId) {
        this.candidateId = candidateId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCandidateType() {
        return candidateType;
    }

    public void setCandidateType(int candidateType) {
        this.candidateType = candidateType;
    }

    public Candidate() {
    }

    public Candidate(int candidateId, String firstName, String lastName, String birthDate, String address, String phone, String email, int candidateType) {
        this.candidateId = candidateId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.candidateType = candidateType;
    }
}
