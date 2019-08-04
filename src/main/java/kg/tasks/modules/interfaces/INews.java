package kg.tasks.modules.interfaces;

import kg.tasks.modules.models.news.News;

import java.util.List;

public interface INews {
    public List<News> getNews(int count);
}
