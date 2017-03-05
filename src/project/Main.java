package project;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Newspaper newspaper = new Newspaper();
        newspaper.censorAndAddArticle(new AdultArticle());
        newspaper.censorAndAddArticle(new AdultArticle());
        newspaper.censorAndAddArticle(new ChildArticle());
        newspaper.censorAndAddArticle(new EntertainmentArticle());
        newspaper.getArticles().forEach(System.out::println);
        System.out.println("--------------------------------");
        newspaper.getArticleBySectionJava7(Section.ADULT).forEach(System.out::println);
        System.out.println("--------------------------------");
        newspaper.getArticleBySectionJava8(Section.ADULT).forEach(System.out::println);

    }

}