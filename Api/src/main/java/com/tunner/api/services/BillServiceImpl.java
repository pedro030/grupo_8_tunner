package com.tunner.api.services;

import com.tunner.api.entities.Bill;
import com.tunner.api.repositories.BaseRepository;
import com.tunner.api.repositories.BillRepository;
import com.tunner.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillServiceImpl extends BaseServiceImpl<Bill, Long> implements BillService{

    @Autowired
    private BillRepository billRepository;

    public BillServiceImpl(BaseRepository<Bill, Long> baseRepository) {
        super(baseRepository);
    }
}