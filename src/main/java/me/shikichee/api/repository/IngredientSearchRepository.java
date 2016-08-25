package me.shikichee.api.repository;

import me.shikichee.api.model.Ingredients;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * Created by tshikichi on 2016/08/23.
 */

public interface IngredientSearchRepository extends MongoRepository<Ingredients, String> {
  @Query(value = "{'readingName': {$regex : '^?0', $options: 'i'}}")
  List<Ingredients> findByReadingName(String searchWord);
}
