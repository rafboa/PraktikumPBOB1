/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package jdbc.services;

import java.sql.*;
import jdbc.model.Mahasiswa;

/**
 *
 * @author ACER
 */
public class MysqlMahasiswaService {
    
   // Atribut
    Connection connection = null;

    // Konstruktor
    public MysqlMahasiswaService() {
        connection = jdbc.utilities.MysqlUtility.getConnection();
    }

    // Membuat objek Mahasiswa
    public Mahasiswa makeMhsObject(){
        Mahasiswa mhs = new Mahasiswa();
        mhs.setId(2345);
        mhs.setNama("john");
        return mhs;
    }
    // Menambahkan data mahasiswa
    public void add(Mahasiswa mhs) {
        try {
            String sql = "INSERT INTO mahasiswa (id, nama) VALUES (?, ?)";
            java.sql.PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, mhs.getId());
            stmt.setString(2, mhs.getNama());
            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Data mahasiswa berhasil ditambahkan.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Update data mahasiswa
    public void update(Mahasiswa mhs) {
        try {
            String sql = "UPDATE mahasiswa SET nama = ? WHERE id = ?";
            java.sql.PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, mhs.getNama());
            stmt.setInt(2, mhs.getId());
            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Data mahasiswa berhasil diupdate.");
            } else {
                System.out.println("Data mahasiswa tidak ditemukan.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Menghapus data mahasiswa
    public void delete(int id) {
        try {
            String sql = "DELETE FROM mahasiswa WHERE id = ?";
            java.sql.PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);
            int rowsDeleted = stmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Data mahasiswa berhasil dihapus.");
            } else {
                System.out.println("Data mahasiswa tidak ditemukan.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Menampilkan data mahasiswa
    public void getAll() {
        try {
            String sql = "SELECT * FROM mahasiswa";
            java.sql.Statement stmt = connection.createStatement();
            java.sql.ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String id = rs.getString("id");
                String nama = rs.getString("nama");
                System.out.println("ID: " + id + ", Nama: " + nama);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Ambil data mahasiswa berdasarkan ID
    public Mahasiswa getById(int id) {
        try {
            String sql = "SELECT * FROM mahasiswa WHERE id = ?";
            java.sql.PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);
            java.sql.ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Mahasiswa mhs = new Mahasiswa();
                mhs.setId(rs.getInt("id"));
                mhs.setNama(rs.getString("nama"));
                return mhs;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

