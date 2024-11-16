/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contactmanager;

/**
 *
 * @author SSD TURBO_BC
 */
public class Contact {
     private int id; // ID kontak
    private String name; // Nama kontak
    private String phone; // Nomor telepon kontak
    private String category; // Kategori kontak

    // Constructor
    public Contact(int id, String name, String phone, String category) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.category = category;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getCategory() {
        return category;
    }
}
