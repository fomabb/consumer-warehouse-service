package com.example.warehouse_service.dto;

public record Order(
        String orderId,
        String product,
        Integer quantity
) {
}
