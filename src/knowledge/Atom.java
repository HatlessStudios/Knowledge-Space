package knowledge;

/**
 * An atom is a single constituent fact, reference, or idea.
 */
public class Atom {

    private String text;
    private String[] references;
    private String[] categories;

    Atom(String text, String[] references, String[] categories){
        this.text = text;
        this.references = references;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String[] getReferences() {
        return references;
    }

    public void setReferences(String[] references) {
        this.references = references;
    }

    public String[] getCategories() {
        return categories;
    }

    public void setCategories(String[] categories) {
        this.categories = categories;
    }
}
