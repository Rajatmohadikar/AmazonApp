package com.rajat.sbjpa;

import org.springframework.data.jpa.repository.JpaRepository;
public interface AmazonRepository extends JpaRepository<AmazonOrders, Integer> {
}
