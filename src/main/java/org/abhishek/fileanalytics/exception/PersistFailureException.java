/* Copyright 2015 Roychoudhury, Abhishek */

package org.abhishek.fileanalytics.exception;

/**
 * Thrown to indicate that a method has been failed to be persisted.
 * 
 * @author abhishek
 * @since 1.0
 */
public class PersistFailureException extends RuntimeException {
    private static final long serialVersionUID = -2125258754494219810L;

    /**
     * Constructs an <code>PersistFailureException</code> with no detail
     * message.
     */
    public PersistFailureException() {
        super();
    }

    /**
     * Constructs an <code>PersistFailureException</code> with the specified
     * detail message.
     *
     * @param s
     *            the detail message.
     */
    public PersistFailureException(String s) {
        super(s);
    }

    /**
     * Constructs a new exception with the specified detail message and cause.
     *
     * <p>
     * Note that the detail message associated with <code>cause</code> is
     * <i>not</i> automatically incorporated in this exception's detail message.
     *
     * @param message
     *            the detail message (which is saved for later retrieval by the
     *            {@link Throwable#getMessage()} method).
     * @param cause
     *            the cause (which is saved for later retrieval by the
     *            {@link Throwable#getCause()} method). (A <tt>null</tt> value
     *            is permitted, and indicates that the cause is nonexistent or
     *            unknown.)
     * @since 1.0
     */
    public PersistFailureException(String message,
        Throwable cause) {
        super(message,
            cause);
    }
    /**
     * Constructs a new exception with the specified cause and a detail
     * message of <tt>(cause==null ? null : cause.toString())</tt> (which
     * typically contains the class and detail message of <tt>cause</tt>).
     * This constructor is useful for exceptions that are little more than
     * wrappers for other throwables (for example, {@link
     * java.security.PrivilegedActionException}).
     *
     * @param  cause the cause (which is saved for later retrieval by the
     *         {@link Throwable#getCause()} method).  (A <tt>null</tt> value is
     *         permitted, and indicates that the cause is nonexistent or
     *         unknown.)
     * @since  1.0
     */
    public PersistFailureException(Throwable cause) {
        super(cause);
    }
}
