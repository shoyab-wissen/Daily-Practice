package com.productcatalog.services;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.productcatalog.beans.Product;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class CatalogService {

    @Autowired
    private RestTemplate restTemplate;

    private static final String BACKEND = "backend";

    /**
     * Retrieves all products from PRODUCT-MGMT-SERVICE.
     * If the service is unavailable, returns a fallback response.
     *
     * @return List of products or a fallback message.
     */
    @CircuitBreaker(name = BACKEND, fallbackMethod = "fallbackGetAllProduct")
    public List<Product> getAllProduct() {
        return restTemplate.getForObject("http://PRODUCT-MGMT-SERVICE/product", List.class);
    }

    /**
     * Fallback method for getAllProduct.
     * Returns a default product list when the service is unavailable.
     *
     * @param throwable The exception that caused the fallback.
     * @return Fallback product list.
     */
    public List<Product> fallbackGetAllProduct(Throwable throwable) {
        // Log the error if necessary
        // For example: logger.error("PRODUCT-MGMT-SERVICE is unavailable", throwable);
        
        // Return a fallback product
        return Collections.singletonList(new Product());
    }
}