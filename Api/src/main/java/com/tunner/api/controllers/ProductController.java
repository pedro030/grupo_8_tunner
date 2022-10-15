package com.tunner.api.controllers;

import com.tunner.api.entities.Product;
import com.tunner.api.services.ProductServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "tunner/api/products")
public class ProductController extends BaseControllerImpl<Product, ProductServiceImpl> {
}
