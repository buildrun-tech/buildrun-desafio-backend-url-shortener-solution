package tech.buildrun.shortener.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import tech.buildrun.shortener.entities.Url;

public interface UrlRepository extends MongoRepository<Url, String> {
}
