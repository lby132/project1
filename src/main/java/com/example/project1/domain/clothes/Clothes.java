package com.example.project1.domain.clothes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

import static jakarta.persistence.GenerationType.*;
import static lombok.AccessLevel.*;

@Entity
@NoArgsConstructor(access = PROTECTED)
public class Clothes {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String name;
    private int price;
    private String explanation;
    private LocalDate arrive;

}
