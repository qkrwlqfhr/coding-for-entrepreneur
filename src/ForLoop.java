/*
    *for-loop
    *original
    *for-each
    *while
*/

import java.util.ArrayList;
import java.util.Arrays;

public class ForLoop {
    public void explainForLoop(){
        String[] strings = {
                "hello","this","is","jiprok",
                "hello","this","is","jiprok",
                "hello","this","is","jiprok",
                "hello","this","is","jiprok",
                "hello","this","is","jiprok",
        };

/*        System.out.println("hello");
        System.out.println("this");
        System.out.println("is");
        System.out.println("jiprok");*/

        // ++operator
        //int testInt = 3;
        //testInt++;
        //System.out.println(testInt);

        for(int i=0; i<strings.length; i++){
            System.out.println(strings[i]);
        }
    }

    public void explainForLoopWithArrayList(){
        String[] strings = {"hello","this","is","jiprok"};
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(strings));
        arrayList.add("!");
        for(int i=0; i<arrayList.size(); i++){
            System.out.println(arrayList.get(i));
            System.out.println(i +  " : " + arrayList.get(i));
        }

        for (String targetString : arrayList) {
            System.out.println(targetString);
        }
    }

    public void explainWhile(){
        int testInt = 0;
/*        while(true){
            System.out.println(testInt);
            testInt++;
        }*/

        String[] strings = {"hello","this","is","jiprok"};
        while(testInt < strings.length){
            System.out.println(strings[testInt]);
            testInt++;
        }

    }
}
