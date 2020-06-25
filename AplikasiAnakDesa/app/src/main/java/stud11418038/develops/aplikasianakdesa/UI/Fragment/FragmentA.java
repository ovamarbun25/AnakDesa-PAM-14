package stud11418038.develops.aplikasianakdesa.UI.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import stud11418038.develops.aplikasianakdesa.R;
import stud11418038.develops.aplikasianakdesa.UI.util.Counts;


public class FragmentA extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RadioGroup no1 = view.findViewById(R.id.no1);
        no1.setOnCheckedChangeListener((group, checkedId) -> {
            switch (checkedId){
                case R.id.no1ya:
                    Counts.add();
                    break;
                case R.id.no1tidak:
                    Counts.min();
            }
        });

        RadioGroup no2 = view.findViewById(R.id.no2);
        no2.setOnCheckedChangeListener((group, checkedId) -> {
            switch (checkedId){
                case R.id.no2ya:
                    Counts.add();
                    break;
                case R.id.no2tidak:
                    Counts.min();
            }
        });

        RadioGroup no3 = view.findViewById(R.id.no3);
        no3.setOnCheckedChangeListener((group, checkedId) -> {
            switch (checkedId){
                case R.id.no3ya:
                    Counts.add();
                    break;
                case R.id.no3tidak:
                    Counts.min();
            }
        });

        RadioGroup no4 = view.findViewById(R.id.no4);
        no4.setOnCheckedChangeListener((group, checkedId) -> {
            switch (checkedId){
                case R.id.no4ya:
                    Counts.add();
                    break;
                case R.id.no4tidak:
                    Counts.min();
            }
        });

        RadioGroup no5 = view.findViewById(R.id.no5);
        no5.setOnCheckedChangeListener((group, checkedId) -> {
            switch (checkedId){
                case R.id.no5ya:
                    Counts.add();
                    break;
                case R.id.no5tidak:
                    Counts.min();
            }
        });

        RadioGroup no6 = view.findViewById(R.id.no6);
        no6.setOnCheckedChangeListener((group, checkedId) -> {
            switch (checkedId){
                case R.id.no6ya:
                    Counts.add();
                    break;
                case R.id.no6tidak:
                    Counts.min();
            }
        });

        RadioGroup no7 = view.findViewById(R.id.no7);
        no7.setOnCheckedChangeListener((group, checkedId) -> {
            switch (checkedId){
                case R.id.no7ya:
                    Counts.add();
                    break;
                case R.id.no7tidak:
                    Counts.min();
            }
        });

        RadioGroup no8 = view.findViewById(R.id.no8);
        no8.setOnCheckedChangeListener((group, checkedId) -> {
            switch (checkedId){
                case R.id.no8ya:
                    Counts.add();
                    break;
                case R.id.no8tidak:
                    Counts.min();
            }
        });
        RadioGroup no9 = view.findViewById(R.id.no9);
        no9.setOnCheckedChangeListener((group, checkedId) -> {
            switch (checkedId){
                case R.id.no9ya:
                    Counts.add();
                    break;
                case R.id.no9tidak:
                    Counts.min();
            }
        });
        RadioGroup no10 = view.findViewById(R.id.no10);
        no10.setOnCheckedChangeListener((group, checkedId) -> {
            switch (checkedId){
                case R.id.no10ya:
                    Counts.add();
                    break;
                case R.id.no10tidak:
                    Counts.min();
            }
        });

        Button next = view.findViewById(R.id.btn_next);
        next.setOnClickListener(v -> {
            String a = String.valueOf(Counts.getTotal());
            Toast.makeText(getContext(), a, Toast.LENGTH_SHORT).show();
        });

    }
}