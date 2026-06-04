/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.model;

/**
 *
 * @author ACER
 */
public class Mahasiswa {

    // Atribut
    private int id;
    private String nama;

    // Konstruktor
    public Mahasiswa() {
        id = 0;
        nama = "";
    }

    public Mahasiswa(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    // Selektor
    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    // Mutator
    public void setId(int id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    
    
}
