package com.risda.washl;

public class approvalStr {
    private String beratOrder;
    private String userOrder;
    private String alamatOrder;
    private String cucianOrder;

    public approvalStr(String beratOrder, String userOrder, String alamatOrder, String cucianOrder) {
        this.beratOrder = beratOrder;
        this.userOrder = userOrder;
        this.alamatOrder = alamatOrder;
        this.cucianOrder = cucianOrder;
    }

    public String getBeratOrder() {
        return beratOrder;
    }

    public void setBeratOrder(String beratOrder) {
        this.beratOrder = beratOrder;
    }

    public String getUserOrder() {
        return userOrder;
    }

    public void setUserOrder(String userOrder) {
        this.userOrder = userOrder;
    }

    public String getAlamatOrder() {
        return alamatOrder;
    }

    public void setAlamatOrder(String alamatOrder) {
        this.alamatOrder = alamatOrder;
    }

    public String getCucianOrder() {
        return cucianOrder;
    }

    public void setCucianOrder(String cucianOrder) {
        this.cucianOrder = cucianOrder;
    }
}
