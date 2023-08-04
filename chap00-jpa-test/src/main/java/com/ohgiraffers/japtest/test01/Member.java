package com.ohgiraffers.japtest.test01;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tbl_member")
public class Member {

    @Id
    @Column(name = "member_code")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int memberCode;

    @Column(name = "member_name")
    private String memberName;

    @Column(name = "member_age")
    private int memberAge;

    @Column(name ="zip_code")
    private int zipCode;

    @Column(name = "general_address")
    private String gemetaAdderss;

    @Column(name = "detailed_address")
    private String detailedAddress;



    public Member() {
    }

    public Member(int memberCode, String memberName, int memberAge, int zipCode, String gemetaAdderss, String detailedAddress) {
        this.memberCode = memberCode;
        this.memberName = memberName;
        this.memberAge = memberAge;
        this.zipCode = zipCode;
        this.gemetaAdderss = gemetaAdderss;
        this.detailedAddress = detailedAddress;
    }


    public int getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(int memberCode) {
        this.memberCode = memberCode;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public int getMemberAge() {
        return memberAge;
    }

    public void setMemberAge(int memberAge) {
        this.memberAge = memberAge;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getGemetaAdderss() {
        return gemetaAdderss;
    }

    public void setGemetaAdderss(String gemetaAdderss) {
        this.gemetaAdderss = gemetaAdderss;
    }

    public String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress;
    }



    @Override
    public String toString() {
        return "Member{" +
                "memberCode=" + memberCode +
                ", memberName='" + memberName + '\'' +
                ", memberAge='" + memberAge + '\'' +
                ", zipCode=" + zipCode +
                ", gemetaAdderss='" + gemetaAdderss + '\'' +
                ", detailedAddress='" + detailedAddress + '\'' +
                '}';
    }
}
