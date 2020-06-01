package hive.hivetech.footballclub.controller;
import hive.hivetech.footballclub.model.News;
import hive.hivetech.footballclub.service.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class NewsController {

    @Autowired
    private INewsService newsService;

    @GetMapping("/news")
    public List<News> getAllNews(){
        return newsService.getAllNews();
    }

    @GetMapping("/news/{id}")
    public News getNewsByID(@PathVariable Long id){
        return newsService.getNewsByID(id);
    }

    @PostMapping("/news/save")
    public void saveNews(@RequestBody News news){
        newsService.saveNews(news);
    }

    @PutMapping("/news/update")
    public void updateNews(@RequestBody News news){
        newsService.updateNews(news);
    }

    @DeleteMapping("/news/delete")
    public void deleteNews(Long idToDelete){
        newsService.deleteNews(idToDelete);
    }
}
