package com.risda.washl.login;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class LoginResponseOwner implements Serializable {
    @SerializedName("pesan")
    @Expose
    private String pesan;
    @SerializedName("data")
    @Expose
    private LoginRequestOwner data;

    public String getPesan() {
        return pesan;
    }

    public void setPesan(String pesan) {
        this.pesan = pesan;
    }

    public LoginRequestOwner getData() {
        return data;
    }

    public void setData(LoginRequestOwner data) {
        this.data = data;
    }
}
