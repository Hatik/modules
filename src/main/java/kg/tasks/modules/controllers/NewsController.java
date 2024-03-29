package kg.tasks.modules.controllers;

import kg.tasks.modules.interfaces.INews;
import kg.tasks.modules.models.LentaRuNews;
import kg.tasks.modules.models.util.ResponseEntity;
import kg.tasks.modules.services.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/news")
@CrossOrigin
public class NewsController {
    @Autowired
    private NewsService newsService;
    @Autowired
    private INews lentaRuNews;

    @GetMapping
    public ResponseEntity getNews() {
        ResponseEntity response = new ResponseEntity();
        try {
            newsService.setNews(lentaRuNews);
            response.setData(newsService.getNews(5));
        } catch (Exception e) {
            response.setSuccess(false);
            response.setMessage(e.toString());
        }
        return response;
    }

}
