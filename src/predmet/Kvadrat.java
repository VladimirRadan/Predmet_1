package predmet;

public class Kvadrat extends Predmet{

    //overriding
    @Override
    protected void povrsina() {
        super.povrsina();
        System.out.println(" Kvadrat: " + Math.pow(x, 2));
    }



}
