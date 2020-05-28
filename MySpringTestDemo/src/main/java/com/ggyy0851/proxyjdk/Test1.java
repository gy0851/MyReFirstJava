package com.ggyy0851.proxyjdk;

/**
 * @author GeYao
 * @create 2020-05-28 - 18:08
 */
public class Test1 {
    public static void main(String[] args)   {
        //该类实现了仆人对师傅的代理，Proxy类需要传入类加载器（任意），需执行的方法（多个接口类对象），代理类虽然并未实现相应
        //的接口方法，但依然可以通过反射来实现静态代理时的效果
        //最终效果是：当某接口的方法被实现时，可以由代理类来对每个要执行的接口方法进行代理处理
        /*Minion minion = new Minion();
        minion.setMaster(new Master());
        KongFu o = (KongFu)Proxy.newProxyInstance(Main.class.getClassLoader(),new Class[]{KongFu.class},minion);
        o.fight();
        System.out.println("--------------------------------------------------");
        o.fly();*/
    }
}
