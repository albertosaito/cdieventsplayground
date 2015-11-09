package alberto.examples.rest;

import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.ws.rs.core.Response;

import alberto.examples.model.AddModel;
import alberto.examples.model.DeleteModel;
import alberto.examples.model.GetModel;
import alberto.examples.model.MyModel;

/**
 * AppRestEndpointImpl
 *
 * @author <a href="mailto:nobuji.saito@gmail.com">nobuji.saito</a>
 * @version $Id$
 * @since Nov 8, 2015
 *
 */
public class AppRestEndpointImpl implements AppRestEndpoint {

    /** AppRestEndpointImpl for modelEvent */
    @Inject
    @GetModel
    Event<MyModel> getModelEvent;

    /** AppRestEndpointImpl for addModelEvent */
    @Inject
    @AddModel
    Event<MyModel> addModelEvent;

    /** AppRestEndpointImpl for deleteModelEvent */
    @Inject
    @DeleteModel
    Event<MyModel> deleteModelEvent;

    /**
     * Overrides eventTrigger
     *
     * @return {@link Response}
     * @since Nov 8, 2015
     * @see alberto.examples.rest.AppRestEndpoint#getModel()
     */
    @Override
    public String getModel() {
	return "get Model Invoked";
    }

    /**
     * Overrides addModel
     *
     * @param modelValue
     * @return {@link Response}
     * @since Nov 8, 2015
     * @see alberto.examples.rest.AppRestEndpoint#addModel(java.lang.String)
     */
    @Override
    public Response addModel(final String modelValue) {
	final MyModel model = new MyModel(modelValue);
	addModelEvent.fire(model);
	return Response.ok().entity(model).build();
    }

    /**
     * Overrides deleteModel
     *
     * @param modelValue
     * @return {@link Response}
     * @since Nov 8, 2015
     * @see alberto.examples.rest.AppRestEndpoint#deleteModel(java.lang.String)
     */
    @Override
    public Response deleteModel(final String modelValue) {
	final MyModel model = new MyModel(modelValue);
	deleteModelEvent.fire(model);
	return Response.ok().entity(model).build();
    }

}
