package Zajecia0302.MyList;

public class MyListDemo {

    public static void main(String[] args) {
        MyList lista = new MyList();
        lista.addAtBegining(9);
        lista.addAtBegining(8);
        lista.addAtBegining(7);
        lista.addAtBegining(6);
        lista.addAtBegining(5);


        lista.addAtEnd(109);
        lista.addAtEnd(108);
        lista.addAtEnd(107);
        lista.addAtEnd(106);
        //System.out.println();
        // lista.printAll();

        try {
            lista.addElementAfterElement(1000, 107);
            lista.addElementAfterElement(1100, 5);
        } catch (Exception e) {
            e.getMessage();
        }
        lista.printAll();
        try {
            lista.deleteElement(1100);
            lista.deleteElement(1000);
            lista.deleteElement(5);

        } catch (Exception e) {
            e.getMessage();
        }
        lista.printAll();
    }
}




