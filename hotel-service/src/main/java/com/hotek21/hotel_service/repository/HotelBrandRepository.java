package com.hotek21.hotel_service.repository;

import com.hotek21.hotel_service.model.HotelBrand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelBrandRepository extends JpaRepository<HotelBrand, Long> {
}
