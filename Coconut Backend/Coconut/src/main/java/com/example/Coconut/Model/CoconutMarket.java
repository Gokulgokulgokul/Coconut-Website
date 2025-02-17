package com.example.Coconut.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CoconutMarket {
    @Id
    private int id;
    private String marketExchange;
    private String district;
    private Long phoneNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarketExchange() {
        return marketExchange;
    }

    public void setMarketExchange(String marketExchange) {
        this.marketExchange = marketExchange;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public CoconutMarket(int id, String marketExchange, String district, Long phoneNumber) {
        this.id = id;
        this.marketExchange = marketExchange;
        this.district = district;
        this.phoneNumber = phoneNumber;
    }
    public CoconutMarket()
    {

    }

}
