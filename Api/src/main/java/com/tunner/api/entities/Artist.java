package com.tunner.api.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Artists")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Audited
public class Artist extends Base{
    @Column(name = "name")
    private String name;
    @JsonIgnore
    @OneToMany(mappedBy = "artist")
    private List<Product> albums = new ArrayList<Product>();
}
