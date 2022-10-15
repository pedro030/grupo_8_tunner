package com.tunner.api.repositories;

import com.tunner.api.entities.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends BaseRepository<Product,Long> {
}
