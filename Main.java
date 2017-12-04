package HomeExcep;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        outOfMemError();


        int a = 0;
        int b = 0;

        assert (a+b!=0);
        assert false;


    }






    public static void outOfMemError(){
        ArrayList list = new ArrayList();

        while (true){
            String error = "error";
            list.add(error);
        }

    }
}
