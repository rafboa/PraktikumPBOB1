/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
package jdbc.utilities;

import java.sql.*;

public class MysqlUtility {
    private static final String HOST = "localhost";
    private static final int PORT = 3306;
    private static final String DB_NAME = "pbo2";
    private static final String USER = "root";
    private static final String PASSWORD = "11111111";

    private static Connection connection;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                String serverUrl = String.format("jdbc:mysql://%s:%d/?serverTimezone=UTC&allowPublicKeyRetrieval=true&useSSL=false", HOST, PORT);
                try (Connection temp = DriverManager.getConnection(serverUrl, USER, PASSWORD);
                     Statement stmt = temp.createStatement()) {
                    stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS " + DB_NAME);
                }

                String databaseUrl = String.format("jdbc:mysql://%s:%d/%s?serverTimezone=UTC&allowPublicKeyRetrieval=true&useSSL=false", HOST, PORT, DB_NAME);
                connection = DriverManager.getConnection(databaseUrl, USER, PASSWORD);
                try (Statement stmt = connection.createStatement()) {
                    stmt.executeUpdate("CREATE TABLE IF NOT EXISTS mahasiswa (id INT AUTO_INCREMENT PRIMARY KEY, nama VARCHAR(100))");
                }

                if (connection != null) {
                    System.out.println("Koneksi berhasil ke database '" + DB_NAME + "'.");
                }
            } catch (ClassNotFoundException e) {
                System.out.println("Driver tidak ditemukan: " + e.getMessage());
            } catch (SQLException e) {
                System.out.println("Koneksi gagal: " + e.getMessage());
            }
        }

        if (connection == null) {
            throw new IllegalStateException("Koneksi MySQL gagal. Periksa username/password dan konfigurasi database.");
        }
        return connection;
    }
}

