package predmet;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Krug krug = new Krug();
        krug.setR(5);
        //Polimorfizam podtipa
        Predmet krug2 = new Krug();
        krug2.povrsina();


        List lista = new ArrayList();
        lista.add(10);
        lista.add("Pera");
        lista.add(true);
        lista.add('A');

        for (Object o : lista) {
            System.out.println(o);
        }



        ArrayList<Integer> list  = new ArrayList<>();
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(80);
        list.remove(0);
        System.out.println(list.contains(8));

        //System.out.println(list);

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

        for (Integer i:list) {
            System.out.println(i);
        }






    }



}
