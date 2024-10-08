package com.bloodmap.dataTranferObject;

import lombok.*;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private String street;
    private String zipcode;
    private String country;
    private String state;
}
