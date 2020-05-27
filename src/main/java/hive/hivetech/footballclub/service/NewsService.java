package hive.hivetech.footballclub.service;
import hive.hivetech.footballclub.model.News;
import hive.hivetech.footballclub.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class NewsService implements INewsService {

    @Autowired
    private NewsRepository newsRepository;

    //Done
    @Override
    public List<News> getAllNews() {
        List<News> newsList = new ArrayList<>();
        newsRepository.findAll().forEach(newsList::add);
        return newsList;
    }

    //Done
    @Override
    public News getNewsByID(Long id) {
        Optional<News> optionalNews = newsRepository.findById(id);
        if(optionalNews.isPresent()){
            return optionalNews.get();
        }
        return null;
    }

    @Override
    public void updateNews(News news){
        newsRepository.save(news);
    }

    //ok
    @Override
    public void deleteNews(Long idToDelete) {
        newsRepository.deleteById(idToDelete);
    }

    //ok
    @Override
    public void saveNews(News news) {
        newsRepository.save(news);
    }
}
