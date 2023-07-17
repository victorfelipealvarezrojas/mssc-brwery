package com.valvarez.msscbrewery.web.mappers;

import com.valvarez.msscbrewery.domain.Beer;
import com.valvarez.msscbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}
