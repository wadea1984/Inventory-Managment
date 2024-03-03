package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class inventory {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long ItemId;
    private String ItemName;
    private Long quanity;
    private double price;

}
