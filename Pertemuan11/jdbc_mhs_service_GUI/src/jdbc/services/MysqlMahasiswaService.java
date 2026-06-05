/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package jdbc.services;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;

/**
 *
 * @author ACER
 */
public class MysqlMahasiswaService {
    
   private final Connection koneksi;

    public MysqlMahasiswaService() {
        koneksi = MysqlUtility.getConnection();
    }

    public Mahasiswa makeMhsObject() {
        return new Mahasiswa();
    }

    public void add(Mahasiswa mhs) {
        String query = "INSERT INTO mahasiswa (nama) VALUES (?)";
        try {
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setString(1, mhs.getNama());
            ps.executeUpdate();
            System.out.println("Data mahasiswa berhasil ditambahkan.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Mahasiswa mhs) {
        String query = "UPDATE mahasiswa SET nama = ? WHERE id = ?";
        try {
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setString(1, mhs.getNama());
            ps.setInt(2, mhs.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        String query = "DELETE FROM mahasiswa WHERE id = ?";
        try {
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Mahasiswa> getAll() {
        List<Mahasiswa> mhsList = new ArrayList<>();
        String query = "SELECT * FROM mahasiswa";
        try {
            Statement st = koneksi.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Mahasiswa mhs = new Mahasiswa();
                mhs.setId(rs.getInt("id"));
                mhs.setNama(rs.getString("nama"));
                mhsList.add(mhs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mhsList;
    }

    public void indexReset() {
        String query = "ALTER TABLE mahasiswa AUTO_INCREMENT = 1";
        try {
            Statement st = koneksi.createStatement();
            st.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

