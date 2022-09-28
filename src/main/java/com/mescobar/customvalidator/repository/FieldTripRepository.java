package com.mescobar.customvalidator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mescobar.customvalidator.model.FieldTrip;

@Repository
public interface FieldTripRepository extends JpaRepository<FieldTrip, Long> {

}
