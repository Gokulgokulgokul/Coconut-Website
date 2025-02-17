package com.example.Coconut.Repositroy;

import com.example.Coconut.Model.CoconutMarket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoconutMarketRepo extends JpaRepository<CoconutMarket,Integer> {
}
