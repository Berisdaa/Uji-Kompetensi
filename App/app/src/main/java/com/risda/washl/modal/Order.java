package com.risda.washl.modal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Order {
    @SerializedName("idorder")
    @Expose
    private Integer idorder;
    @SerializedName("idpelanggan")
    @Expose
    private Integer idpelanggan;
    @SerializedName("tglorder")
    @Expose
    private String tglorder;
    @SerializedName("berat1")
    @Expose
    private Integer berat1;
    @SerializedName("berat2")
    @Expose
    private Integer berat2;
    @SerializedName("berat3")
    @Expose
    private Integer berat3;
    @SerializedName("berat4")
    @Expose
    private Integer berat4;
    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("bayar")
    @Expose
    private Integer bayar;
    @SerializedName("kembali")
    @Expose
    private Integer kembali;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("pelanggan")
    @Expose
    private String pelanggan;
    @SerializedName("avauser")
    @Expose
    private String avauser;
    @SerializedName("alamat")
    @Expose
    private String alamat;
    @SerializedName("telp")
    @Expose
    private String telp;

    public Integer getIdorder() {
        return idorder;
    }

    public void setIdorder(Integer idorder) {
        this.idorder = idorder;
    }

    public Integer getIdpelanggan() {
        return idpelanggan;
    }

    public void setIdpelanggan(Integer idpelanggan) {
        this.idpelanggan = idpelanggan;
    }

    public String getTglorder() {
        return tglorder;
    }

    public void setTglorder(String tglorder) {
        this.tglorder = tglorder;
    }

    public Integer getBerat1() {
        return berat1;
    }

    public void setBerat1(Integer berat1) {
        this.berat1 = berat1;
    }

    public Integer getBerat2() {
        return berat2;
    }

    public void setBerat2(Integer berat2) {
        this.berat2 = berat2;
    }

    public Integer getBerat3() {
        return berat3;
    }

    public void setBerat3(Integer berat3) {
        this.berat3 = berat3;
    }

    public Integer getBerat4() {
        return berat4;
    }

    public void setBerat4(Integer berat4) {
        this.berat4 = berat4;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getBayar() {
        return bayar;
    }

    public void setBayar(Integer bayar) {
        this.bayar = bayar;
    }

    public Integer getKembali() {
        return kembali;
    }

    public void setKembali(Integer kembali) {
        this.kembali = kembali;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public String getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(String pelanggan) {
        this.pelanggan = pelanggan;
    }

    public String getAvauser() {
        return avauser;
    }

    public void setAvauser(String avauser) {
        this.avauser = avauser;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }
}
