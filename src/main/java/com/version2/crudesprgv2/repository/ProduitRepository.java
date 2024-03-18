package com.version2.crudesprgv2.repository;

import com.version2.crudesprgv2.entity.Produits;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitRepository extends JpaRepository<Produits,Integer> {

}
