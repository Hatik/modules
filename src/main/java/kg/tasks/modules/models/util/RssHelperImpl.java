package kg.tasks.modules.models.util;

import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.io.FeedException;
import com.sun.syndication.io.SyndFeedInput;
import com.sun.syndication.io.XmlReader;
import kg.tasks.modules.interfaces.IRssHelper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URL;
import java.util.List;

@Component
public class RssHelperImpl implements IRssHelper {
    @Override
    public SyndFeed getData(String url) {
        try {
            URL feedSource = new URL(url);

            SyndFeedInput input = new SyndFeedInput();
            SyndFeed feed = input.build(new XmlReader(feedSource));
            return feed;
        } catch (IOException | FeedException e) {
            //Write to Database log with params
            e.printStackTrace();
        }
        return null;
    }
}
