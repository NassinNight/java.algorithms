public class MyLinkedList<E> {


    private class Element{
        private E value;
        private Element next;


        public Element(E data) {
            value = data;
        }

        public E getValue() {
            return value;
        }

        public void setValue(E value) {
            this.value = value;
        }

        public Element getNext() {
            return next;
        }

        public void setNext(Element next) {
            this.next = next;
        }
    }


    private Element head;

    public MyLinkedList() {
        head=null;
    }



    public boolean isEmpty() {
        return head==null;
    }

    public void clear(){
        head=null;
    }

    public int lenght() {
        int pos = 0;
        Element e = head;
        while (e != null){
            pos++;
            e=e.next;
        }
        return pos;
    }

    public void add(E newValue) {
        Element newElem = new Element(newValue);
        if (isEmpty()) {
            head = newElem;
        } else {
            Element tail = head;
            while (tail.getNext()!=null) {
                tail=tail.getNext();
            }
            tail.setNext(newElem);
        }
    }

    public void add(int index, E newValue) {
        Element e = head;
        Element newElem = new Element(newValue);
        if (index==0) {
            newElem.setNext(head);
            head=newElem;
        } else {
            for (int i = 0; i < index - 1; i++) {
                if (e == null) {
                    System.out.println("index out of bounds");
                } else {
                    e = e.getNext();
                }
            }
            newElem.setNext((e.getNext()));
            e.setNext(newElem);
        }
    }

    public void remove(int index) {
        Element e = head;
        if (index==0) {
            head = (head.getNext());
        } else {
            for (int i = 0; i < index - 1; i++) {
                if (e == null) {
                    System.out.println("index out of bounds");
                } else {
                    e = e.getNext();
                }
            }
            e.setNext(e.getNext().getNext());
        }
    }
    public void remove(E e) {
        Element element = head;
        if(element.getValue().equals(e)) {
            head=head.getNext();
        } else {
            while (element!= null) {
                if (element.getNext().getValue().equals(e)) {
                    element.setNext(element.getNext().getNext());
                }
                element = element.getNext();

            }
        }
    }


    public E getElement(int index){
        Element e = head;
            for (int i = 0; i<index; i++) {
                if (e==null) {
                    return null;
                } else {
                    e=e.getNext();
                }
        }
        return e.value;
    }


    public void wyswietl() {
        Element e = head;
        System.out.println("Lista:");
        while (e != null) {
            System.out.println(e.getValue());
            e = e.next;
        }
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                '}';
    }
}
