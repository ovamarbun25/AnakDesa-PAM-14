package stud11418008.develops.antisipasicovid19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class Splashscreen extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        Button btnMoveLogin = findViewById(R.id.buttonLogin);
        btnMoveLogin.setOnClickListener(this);

        Button btnMoveRegister = findViewById(R.id.buttonSignUp);
        btnMoveRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonLogin:
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent main = new Intent(Splashscreen.this, LoginPage.class);
                        startActivity(main);
                    }
                }, 3000);
        }
    }
    }
