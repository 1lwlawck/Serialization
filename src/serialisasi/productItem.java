/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serialisasi;

import java.io.Serializable;

/**
 *
 * @author maeepp
 */
public class productItem implements Serializable {

    private String nama;
    private int harga;
    private transient String IDitem;
    private static int kategori;
    private final String jenisitem;

    public productItem(String nama, int harga, String IDitem, int kategori, String jenisitem) {
        this.nama = nama;
        this.harga = harga;
        this.IDitem = IDitem;
        this.kategori = kategori;
        this.jenisitem = jenisitem;
    }

    @Override
    public String toString() {
        return "\r\nNama = " + nama + "\r\nHarga = " + harga + "\r\nID Item = " + IDitem + "\r\nKategori = " + kategori + "\r\nJenis Item = " + jenisitem + "\r\n";
    }
}
