package com.krishnam.simpleWebApp.Repository;

import com.krishnam.simpleWebApp.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Products,Integer> {
}
