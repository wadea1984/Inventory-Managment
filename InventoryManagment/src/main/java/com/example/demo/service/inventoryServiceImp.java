package com.example.demo.service;
import  com.example.demo.entity.*;
import com.example.demo.repository.InventoryRepository;
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class inventoryServiceImp implements inventoryService{
	@Autowired
    private InventoryRepository inventoryRepository;
 
    // Save operation
    @Override
    public inventory saveItem(inventory Inventory)
	 {
	        return inventoryRepository.save(Inventory);
	    }
	 
	    // Read operation
	    @Override public List<inventory> fetchItemList()
	    {
	        return (List<inventory>)
	            inventoryRepository.findAll();
	 }
 
    // Update operation
    @Override
    public inventory
    updateItem(inventory Inventory,
                     Long ItemId)
       
    {
        inventory ItemDB
            = inventoryRepository.findById(ItemId)
                  .get();
 
        if (Objects.nonNull(Inventory)
            && !"".equalsIgnoreCase(
                Inventory.getItemName())) {
            ItemDB.setItemName(
                Inventory.getItemName());
        }
 
        if (Objects.nonNull(
        		Inventory.getQuanity())&&Inventory.getQuanity()>0) 
        {
            ItemDB.setQuanity(
            		Inventory.getQuanity());
        }
        
 
        if (Objects.nonNull(Inventory.getPrice())&&Inventory.getPrice()>0)
        {
            ItemDB.setPrice(
                Inventory.getPrice());
        }
 
        return inventoryRepository.save(ItemDB);
    }
 
    // Delete operation
    @Override
    public void deleteItemId(Long ItemId)
    {
        inventoryRepository.deleteById(ItemId);
    }
	

}
