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
	public Long getItemId() {
		return ItemId;
	}
	public void setItemId(Long itemId) {
		ItemId = itemId;
	}
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	public Long getQuanity() {
		return quanity;
	}
	public void setQuanity(Long quanity) {
		this.quanity = quanity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "inventory [ItemId=" + ItemId + ", ItemName=" + ItemName + ", quanity=" + quanity + ", price=" + price
				+ "]";
	}
    
    

}
