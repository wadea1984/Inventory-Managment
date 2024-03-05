package com.example.demo.service;
import  com.example.demo.entity.*;
import java.util.List;


public interface inventoryService {
	// Save operation
    inventory saveItem(inventory Item);
 
    // Read operation
    List<inventory> fetchDepartmentList();
 
    // Update operation
    inventory updateItem(inventory Inventory,
                                Long ItemId);
 
    // Delete operation
    void deleteItemId(Long ItemId);

}
