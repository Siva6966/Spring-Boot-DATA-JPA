package com.cts.airline.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.airline.entity.Inventory;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long> {
}
