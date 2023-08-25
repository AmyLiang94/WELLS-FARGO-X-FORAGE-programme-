package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public  class Protfolio {

    public void setPName(String PName) {
        this.PName = PName;
    }

    @Id
    @GeneratedValue()
    private long PID;

    @Column(nullable = false)
    private long CID;

    @Column(nullable = false)
    private String PName;

    public Protfolio(long PID, long CID, String PName) {
        this.PID = PID;
        this.CID = CID;
        this.PName = PName;
    }

    public long getPID() {
        return PID;
    }

    public long getCID() {
        return CID;
    }

    public String getPName() {
        return PName;
    }
}
