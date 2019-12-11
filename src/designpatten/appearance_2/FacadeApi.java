package designpatten.appearance_2;

import designpatten.appearance_2.impl.ImplA1;
import designpatten.appearance_2.impl.ImplB1;
import designpatten.appearance_2.impl.ImplC1;

//外观模式实现类 --- 系统和外部的交互
//外部要使用时，不需要关心内部模块的交互细节。
public class FacadeApi {
	public void test(){
		new ImplA1().test1();
		new ImplC1().test3();
		new ImplB1().test2();
	}
}
