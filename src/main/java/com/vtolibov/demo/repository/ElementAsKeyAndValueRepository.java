package com.vtolibov.demo.repository;

import com.vtolibov.demo.entity.ElementsAsKeyAndValueDao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ElementAsKeyAndValueRepository extends JpaRepository<ElementsAsKeyAndValueDao, Integer> {

}
