public class Ebook extends Book{

    private String filename;
    
    
    public Ebook(String title, String author, String filename){
        super(title,author);
        this.filename = filename;
    }


    public String getFilename() {
        return filename;
    }


    public void setFilename(String filename) {
        this.filename = filename;
    }
    
    public String display(){
        return "title: " + getTitle() + "," + "author: " + getAuthor() + "filename: " + filename;
    
}
}
