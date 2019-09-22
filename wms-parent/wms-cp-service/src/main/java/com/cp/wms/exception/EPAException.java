package com.cp.wms.exception;

import java.io.PrintStream;

public class EPAException extends RuntimeException{

    private static final long serialVersionUID = -1378076813308977834L;

    private Throwable cause;

    public EPAException(String msg) {
        super(msg);
    }

    public EPAException(String msg, Throwable ex) {
        super(msg);
        this.cause = ex;
    }

    public Throwable getCause() {
        return (this.cause == null ? this : this.cause);
    }

    public String getMessage(){
        String message = super.getMessage();
        return message;
    }

    public void printStackTrace(PrintStream ps) {
        if (getCause() == null) {
            super.printStackTrace(ps);

        } else {
            ps.println(this);
            getCause().printStackTrace(ps);
        }
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }
}
