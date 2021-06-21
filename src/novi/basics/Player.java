package novi.basics;

public class Player {
    //velden / attributen //
    private String name;
    private String token;
    private int score;


    // constructor
    public Player(String name, String token){
        this.name =name;
        this.token = token;
        this.score = 0;
    }
    // methodes
    public int getScore(){
    return this.score; // kan ook zonder this.
    }
    public String getName(){
        return this.name;
    }
    public String getToken(){
        return this.token;
    }

    public void setScore(int extraPoints);{
        score = score + extraPoints;
    }


}
