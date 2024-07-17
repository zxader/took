package com.housing.back.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.housing.back.entity.CertificationEntity;

@Repository
public interface CertificationRepository extends JpaRepository<CertificationEntity,String>{
  
}
