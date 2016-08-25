package me.shikichee.api.configuration;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;

/**
 * Created by tshikichi on 2016/08/23.
 */
@Configuration
public class MongoConfiguration  extends AbstractMongoConfiguration {
  @Value("${spring.data.mongodb.host}")
  private String mongoHost;

  @Value("${spring.data.mongodb.port}")
  private Integer mongoPort;

  @Value("${spring.data.mongodb.database}")
  private String mongoDB;

  @Override
  public MongoMappingContext mongoMappingContext()
      throws ClassNotFoundException {
    return super.mongoMappingContext();
  }

  @Override
  @Bean
  public Mongo mongo() throws Exception {
    return new MongoClient(mongoHost,mongoPort);
  }

  @Override
  protected String getDatabaseName() {
    return mongoDB;
  }

  @Bean
  public MongoTemplate mongoTemplate() throws Exception{
    return new MongoTemplate(mongo(), this.getDatabaseName());
  }
}
