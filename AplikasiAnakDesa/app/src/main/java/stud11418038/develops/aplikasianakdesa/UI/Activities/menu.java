package stud11418038.develops.aplikasianakdesa.UI.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import stud11418038.develops.aplikasianakdesa.R;

public class menu extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        findViewById(R.id.updateCovid).setOnClickListener(this);
        findViewById(R.id.tipsTrick).setOnClickListener(this);
        findViewById(R.id.lokasiMedis).setOnClickListener(this);
        findViewById(R.id.gejala).setOnClickListener(this);
        findViewById(R.id.cekDiri).setOnClickListener(this);
        findViewById(R.id.profile).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}
