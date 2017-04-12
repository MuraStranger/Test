package search_system;

import org.jsoup.select.Elements;

/**
 * Created by Мура on 12.04.2017.
 */
public interface ISearchSystem {
    void showResultSearch() throws Exception;
    Elements getLink (String nameSystem, String search) throws Exception;
}
