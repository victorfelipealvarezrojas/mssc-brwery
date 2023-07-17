package com.valvarez.msscbrewery.web.mappers;

import com.valvarez.msscbrewery.domain.Customer;
import com.valvarez.msscbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {
    CustomerDto customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDto dto);
}
