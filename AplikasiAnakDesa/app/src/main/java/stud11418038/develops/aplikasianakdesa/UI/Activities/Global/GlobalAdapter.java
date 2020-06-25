package stud11418038.develops.aplikasianakdesa.UI.Activities.Global;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import stud11418038.develops.aplikasianakdesa.R;
import stud11418038.develops.aplikasianakdesa.UI.Activities.Provinsi.List_Provinsi;
import stud11418038.develops.aplikasianakdesa.UI.Activities.Provinsi.ProvinsiAdapter;

public class GlobalAdapter extends RecyclerView.Adapter<GlobalViewHolder> {
    ArrayList<List_Global> list_global;

    public GlobalAdapter(){
        list_global = new ArrayList<>();
    }

    public void setData(ArrayList<List_Global> list_global){
        this.list_global = list_global;

    }


    @NonNull
    @Override
    public GlobalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context mcontext = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(mcontext);
        View globalView = layoutInflater.inflate(R.layout.global, parent, false);
        return new GlobalViewHolder(globalView);
    }

    @Override
    public void onBindViewHolder(@NonNull GlobalViewHolder holder, int position) {
        List_Global daftar_negara = list_global.get(position);
        holder.namaNegara.setText(daftar_negara.getNamaNegara());
        holder.meninggal.setText(Integer.toString(daftar_negara.getMeninggal()));
        holder.positif.setText(Integer.toString(daftar_negara.getPositif()));
        holder.sembuh.setText(Integer.toString(daftar_negara.getSembuh()));
    }

    @Override
    public int getItemCount() {
        return list_global.size();
    }
}
