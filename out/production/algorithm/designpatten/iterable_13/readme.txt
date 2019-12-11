


     迭代器模式：
  
    1、说明：
    
                   作用： 以一种统一的方式能够访问内部实现不同的聚合（指的是一组对象的组合结构，比如：集合、数组）对象                  
                   说明： 提供一种方法顺序访问一个聚合对象的各个元素，而又不暴露改对象内部表示。 
        
                     
                  
                   关键思想：
                   
                            聚合对象类型很多，如果聚合对象的迭代访问和聚合对象本身融合在一起的话，会影响到聚合对象的可扩展性和可维护性                       
                            把聚合对象的遍历和访问从聚合对象中分离出来，放入单独的迭代器中       
    
                   关键点：
                  
                           聚合对象的遍历访问 和 聚合对象分离
                           迭代器定义遍历算法                  
    
  
    2、实例：
    
        1、一个集团下有 A，B两个公司，A公司内部采用List记录工资列表，B公司采用数组记录工资列表，现在想统一查看工资列表
                            原本想直接将B公司也改用List记录工资，但是发现内部涉及数组逻辑太多，于是作罢，于是考虑设计一个辅助系统，来查看
                            工资，于是引出迭代器模式
                            
                        问题：如何能够用一种统一的方式来访问内部实现不同的聚合对象？
                        答案：使用迭代器模式 
                        
                        
                        
    3、步骤：
    
        1、定义一个统一访问的接口  - Iterator接口
        2、定义抽象父类，操作聚合对象的公共接口  -- Aggregate对象
                           
                        
           Iterator : 迭代器接口，定义访问和遍历元素的接口  -- 提供遍历的方法
           ConcreleIterator: 具体的迭代器实现对象，实现对聚合对象的遍历，并跟踪遍历时当前的位置
           Aggregate : 聚合对象，定义创建相应迭代器对象的接口
           ConcreteAggregate: 具体聚合对象，实现创建相应的迭代器对象               
                        
                        
                        
                                                
    4、迭代器功能：
    
                       迭代器的主要功能是提供对聚合对象的迭代访问，围绕着这个访问，做出了许多的文章                        
         (1)、以不同的方式遍历聚合对象，比如向前，向后等
         (2)、对同一个聚合对象同时进行多个遍历
         (3)、以不同的遍历策略来遍历聚合，比如是否需要过滤
         (4)、多态迭代：为不同的聚合结构，提供统一的迭代接口。如上                    
                             
                            
                            
                            
                            
    
    5、注意点：
    
        java本身提供了迭代器接口：Iterator接口，而且java框架中的聚合对象基本上都提供了迭代器的
        
        
        
       
      
      
    6、迭代器分类：
                   由于迭代器实现了聚合对象和访问聚合对象的分离，故可以在迭代器上增加不同的迭代策略
                   
              （1）、具备过滤功能的迭代器      
                   
                     例如：
            
          public Object next(){
            Object obj = null;
            if(hasNext()){
               obj = pams[index];
               index ++;
            }           
            //迭代的时候，添加过滤信息
            if(...){
               ((PayModel)obj).setPay(0,0);
            }  
          }  
    
    
              （2）双向迭代器：可以同时向前和向后遍历数据的迭代器
              
            java里面提供了双向迭代器接口  ListIterator
                                  自己也可以实现双向迭代器
                                  
          public interface Iterator{
            public void first();
            public void next();
            ...
            
            public boolean isFirst();
            public void previous();         
          }                          
              
              
          
          public class ArrayIteratorImpl implements Iterator{
          
              public boolean isFirst(){
                if(index == 0){
                   return true;
                }
                return false;
              }
              
              public void previous(){
                if(index > 0){
                   index = index - 1;
                }   
              }
          
          }    
    
    
    
    
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
  
