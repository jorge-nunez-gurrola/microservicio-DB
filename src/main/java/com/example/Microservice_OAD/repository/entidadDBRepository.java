package com.example.Microservice_OAD.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Microservice_OAD.model.entidadDB;

@Repository
public interface entidadDBRepository extends JpaRepository<entidadDB, Integer> {

}

