package com.risda.washl.rest;

import com.risda.washl.login.LoginRequest;
import com.risda.washl.login.LoginRequestOwner;
import com.risda.washl.login.LoginResponse;
import com.risda.washl.login.LoginResponseOwner;
import com.risda.washl.modal.Beli;
import com.risda.washl.modal.GetBeli;
import com.risda.washl.modal.GetKategori;
import com.risda.washl.modal.GetMenu;
import com.risda.washl.modal.GetOrder;
import com.risda.washl.modal.GetPelanggan;
import com.risda.washl.modal.Menu;
import com.risda.washl.register.RegisterRequest;
import com.risda.washl.register.RegisterRequestOwner;
import com.risda.washl.register.RegisterResponse;
import com.risda.washl.register.RegisterResponseOwner;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ApiInterface {

    @GET("api/kategori")
    Call<GetKategori> getKategori();

    @GET("api/menu")
    Call<GetMenu> getMenu();
    @Multipart
    @POST("/api/menu")
    Call<Menu> postMenu(@Part("idmenu") RequestBody idmenu,
                        @Part("menu") RequestBody menu,
                        @Part("alamat1") RequestBody alamat1,
                        @Part("alamat2") RequestBody alamat2,
                        @Part("gambar") MultipartBody.Part gambar,
                        @Part("harga") RequestBody harga,
                        @Part("harga2") RequestBody harga2,
                        @Part("harga3") RequestBody harga3,
                        @Part("harga4") RequestBody harga4);

    @GET("api/order")
    Call<GetOrder> getOrder();

    @GET("api/pelanggan")
    Call<GetPelanggan> getPelanggan();

    @POST("/api/login")
    Call<LoginResponse> loginUser(@Body LoginRequest loginRequest);

    @POST("/api/register")
    Call<RegisterResponse> registerUser(@Body RegisterRequest registerRequest);

    @POST("/api/loginowner")
    Call<LoginResponseOwner> loginOwner(@Body LoginRequestOwner loginRequestOwner);

    @POST("/api/registerowner")
    Call<RegisterResponseOwner> registerOwner(@Body RegisterRequestOwner registerRequestOwner);

    @GET("api/beli")
    Call<GetBeli> getBeli();




}
