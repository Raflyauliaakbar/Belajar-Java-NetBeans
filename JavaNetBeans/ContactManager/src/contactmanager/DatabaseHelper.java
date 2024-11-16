package contactmanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SSD TURBO_BC
 */
public class DatabaseHelper {
    private static final String URL = "jdbc:mysql://localhost:3306/contact_db"; // URL database MySQL
    //private static final String URL = "jdbc:sqlite:C:/Users/SSD TURBO_BC/Documents/NetBeansProjects/ContactManager/src/contacts.db";
    private static final String USERNAME = "root"; // username MySQL, default: "root"
    private static final String PASSWORD = "";     // password MySQL, default kosong untuk XAMPP

    // Metode untuk menghubungkan ke database
    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    // Metode untuk menambahkan kontak
    public void addContact(String name, String phone, String category) throws SQLException {
        String sql = "INSERT INTO contacts (name, phone, category) VALUES (?, ?, ?)";
        try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, phone);
            pstmt.setString(3, category);
            pstmt.executeUpdate();
        }
    }

    public void updateContact(int id, String name, String phone, String category) throws SQLException {
        String sql = "UPDATE contacts SET name = ?, phone = ?, category = ? WHERE id = ?";
        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, phone);
            pstmt.setString(3, category);
            pstmt.setInt(4, id);
            pstmt.executeUpdate();
        }
    }
    
    public void deleteContact(int id) throws SQLException {
        String sql = "DELETE FROM contacts WHERE id = ?";
        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        }
    }
    
    public List<Contact> getContactsByCategory(String category) throws SQLException {
        List<Contact> contacts = new ArrayList<>();
        String sql = "SELECT * FROM contacts WHERE category = ?";
        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, category);
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    String phone = rs.getString("phone");
                    contacts.add(new Contact(id, name, phone, category));
                }
            }
        }
        return contacts;
    }
    
    // Metode untuk mengambil semua kontak
    public List<Contact> getAllContacts() throws SQLException {
        List<Contact> contacts = new ArrayList<>();
        String query = "SELECT * FROM contacts"; // Ganti dengan nama tabel Anda

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String phone = rs.getString("phone");
                String category = rs.getString("category");
                contacts.add(new Contact(id, name, phone, category));
            }
        }
        return contacts;
    }
}