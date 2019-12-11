java 相关复习:

  一、java基础

          (1)、数据类型
              基本类型
              包装类型
              缓存池

          (2)、String
              概览
              不可变的好处
              String, StringBuffer and StringBuilder
              String Pool
              new String("abc")

          (3)、运算
              参数传递
              float 与 double
              隐式类型转换
              switch

          (4)、关键字
              final
              static

          (5)、Object 通用方法
              概览
              equals()
              hashCode()
              toString()
              clone()

          (6)、继承
              访问权限
              抽象类与接口
              super
              重写与重载

          (7)、反射
          (8)、异常
          (9)、泛型
          (10)、注解
          (11)、特性
              Java 各版本的新特性
              Java 与 C++ 的区别
              JRE or JDK


  二、java容器

          (1)、概览
               Collection
               Map
          (2)、容器中的设计模式
               迭代器模式
               适配器模式
          (3)、源码分析
               ArrayList
               Vector
               CopyOnWriteArrayList
               LinkedList
               HashMap
               ConcurrentHashMap
               LinkedHashMap
               WeakHashMap


  三、java并发

           (1)、线程状态转换
               新建（New）
               可运行（Runnable）
               阻塞（Blocked）
               无限期等待（Waiting）
               限期等待（Timed Waiting）
               死亡（Terminated）

           (2)、使用线程
               实现 Runnable 接口
               实现 Callable 接口
               继承 Thread 类
               实现接口 VS 继承 Thread

           (3)、基础线程机制
               Executor
               Daemon
               sleep()
               yield()

           (4)、中断
               InterruptedException
               interrupted()
               Executor 的中断操作

           (5)、互斥同步
               synchronized
               ReentrantLock
               比较
               使用选择

           (6)、线程之间的协作
               join()
               wait() notify() notifyAll()
               await() signal() signalAll()

           (7)、J.U.C - AQS
               CountDownLatch
               CyclicBarrier
               Semaphore

           (8)、J.U.C - 其它组件
               FutureTask
               BlockingQueue
               ForkJoin

           (9)、线程不安全示例
           (10)、Java 内存模型
               主内存与工作内存
               内存间交互操作
               内存模型三大特性
               先行发生原则

           (11)、线程安全
               不可变
               互斥同步
               非阻塞同步
               无同步方案

           (12)、锁优化
               自旋锁
               锁消除
               锁粗化
               轻量级锁
               偏向锁
           (13)、多线程开发良好的实践

  四、java虚拟机

           一、运行时数据区域
               程序计数器
               Java 虚拟机栈
               本地方法栈
               堆
               方法区
               运行时常量池
               直接内存

           二、垃圾收集
               判断一个对象是否可被回收
               引用类型
               垃圾收集算法
               垃圾收集器

           三、内存分配与回收策略
               Minor GC 和 Full GC
               内存分配策略
               Full GC 的触发条件

           四、类加载机制
               类的生命周期
               类加载过程
               类初始化时机
               类与类加载器
               类加载器分类
               双亲委派模型
               自定义类加载器实现

  五、java/IO

            一、概览
            二、磁盘操作
            三、字节操作
                实现文件复制
                装饰者模式

            四、字符操作
                编码与解码
                String 的编码方式
                Reader 与 Writer
                实现逐行输出文本文件的内容

            五、对象操作
                序列化
                Serializable
                transient

            六、网络操作
                InetAddress
                URL
                Sockets
                Datagram

            七、NIO
                流与块
                通道与缓冲区
                缓冲区状态变量
                文件 NIO 实例
                选择器
                套接字 NIO 实例
                内存映射文件
                对比

            八、参考资料
