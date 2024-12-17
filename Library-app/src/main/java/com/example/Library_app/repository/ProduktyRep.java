package com.example.Library_app.repository;

import com.example.Library_app.model.Produkty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduktyRep extends JpaRepository<Produkty, Long>{
}
