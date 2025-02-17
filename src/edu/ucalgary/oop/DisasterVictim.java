package edu.ucalgary.oop;

public class DisasterVictim {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private final int ASSIGNED_SOCIAL_ID = 123121;
    private final String ENTRY_DATE;
    private String gender;
    private String comments;
    private static int counter;
    private FamilyRelation familyConnection;
    private Supply personalBelongings;
    private MedicalRecord medicalRecords;

    public DisasterVictim(String firstName, String ENTRY_DATE) {
        this.firstName = firstName;
        this.ENTRY_DATE = ENTRY_DATE;
    }

    public DisasterVictim(String firstName, String ENTRY_DATE, String dateOfBirth) {
        this.firstName = firstName;
        this.ENTRY_DATE = ENTRY_DATE;
        this.dateOfBirth = dateOfBirth;
    }



    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public String getDateOfBirth() {return dateOfBirth;}
    public String getGender() {return gender;}
    public String getComments() {return comments;}
    public int getAssignedSocialId() {return ASSIGNED_SOCIAL_ID;}
    public String getEntryDate() {return ENTRY_DATE;}


    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public void setDateOfBirth(String dateOfBirth) {this.dateOfBirth = dateOfBirth;}
    public void setGender(String gender) {this.gender = gender;}
    public void setComments(String comments) {this.comments = comments;}






}
