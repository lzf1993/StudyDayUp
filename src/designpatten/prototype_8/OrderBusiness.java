package designpatten.prototype_8;

import designpatten.prototype_8.self.OrderApi;

public class OrderBusiness {

	public void saveOrder(OrderApi order){
		while(order.getOrderProductNum() >1000){

			//原型模式：通过原型实例确定类型，并创建新的原型对象
			OrderApi newOrder = order.cloneOrder();
			newOrder.setOrderProductNum(1000);
			order.setOrderProductNum(order.getOrderProductNum()-1000);
			System.out.println("拆分订单 newOrder： "+newOrder);
			System.out.println("订单 order："+order);
		}
	}



	public void saveOrder2(designpatten.prototype_8.java.OrderApi order){
		while(order.getOrderProductNum() >1000){

			//原型模式：通过原型实例确定类型，并创建新的原型对象
			designpatten.prototype_8.java.OrderApi newOrder = order.cloneOrder();; //
			newOrder.setOrderProductNum(1000);
			order.setOrderProductNum(order.getOrderProductNum()-1000);
			System.out.println("拆分订单 newOrder： "+newOrder);
			System.out.println("订单 order："+order);
		}
	}

}
