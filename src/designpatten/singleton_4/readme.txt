

  单例：


     1、单例的范围：
 
           java里面的单例，是在虚拟机的范畴，因为装载类功能是虚拟机，所以一个虚拟机通过自己的classLoader装载单例类的时候
                      就会创建一个对象。
    
                             这意味着，如果一个虚拟机有多个ClassLoader，而这些ClassLoader都装载某个类的话，就算这个类是单例，也会产生很多的实例   
                     如果一个机器有多个虚拟机，那这个类就有很多的实例了。
  
  
  
     2、本质：
     
                      控制实例数量，一个类只有一个对象 , jvm保证线程安全
                   
                   
                   
     3、推荐的单例模式
     
                   （1）、类级内部类 -- 用static修饰的内部类叫做类级内部类， 没有用static修饰的叫做对象级内部类              
                                                             类级内部类和外部类对象没有依赖关系。只有第一次使用该类的时候，才会被装载 
                                                             
                                                             
                   （2）、枚举           
                   
               public enum Singleton{
               
                   //定义一个元素，代表一个Singleton实例
                   uniqueInstance;
                   
                   public void singleonOpeartion(){
                   
                   }
                   
               }           
               
               
               
               
               
               
               
               
               
                                                     