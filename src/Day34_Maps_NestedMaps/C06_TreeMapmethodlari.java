package Day34_Maps_NestedMaps;

import java.util.TreeMap;

public class C06_TreeMapmethodlari {
    public static void main(String[] args) {

        TreeMap<String,Integer> harfsayilariMap=new TreeMap<>();
        harfsayilariMap.put("A", 10);
        harfsayilariMap.put("C",15);
        harfsayilariMap.put("D",3);
        harfsayilariMap.put("K",5);

        System.out.println(harfsayilariMap); // {A=10, C=15, D=3, K=5}

        System.out.println(harfsayilariMap.subMap("C", "F")); // {C=15, D=3}

        System.out.println(harfsayilariMap.subMap("C", "K")); // {C=15, D=3} C dahil K haric

        System.out.println(harfsayilariMap.subMap("B", "K")); //{C=15, D=3}

        System.out.println(harfsayilariMap.descendingMap()); //{K=5, D=3, C=15, A=10} tersden yazidirir

        System.out.println(harfsayilariMap.lowerKey("E")); // E den daha az olan D var

        System.out.println(harfsayilariMap.lowerKey("D")); // C

        System.out.println(harfsayilariMap.floorKey("E")); // D

        System.out.println(harfsayilariMap.floorKey("D")); //D

        System.out.println(harfsayilariMap.higherKey("D")); //K

        System.out.println(harfsayilariMap.ceilingKey("D")); //D

        System.out.println(harfsayilariMap); //{A=10, C=15, D=3, K=5}

        System.out.println(harfsayilariMap.headMap("D")); // {A=10, C=15}

        System.out.println(harfsayilariMap.headMap("D", true)); // {A=10, C=15, D=3}

        System.out.println(harfsayilariMap.tailMap("C")); // {C=15, D=3, K=5}

        System.out.println(harfsayilariMap.tailMap("C", false)); //{D=3, K=5}

        System.out.println(harfsayilariMap.pollFirstEntry());//A=10 getirir ve siler
        System.out.println(harfsayilariMap); // {C=15, D=3, K=5}

        System.out.println(harfsayilariMap.pollLastEntry()); //K=5
        System.out.println(harfsayilariMap); //{C=15, D=3}

    }


}
