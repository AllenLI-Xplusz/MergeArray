package com.xplusz;

import java.util.Set;
import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{



        public Set<String> mergearray(Set<String> setA, Set<String> setB)
        {

            Set<String> setIntersection = new HashSet<String>();
            String s = "";
            Iterator<String> iterA = setA.iterator();
            while (iterA.hasNext()) {
                s = iterA.next();
                if (setB.contains(s)) {
                    setIntersection.add(s);
                }
            }
            return setIntersection;
        }








    public static void main( String[] args )
    {
             App a1=new App();
             int a[]=new int[10];

                 int b[]=new int[10];

        Set  set1=new HashSet();
        set1.add("1");
        set1.add("2");
        set1.add("3");
        set1.add("4");

        Set  set2=new HashSet();
        set2.add("1");
        set2.add("2");
        set2.add("3");
        set2.add("4");


      Set set3=  a1.mergearray(set1 ,set2);
        Iterator<String> iterA = set3.iterator();
        while (iterA.hasNext()) {
            System.out.println(iterA.next().toString());
        }

    }
}
