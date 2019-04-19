package finalprojectgroup2;

import java.util.ArrayList;

public interface InventorySearcher {

	ArrayList<Vehicle> search_inventory(ArrayList<Vehicle> inventory,
										String category,
										String min_year,
										String max_year,
										String max_mileage,
										String min_price,
										String max_price,
										String model,
										String make,
										String type,
										String seat_count);
}
