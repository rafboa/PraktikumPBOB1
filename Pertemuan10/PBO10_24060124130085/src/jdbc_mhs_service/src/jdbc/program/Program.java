/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.program;

import java.util.*;

import jdbc.model.Mahasiswa;
import jdbc.services.MysqlMahasiswaService;

/**
 *
 * @author ACER
 */
public class Program {
    static MysqlMahasiswaService mhsService = new MysqlMahasiswaService();
    public static void main(String[] args) {
        List<Mahasiswa> listMhs = new ArrayList<>();
        System.out.println("Menambahkan data mahasiswa...");

        // insert
        System.out.println("Insert data mahasiswa...");
        Mahasiswa mhs1 = new Mahasiswa(67, "lala");
        mhsService.add(mhs1);
        System.out.println("Berhasil menambahkan data mahasiswa: " + mhs1);
        mhsService.getAll();

        // update
        System.out.println("Update data mahasiswa...");
        Mahasiswa mhsUpdate = mhsService.getById(67);
        System.out.println("Data mahasiswa sebelum diupdate: " + mhsUpdate);
        mhsUpdate.setNama("lalamove");
        mhsService.update(mhsUpdate);
        System.out.println("Data mahasiswa setelah diupdate: " + mhsService.getById(67));

        // delete
        System.out.println("Delete data mahasiswa...");
        mhsService.delete(67);
        System.out.println("Data mahasiswa setelah dihapus: " + mhsService.getById(67));
        mhsService.getAll();
        
    }
}
