package de.htwberlin.fiw.profiler;

public class List {

    private Element[] list;

    public List(Element[] list) {
        this.list = list;
    }

    public Element[] getList() {
        return list;
    }

    public void setList(Element[] list) {
        this.list = list;
    }

    public List() {
    }

    public void prepend(int data) {

        if (this.list != null) {
            Element[] temp = new Element[list.length + 1];
            Element element = new Element(data);
            temp[0] = element;
            for (int i = 1; i <= temp.length - 1; i++) {
                temp[i] = this.list[i - 1];

            }
            this.list = temp;
        } else {
            this.list = new Element[1];
            Element element = new Element(data);
            this.list[0] = element;
            for (Element element1 : this.list) {
                System.out.println(element1.getData());
            }
        }
    }

    public void append(int data) {
        Element element = new Element(data);
        Element[] temp = new Element[list.length + 1];

        for (int i = 0; i <= this.list.length - 1; i++) {
            temp[i] = this.list[i];
            System.out.print(temp[i].getData());
        }
        temp[temp.length - 1] = element;
        System.out.println(temp[temp.length - 1].getData());

    }

    public void insert(int target, Element element) {

        Element[] temp = new Element[this.list.length + 1];
        for (int i = 0; i <= this.list.length-1; i++) {
            temp[i]=this.list[i];
            if (i == target) {
               element.setNext(this.list[i].getNext());
                temp[i]=element;
            }
            System.out.println(temp[i].getData());
        }
    }


}
