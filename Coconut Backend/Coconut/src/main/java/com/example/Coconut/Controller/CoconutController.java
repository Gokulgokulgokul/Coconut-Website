package com.example.Coconut.Controller;

import com.example.Coconut.Model.Coconut;
import com.example.Coconut.Model.CoconutMarket;
import com.example.Coconut.Services.CoconutServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5500/")
public class CoconutController {
    @Autowired
    private CoconutServices services;
    @PostMapping("coconut/reg")
    public String reg(@RequestParam String userName,
                      @RequestParam String emailId,
                      @RequestParam String district)
    {
        services.reg(userName,emailId,district);
        return "added successfully";
    }
    @GetMapping("coconut/peoples")
    public List<Coconut> list()
    {
       return services.getLists();
    }
    @GetMapping("coconut/markets")
    public List<CoconutMarket>markets()
    {
     return  services.getMarkets();
    }

}
