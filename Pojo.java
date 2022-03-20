package com.company;

public class Pojo {
    private String nip;
    private String nama;
    private String divisi;

    public Pojo(String nip, String nama, String divisi) {
        this.nip = nip;
        this.nama = nama;
        this.divisi = divisi;
    }

    public String getNip() {
        return nip;
    }

    @Override
    public String toString() {
        return	"Pojo {nip='" + nip + '\'' +
                ", nama='" + nama + '\''
                + ", divisi='" + divisi + '\'' + "}" ;
    }
}