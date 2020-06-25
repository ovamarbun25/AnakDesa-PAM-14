package stud11418038.develops.aplikasianakdesa.UI.Models;

import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("id")
    private int id;
    @SerializedName("nama")
    private String nama;
    @SerializedName("umur")
    private int umur;
    @SerializedName("jeniskelamin")
    private String gender;
    @SerializedName("domisili")
    private String domisili;
    @SerializedName("username")
    private String username;

    public User(int id, String nama, int umur, String gender, String domisili, String username) {
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

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDomisili() {
        return domisili;
    }

    public void setDomisili(String domisili) {
        this.domisili = domisili;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

