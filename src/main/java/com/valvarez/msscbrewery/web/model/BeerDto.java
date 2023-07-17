package com.valvarez.msscbrewery.web.model;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import java.sql.Timestamp;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
public class BeerDto {
    private UUID id;
    private String beerName;
    private String beerStyle;
    private Long upc;

    private OffsetDateTime createdDate;
    private OffsetDateTime lastUpdatedDate;

    public BeerDto(UUID id, String beerName, String beerStyle, Long upc, OffsetDateTime createdDate, OffsetDateTime lastUpdatedDate) {
        this.id = id;
        this.beerName = beerName;
        this.beerStyle = beerStyle;
        this.upc = upc;
        this.createdDate = createdDate;
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public static BeerDtoBuilder builder() {
        return new BeerDtoBuilder();
    }

    public static class BeerDtoBuilder {
        @Null
        private UUID id;
        @NotBlank
        private String beerName;
        @NotBlank
        private String beerStyle;
        @Positive
        private Long upc;

        private OffsetDateTime createdDate;
        private OffsetDateTime lastUpdatedDate;

        public BeerDtoBuilder id(UUID id) {
            this.id = id;
            return this;
        }

        public BeerDtoBuilder beerName(String beerName) {
            this.beerName = beerName;
            return this;
        }

        public BeerDtoBuilder beerStyle(String beerStyle) {
            this.beerStyle = beerStyle;
            return this;
        }

        public BeerDtoBuilder upc(Long upc) {
            this.upc = upc;
            return this;
        }

        public BeerDtoBuilder createdDate(OffsetDateTime createdDate) {
            this.createdDate = createdDate;
            return this;
        }

        public BeerDtoBuilder lastUpdatedDate(OffsetDateTime lastUpdatedDate) {
            this.lastUpdatedDate = lastUpdatedDate;
            return this;
        }

        public BeerDto build() {
            return new BeerDto(this.id, this.beerName, this.beerStyle, this.upc, this.createdDate, this.lastUpdatedDate);
        }

        public String toString() {
            return "BeerDto.BeerDtoBuilder(id="
                    + this.id + ", beerName="
                    + this.beerName + ", beerStyle="
                    + this.beerStyle + ", upc="
                    + this.upc + ")";
        }
    }
}
