package ws.inmemory;

import java.util.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import ws.model.Order;

public class MemoryData {
	
	public static List<Order> orders = new ArrayList<>();
	static {

		Calendar calendar = Calendar.getInstance();

		calendar.set(2017, 11, 1, 20, 25, 53);
		Date date1 = calendar.getTime();

		calendar.set(2017, 11, 9, 21, 30, 20);
		Date date2 = calendar.getTime();

		calendar.set(2017, 11, 10, 22, 10, 50);
		Date date3 = calendar.getTime();

		Order order1 = new Order("Order-100", date1, 10);
		Order order2 = new Order("Order-200", date2, 20);
		Order order3 = new Order("Order-300", date3, 30);

		orders.add(order1);
		orders.add(order2);
		orders.add(order3);

	}

	public static Order getOrder(String id) {
		return MemoryData.orders.stream().filter(p -> id.equals(p.getOrderId())).findFirst().get();
	}

	public static Order[] getOrdersAsArray() {
		return orders.toArray(new Order[orders.size()]);
	}

}
