package com.risda.washl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.risda.washl.rest.ApiInterface;
import com.risda.washl.rest.ServerConfig;

public class SettingProduk extends AppCompatActivity {

    EditText idkategori,menu,alamat1,alamat2,harga,harga2,harga3,harga4;
    Button btnGalery, btSubmit;
    ImageView imgHolder;

    private String mediaPath;

    ApiInterface mApiInterface;
    private static final int REQUEST_PICK_PHOTO = 9544;
    private static final int REQUEST_WRITE_PERMISSION = ServerConfig.REQUEST_WRITE_PERMISSION;
    private static final String INSERT_FLAG = ServerConfig.INSERT_FLAG;

    // Akses Izin Ambil Gambar dari Storage
//    @Override
//    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
//        if (requestCode == REQUEST_WRITE_PERMISSION && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
//            saveImageUpload();
//        }
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_produk);

        ImageButton home = findViewById(R.id.btnBackHome5);
        home.setOnClickListener(v -> openBack());
    }

    public void openBack(){
        Intent h = new Intent(SettingProduk.this, SettingProfileOwner.class);
        startActivity(h);
        finish();
    }


    // Identifikasi Komponen Form
//    idkategori = (EditText) findViewById(R.id.idkategori);
//    menu = (EditText) findViewById(R.id.menu);
//    harga = (EditText) findViewById(R.id.harga);
//    imgHolder = (ImageView) findViewById(R.id.imgHolder);
//    btnGalery = (Button) findViewById(R.id.btn_galery);
//    btSubmit = (Button) findViewById(R.id.btn_submit);
//
//    // Definisi API
//    mApiInterface = ApiClient.getClient().create(ApiInterface.class);
//
//    // Fungsi Tombol Pilih Galery
//        btnGalery.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            Intent getIntent = new Intent(Intent.ACTION_GET_CONTENT);
//            getIntent.setType("images/*");
//
//            Intent galleryIntent = new Intent(Intent.ACTION_PICK,
//                    MediaStore.Images.Media.INTERNAL_CONTENT_URI);
//            galleryIntent.setType("images/*");
//
//
//            Intent choose = Intent.createChooser(getIntent,"select");
//            choose.putExtra(Intent.EXTRA_INITIAL_INTENTS,new Intent[] {galleryIntent});
//            startActivityForResult(choose, REQUEST_PICK_PHOTO);
//
//        }
//    });
//
//    // Fungsi Tombol Simpan
//        btSubmit.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            requestPermission();
//        }
//    });
}