


面向对象的六大原则：

   1、优化代码第一步 ： 单一原则   --  srp
   
                      就是一个类，应该仅有一个引起它变化的原因，简单来说。一个类应该有一组相关性很高的函数，数据的封装。            
                     关键点：每个类只负责一个功能
        
   2、让程序更稳定，更灵活：开闭原则:  open close principle : ocp 
   
                     软件中的对象（类、模块、函数）应该对于扩展是开开放的，但是对于修改是封闭的。
                    当软件需要变化时，应该尽量通过扩展的方式来实现变化，而不是通过修改原有的代码来实现。
   
                    关键点： 软件变化通过 - 抽象（接口、抽象类）、注入
       
       
       
   3、构建扩展性更好的系统：里式替换原则： open close principle : ocp 
      
                   定义：所有引用基类的地方必须能够透明的使用其子类。
                  通俗的讲：只要父类能出现的地方，子类就可以出现，而且替换为子类也不会产生任何错误或者隐藏。             --- 抽象
                  里式替换原则就是依赖于继承、多态两大特性
                  
            例子：
       public class Window{
         public void show(View child){
             child.draw();
         }
       }            
       
       public abstract class View{
         public abstract void draw();
         public void measure(int width, int height){
             
         }
       }
   
       public class Button extends View{
          public void draw(){
             //绘制按钮
          }
       }
       
       public class TextView extends View{
          public void draw(){
            //绘制文本
          }
       }
               上面替换成任何一个子类，都不会引起程序出错。
   
   
   
          关键点：继承、多态性质； 使用父类，但是可以替换成某个具体的子类，而且不会出错。
          
                      通过抽象，确定规范，具体的实现在运行的时候替换掉抽象。 
   
   
   
   
   4、让项目拥有变化的能力：依赖倒置原则： Dependence Inversion Principle -- DIP
    
                 定义：依赖倒置原则指代了一种特定的解耦形式。使得高层次的模块不依赖低层次的模块实现细节的目的
               关键点：      
        1、高层模式不应该依赖底层模块，两者都应该依赖其抽象。
        2、抽象不应该依赖细节。
        3、细节应该依赖抽象。    
          在java中，抽象就是接口或者抽象类，两者都不能被实例化； 
                                细节就是实现类，实现接口或者抽象类产生的类就是细节，可以被直接实例化。
                                
                    高层模块就是调用端，底层模块就是具体实现类      
                    
       依赖倒置原则在java中表现为：模块间的依赖通过抽象类发生，实现类之间不能直接发生依赖关系，其依赖应该通过接口或者抽象类产生。
       
             实例：ImageLoader不应该依赖MemoryCache(具体实现，相当于细节)，而应该依赖抽象。
       
       一句话就是：面向接口编程。
                      
    
   
   5、让系统有更高的灵活性：接口隔离原则：InterfaceSegregation Principles -- ISP
   
                 定义：客户端不应该依赖他不需要的接口。
               另一种定义：类间的依赖关系应该建立在最小的接口上。
               
                  接口隔离原则：将非常庞大的、臃肿的接口拆分成更小和更具体的接口。这样客户端只需要知道他们感兴趣的方法。
                  --接口隔离原则:目的是系统接口耦合，从而容易重构，更改和重新部署。                      
   
       
                   例子：例如我们在使用 FileOutPutStream等操作文件时，最后都需要保证关闭掉
                   
       public void put(Sring url ,Bitmap bmp){
         FileOutputStream ous = null;
          try{
              ous = new FileOutputStream(cacheDir+url);
              bmp.compress(CompressFormat.PNG,100,ous);
          }catch(FileNotFoundExecption e){
            e.printStackTrance();    
          }finally{
              if(ous!=null){
                 try{
                   ous.close();
                 }catch(IOexecption e){
                     e.printStackTrace();
                 }
              }
          }
       }             
   
   
      try{}catch()太多会影响可读性。而我们知道，java中有一个Closeable接口，改接口标识了一个可关闭的对象，有一个
       close方法。
       
       于是，通过该接口，可以写一个工具类
       
       public final class CloseUtils{
         private CloseUtils();         
         public static void closeQuiety(Closeable close){
           if(close != null){
             try{
                close.close();
             }catch(IOExecption e){
               e.printStackTrace()
             }
           
           }
         }
       }
   
              接口隔离原则：最小化接口，我只需要知道关闭流的接口就行，其他的不需要知道。
   
   
   6、更好的扩展性：迪米特原则 : Law of Demeter -- LOD
                也称为最少知识原则
                     
                  定义： 一个对象应该对其他对象最少的了解，类与类之间关系越密切，则耦合度就越大。
                  
          还有另一种解释：   只与之间的朋友通信，什么是直接的朋友？每个对象必然会与其他对象有耦合，两个对象直接的耦合关系就称为朋友关系
          
        这种关系的类型包括：组合、聚合、依赖
        
        
        
        
        
        总结：
        
               单一原则：每个类负责自己的功能就行，不要什么功能都耦合在一个类里面  
               开闭原则 ：对于扩展是开放的， 对于修改是封闭的。 即需要其他类的功能，一般使用抽象，要修改通过注入方式。
               里式替换原则：就是使用基类，在运行的时候，替换成子类。
               依赖倒置原则 ：模块间依赖抽象，不依赖细节，就是面向接口编程
               接口隔离原则：就是只需要最小的接口就行。 
               迪米亚原则：一个对象对另一个人对象知道最少就行。从而减少耦合。                   
                   
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
   
   
   
   
   
   
   
   
   
   
   