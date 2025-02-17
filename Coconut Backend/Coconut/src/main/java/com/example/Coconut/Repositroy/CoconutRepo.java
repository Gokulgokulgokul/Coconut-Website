package com.example.Coconut.Repositroy;

import com.example.Coconut.Model.Coconut;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoconutRepo extends JpaRepository<Coconut,Integer> {
}
