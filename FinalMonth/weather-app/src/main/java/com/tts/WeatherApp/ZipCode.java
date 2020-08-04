package com.tts.WeatherApp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
class ZipCode {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NonNull
    private Long id;
    @NonNull
    private String zip;

    public ZipCode(@NonNull String zip) {
        this.zip = zip;
    }
}
