package com.valvarez.msscbrewery.web.mappers;

import com.valvarez.msscbrewery.domain.Customer;
import com.valvarez.msscbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {
    Customer customerDtoToCustomer(CustomerDto dto);

    CustomerDto customerToCustomerDto(Customer customer);
}
