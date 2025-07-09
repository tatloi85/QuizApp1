/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.ntl.quizappv2;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;


/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class QuestionsController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            // B1: Nap driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // B2: Mo ket noi
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/quizbd", "root", "12345");
            // B3: Truy van
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM category");
            while (rs.next()) {
                int id = rs.getInt("idcategory");
                String name = rs.getString("name");
                System.out.printf("%d - %s\n", id, name);
            }
            conn.close();
            
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
    }    
    
}
