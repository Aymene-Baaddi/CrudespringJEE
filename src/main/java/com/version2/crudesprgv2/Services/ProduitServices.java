package com.version2.crudesprgv2.Services;

import com.version2.crudesprgv2.entity.Produits;

import java.util.List;
import java.util.Optional;


public interface ProduitServices {

     Produits create( Produits taha);
     List<Produits> getproduit();
     Optional<Produits> getproduit(Integer id);
     void delete( Integer id);
     Optional<Object> update (Integer id , Produits taha);





}
