package com.tunner.api.services;

import com.tunner.api.entities.Product;
import com.tunner.api.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl extends BaseServiceImpl<Product, Long> implements ProductService{

    public ProductServiceImpl(BaseRepository<Product, Long> baseRepository) {
        super(baseRepository);
    }
}
