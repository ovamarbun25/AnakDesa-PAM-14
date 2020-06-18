package stud11418038.develops.aplikasianakdesa.UI.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Patterns;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import stud11418038.develops.aplikasianakdesa.R;
import stud11418038.develops.aplikasianakdesa.UI.API.RetrofitClient;
import stud11418038.develops.aplikasianakdesa.UI.Models.DefaultResponse;
import stud11418038.develops.aplikasianakdesa.UI.Storage.Manager;

public class RegisterPage extends AppCompatActivity implements View.OnClickListener{
    private EditText editTextNama, editTextUmur,editTextJenisKelamin,
            editTextDomisili,editTextUsername,editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);
        editTextNama = findViewById(R.id.nama);
        editTextUmur = findViewById(R.id.umur);
        editTextJenisKelamin = findViewById(R.id.jeniskelamin);
        editTextDomisili = findViewById(R.id.domisili);
        editTextUsername = findViewById(R.id.username);
        editTextPassword = findViewById(R.id.password);

        findViewById(R.id.gotoLogin).setOnClickListener(this);
        findViewById(R.id.regbtn).setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        if(Manager.getInstance(this).isLoggedIn()){
            Intent intent = new Intent(this, menu.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
        }
    }

    private void userSignUp() {
        String nama = editTextNama.getText().toString().trim();
        String umur = editTextUmur.getText().toString().trim();
        String jeniskelamin = editTextJenisKelamin.getText().toString().trim();
        String domisili = editTextDomisili.getText().toString().trim();
        String username = editTextUsername.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();

        if (nama.isEmpty()) {
            editTextNama.setError("Masukkan Nama");
            editTextNama.requestFocus();
            return;
        }

        if (umur.isEmpty()) {
            editTextUmur.setError("Masukkan Umur");
            editTextUmur.requestFocus();
            return;
        }

        if (jeniskelamin.isEmpty()) {
            editTextJenisKelamin.setError("Masukkan Jenis Kelamin");
            editTextJenisKelamin.requestFocus();
            return;
        }

        if (domisili.isEmpty()) {
            editTextDomisili.setError("Masukkan Domisili");
            editTextDomisili.requestFocus();
            return;
        }

        if (username.isEmpty()) {
            editTextUsername.setError("Masukkan Username");
            editTextUsername.requestFocus();
            return;
        }

        if (password.isEmpty()) {
            editTextPassword.setError("Masukkan Password");
            editTextPassword.requestFocus();
            return;
        }






        Call<DefaultResponse> call = RetrofitClient
                .getInstance()
                .getApi()
                .createUser(nama, umur, jeniskelamin, domisili,username,password);


        call.enqueue(new Callback<DefaultResponse>() {
            @Override
            public void onResponse(Call<DefaultResponse> call, Response<DefaultResponse> response) {
                if (response.code() == 201) {

                    DefaultResponse dr = response.body();
                    Toast.makeText(getApplicationContext(), dr.getMsg(), Toast.LENGTH_LONG).show();

                } else if (response.code() == 422) {
                    Toast.makeText(getApplicationContext(), "Pengguna Sudah Terdaftar", Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<DefaultResponse> call, Throwable t) {

                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_LONG).show();

            }
        });


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.regbtn:
                userSignUp();
                break;
            case R.id.gotoLogin:
                startActivity(new Intent(this, LoginPage.class));
                break;
            default:break;
        }
    }
}
