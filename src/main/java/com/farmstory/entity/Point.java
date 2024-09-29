package com.farmstory.entity;

import com.farmstory.dto.PointDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity                 // 엔티티 객체 정의
@Table(name = "point")
public class Point {
    @Id
    private int pointNo;
    private String userId;
    private int pointValue;
    private String pointDesc;

    @CreationTimestamp
    private String pointDate;

    public PointDTO toDTO() {
        return PointDTO.builder()
                .pointNo(pointNo)
                .userId(userId)
                .pointValue(pointValue)
                .pointDesc(pointDesc)
                .pointDate(pointDate)
                .build();
    }

}
