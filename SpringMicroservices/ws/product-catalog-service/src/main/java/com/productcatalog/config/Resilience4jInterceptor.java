package com.productcatalog.config;

import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import io.github.resilience4j.circuitbreaker.CircuitBreakerRegistry;
import io.github.resilience4j.timelimiter.TimeLimiter;
import io.github.resilience4j.timelimiter.TimeLimiterRegistry;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import java.io.IOException;

public class Resilience4jInterceptor implements ClientHttpRequestInterceptor {

    private CircuitBreakerRegistry circuitBreakerRegistry;
    private TimeLimiterRegistry timeLimiterRegistry;

    public Resilience4jInterceptor(CircuitBreakerRegistry circuitBreakerRegistry, TimeLimiterRegistry timeLimiterRegistry) {
        this.circuitBreakerRegistry = circuitBreakerRegistry;
        this.timeLimiterRegistry = timeLimiterRegistry;
    }

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
        String serviceName = "backend"; // Define the service name or determine it based on the request
        CircuitBreaker circuitBreaker = circuitBreakerRegistry.circuitBreaker(serviceName);
        TimeLimiter timeLimiter = timeLimiterRegistry.timeLimiter(serviceName);

        // Apply Circuit Breaker
        try {
			return circuitBreaker.executeCheckedSupplier(() -> {
			    ClientHttpResponse response = execution.execute(request, body);
			    // You can add more logic here if needed
			    return response;
			});
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return null;
    }
}