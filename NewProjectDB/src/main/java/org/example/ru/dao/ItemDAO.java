package org.example.ru.dao;

import org.example.ru.dao.MusicItem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ItemDAO {

    private Connection connection;

    public ItemDAO(Connection connection) {
        this.connection = connection;
    }

    public List<MusicItem> searchByKeyword(String keyword) {
        List<MusicItem> resultList = new ArrayList<>();
        String sql = "SELECT * FROM GUEST.ITEM WHERE TITLE LIKE ?";
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            pstmt = connection.prepareStatement(sql);
            String wildcarded = "%" + keyword + "%";
            pstmt.setString(1, wildcarded);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                MusicItem item = new MusicItem();
                // Пример заполнения полей MusicItem, предполагая, что в вашей таблице есть столбец "TITLE"
                item.setTitle(rs.getString("TITLE"));
                // Другие поля, если есть
                resultList.add(item);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return resultList;
    }
    public void create(MusicItem item) {
        String sql = "INSERT INTO ITEM (title, description, price) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, item.getTitle());
            pstmt.setString(2, item.getDescription());
            pstmt.setBigDecimal(3, item.getPrice());
            pstmt.executeUpdate();
            System.out.println("Record inserted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



}
