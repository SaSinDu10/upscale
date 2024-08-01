package com.devstack.ecom.upscale.dto.request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestCustomerDto {
    private String name;
    private String mail;
    private String phone;
    private String address;
    private boolean isActive;

}
