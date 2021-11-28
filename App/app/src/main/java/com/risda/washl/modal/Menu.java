package com.risda.washl.modal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Menu {
    @SerializedName("idmenu")
    @Expose
    private Integer idmenu;
    @SerializedName("idkategori")
    @Expose
    private Integer idkategori;
    @SerializedName("menu")
    @Expose
    private String menu;
    @SerializedName("alamat1")
    @Expose
    private String alamat1;
    @SerializedName("alamat2")
    @Expose
    private String alamat2;
    @SerializedName("gambar")
    @Expose
    private String gambar;
    @SerializedName("harga")
    @Expose
    private Integer harga;
    @SerializedName("harga2")
    @Expose
    private Integer harga2;
    @SerializedName("harga3")
    @Expose
    private Integer harga3;
    @SerializedName("harga4")
    @Expose
    private Integer harga4;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("kategori")
    @Expose
    private String kategori;

    public Integer getIdmenu() {
        return idmenu;
    }

    public void setIdmenu(Integer idmenu) {
        this.idmenu = idmenu;
    }

    public Integer getIdkategori() {
        return idkategori;
    }

    public void setIdkategori(Integer idkategori) {
        this.idkategori = idkategori;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getAlamat1() {
        return alamat1;
    }

    public void setAlamat1(String alamat1) {
        this.alamat1 = alamat1;
    }

    public String getAlamat2() {
        return alamat2;
    }

    public void setAlamat2(String alamat2) {
        this.alamat2 = alamat2;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public Integer getHarga() {
        return harga;
    }

    public void setHarga(Integer harga) {
        this.harga = harga;
    }

    public Integer getHarga2() {
        return harga2;
    }

    public void setHarga2(Integer harga2) {
        this.harga2 = harga2;
    }

    public Integer getHarga3() {
        return harga3;
    }

    public void setHarga3(Integer harga3) {
        this.harga3 = harga3;
    }

    public Integer getHarga4() {
        return harga4;
    }

    public void setHarga4(Integer harga4) {
        this.harga4 = harga4;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
}

