package stud11418038.develops.aplikasianakdesa.UI.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

import stud11418038.develops.aplikasianakdesa.R;

public class LoginPage extends AppCompatActivity implements View.OnClickListener{
    private EditText username;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);

    }


    @Override
    public void onClick(View v) {

    }
}
