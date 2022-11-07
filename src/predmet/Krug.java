package predmet;

import java.text.DecimalFormat;

public class Krug extends Predmet{

    private double r;
    private final static double PI = Math.PI;


    @Override
    public void povrsina() {
        super.povrsina();
        DecimalFormat df  = new DecimalFormat("0.00");
        double rezultat = Math.pow(r, 2) * PI;
        System.out.println("Krug: " + df.format(rezultat));
    }


    //overloading
    public void povrsina(double r){
        super.povrsina();
        DecimalFormat df  = new DecimalFormat("0.00");
        double rezultat = Math.pow(r, 2) * PI;
        System.out.println("Krug: " + df.format(rezultat));
    }

    public void povrsina(double r, String ispis){
        super.povrsina();
        DecimalFormat df  = new DecimalFormat("0.00");
        double rezultat = Math.pow(r, 2) * PI;
        System.out.println(ispis + " " + df.format(rezultat));
    }





    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }




}
