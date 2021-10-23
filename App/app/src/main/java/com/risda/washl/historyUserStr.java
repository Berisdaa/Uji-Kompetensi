package com.risda.washl;

public class historyUserStr {
    private String beratLdr;
    private String username;
    private String alamatUsr;
    private String jenisCucian;

    public historyUserStr(String beratLdr, String username, String alamatLdr, String jenisCucian) {
        this.beratLdr = beratLdr;
        this.username = username;
        this.alamatUsr = alamatLdr;
        this.jenisCucian = jenisCucian;
    }

    public String getBeratLdr() {
        return beratLdr;
    }

    public void setBeratLdr(String beratLdr) {
        this.beratLdr = beratLdr;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAlamatUsr() {
        return alamatUsr;
    }

    public void setAlamatLdr(String alamatLdr) {
        this.alamatUsr = alamatLdr;
    }

    public String getJenisCucian() {
        return jenisCucian;
    }

    public void setJenisCucian(String jenisCucian) {
        this.jenisCucian = jenisCucian;
    }
}
