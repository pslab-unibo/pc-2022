package lamp_dt.consumer;

import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;

/**
 * Toy Lamp Digital Twin API 
 *   
 * @author aricci
 *
 */
public interface LampDTAPI {
	
	
	/**
	 * 
	 * Get the state of the lamp
	 * 
	 */
	Future<JsonObject> getState();
	

	/**
	 * Subscribe to events generated by the lamp digital twin
	 * 
	 * @param handler
	 * @return
	 */
	Future<Void> subscribe(Handler<JsonObject> handler);
}