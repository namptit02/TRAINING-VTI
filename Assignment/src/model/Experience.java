package model;

public class Experience extends Candidate {
    private int ExpInYear;
    private String ProSkill;

//    public Experience(int expInYear, String proSkill) {
//        ExpInYear = expInYear;
//        ProSkill = proSkill;
//    }

    public Experience(int candidateId, String firstName, String lastName, String birthDate, String address, String phone, String email, int candidateType, int expInYear, String proSkill) {
        super(candidateId, firstName, lastName, birthDate, address, phone, email, candidateType);
        ExpInYear = expInYear;
        ProSkill = proSkill;
    }

    public int getExpInYear() {
        return ExpInYear;
    }

    public void setExpInYear(int expInYear) {
        ExpInYear = expInYear;
    }

    public String getProSkill() {
        return ProSkill;
    }

    public void setProSkill(String proSkill) {
        ProSkill = proSkill;
    }
}
