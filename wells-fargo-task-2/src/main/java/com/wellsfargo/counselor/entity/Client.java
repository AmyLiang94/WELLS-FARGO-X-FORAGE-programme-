package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Client {

    @Id
    @GeneratedValue()
    private long CID;;

    @Column(nullable = false)
    //PK
    private long advisorId;
    @Column(nullable = false)

    private String CName;
    @Column(nullable = false)

    private String Phone;

    public Client(long CID, long advisorId, String CName, String Phone) {
        this.CID = CID;
        this.advisorId = advisorId;
        this.CName = CName;
        this.Phone = Phone;
    }

    public long getClientId() {
        return CID;
    }

    public long getAdvisorId() {
        return advisorId;
    }

    public String getName() {
        return CName;
    }

    public String getPhoneNumber() {
        return Phone;
    }

    public void setAdvisorId(long advisorId) {
        this.advisorId = advisorId;
    }

    public void setCName(String CName) {
        this.CName = CName;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }
}
