package Day27_overriding;

public class EParent extends DGrantParent{

    @Override
    protected void method1() {
        System.out.println("P method1");

        //@override rotasyonu overriden method ile overriding methodu ilisiklendiri
        //eger overriddden methodda bu iliskiyi bozacak bir degisiklik yapilirsa
        //@overide CTE verir

    }

    protected void method2(){
        System.out.println("P method2");
    }

    private void method3(){
        System.out.println("P method3");
    }
}
