package FileOperation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class GetDataAsList {
	public static void main(String[] args) {
		List<OrderDemo> orderList = new ArrayList<OrderDemo>();
		OrderDemo demo = new OrderDemo();
		
		demo.setOrderID(12);
		demo.setOrderName("Ram");
		demo.setOrderID(14);
		demo.setOrderName("Laxman");
		demo.setOrderID(15);
		demo.setOrderName("om");
		demo.setOrderID(17);
		demo.setOrderName("Mahesh");
		
		orderList.add(demo);
		Arrays.asList(demo);
		
		for (OrderDemo d : orderList) {
			System.out.println(d.getOrderID());
			System.out.println(d.getOrderName());
		}

	}
}
