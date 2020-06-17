package stud11418038.develops.aplikasianakdesa.UI.Models;

import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("id")
    private int id;
    @SerializedName("nama")
    private String nama;
    @SerializedName("umur")
    private String umur;
    @SerializedName("jeniskelamin")
    private String gender;
    @SerializedName("domisili")
    private String domisili;
    @SerializedName("username")
    private String username;

    public User(int id, String nama, String umur, String gender, String domisili, String username) {
        this.id = id;
        this.nama = nama;
        this.umur = umur;
        this.gender = gender;
        this.domisili = domisili;
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getUmur() {
        return umur;
    }

    public String getGender() {
        return gender;
    }

    public String getDomisili() {
        return domisili;
    }

    public String getUsername() {
        return username;
    }
}

