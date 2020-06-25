package stud11418038.develops.aplikasianakdesa.UI.Activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import stud11418038.develops.aplikasianakdesa.R;
import stud11418038.develops.aplikasianakdesa.UI.Fragment.FragmentA;


public class CekDiri extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cek_diri);

        androidx.fragment.app.Fragment fragment = new FragmentA();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.frame_cek_diri, fragment);
        fragmentTransaction.commit();
    }
}