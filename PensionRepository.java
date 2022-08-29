package com.pension.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pension.entity.Pension;

public interface PensionRepository extends JpaRepository<Pension,Long> {

}

