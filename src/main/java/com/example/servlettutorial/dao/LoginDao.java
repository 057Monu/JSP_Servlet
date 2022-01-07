package com.example.servlettutorial.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {

    private String url = "jdbc:mysql://localhost:3306/servletjsp";
    private String username = "root";
    private String password = "database password";

    private String sql = "SELECT * FROM table name WHERE USERNAME = ? AND PASSWORD = ?";

    public boolean checkCredentials(String user, String pass) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);

            PreparedStatement st = conn.prepareStatement(sql);

            st.setString(1, user);
            st.setString(2, pass);

            ResultSet rs = st.executeQuery();

            if(rs.next()){
                return true;
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
