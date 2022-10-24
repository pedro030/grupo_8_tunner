package com.tunner.api.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Products")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Product extends Base{
    @Column(name = "name")
    private String name;
    @ManyToOne
    @JoinColumn(name = "id_artist")
    private Artist artist;
    @ManyToOne
    @JoinColumn(name = "id_genre")
    private Genre genre;
    @OneToMany(mappedBy = "product")
    private List<Song> songs = new ArrayList<Song>();

}
