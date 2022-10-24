package com.tunner.api.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Table(name = "Songs")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Audited
public class Song extends Base{
    @Column(name = "name")
    private String name;
    @Column(name = "file")
    private String file;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_product")
    private Product product;
}
