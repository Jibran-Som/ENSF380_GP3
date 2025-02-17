package edu.ucalgary.oop;

import java.util.List;
import java.util.ArrayList;

public class DisasterVictim {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private final int ASSIGNED_SOCIAL_ID;
    private final String ENTRY_DATE;
    private String gender;
    private String comments;
    private static int counter = 10000;
    private List<FamilyRelation> familyConnections;
    private List<Supply> personalBelongings;
    private ArrayList<MedicalRecord> medicalRecords;

    public DisasterVictim(String firstName, String ENTRY_DATE) {
        this.firstName = firstName;
        this.ENTRY_DATE = ENTRY_DATE;
        this.ASSIGNED_SOCIAL_ID = counter++;
        this.familyConnections = new ArrayList<>();
        this.personalBelongings = new ArrayList<>();
        this.medicalRecords = new ArrayList<>();

    }

    public DisasterVictim(String firstName, String ENTRY_DATE, String dateOfBirth) {
        this.firstName = firstName;
        this.ENTRY_DATE = ENTRY_DATE;
        this.dateOfBirth = dateOfBirth;
        this.ASSIGNED_SOCIAL_ID = counter++;
        this.familyConnections = new ArrayList<>();
        this.personalBelongings = new ArrayList<>();
        this.medicalRecords = new ArrayList<>();

    }



    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public String getDateOfBirth() {return dateOfBirth;}
    public String getGender() {return gender;}
    public String getComments() {return comments;}
    public int getAssignedSocialID() {return ASSIGNED_SOCIAL_ID;}
    public String getEntryDate() {return ENTRY_DATE;}
    public List<FamilyRelation> getFamilyConnections() {return familyConnections;}
    public List<Supply> getPersonalBelongings() {return personalBelongings;}
    public ArrayList<MedicalRecord> getMedicalRecords() {return medicalRecords;}




    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public void setDateOfBirth(String dateOfBirth) {this.dateOfBirth = dateOfBirth;}
    public void setGender(String gender) {this.gender = gender;}
    public void setComments(String comments) {this.comments = comments;}
    public void setPersonalBelongings(List<Supply> personalBelongings) {
        this.personalBelongings = personalBelongings;
    }
    public void setMedicalRecords(ArrayList<MedicalRecord> medicalRecords) {
        this.medicalRecords = medicalRecords;
    }
    public void setFamilyConnections(List<FamilyRelation> familyConnections) {
        this.familyConnections = familyConnections;
    }


    public void addPersonalBelonging(Supply newSupply) {
        personalBelongings.add(newSupply);
    }

    public void addMedicalRecord(MedicalRecord newMedicalRecord) {
        medicalRecords.add(newMedicalRecord);
    }

    public void addFamilyConnection(FamilyRelation newFamilyConnection) {
        familyConnections.add(newFamilyConnection);
    }


    public void removeFamilyConnection(FamilyRelation exFamilyConnection) {
        familyConnections.remove(exFamilyConnection);
    }

    public void removePersonalBelonging(Supply exSupply) {
        personalBelongings.remove(exSupply);
    }










}
