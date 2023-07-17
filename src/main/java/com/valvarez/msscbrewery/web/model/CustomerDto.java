package com.valvarez.msscbrewery.web.model;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.UUID;


@Data
public class CustomerDto {
    private UUID id;
    @NotBlank
    @Size(min = 3, max = 100)
    private String name;

    public CustomerDto(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public static CustomerBuilder builder() {
        return new CustomerBuilder();
    }


    public static class CustomerBuilder {
        private UUID id;
        private String name;

        public CustomerBuilder id(UUID id) {
            this.id = id;
            return this;
        }

        public CustomerBuilder name(String name) {
            this.name = name;
            return this;
        }

        public CustomerDto build() {
            return new CustomerDto(this.id, this.name);
        }

        public String toString() {
            return "Customer.CustomerBuilder(id="
                    + this.id
                    + ", name="
                    + this.name + ")";
        }
    }
}
