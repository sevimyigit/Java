package Day29_final_abstractClasses;

public class EChild extends DParent{
    @Override
    public void method1() {
        System.out.println("parent class'daki mecburi override edilecek method1'i override ettik");

    }

    @Override
    public void method2() {
        System.out.println("parent class'daki mecburi override edilecek method2'i override ettik");

    }

    /*
        Klasik inheritance ile parent child iliskisi olusturdugumuzda
        Parent class'daki tum ozellikleri otomatik olarak kazaniriz
        Ancak method'lari Override etme MECBURIYETI YOKTUR
        Ister override edip kendimize ozellestiririz,
        Istersek de parent class'daki haliyle kullaniriz

     */
    public static void main(String[] args) {

        // DParent obj=new DParent();
        //'DParent' is abstract; cannot be instantiated
        //Abstract class larin contructor lari vardir ama OBJE URETILEMEZ

        EChild child1=new EChild();
        child1.method1(); //parent class'daki mecburi override edilecek method1'i override ettik
        child1.method2(); //parent class'daki mecburi override edilecek method2'i override ettik
        child1.method3(); //Parent class'indan method3 calisti

        DParent child2=new EChild();
        child2.method1();
        child2.method2();
        child2.method3();
    }

}
