package stud11418038.develops.aplikasianakdesa.UI.Activities.Provinsi;

public class List_Provinsi {
    private String namaProvinsi;
    private int positif;
    private int sembuh;
    private int meninggal;

    public List_Provinsi(String namaProvinsi, int positif, int sembuh, int meninggal) {
        this.namaProvinsi = namaProvinsi;
        this.positif = positif;
        this.sembuh = sembuh;
        this.meninggal = meninggal;
    }

    public List_Provinsi(){

    }

    public String getNamaProvinsi() {
        return namaProvinsi;
  }

    public void setNamaProvinsi(String namaProvinsi) {
        this.namaProvinsi = namaProvinsi;
    }

    public int getPositif() {
        return positif;
    }

    public void setPositif(int positif) {
        this.positif = positif;
    }

    public int getSembuh() {
        return sembuh;
    }

    public void setSembuh(int sembuh) {
        this.sembuh = sembuh;
    }

    public int getMeninggal() {
        return meninggal;
    }

    public void setMeninggal(int meninggal) {
        this.meninggal = meninggal;
    }
}
