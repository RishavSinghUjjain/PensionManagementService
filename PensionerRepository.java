package com.pension.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pension.entity.Pensioner;

public interface PensionerRepository extends JpaRepository<Pensioner,Long> {

}
