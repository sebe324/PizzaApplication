package pl.Sebastian.pizza.domain.service;

import org.springframework.stereotype.Service;
import pl.Sebastian.pizza.data.entity.pizza.PizzaEntity;
import pl.Sebastian.pizza.data.repository.PizzaRepository;
import pl.Sebastian.pizza.domain.mapper.PizzaMapper;
import pl.Sebastian.pizza.remote.rest.dto.request.AddPizzaDto;
import pl.Sebastian.pizza.remote.rest.dto.response.PizzaDto;

import static pl.Sebastian.pizza.domain.service.AuthorizationService.checkToken;

@Service
public class PizzaService {
    private final PizzaRepository pizzaRepository;
    private final PizzaMapper pizzaMapper;

    public PizzaService(PizzaRepository pizzaRepository, PizzaMapper pizzaMapper) {
        this.pizzaRepository = pizzaRepository;
        this.pizzaMapper = pizzaMapper;
    }

    public PizzaDto addPizza(AddPizzaDto addPizzaDto, String token){
checkToken(token);
//wpisujemy nazwe pizzy do bazy danych
    PizzaEntity pizzaEntity = new PizzaEntity();
    PizzaEntity.setName(addPizzaDto.getName());
    PizzaEntity savedPizzaEntity=pizzaRepository.save(pizzaEntity);
    pizzaRepository.save(pizzaMapper.mapToPizzaEntity(addPizzaDto));
}
}
