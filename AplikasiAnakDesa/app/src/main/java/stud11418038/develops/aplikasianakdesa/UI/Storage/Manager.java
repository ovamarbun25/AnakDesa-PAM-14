package stud11418038.develops.aplikasianakdesa.UI.Storage;

import android.content.Context;
import android.content.SharedPreferences;
import stud11418038.develops.aplikasianakdesa.UI.Models.User;

public class Manager {


    private static final String SHARED_PREF_NAME = "my_shared_preff";

    private static Manager mInstance;
    private Context mCtx;

    private Manager(Context mCtx) {
        this.mCtx = mCtx;
    }


    public static synchronized Manager getInstance(Context mCtx) {
        if (mInstance == null) {
            mInstance = new Manager(mCtx);
        }
        return mInstance;
    }


    public void saveUser(User user) {

        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("id", user.getNama());
        editor.putString("nama", user.getNama());
        editor.putString("umur", user.getUmur());
        editor.putString("jeniskelamin", user.getGender());
        editor.putString("domisili", user.getDomisili());
        editor.putString("username", user.getUsername());
        editor.apply();

    }

    public boolean isLoggedIn() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getInt("id", -1) != -1;
    }

    public User getUser() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        return new User(
                sharedPreferences.getInt("id", -1),
                sharedPreferences.getString("nama", null),
                sharedPreferences.getString("umur", null),
                sharedPreferences.getString("jeniskelamin", null),
                sharedPreferences.getString("domisili", null),
                sharedPreferences.getString("username", null)
        );
    }

    public void clear() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.apply();
    }
}
