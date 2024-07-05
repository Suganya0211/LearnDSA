package com.sugan.concurrency;

class FooBar {
    private int n;
    private boolean valueSet = false;

    public FooBar(int n) {
        this.n = n;
    }

    public synchronized void foo(Runnable printFoo) throws InterruptedException {
        int i = n;
        while (i > 0) {
            if(valueSet) {
                wait();
            }
            if(!valueSet) {
                printFoo.run();
                valueSet = true;
                notify();
            }
            i--;
        	// printFoo.run() outputs "foo". Do not change or remove this line.
        }
    }

    public synchronized void bar(Runnable printBar) throws InterruptedException {
        int j = n;
        while(j > 0) {
            if(!valueSet) {
                wait();
            }
            if(valueSet) {
                // printBar.run() outputs "bar". Do not change or remove this line.
        	    printBar.run();
                valueSet = false;
                notify();
            }
           j--;
        }
    }
}