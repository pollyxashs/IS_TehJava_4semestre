package org.example.ru.dao;

import java.math.BigDecimal;
import java.sql.Date;

public class MusicItem {
    private long id;
    private String title;
    private String name;
    private String description;
    private Date releaseDate;
    private BigDecimal price;
    public long getId() {
        return id;
    }
    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    // Переопределение метода toString для удобного вывода информации
    @Override
    public String toString() {
        return "MusicItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
