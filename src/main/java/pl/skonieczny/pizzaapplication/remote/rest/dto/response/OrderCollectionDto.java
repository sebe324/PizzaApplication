package pl.skonieczny.pizzaapplication.remote.rest.dto.response;

import java.util.List;

public class OrderCollectionDto {

    private List<OrderDto> orders;

    public OrderCollectionDto() {
    }

    public OrderCollectionDto(List<OrderDto> orders) {
        orders = orders;
    }

    public List<OrderDto> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderDto> orders) {
        orders = orders;
    }
}
