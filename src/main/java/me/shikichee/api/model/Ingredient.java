package me.shikichee.api.model;

import java.util.List;

/**
 * Created by tshikichi on 2016/08/23.
 */
public class Ingredient {
  private String id;
  private String name;
  private List<String> readingName;
  private String category;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<String> getReadingName() {
    return readingName;
  }

  public void setReadingName(List<String> readingName) {
    this.readingName = readingName;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }
}
