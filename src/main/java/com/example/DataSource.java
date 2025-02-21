package com.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataSource {
    public void addHelyek(Helyek helyek) {
        try {
            tryAddHelyek(helyek);
        } catch (SQLException e) {
            System.err.println("Hiba! A hozzáadás sikertelen!");
            System.err.println(e.getMessage());
        }
    }
    
    public void tryAddHelyek(Helyek helyek) throws SQLException {
         Mariadb db = new Mariadb(); 
         Connection conn = db.connect(); 
         String sql = "insert into celok "+ 
         "(place, finish)" + 
         "values (?, ?, ?, ?, ?, ?, ?)";
         PreparedStatement ps = conn.prepareStatement(sql);
         ps.setString(1, helyek.getPlace());
         ps.setString(2, helyek.getFinish());
         ps.execute();
    }
}
