package tech.buildrun.urlshortener.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import tech.buildrun.urlshortener.entities.UrlEntity;

public interface UrlRepository extends MongoRepository<UrlEntity, String> {
}
