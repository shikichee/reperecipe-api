package me.shikichee.api.repository;

import me.shikichee.api.model.Ingredient;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by tshikichi on 2016/08/23.
 */
public class IngredientSearchRepository extends MongoRepository<Ingredient, String> {
}
