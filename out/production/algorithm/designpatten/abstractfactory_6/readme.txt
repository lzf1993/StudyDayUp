


  抽象工厂：


   1、场景：

                 装机工程师组装电脑，需要选择cpu和主板 ，但不知道用户会选中什么样的CPU和主板
           cpu有很多种，主板有很多种， cpu和主板的搭配有一点关系，有些没法搭配。
     
     
     
   2、 本质：选择产品篨实现
     
       CpuApi          IntelCpuImpl
       MainBoardApi    MisMainBoardImpl
    
    
                        CpuApi             
        AbstractFactory                      schema1,schema2
                        MainBoardApi