package com.tunner.api.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Bills")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Bill extends Base {
    @ManyToOne()
    @JoinColumn(name = "id_user")
    @JsonBackReference
    private User client;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<BillLine> billLines = new ArrayList<BillLine>();
}
