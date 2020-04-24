package de.htwberlin.fiw.profiler;


public class Element {
    private int data;
    private Element next;
    private Element[] list;


    public Element(int data) {
        this.data = data;
    }

    public Element(int data, Element next) {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }

}
