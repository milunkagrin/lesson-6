package s;

public class App {
    public static void main(String[] args) {
        CustomStack lifoStack = new Stack();

        System.out.println("Очередь заполяется...");
        lifoStack.push(12);
        lifoStack.push(15);
        lifoStack.push(32);
        lifoStack.push(16);
        lifoStack.push(79);
        System.out.println( "Очередь: ");
        lifoStack.print();
        System.out.println("Длинна массива = " + lifoStack.getSize());

        System.out.println("Удаляем...");

        lifoStack.pop();
        lifoStack.pop();
        System.out.println("Теперь: ");
        lifoStack.print();
        System.out.println("Добавляем и получается...");
        lifoStack.push(89);
        lifoStack.print();



    }
}
