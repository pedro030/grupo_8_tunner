package com.tunner.api.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Table(name = "CartLines")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class CartLine extends Base{
    @ManyToOne
    @JoinColumn(name = "id_product")
    private Product product;
    @Column(name = "quantity")
    private int quantity;
}
