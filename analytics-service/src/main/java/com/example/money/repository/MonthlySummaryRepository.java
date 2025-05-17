package com.example.money.repository;

import com.example.money.model.MonthlySummary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonthlySummaryRepository extends JpaRepository<MonthlySummary, Long> {
}
