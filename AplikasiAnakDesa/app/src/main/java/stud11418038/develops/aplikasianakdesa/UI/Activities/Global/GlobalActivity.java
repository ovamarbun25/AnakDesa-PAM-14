package stud11418038.develops.aplikasianakdesa.UI.Activities.Global;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.os.Bundle;
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
import stud11418038.develops.aplikasianakdesa.UI.Activities.Provinsi.Activity_Provinsi;
import stud11418038.develops.aplikasianakdesa.UI.Activities.Provinsi.List_Provinsi;
import stud11418038.develops.aplikasianakdesa.UI.Activities.Provinsi.ProvinsiAdapter;

public class GlobalActivity extends AppCompatActivity {

    String url = "https://api.kawalcorona.com/";
    RecyclerView recyclerView;
    GlobalAdapter globalAdapter;
    ArrayList<List_Global> list_globals;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_global);

        recyclerView = findViewById(R.id.rvGlobal);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        globalAdapter = new GlobalAdapter();
        recyclerView.setAdapter(globalAdapter);
        list_globals = new ArrayList<>();
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
                        List_Global list_global1 = new List_Global();
                        list_global1.setNamaNegara(attr.getString("Country_Region"));
                        list_global1.setMeninggal(attr.getInt("Deaths"));
                        list_global1.setPositif(attr.getInt("Confirmed"));
                        list_global1.setSembuh(attr.getInt("Recovered"));
                        list_globals.add(list_global1);
                    }
                } catch (JSONException e) {
                    Toast.makeText(GlobalActivity.this, "JSON problem",Toast.LENGTH_SHORT).show();
                }
                globalAdapter.setData(list_globals);
                globalAdapter.notifyDataSetChanged();
                progressDialog.dismiss();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                progressDialog.dismiss();
                Toast.makeText(GlobalActivity.this, "Error Occured :",Toast.LENGTH_SHORT).show();
            }
        });

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(jsonArrayRequest);
    }


}