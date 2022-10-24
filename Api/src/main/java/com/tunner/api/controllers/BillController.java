package com.tunner.api.controllers;

import com.tunner.api.entities.Bill;
import com.tunner.api.services.BillServiceImpl;
import com.tunner.api.services.ProductServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "tunner/api/bill")
public class BillController extends BaseControllerImpl<Bill, BillServiceImpl>{
}
