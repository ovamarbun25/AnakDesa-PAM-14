package stud11418038.develops.aplikasianakdesa.UI.Activities.Profile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import stud11418038.develops.aplikasianakdesa.R;
import stud11418038.develops.aplikasianakdesa.UI.Activities.menu;
import stud11418038.develops.aplikasianakdesa.UI.Storage.Manager;

public class Profil extends AppCompatActivity {
    private TextView textViewNama, textViewJenisKelamin,textViewUmur,textViewDomisili;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarProfile);;
        setSupportActionBar(toolbar);
        toolbar.setTitle("Aplikasi Antisipasi Covid 19");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), menu.class));
            }
        });

        textViewNama = findViewById(R.id.tvNama);
        textViewUmur = findViewById(R.id.tvUmur);
        textViewJenisKelamin = findViewById(R.id.tvJenisKelamin);
        textViewDomisili = findViewById(R.id.tvDomisili);

        textViewNama.setText(Manager.getInstance(getApplicationContext()).getUser().getNama());
        textViewUmur.setText(Integer.toString(Manager.getInstance(getApplicationContext()).getUser().getUmur()));
        textViewJenisKelamin.setText(Manager.getInstance(getApplicationContext()).getUser().getGender());
        textViewDomisili.setText(Manager.getInstance(getApplicationContext()).getUser().getDomisili());



        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), menu.class));
            }
        });
    }
}
