package cs1302.ce12;

import cs1302.Utility;

/**
 * Represents a container for {@code Boolean} objects. {@code BooleanContainer}
 * objects cannot store {@code null} values.
 */
public class BooleanContainer {

    /** The contents of this container. */
    private Boolean contents;

    /**
     * Constructs a {@code cs1302.generics.BooleanContainer} object
     * with the specified {@code Boolean}. The specified value cannot
     * be {@code null}.
     *
     * @param contents the contents for the {@code BooleanContainer}
     * @throws NullPointerException if the contents are null.
     */
    public BooleanContainer(Boolean contents) {
	set(contents);
    } // BooleanContainer

    /**
     * Modifies the contents of this {@code BooleanContainer} object.
     * The specified value cannot be {@code null}.
     *
     * @param contents the contents for the {@code BooleanContainer}
     * @throws NullPointerException if the contents are null.
     */
    public void set(Boolean contents) {
	Utility.nullCheck("BooleanContainer: set", contents);
	this.contents = contents;
    } // set

    /**
     * Returns the contents of this {@code BooleanContainer} object.
     */
    public Boolean get() {
	return contents;
    } // get

} // BooleanContainer
