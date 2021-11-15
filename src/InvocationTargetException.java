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
public class InvocationTargetException extends Exception {

    /**
     * Creates a new instance of <code>InvocationTargetException</code> without
     * detail message.
     */
    public InvocationTargetException() {
    }

    /**
     * Constructs an instance of <code>InvocationTargetException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public InvocationTargetException(String msg) {
        super(msg);
    }
}
