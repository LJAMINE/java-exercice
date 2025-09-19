public class Magazine extends Item {

    public String author;

    public Magazine(String title, int year,String author) {
        super(title, year);
        this.author=author;
    }

    @Override
    public void getInfo() {
        System.out.println(author+title+year);
    }
}
