package me.shikichee.api.service;

import me.shikichee.api.model.Ingredients;
import me.shikichee.api.repository.IngredientSearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by tshikichi on 2016/08/23.
 */
@Service
public class IngredientSearchService {

  @Autowired
  private IngredientSearchRepository repository;

  public List<Ingredients> getSearchedIngredients(String searchWord) {
    return repository.findByReadingName(searchWord);
  }
}
