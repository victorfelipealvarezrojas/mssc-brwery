package com.valvarez.msscbrewery.services;

import com.valvarez.msscbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Cristal")
                .beerStyle("lager")
                .upc(123456789L)
                .build();
    }

    @Override
    public BeerDto setBeer(BeerDto beerDto) {
        BeerDto builder = (BeerDto) beerDto;
        return builder;
    }

    @Override
    public void updateBeer(UUID beerId,BeerDto beerDto) {

    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleting a beer...");
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return null;
    }


}
