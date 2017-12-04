package q;

public class Application {
    public static void main(String[] args) {
        CustomQueue fifoQueue = new FifoQueue();

        System.out.println("Очередь заполяется...");
        fifoQueue.enqueue(5);
        fifoQueue.enqueue(10);
        fifoQueue.enqueue(15);
        fifoQueue.enqueue(35);
        fifoQueue.enqueue(50);
        fifoQueue.enqueue(55);
        fifoQueue.enqueue(19);
        fifoQueue.enqueue(18);

        System.out.println( "Очередь: ");
        fifoQueue.print();
        System.out.println("Длинна массива = " + fifoQueue.getSize());

        System.out.println("Удаляем...");

        fifoQueue.dequeue();
        fifoQueue.dequeue();
        System.out.println("Теперь: ");
        fifoQueue.print();

    }



}
