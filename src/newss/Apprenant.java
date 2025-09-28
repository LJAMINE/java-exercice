package newss;

public class Apprenant {

    private int  id;
    private String name;
    private int score;

   static int count=0;


    public Apprenant(String name,int score){
        this.name=name;
        this.score=score;
        this.id=++count;
    }


    @Override
    public String toString() {
        return "Apprenant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score='" + score + '\'' +
                ", count=" + count +
                '}';
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

