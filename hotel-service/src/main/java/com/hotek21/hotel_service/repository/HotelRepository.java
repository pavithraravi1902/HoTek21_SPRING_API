package com.hotek21.hotel_service.repository;
import com.hotek21.hotel_service.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {

    List<Hotel> findByBrandId(Long brandId);

    List<Hotel> findByCityId(Long cityId);

    List<Hotel> findByStatus(Hotel.Status status);

    List<Hotel> findByNameContainingIgnoreCase(String name);
}

