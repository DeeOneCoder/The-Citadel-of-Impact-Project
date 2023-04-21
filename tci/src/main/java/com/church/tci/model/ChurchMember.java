package com.church.tci.model;

import javax.persistence.*;

@Entity
@Table(name = "church_members")
public class ChurchMember {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "parent_contact")
    private String parentPhoneContact;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "other_name")
    private String otherName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "gender")
    private String gender;

    @Column(name = "date_of_birth")
    private String dateOfBirth;

    @Column(name = "profession")
    private String profession;

    @Column(name = "church_unit")
    private String unitMembershipInChurch;

    @Column(name = "home_fellowship")
    private String homeFellowship;

    @Column(name = "locality")
    private String areaName;

    @Column(name = "full_address")
    private String fullAddress;

    @Column(name = "nationality")
    private String nationality;

    public ChurchMember(){}

    public ChurchMember(String parentPhoneContact, String firstName, String otherName, String lastName, String email, String phoneNumber, String gender, String dateOfBirth, String profession, String unitMembershipInChurch, String homeFellowship, String areaName, String fullAddress, String nationality) {
        super();
        this.parentPhoneContact = parentPhoneContact;
        this.firstName = firstName;
        this.otherName = otherName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.profession = profession;
        this.unitMembershipInChurch = unitMembershipInChurch;
        this.homeFellowship = homeFellowship;
        this.areaName = areaName;
        this.fullAddress = fullAddress;
        this.nationality = nationality;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getParentPhoneContact() {
        return parentPhoneContact;
    }

    public void setParentPhoneContact(String parentPhoneContact) {
        this.parentPhoneContact = parentPhoneContact;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getOtherName() {
        return otherName;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getUnitMembershipInChurch() {
        return unitMembershipInChurch;
    }

    public void setUnitMembershipInChurch(String unitMembershipInChurch) {
        this.unitMembershipInChurch = unitMembershipInChurch;
    }

    public String getHomeFellowship() {
        return homeFellowship;
    }

    public void setHomeFellowship(String homeFellowship) {
        this.homeFellowship = homeFellowship;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
