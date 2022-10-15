package com.tunner.api.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Products")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Product extends Base{
    @Column(name = "name")
    private String name;
    @Column(name = "artist")
    private String artist;
    @Column(name = "genre")
    private String genre;
    @Column(name = "format")
    private String format;
}
