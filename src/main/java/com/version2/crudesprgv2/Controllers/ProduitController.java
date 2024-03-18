package com.version2.crudesprgv2.Controllers;

import com.version2.crudesprgv2.Services.ProduitServices;
import com.version2.crudesprgv2.entity.Produits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Produit2")


public class ProduitController {

    @Autowired
    ProduitServices services;

    @PostMapping
    public Produits add(@RequestBody Produits taha){
        return services.create(taha);
    }

    @GetMapping
    public List<Produits> getall(){
        return services.getproduit();
    }

    @GetMapping("/{id}")
    public Optional<Produits> getproduit(@PathVariable Integer id){
        return services.getproduit(id);
    }

    @DeleteMapping("/{id}")
    public void supprimer(@PathVariable Integer id ){
        services.delete(id);
    }
    @PutMapping("/{id}")
    public Optional<Object> modifier(@PathVariable Integer id , @RequestBody Produits taha){
        return services.update(id,taha);
    }




}
