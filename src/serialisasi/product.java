/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serialisasi;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author maeepp
 */
public class product implements Serializable {

    private String id;
    private String nama;
    private List<productItem> items;

    product(String nama, String iditem, String kategori, String jenisitem, int harga) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    product() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setItems(List<productItem> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        String produk, item = "";
        produk = "Produk: \r\n"
                + "Id=" + id + "\r\n"
                + "Nama=" + nama + "\r\n"
                + "=======================\r\n"
                + "Product Item:\r\n";
        item = items.stream().map((obj)
                -> obj.toString()).reduce(item, String::concat);
        return produk + item;
    }

    void setId_Produk(String id_produk) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setNama_Game(String nama_produk) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setProduct(List<product> p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
