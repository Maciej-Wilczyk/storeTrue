package com.store.repository;





import com.store.model.Magazine;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;



@Repository
public interface MagazineRepository extends JpaRepository<Magazine, Long> {
}
