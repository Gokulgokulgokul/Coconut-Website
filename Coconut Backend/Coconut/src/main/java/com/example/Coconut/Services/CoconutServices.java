package com.example.Coconut.Services;

import com.example.Coconut.Model.Coconut;
import com.example.Coconut.Model.CoconutMarket;
import com.example.Coconut.Repositroy.CoconutMarketRepo;
import com.example.Coconut.Repositroy.CoconutRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoconutServices {
    @Autowired
    CoconutRepo repo;
    @Autowired
    CoconutMarketRepo marketRepo;
    public void reg(String userName, String emailId, String district) {
        Coconut coc=new Coconut(userName,emailId,district);
        repo.save(coc);
    }

    public List<Coconut> getLists() {
       return repo.findAll();
    }

    public List<CoconutMarket> getMarkets() {
        return marketRepo.findAll();
    }
}
