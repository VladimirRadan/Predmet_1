package predmet;

public class Predmet {

    protected double x;
    protected double y;

    protected void povrsina(){
        System.out.println("Povrsina predmeta: ");
    }

    @Override
    public String toString() {
        return "Predmet{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }



}
