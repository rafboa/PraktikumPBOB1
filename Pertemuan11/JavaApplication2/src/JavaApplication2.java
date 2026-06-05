/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */




import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class JavaApplication2 {

    public static void main(String[] args) {
        // 1. Membuat Jendela Utama Aplikasi
        JFrame frame = new JFrame("Aplikasi Bundel Praktikum 11");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 2. Membuat Kontainer Tab
        JTabbedPane tabbedPane = new JTabbedPane();

        // 3. Memasukkan semua JPanel GUI Anda ke dalam masing-masing Tab
        tabbedPane.addTab("Proyek 1: Simple", new GuiSimple());
        tabbedPane.addTab("Proyek 2: CRUD", new GuiCRUD());
        tabbedPane.addTab("Proyek 3: Collection", new GuiCollection());
        tabbedPane.addTab("Proyek 4: Multi List", new GuiMultiList());

        // 4. Memasukkan kontainer tab ke dalam jendela utama
        frame.getContentPane().add(tabbedPane);
        
        // 5. Mengatur ukuran dan posisi jendela
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
