package stud11418038.develops.aplikasianakdesa.UI.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

import stud11418038.develops.aplikasianakdesa.R;

public class RegisterPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
    }


    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                final Handler handlerSign = new Handler();
                handlerSign.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent main = new Intent(getApplicationContext(), Splashscreen.class);
                        startActivity(main);
                    }
                }, 3000);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
