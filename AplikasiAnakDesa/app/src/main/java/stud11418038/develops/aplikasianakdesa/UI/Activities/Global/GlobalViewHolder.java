package stud11418038.develops.aplikasianakdesa.UI.Activities.Global;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import stud11418038.develops.aplikasianakdesa.R;

public class GlobalViewHolder extends RecyclerView.ViewHolder {
    TextView namaNegara, meninggal,positif,sembuh;
    public GlobalViewHolder(@NonNull View itemView) {
        super(itemView);

        namaNegara = itemView.findViewById(R.id.txtNegara);
        meninggal = itemView.findViewById(R.id.txtMeninggalGlobal);
        positif = itemView.findViewById(R.id.txtPositifGlobal);
        sembuh = itemView.findViewById(R.id.txtSembuhGlobal);
    }
}
