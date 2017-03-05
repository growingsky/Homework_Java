package project;

public abstract class Article {
    private String title;
    private String text;
    private String authorName;
    private Section section;


    protected String getTitle() {
        return title;
    }

    protected void setTitle(String title) {
        this.title = title;
    }

    protected String getText() {
        return text;
    }

    protected void setText(String text) {
        this.text = text;
    }

    protected String getAuthorName() {
        return authorName;
    }

    protected void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    protected Section getSection() {
        return section;
    }

    protected void setSection(Section section) {
        this.section = section;
    }
}
