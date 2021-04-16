package com.bhcj.edu.films.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "films_orders")
@ToString
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})
public class FilmOrders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    private int uid;
    private int filmid;
    private String fname;
    private double rating;
    private String time;
    private double price;
    private int count;
    private String orderno;
    private String cover;
}