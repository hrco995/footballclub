package hive.hivetech.footballclub.repository;

import hive.hivetech.footballclub.model.News;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsRepository extends CrudRepository<News, Long> {
}
