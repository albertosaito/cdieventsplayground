package alberto.examples.manager;

import javax.ejb.Asynchronous;
import javax.ejb.Stateless;
import javax.enterprise.event.Observes;

import alberto.examples.model.AddModel;
import alberto.examples.model.DeleteModel;
import alberto.examples.model.GetModel;
import alberto.examples.model.MyModel;

/**
 * EventManager
 *
 * @author <a href="mailto:nobuji.saito@gmail.com">nobuji.saito</a>
 * @version $Id$
 * @since Nov 8, 2015
 *
 */
@Stateless
public class EventManager {

    /**
     * Represents handleEvent
     *
     * @param model
     * @throws InterruptedException
     * @since Nov 8, 2015
     *
     */
    @Asynchronous
    public void handleGetEvent(@Observes @GetModel final MyModel model) throws InterruptedException {
	// This is a very time consuming task ;)
	Thread.sleep(3000);
	System.out.printf("Get models completed\n");
    }

    /**
     * Represents handleAddEvent
     *
     * @param model
     * @throws InterruptedException
     * @since Nov 8, 2015
     *
     */
    @Asynchronous
    public void handleAddEvent(@Observes @AddModel final MyModel model) throws InterruptedException {
	// This is a very time consuming task ;)
	System.out.printf("Adding model: %s...\n", model.getValue());
	Thread.sleep(3000);
	System.out.printf("Added model: %s\n", model.getValue());
    }

    /**
     * Represents handleDeleteEvent
     *
     * @param model
     * @throws InterruptedException
     * @since Nov 8, 2015
     *
     */
    @Asynchronous
    public void handleDeleteEvent(@Observes @DeleteModel final MyModel model) throws InterruptedException {
	// This is a very time consuming task ;)
	System.out.printf("Deleting model %s...%n", model.getValue());
	Thread.sleep(3000);
	System.out.printf("Deleted model: %s\n", model.getValue());
    }

}
