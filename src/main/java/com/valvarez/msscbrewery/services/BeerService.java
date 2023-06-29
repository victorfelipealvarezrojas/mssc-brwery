package com.valvarez.msscbrewery.services;

import com.valvarez.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
    BeerDto setBeer(BeerDto beerDto);
    void updateBeer(UUID beerId,BeerDto beerDto);
    void deleteById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);
}
