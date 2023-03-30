package com.habib.demo345.repos;

import com.habib.demo345.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
