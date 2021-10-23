package com.risda.washl;

public class completeOrder {
    private String BeratLd;
    private String UsernameLd;
    private String AlamatLd;
    private String JenisCucianLd;

    public completeOrder(String beratLd, String usernameLd, String alamatLd, String jenisCucianLd) {
        BeratLd = beratLd;
        UsernameLd = usernameLd;
        AlamatLd = alamatLd;
        JenisCucianLd = jenisCucianLd;
    }

    public String getBeratLd() {
        return BeratLd;
    }

    public void setBeratLd(String beratLd) {
        BeratLd = beratLd;
    }

    public String getUsernameLd() {
        return UsernameLd;
    }

    public void setUsernameLd(String usernameLd) {
        UsernameLd = usernameLd;
    }

    public String getAlamatLd() {
        return AlamatLd;
    }

    public void setAlamatLd(String alamatLd) {
        AlamatLd = alamatLd;
    }

    public String getJenisCucianLd() {
        return JenisCucianLd;
    }

    public void setJenisCucianLd(String jenisCucianLd) {
        JenisCucianLd = jenisCucianLd;
    }
}
