package com.tunner.api.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Carts")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Audited
public class Cart extends Base{
    @JsonIgnore
    @OneToOne(mappedBy = "cart")
    @JoinColumn(name = "id_user")
    private User user;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CartLine> cartLines = new ArrayList<CartLine>();
}
