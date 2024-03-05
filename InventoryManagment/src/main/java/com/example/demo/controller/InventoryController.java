package com.example.demo.controller;

import  com.example.demo.entity.*;
import  com.example.demo.service.*;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

public class InventoryController {
	 @Autowired private inventoryService InventoryService;
	 
	    // Save operation
	    @PostMapping("/inventory")
	 
	    public inventory saveItem(
	        @Valid @RequestBody inventory Inventory)
	    {
	        return InventoryService.saveItem(Inventory);
	    }
	    // Read operation
	    @GetMapping("/inventory")
	 
	    public List<inventory> fetchDepartmentList()
	    {
	        return InventoryService.fetchItemList();
	    }
	 
	    // Update operation
	    @PutMapping("/departments/{id}")
	 
	    public inventory
	    updateDepartment(@RequestBody inventory Inventory,
	                     @PathVariable("id") Long ItemId)
	    {
	        return InventoryService.updateItem(
	            Inventory, ItemId);
	    }
	 
	    // Delete operation
	    @DeleteMapping("/departments/{id}")
	 
	    public String deleteItemtById(@PathVariable("id")
	                                       Long ItemId)
	    {
	    	InventoryService.deleteItemId(ItemId);
	        return "Deleted Successfully";
	    }
	
	

}

