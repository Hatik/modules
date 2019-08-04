package kg.tasks.modules.models;

import com.sun.syndication.feed.synd.SyndEntryImpl;
import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.io.FeedException;
import com.sun.syndication.io.SyndFeedInput;
import com.sun.syndication.io.XmlReader;
import kg.tasks.modules.interfaces.INews;
import kg.tasks.modules.models.news.News;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LentaRuNews implements INews {
    @Override
    public List<News> getNews(int count) {
        List<News> news = new ArrayList<>();
        try {
            URL feedSource = new URL("https://lenta.ru/rss/top7");

            SyndFeedInput input = new SyndFeedInput();
            SyndFeed feed = input.build(new XmlReader(feedSource));
            List entries = feed.getEntries();
            entries = (List) entries.stream().limit(count).collect(Collectors.toList());
            for (var entry: entries) {
                SyndEntryImpl en = (SyndEntryImpl ) entry;
                news.add(new News(en.getTitle(),en.getDescription().getValue(), en.getUri()));
            }
        } catch (IOException | FeedException e) {
            e.printStackTrace();
        }
        return news;
    }
}
