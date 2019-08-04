package kg.tasks.modules.services;

import kg.tasks.modules.interfaces.ICurrency;
import kg.tasks.modules.interfaces.INews;
import kg.tasks.modules.models.currency.ValuteCursOnDate;
import kg.tasks.modules.models.news.News;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class NewsService {
    private INews news;

    public void setNews(INews news) {
        this.news = news;
    }

    public List<News> getNews(int newsCount) {
        return news.getNews(newsCount);
    }
}
