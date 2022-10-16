package com.tunner.api.controllers;

import com.tunner.api.entities.Base;
import com.tunner.api.entities.User;
import com.tunner.api.services.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
public abstract class BaseControllerImpl<E extends Base, S extends BaseServiceImpl<E, Long >> implements BaseController<E, Long> {
    protected S service;

    @GetMapping("")
    public ResponseEntity<?> getAll(){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"Error. Por favor intente más tarde.\"}");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findById(id));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"Error. Por favor intente más tarde.\"}");
        }
    }

    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody E entity){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.save(entity));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\": \"Error. Por favor intente más tarde.\"}");
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id,@RequestBody E entity){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.update(id, entity));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"Error. Por favor intente más tarde.\"}");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.delete(id));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"Error. Por favor intente más tarde.\"}");
        }
    }
}
