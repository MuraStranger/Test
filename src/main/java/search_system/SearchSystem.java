package search_system;

import com.sun.deploy.net.URLEncoder;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import search_system.ISearchSystem;

import java.net.URLDecoder;


/**
 * Created by Мура on 12.04.2017.
 */
public class SearchSystem implements ISearchSystem {

    private String nameSystem;
    private String search;

    public SearchSystem(String nameSystem, String search) {
        this.nameSystem = nameSystem;
        this.search = search;
    }


    @Override
    public void showResultSearch() throws Exception{
        Elements links = getLink(nameSystem, search);
        String title = links.get(0).text();
        String url = links.get(0).absUrl("href");

        System.out.println("Title: " + title);
        System.out.println("URL: " + url);
    }

    @Override
    public Elements getLink (String nameSystem, String search) throws Exception{
        String charset = "UTF-8";
        String userAgent = "Mozilla/5.0 (Android 7.1.1; Mobile; rv:52.0) Gecko/52.0 Firefox/52.0";
        Elements links = Jsoup.connect(nameSystem + URLEncoder.encode(search, charset)).userAgent(userAgent).get().select(".g>.r>a");
        return links;
    }
}
