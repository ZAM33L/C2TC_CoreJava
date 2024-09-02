package com.example.Store;
import com.example.Store.Store;
import com.example.Store.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class StoreService {
	@Autowired
    private StoreRepository storeRepository;

    public List<Store> getAllStores() {
        return storeRepository.findAll();
    }

    public Store getStoreById(Long id) {
        return storeRepository.findById(id).orElse(null);
    }

    public Store saveStore(Store store) {
        return storeRepository.save(store);
    }

    public void deleteStore(Long id) {
    	storeRepository.deleteById(id);
    }
}
