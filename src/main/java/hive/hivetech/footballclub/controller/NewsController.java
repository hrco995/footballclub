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

    @RequestMapping(value = "/news", method = RequestMethod.GET)
    public List<News> getAllNews(){
        return newsService.getAllNews();
    }

    @RequestMapping(value = "/news/{id}", method = RequestMethod.GET)
    public News getNewsByID(@PathVariable Long id){
        return newsService.getNewsByID(id);
    }

    @RequestMapping(value = "/news/save", method = RequestMethod.POST)
    public void saveNews(@RequestBody News news){
        newsService.saveNews(news);
    }

    @RequestMapping(value = "/news/update", method = RequestMethod.PUT)
    public void updateNews(@RequestBody News news){
        newsService.updateNews(news);
    }

    @RequestMapping(value = "/news/delete", method = RequestMethod.DELETE)
    public void deleteNews(Long idToDelete){
        newsService.deleteNews(idToDelete);
    }
}
