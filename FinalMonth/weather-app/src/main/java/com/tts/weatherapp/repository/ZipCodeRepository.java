package com.tts.weatherapp.repository;

import com.tts.weatherapp.model.ZipCode;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ZipCodeRepository extends JpaRepository<ZipCode, Long> {
    public ZipCode findByZip(String zipcode);
}
