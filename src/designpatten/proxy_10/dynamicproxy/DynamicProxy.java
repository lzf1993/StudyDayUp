package designpatten.proxy_10.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import designpatten.proxy_10.dao.OrderApi;
import designpatten.proxy_10.dao.OrderImpl;

//��̬������
public class DynamicProxy implements InvocationHandler{

	//����Ҫ�������
	private OrderApi order;
	
	public OrderApi getProxyInterface(OrderImpl order){
		this.order = order;
		
		//�ķ�������Ϊָ�����������һ��ӿڣ����ɴ���ʵ��
		//��һ�������������������������������Ҫ����ָ��Ϊ�����������ͬ���������
		//�ڶ���������ʵ�ֺͱ��������һ���Ľӿ�
		//����ֵ�����ݴ�����󷵻ش���ʵ��
		OrderApi api = (OrderApi) Proxy.newProxyInstance(order.getClass().getClassLoader(),
				order.getClass().getInterfaces(), this);
		
		return api;
	}
	
	
	
	//���ñ��������ķ���
	/* 
	 *  proxy ������Ķ���
	 *  method��ʾԭ���󱻵��õķ�����
	 *  args��ʾ�����Ĳ���
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {		
		if(method.getName().startsWith("set")){
			if(order.getOrderUser()!=null && order.getOrderUser().equals(args[1])){
				return method.invoke(order, args);
			}else{
				System.out.println("�Բ�����ûȨ�޷���...");
			}
		}else{
			System.out.println("get...");
			return method.invoke(order, args);
		}
		
		return null;
	}

}
