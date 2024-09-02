package com.example.Store;



import jakarta.persistence.*;


@Entity
public class Store {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String storeName;
	private String storeType;
	private String storeTiming;
	private String storeAddress;
	private String storeContactnumber;
	private Long storeId;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStoreType() {
		return storeType;
	}

	public void setStoreType(String storeType) {
		this.storeType = storeType;
	}

	public String getStoreTiming() {
		return storeTiming;
	}

	public void setStoreTiming(String storeTiming) {
		this.storeTiming = storeTiming;
	}

	public String getStoreAddress() {
		return storeAddress;
	}

	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}

	public String getStoreContactnumber() {
		return storeContactnumber;
	}

	public void setStoreContactnumber(String storeContactnumber) {
		this.storeContactnumber = storeContactnumber;
	}
	
	public Long getStoreId() {
		return storeId;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}
	
	
}
