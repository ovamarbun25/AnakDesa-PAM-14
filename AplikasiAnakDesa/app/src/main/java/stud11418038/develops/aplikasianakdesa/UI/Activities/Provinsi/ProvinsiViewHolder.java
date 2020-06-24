package stud11418038.develops.aplikasianakdesa.UI.Activities.Provinsi;


import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import stud11418038.develops.aplikasianakdesa.R;

public class ProvinsiViewHolder extends RecyclerView.ViewHolder {
     TextView namaProvinsi, meninggal,positif,sembuh;

    public ProvinsiViewHolder(@NonNull View itemView) {
        super(itemView);
        namaProvinsi = itemView.findViewById(R.id.txtProvinsi);
        meninggal = itemView.findViewById(R.id.txtMeninggal);
        positif = itemView.findViewById(R.id.txtPositif);
        sembuh = itemView.findViewById(R.id.txtSembuh);

    }
}
