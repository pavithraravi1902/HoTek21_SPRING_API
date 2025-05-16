package com.hotek21.hotel_service.controller;

import com.hotek21.hotel_service.model.HotelBrand;
import com.hotek21.hotel_service.service.HotelBrandService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotek21/hotel-brand")
@RequiredArgsConstructor
@Tag(name = "Hotel Brand API", description = "Endpoints for managing hotel brand")
public class HotelBrandController {

    private final HotelBrandService hotelBrandService;

    @PostMapping
    public ResponseEntity<HotelBrand> createHotelBrand(@RequestBody HotelBrand hotel_brand) {
        return ResponseEntity.ok(hotelBrandService.createHotelBrand(hotel_brand));
    }

    @GetMapping("/{id}")
    public ResponseEntity<HotelBrand> getHotelBrandById(@PathVariable Long id) {
        return hotelBrandService.getHotelBrandById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<HotelBrand>> getAllHotels() {
        return ResponseEntity.ok(hotelBrandService.getAllHotelsBrand());
    }

    @PutMapping("/{id}")
    public ResponseEntity<HotelBrand> updateHotelBrand(@PathVariable Long id, @RequestBody HotelBrand hotel_brand) {
        return ResponseEntity.ok(hotelBrandService.updateHotelBrand(id, hotel_brand));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHotelBrand(@PathVariable Long id) {
        hotelBrandService.deleteHotel(id);
        return ResponseEntity.noContent().build();
    }
}
