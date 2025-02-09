package com.ko.playground.basic.domain.children;

import com.ko.playground.basic.support.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Entity
public class Children extends BaseEntity {
    @Column(name = "name", nullable = false)
    String name;

    @Column(name = "sex", nullable = false)
    private Sex sex;

    @Column(name = "year_of_birth", nullable = false)
    private Long yearOfBirth;

    @Column(name = "delivery_zone_id", nullable = false)
    private Long deliveryZoneId;

    @Column(name = "parent_id")
    private Long parentId;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt = LocalDateTime.now();

    public boolean checkAdult() {
        return yearOfBirth <= LocalDateTime.now().getYear() - 18;
    }

    public Long changeDeliveryZone(Long deliveryZoneId) {
        this.deliveryZoneId = deliveryZoneId;
        return this.getId();
    }
}
