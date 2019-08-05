package kg.tasks.modules.models;

import com.sun.syndication.feed.synd.SyndEntryImpl;
import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.io.FeedException;
import com.sun.syndication.io.SyndFeedInput;
import com.sun.syndication.io.XmlReader;
import kg.tasks.modules.interfaces.INews;
import kg.tasks.modules.interfaces.IRssHelper;
import kg.tasks.modules.models.news.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class LentaRuNews implements INews {
    @Autowired
    private IRssHelper rssHelper;

    @Override
    public List<News> getNews(int count) {
        List<News> news = new ArrayList<>();
        SyndFeed feed = rssHelper.getData("https://lenta.ru/rss/top7");

        if(feed != null) {
            List entries = feed.getEntries();
            entries = (List) entries.stream().limit(count).collect(Collectors.toList());
            for (var entry : entries) {
                SyndEntryImpl en = (SyndEntryImpl) entry;
                news.add(new News(en.getTitle(), en.getDescription().getValue(), en.getUri()));
            }
        }
        return news;
    }
}
