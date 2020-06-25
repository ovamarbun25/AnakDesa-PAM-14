package stud11418038.develops.aplikasianakdesa.UI.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import stud11418038.develops.aplikasianakdesa.R;
import stud11418038.develops.aplikasianakdesa.UI.Activities.Global.GlobalActivity;
import stud11418038.develops.aplikasianakdesa.UI.Activities.Profile.Profil;
import stud11418038.develops.aplikasianakdesa.UI.Activities.Provinsi.Activity_Provinsi;
import stud11418038.develops.aplikasianakdesa.UI.Storage.Manager;

public class menu extends AppCompatActivity implements View.OnClickListener{

private TextView textViewUsername;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        textViewUsername = findViewById(R.id.tvUsername);

        findViewById(R.id.updateCovid).setOnClickListener(this);
        findViewById(R.id.tipsTrick).setOnClickListener(this);
        findViewById(R.id.lokasiMedis).setOnClickListener(this);
        findViewById(R.id.gejala).setOnClickListener(this);
        findViewById(R.id.cekDiri).setOnClickListener(this);
        findViewById(R.id.profile).setOnClickListener(this);
        findViewById(R.id.updateCovidGlobal).setOnClickListener(this);

        textViewUsername.setText(Manager.getInstance(getApplicationContext()).getUser().getNama());

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.updateCovid:
                Intent intent = new Intent(this, Activity_Provinsi.class);
                this.startActivity(intent);
                break;
            case R.id.cekDiri:
                Intent intent2 = new Intent(this, CekDiri.class);
                this.startActivity(intent2);
                break;
            case R.id.updateCovidGlobal:
                Intent intent3 = new Intent(this, GlobalActivity.class);
                this.startActivity(intent3);
                break;
            case R.id.profile:
                Intent intent4 = new Intent(this, Profil.class);
                this.startActivity(intent4);
                break;
        }

    }
}
