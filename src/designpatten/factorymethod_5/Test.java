package designpatten.factorymethod_5;

import designpatten.factorymethod_5.operate.ExportTxtFileOperate;

public class Test {
  public static void main(String args[]){

      //应用场景： 父类不知道具体实现，完成自身功能的调用
	  ExportOperate operate = new ExportTxtFileOperate();
	  operate.export("test");
  }
}
