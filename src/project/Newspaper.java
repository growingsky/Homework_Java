package project;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Newspaper {

     private ArrayList<Article> articles = new ArrayList<>();

    public ArrayList<Article> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<Article> articles) {
        this.articles = articles;
    }

    public void censorAndAddArticle(Article article){
        article.setText(getCensor(article.getSection()).checkTheArticle(article.getText()));
        articles.add(article);
    }

    private Censor getCensor(Section section) {
        switch (section){
            case ADULT:
                return new AdultCensor();
            case CHILD:
                return new ChildCensor();
            case FUN:
                return new FunCensor();
            default:
                    throw new IllegalArgumentException();
        }
    }

    public List<Article> getArticleBySectionJava7(Section section){
        List<Article> result = new ArrayList<>();
        for (Article article : getArticles()) {
            if (section.equals(article.getSection())){
                result.add(article);
            }
        }
        return result;
    }

    public List<Article> getArticleBySectionJava8(Section section){
        Predicate<Article> predicate = (article) -> section.equals(article.getSection());


        return getArticles().stream().filter(predicate).collect(Collectors.toList());
    }

}
