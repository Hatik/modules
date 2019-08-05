package kg.tasks.modules.interfaces;

import com.sun.syndication.feed.synd.SyndFeed;

public interface IRssHelper {
    SyndFeed getData(String url);
}
