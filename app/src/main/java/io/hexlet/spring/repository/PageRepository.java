package io.hexlet.spring.repository;


import io.hexlet.spring.model.Page;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PageRepository extends JpaRepository<Page, Long> {

}
