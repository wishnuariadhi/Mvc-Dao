/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.endro.test.error;

/**
 *
 * @author klewoood
 */
public class TestException extends Exception {

    /**
     * Creates a new instance of <code>TestException</code> without detail
     * message.
     */
    public TestException() {
    }

    /**
     * Constructs an instance of <code>TestException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public TestException(String msg) {
        super(msg);
    }
}
