package stud11418038.develops.aplikasianakdesa.UI.Activities.Provinsi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import stud11418038.develops.aplikasianakdesa.R;

public class ProvinsiAdapter extends RecyclerView.Adapter<ProvinsiViewHolder> {
    ArrayList<List_Provinsi> list_provinsi;

    public ProvinsiAdapter() {
        list_provinsi = new ArrayList<>();

    }

    public void setData(ArrayList<List_Provinsi> list_provinsi){
        this.list_provinsi = list_provinsi;

    }

    @NonNull
    @Override
    public ProvinsiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context mcontex = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(mcontex);
        View provinsiView = layoutInflater.inflate(R.layout.provinsi,parent,false);
        return new ProvinsiViewHolder(provinsiView);
    }

    @Override
    public void onBindViewHolder(@NonNull ProvinsiViewHolder holder, int position) {
        List_Provinsi daftar_provinsi = list_provinsi.get(position);
        holder.namaProvinsi.setText(daftar_provinsi.getNamaProvinsi());
        holder.meninggal.setText(Integer.toString(daftar_provinsi.getMeninggal()));
        holder.positif.setText(Integer.toString(daftar_provinsi.getPositif()));
        holder.sembuh.setText(Integer.toString(daftar_provinsi.getSembuh()));
    }

    @Override
    public int getItemCount() {
        return list_provinsi.size();
    }
}
