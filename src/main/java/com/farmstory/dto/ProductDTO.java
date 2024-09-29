package com.farmstory.dto;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDTO {
    private int prodNo;
    private int prodCateType;
    private String prodName;
    private int prodPrice;
    private int prodStock;
    private int prodDiscount;
    private String prodImage1;
    private String prodImage2;
    private String prodImage3;
    private int prodPoint;
    private String prodEtc;
    private int prodDelivery;

    @CreationTimestamp
    private String prodRegDate;

    public ProductDTO toEntity() {
        return ProductDTO.builder()
                .prodNo(prodNo)
                .prodCateType(prodCateType)
                .prodName(prodName)
                .prodPrice(prodPrice)
                .prodStock(prodStock)
                .prodDiscount(prodDiscount)
                .prodImage1(prodImage1)
                .prodImage2(prodImage2)
                .prodImage3(prodImage3)
                .prodPoint(prodPoint)
                .prodEtc(prodEtc)
                .prodDelivery(prodDelivery)
                .prodRegDate(prodRegDate)
                .build();
    }

}
