package com.version2.crudesprgv2.Services;

import com.version2.crudesprgv2.entity.Produits;
import com.version2.crudesprgv2.repository.ProduitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ProduitServiceImpl implements ProduitServices {

    @Autowired
     ProduitRepository repository;




    @Override
    public Produits create(Produits taha) {
        return repository.save(taha);
    }

    @Override
    public List<Produits> getproduit() {
        return  repository.findAll();
    }

    @Override
    public Optional<Produits> getproduit(Integer id) {
        return repository.findById(id);
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);

        System.out.println("le produits a ete supprimer");
    }

    @Override
    public Optional<Object> update(Integer id, Produits taha) {
        return  repository.findById(id)
                .map(s->{
                    s.setName(taha.getName());
                    s.setDescription(taha.getDescription());
                    s.setPrix(taha.getPrix());


                    return repository.save(s);
                });


}}
