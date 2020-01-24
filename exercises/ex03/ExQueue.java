package ex03;

// Code example from Introduction to Software Testing, Ammann and Offutt


public class ExQueue { // Overview: a Queue is a mutable, bounded FIFO data structure
        // of fixed size (size is 2, for this exercise).
        // A typical Queue is [], [o1], or [o1, o2], where neither o1 nor o2 // are ever null. Older elements are listed before newer ones.
        private Object[] elements;
        private int size, front, back; private static final int capacity = 2;
        public ExQueue () {
            elements = new Object [capacity];
            size =0;front=0;back =0; }
        public void enqueue (Object o)
                throws NullPointerException, IllegalStateException
        {
// Modifies: this
// Effects: If argument is null throw NullPointerException // else if this is full, throw IllegalStateException,
// else make o the newest element of this
            if (o == null)
                throw new NullPointerException ("Queue.enqueue"); else if (size == capacity)
                throw new IllegalStateException ("Queue.enqueue"); else
            {
                size++;
                elements [back] = o;
                back = (back+1) % capacity; }
        }
        public Object dequeue () throws IllegalStateException {
            // Modifies: this
// Effects: If queue is empty, throw IllegalStateException, // else remove and return oldest element of this
            if (size == 0)
                throw new IllegalStateException ("Queue.dequeue");
            else {
                size--;
                Object o = elements[(front % capacity)];
                elements[front] = null;
                front = (front + 1) % capacity;
                return o;
            }
        }

    public boolean isEmpty() { return (size == 0); } public boolean isFull() { return (size == capacity); }
    public String toString() {
        String result = "[";
        for (int i = 0; i < size; i++) {
            result += elements[ (front + i) % capacity ] . toString(); if (i < size -1) {
                result += ", "; }
        }
        result += "]"; return result;
    }
}

