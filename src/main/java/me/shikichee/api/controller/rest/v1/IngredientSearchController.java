package me.shikichee.api.controller.rest.v1;

import me.shikichee.api.model.Ingredients;
import me.shikichee.api.service.IngredientSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by tshikichi on 2016/08/22.
 */
@RestController
@RequestMapping("api/v1/ingredients/search")
public class IngredientSearchController {
  private IngredientSearchService service;

  @Autowired
  public IngredientSearchController(IngredientSearchService service) {
    this.service = service;
  }

  @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
  public List<Ingredients> getSearchedIngredients(@RequestParam(required = true) String q) {
    return service.getSearchedIngredients(q);
  }
}


