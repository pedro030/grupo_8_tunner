package com.tunner.api.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Bills")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Bill extends Base {

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinColumn(name = "product_id")
    private List<Product> product;

    @ManyToOne()
    @JoinColumn(name = "client_id")
    private User client;
}
