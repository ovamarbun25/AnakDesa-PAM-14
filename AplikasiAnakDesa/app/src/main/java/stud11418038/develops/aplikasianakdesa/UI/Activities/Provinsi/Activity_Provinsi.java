package stud11418038.develops.aplikasianakdesa.UI.Activities.Provinsi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import stud11418038.develops.aplikasianakdesa.R;

public class Activity_Provinsi extends AppCompatActivity {


    String url = "https://api.kawalcorona.com/indonesia/provinsi/";
    RecyclerView recyclerView;
    ProvinsiAdapter adapter;
    ArrayList<List_Provinsi> list_provinsis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__provinsi);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerView = findViewById(R.id.rvProvinsi);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new ProvinsiAdapter();
        recyclerView.setAdapter(adapter);
        list_provinsis = new ArrayList<>();
        getData();
    }

    private void getData() {

        ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Sedang Mengambil Data, Sabar Yaaa :)");
        progressDialog.show();

        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(url, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                    try {


                        for (int i=0;i<response.length();i++) {
                            JSONObject jsonObject = response.getJSONObject(i);
                            JSONObject attr = jsonObject.getJSONObject("attributes");
                            List_Provinsi list_provinsi1 = new List_Provinsi();
                            list_provinsi1.setNamaProvinsi(attr.getString("Provinsi"));
                            list_provinsi1.setMeninggal(attr.getInt("Kasus_Meni"));
                            list_provinsi1.setPositif(attr.getInt("Kasus_Posi"));
                            list_provinsi1.setSembuh(attr.getInt("Kasus_Semb"));
                            list_provinsis.add(list_provinsi1);
                        }
                    } catch (JSONException e) {
                        Toast.makeText(Activity_Provinsi.this, "JSON problem",Toast.LENGTH_SHORT).show();
                    }
                    adapter.setData(list_provinsis);
                    adapter.notifyDataSetChanged();
                    progressDialog.dismiss();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
            progressDialog.dismiss();
            Toast.makeText(Activity_Provinsi.this, "Error Occured :",Toast.LENGTH_SHORT).show();
            }
        });

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(jsonArrayRequest);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.home){
            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }
}