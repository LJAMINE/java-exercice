package exe;

abstract  class Item {

public String title;

    public Item(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public int year;



public abstract void getInfo();
}
