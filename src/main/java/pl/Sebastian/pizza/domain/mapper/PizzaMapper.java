package pl.Sebastian.pizza.domain.mapper;

import org.springframework.stereotype.Component;
import pl.Sebastian.pizza.data.entity.pizza.PizzaEntity;
import pl.Sebastian.pizza.remote.rest.dto.request.AddPizzaDto;

@Component
public class PizzaMapper {
    public PizzaEntity mapToPizzaEntity(AddPizzaDto addPizzaDto){
        PizzaEntity pizzaEntity = new PizzaEntity();
        pizzaEntity.setName(addPizzaDto.getName());
        return pizzaEntity;
    }
}
