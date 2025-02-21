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
    private FamilyRelation[] familyConnections;
    private Supply[] personalBelongings;
    private MedicalRecord[] medicalRecords;

    public DisasterVictim(String firstName, String ENTRY_DATE) {
        if(!(isValidDateFormat(ENTRY_DATE))) {
            throw new IllegalArgumentException("Invalid date format");
        }
        this.firstName = firstName;
        this.ENTRY_DATE = ENTRY_DATE;
        this.ASSIGNED_SOCIAL_ID = generateSocialID();
        this.familyConnections = new FamilyRelation[10];
        this.personalBelongings = new Supply[10];
        this.medicalRecords = new MedicalRecord[10];

    }

    public DisasterVictim(String firstName, String ENTRY_DATE, String dateOfBirth) {
        if(!(isValidDateFormat(ENTRY_DATE))) {
            throw new IllegalArgumentException("Invalid date format");
        }
        if(!(isValidDateFormat(dateOfBirth))) {
            throw new IllegalArgumentException("Invalid date format");
        }
        if(convertDateStringToInt(dateOfBirth) > convertDateStringToInt(ENTRY_DATE)) {
            throw new IllegalArgumentException("Invalid Entry Date");
        }
        this.firstName = firstName;
        this.ENTRY_DATE = ENTRY_DATE;
        this.dateOfBirth = dateOfBirth;
        this.ASSIGNED_SOCIAL_ID = generateSocialID();
        this.familyConnections = new FamilyRelation[10];
        this.personalBelongings = new Supply[10];
        this.medicalRecords = new MedicalRecord[10];

    }



    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public String getDateOfBirth() {return dateOfBirth;}
    public String getGender() {return gender;}
    public String getComments() {return comments;}
    public int getAssignedSocialID() {return ASSIGNED_SOCIAL_ID;}
    public String getEntryDate() {return ENTRY_DATE;}
    public FamilyRelation[] getFamilyConnections() {return familyConnections;}
    public Supply[] getPersonalBelongings() {return personalBelongings;}
    public MedicalRecord[] getMedicalRecords() {return medicalRecords;}




    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public void setDateOfBirth(String dateOfBirth) {
        if(!(isValidDateFormat(dateOfBirth))) {
            throw new IllegalArgumentException("Invalid date format");
        }
        this.dateOfBirth = dateOfBirth;}
    public void setGender(String gender) {this.gender = gender;}
    public void setComments(String comments) {this.comments = comments;}
    public void setPersonalBelongings(Supply[] personalBelongings) {
        this.personalBelongings = personalBelongings;
    }
    public void setMedicalRecords(MedicalRecord[] medicalRecords) {
        this.medicalRecords = medicalRecords;
    }
    public void setFamilyConnections(FamilyRelation[] familyConnections) {
        this.familyConnections = familyConnections;
    }


    public void addPersonalBelonging(Supply newSupply) {
        int null_index = -1;
        for (int i = 0; i < personalBelongings.length; i++) {
            if (personalBelongings[i] == null) {
                null_index = i;
                break;
            }
        }
        if (null_index == -1) {
            Supply[] newPersonalBelongings = new Supply[personalBelongings.length + 1];
            System.arraycopy(personalBelongings, 0, newPersonalBelongings, 0, personalBelongings.length);
            personalBelongings = newPersonalBelongings;

            personalBelongings[personalBelongings.length - 1] = newSupply;
        }

        else {
            personalBelongings[null_index] = newSupply;
        }





    }

    public void addMedicalRecord(MedicalRecord newMedicalRecord) {
        int null_index = -1;
        for (int i = 0; i < medicalRecords.length; i++) {
            if (medicalRecords[i] == null) {
                null_index = i;
                break;
            }
        }
        if (null_index == -1) {
            MedicalRecord[] newMedicalRecords = new MedicalRecord[medicalRecords.length + 1];
            System.arraycopy(medicalRecords, 0, newMedicalRecords, 0, medicalRecords.length);
            medicalRecords = newMedicalRecords;
            medicalRecords[medicalRecords.length - 1] = newMedicalRecord;
        }
        else {
            medicalRecords[null_index] = newMedicalRecord;
        }

    }

    public void addFamilyConnection(FamilyRelation newFamilyConnection) {
        int null_index = -1;
        for (int i = 0; i < familyConnections.length; i++) {
            if (familyConnections[i] == null) {
                null_index = i;
            }
        }
        if (null_index == -1) {
            FamilyRelation[] newFamilyConnections = new FamilyRelation[familyConnections.length + 1];
            System.arraycopy(familyConnections, 0, newFamilyConnections, 0, familyConnections.length);
            familyConnections = newFamilyConnections;
            familyConnections[familyConnections.length - 1] = newFamilyConnection;
        }
        else {
            familyConnections[null_index] = newFamilyConnection;
        }

    }


    public void removeFamilyConnection(FamilyRelation exFamilyConnection) {
        for (int i = 0; i < familyConnections.length; i++) {
            if (familyConnections[i] == exFamilyConnection) {
                familyConnections[i] = null;
            }
        }

    }

    public void removePersonalBelonging(Supply exSupply) {
        for (int i = 0; i < personalBelongings.length; i++) {
            if (personalBelongings[i] == exSupply) {
                personalBelongings[i] = null;
            }
        }

    }

    private static boolean isValidDateFormat(String date) {
        if (date == null || date.length() != 10) {
            return false;
        }

        if (date.charAt(4) != '-' || date.charAt(7) != '-') {
            return false;
        }

        String yearStr = date.substring(0, 4);
        String monthStr = date.substring(5, 7);
        String dayStr = date.substring(8, 10);


        int year = Integer.parseInt(yearStr);
        int month = Integer.parseInt(monthStr);
        int day = Integer.parseInt(dayStr);

        if (month < 1 || month > 12) {
            return false;
        }

        if (day < 1 || day > 31) {
            return false;
        }

        if(year < 1900 || year > 2026) {
            return false;
        }

        return true;

    }

    private static int convertDateStringToInt(String dateStr){

        String yearStr = dateStr.substring(0, 4);
        String monthStr = dateStr.substring(5, 7);
        String dayStr = dateStr.substring(8, 10);


        int year = Integer.parseInt(yearStr);
        int month = Integer.parseInt(monthStr);
        int day = Integer.parseInt(dayStr);

        return year * 10000 + month * 100 + day;

    }
    
    private static int generateSocialID() {
    	return counter++;
    }












}
