/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author root
 */
public class InterruptedException extends Exception {

    /**
     * Creates a new instance of <code>InterruptedException</code> without
     * detail message.
     */
    public InterruptedException() {
    }

    /**
     * Constructs an instance of <code>InterruptedException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public InterruptedException(String msg) {
        super(msg);
    }
}
