package com.hotek21.hotel_service.service.impl;

import com.hotek21.hotel_service.model.HotelBrand;
import com.hotek21.hotel_service.repository.HotelBrandRepository;
import com.hotek21.hotel_service.service.HotelBrandService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class HotelBrandServiceImpl implements HotelBrandService {

    private final HotelBrandRepository hotelBrandRepository;

    @Override
    public HotelBrand createHotelBrand(HotelBrand hotel_brand) {
        return hotelBrandRepository.save(hotel_brand);
    }

    @Override
    public Optional<HotelBrand> getHotelBrandById(Long id) {
        return hotelBrandRepository.findById(id);
    }

    @Override
    public List<HotelBrand> getAllHotelsBrand() {
        return hotelBrandRepository.findAll();
    }

    @Override
    public HotelBrand updateHotelBrand(Long id, HotelBrand hotel_brand) {
        hotel_brand.setId(id);
        return hotelBrandRepository.save(hotel_brand);
    }

    @Override
    public void deleteHotel(Long id) {
        hotelBrandRepository.deleteById(id);
    }
}
