package com.hotek21.hotel_service.service;

import com.hotek21.hotel_service.model.HotelBrand;

import java.util.List;
import java.util.Optional;

public interface HotelBrandService {
    HotelBrand createHotelBrand(HotelBrand hotel_brand);
    Optional<HotelBrand> getHotelBrandById(Long id);
    List<HotelBrand> getAllHotelsBrand();
    HotelBrand updateHotelBrand(Long id, HotelBrand hotel_brand);
    void deleteHotel(Long id);
}
