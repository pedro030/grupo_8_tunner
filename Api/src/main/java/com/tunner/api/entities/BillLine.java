package com.tunner.api.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Table(name = "BillLines")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Audited
public class BillLine extends Base{

    @Column(name = "quantity")
    private int quantity;
    @Column(name = "price")
    private int price;
    @ManyToOne()
    @JoinColumn(name = "id_product")
    private Product product;

}
