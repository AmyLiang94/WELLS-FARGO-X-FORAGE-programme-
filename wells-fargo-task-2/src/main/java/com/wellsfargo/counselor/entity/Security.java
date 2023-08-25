package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Security {

    @Id
    @GeneratedValue()
    private long SID;

    public void setPName(String PName) {
        this.PName = PName;
    }

    @Column(nullable = false)
    private long CID;

    @Column(nullable = false)
    private String PName;

    public Security(long SID, long CID, String PName) {
        this.SID = SID;
        this.CID = CID;
        this.PName = PName;
    }

    public long getSID() {
        return SID;
    }

    public long getCID() {
        return CID;
    }

    public String getPName() {
        return PName;
    }
}
