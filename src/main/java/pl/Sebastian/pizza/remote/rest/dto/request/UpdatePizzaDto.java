package pl.Sebastian.pizza.remote.rest.dto.request;

import pl.Sebastian.pizza.remote.rest.dto.response.SizeDto;

import java.util.List;

public class UpdatePizzaDto {
    private String name;
    private List<SizeDto> sizes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SizeDto> getSizes() {
        return sizes;
    }

    public void setSizes(List<SizeDto> sizes) {
        this.sizes = sizes;
    }

    public UpdatePizzaDto(String name, List<SizeDto> sizes) {
        this.name = name;
        this.sizes = sizes;
    }
}
