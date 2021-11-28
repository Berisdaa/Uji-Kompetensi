package com.risda.washl.modal;

import com.google.gson.annotations.SerializedName;

public class PostPutDelMenu {
    @SerializedName("status")
    String status;
    @SerializedName("result")
    Menu pMenu;
    @SerializedName("message")
    String message;
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Menu getMenu() {
        return pMenu;
    }
    public void setMenu(Menu Menu) {
        pMenu = Menu;
    }
}
