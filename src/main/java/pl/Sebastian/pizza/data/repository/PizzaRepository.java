package pl.Sebastian.pizza.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.Sebastian.pizza.data.entity.pizza.PizzaEntity;

public interface PizzaRepository extends JpaRepository<PizzaEntity, Integer>{
}
