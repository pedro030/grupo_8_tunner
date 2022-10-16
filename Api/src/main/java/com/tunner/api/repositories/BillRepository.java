package com.tunner.api.repositories;

import com.tunner.api.entities.Bill;
import org.springframework.stereotype.Repository;

@Repository
public interface BillRepository extends BaseRepository<Bill,Long>{
}
