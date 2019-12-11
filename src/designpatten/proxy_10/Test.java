package designpatten.proxy_10;

import designpatten.proxy_10.dao.OrderApi;
import designpatten.proxy_10.dao.OrderImpl;
import designpatten.proxy_10.dynamicproxy.DynamicProxy;

public class Test {
   public static void main(String args[]){
	   OrderImpl impl = new OrderImpl("���ģʽ", 100, "����");
	   DynamicProxy  dynamicProxy = new DynamicProxy();
	   
	   //������
	   OrderApi order = dynamicProxy.getProxyInterface(impl);
	   order.getOrderNum();
   }
}
