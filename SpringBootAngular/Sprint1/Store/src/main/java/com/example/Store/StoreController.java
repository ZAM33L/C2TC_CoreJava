package com.example.Store;
import com.example.Store.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/store")
public class StoreController {
	 @Autowired
	    private StoreService storeService;

	    @GetMapping
	    public List<Store> getAllStores() {
	        return storeService.getAllStores();
	    }

	    @GetMapping("/{id}")
	    public Store getStoreById(@PathVariable Long id) {
	        return storeService.getStoreById(id);
	    }

	    @PostMapping
	    public Store createStore(@RequestBody Store store) {
	        return storeService.saveStore(store);
	    }

	    @PutMapping("/{id}")
	    public Store updateStore(@PathVariable Long id, @RequestBody Store store) {
	    	Store existingStore = storeService.getStoreById(id);
	        if (existingStore != null) {
	            existingStore.setStoreName(store.getStoreName());
	            existingStore.setStoreType(store.getStoreType());
	            existingStore.setStoreTiming(store.getStoreTiming());
	            existingStore.setStoreAddress(store.getStoreAddress());
	            existingStore.setStoreContactnumber(store.getStoreContactnumber());
	            existingStore.setStoreId(store.getStoreId());
	            return storeService.saveStore(existingStore);
	        }
	        return null;
	    }

	    @DeleteMapping("/{id}")
	    public void deleteStore(@PathVariable Long id) {
	    	storeService.deleteStore(id);
	    }
}

