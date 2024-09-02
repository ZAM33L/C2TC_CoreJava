package com.example.Store;
import com.example.Store.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
public interface StoreRepository extends JpaRepository<Store, Long>{

}
