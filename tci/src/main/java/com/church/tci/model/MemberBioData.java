package com.church.tci.model;

import javax.persistence.*;

@Entity(name = "bio_data")
public class MemberBioData {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "member_name")
    private String memberName;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "church_member_id")
    private ChurchMember churchMember;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "passport", columnDefinition = "BLOB NOT NULL")
    private byte[] passportPhotograph;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "leftFinger", columnDefinition = "BLOB NOT NULL")
    private byte[] leftFingerPrint;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "rightFinger", columnDefinition = "BLOB NOT NULL")
    private byte[] rightFingerPrint;

    public ChurchMember getChurchMember() {
        return churchMember;
    }

    public void setChurchMember(ChurchMember churchMember) {
        this.churchMember = churchMember;
    }

    public MemberBioData(){

    }

    public MemberBioData(String memberName, byte[] passportPhotograph, byte[] leftFingerPrint, byte[] rightFingerPrint) {
        super();
        this.memberName = memberName;
        this.passportPhotograph = passportPhotograph;
        this.leftFingerPrint = leftFingerPrint;
        this.rightFingerPrint = rightFingerPrint;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public byte[] getPassportPhotograph() {
        return passportPhotograph;
    }

    public void setPassportPhotograph(byte[] passportPhotograph) {
        this.passportPhotograph = passportPhotograph;
    }

    public byte[] getLeftFingerPrint() {
        return leftFingerPrint;
    }

    public void setLeftFingerPrint(byte[] leftFingerPrint) {
        this.leftFingerPrint = leftFingerPrint;
    }

    public byte[] getRightFingerPrint() {
        return rightFingerPrint;
    }

    public void setRightFingerPrint(byte[] rightFingerPrint) {
        this.rightFingerPrint = rightFingerPrint;
    }
}
