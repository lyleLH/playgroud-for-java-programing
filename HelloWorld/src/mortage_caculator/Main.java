package mortage_caculator;

import com.lylelh.oop.SupreGod;
import com.lylelh.oop.VikinGod;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world");

        VikinGod thor = new VikinGod();
        thor.killMonster();
        thor.killMonster();

        SupreGod zeus = new SupreGod();
        zeus.killTitan();

        System.out.println(thor.getAge());
        System.out.println(zeus.getAge());

    }

    public void dayOne(){
        System.out.println("god create the whole word,there is a light ,there is a light ");
    }
}
