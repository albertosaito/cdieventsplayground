package alberto.examples.model;

/**
 * MyModel
 *
 * @author <a href="mailto:nobuji.saito@gmail.com">nobuji.saito</a>
 * @version $Id$
 * @since Nov 8, 2015
 *
 */
public class MyModel {
    private String value;

    /**
     * Constructs an instance of MyModel object.
     *
     * @param string
     */
    public MyModel(final String string) {
	super();
	setValue(string);
    }

    /**
     * @return the value
     */
    public String getValue() {
	return value;
    }

    /**
     * @param param
     *            the value to set
     */
    public void setValue(final String param) {
	this.value = param;
    }

}
