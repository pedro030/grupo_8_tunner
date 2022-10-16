package com.tunner.api.audit;

import com.tunner.api.config.CustomRevisionListener;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.RevisionEntity;
import org.hibernate.envers.RevisionNumber;
import org.hibernate.envers.RevisionTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "revision_info")
@RevisionEntity(CustomRevisionListener.class)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Revision implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "revision_q")
    @SequenceGenerator(name = "revision_seq",sequenceName = "rbac.seq_revision_id")
    @RevisionNumber
    private int id;

    @Column(name = "revision_date")
    @Temporal(TemporalType.TIMESTAMP)
    @RevisionTimestamp
    private Date date;

}
