package hive.hivetech.footballclub.service;
import hive.hivetech.footballclub.model.News;
import java.util.List;

public interface INewsService {

    void saveNews(News news);

    void deleteNews(Long idToDelete);

    List<News> getAllNews();

    News getNewsByID(Long id);

    void updateNews(News news);
}
