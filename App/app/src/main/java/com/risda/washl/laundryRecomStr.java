package com.risda.washl;

public class laundryRecomStr {
    private String namaLdrHome;
    private String alamat1Home;

    public laundryRecomStr(String namaLdrHome, String alamat1Home) {
        this.namaLdrHome = namaLdrHome;
        this.alamat1Home = alamat1Home;
    }

    public String getNamaLdrHome() {
        return namaLdrHome;
    }

    public void setNamaLdrHome(String namaLdrHome) {
        this.namaLdrHome = namaLdrHome;
    }

    public String getAlamat1Home() {
        return alamat1Home;
    }

    public void setAlamat1Home(String alamat1Home) {
        this.alamat1Home = alamat1Home;
    }
}
