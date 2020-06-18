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
import stud11418038.develops.aplikasianakdesa.UI.Models.LoginResponse;
import stud11418038.develops.aplikasianakdesa.UI.Storage.Manager;

public class LoginPage extends AppCompatActivity implements View.OnClickListener{
    private EditText username;
    private EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        username = findViewById(R.id.username);
        pass = findViewById(R.id.password);

        findViewById(R.id.loginbtn).setOnClickListener(this);
        findViewById(R.id.gotoSignUp).setOnClickListener(this);

    }

    @Override
    protected void onStart() {
        super.onStart();

        if (Manager.getInstance(this).isLoggedIn()) {
            Intent intent = new Intent(this, menu.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
        }
    }

    private void userLogin() {

        String usrnme = username.getText().toString().trim();
        String password = pass.getText().toString().trim();

        if (usrnme.isEmpty()) {
            username.setError("Masukkan Username");
            username.requestFocus();
            return;
        }


        if (password.isEmpty()) {
            pass.setError("Masukkan Password");
            pass.requestFocus();
            return;
        }

        Call<LoginResponse> call = RetrofitClient
                .getInstance().getApi().userLogin(usrnme, password);

        call.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                LoginResponse loginResponse = response.body();

                if (!loginResponse.isError()) {

                    Manager.getInstance(LoginPage.this)
                            .saveUser(loginResponse.getUser());

                    Intent intent = new Intent(LoginPage.this, menu.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);


                } else {
                    Toast.makeText(LoginPage.this, loginResponse.getMessage(), Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.loginbtn:
                userLogin();
                break;
            case R.id.gotoSignUp:
                Intent move_to_login = new Intent(LoginPage.this, RegisterPage.class);
                startActivity(move_to_login);
                finish();
                break;
            default:break;
        }
    }
}
