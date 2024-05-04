package org.example.ru.dao;

import org.example.ru.dao.ItemDAO;
import org.example.ru.dao.MusicItem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class ItemDAOMain {

    public static void main(String[] args) {
        Connection conn = null;
        try {
            // Установка свойств для подключения к PostgreSQL

            // Создание соединения с базой данных
            conn = DriverManager.getConnection("jdbc:postgresql://localhost/Lab2", "postgres", "qwerty");

            // Создание экземпляра класса ItemDAO
            ItemDAO itemDAO = new ItemDAO(conn);

            // Поиск по ключевым словам
            List<MusicItem> itemsOf = itemDAO.searchByKeyword("of");
            List<MusicItem> itemsGay = itemDAO.searchByKeyword("Gay");

            System.out.println("Items with keyword 'of': " + itemsOf.size());
            System.out.println("Items with keyword 'Gay': " + itemsGay.size());

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                // Закрытие подключения
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
