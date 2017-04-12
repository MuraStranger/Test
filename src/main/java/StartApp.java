import search_system.SearchSystem;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Мура on 12.04.2017.
 */
public class StartApp {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String search = reader.readLine();
        String nameSystem = "http://www.google.com/search?q=";

        SearchSystem searchSystem = new SearchSystem(nameSystem, search);
        searchSystem.showResultSearch();
    }
}
