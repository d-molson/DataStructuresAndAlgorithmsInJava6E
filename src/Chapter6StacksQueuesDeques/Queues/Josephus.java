package Chapter4RecursionStacksQueues.Queues;

public class Josephus {

    public static Object Josephus(Queue queue, int k){
        if(queue.isEmpty()){
            return null;
        }
        while(queue.size() > 1){
            System.out.println(" Queue: " + queue + " k = " + k);
            for(int i = 0; i < k; i++){
                queue.enqueue(queue.dequeue());
            }
            Object element = queue.dequeue();
            System.out.println("   "  + element + " is out");
        }
        return queue.dequeue();
    }

    public static Queue buildQueue(Object array[]){
        Queue queue = new NodeQueue();
        for(int i = 0; i < array.length; i++){
            queue.enqueue(array[i]);
        }
        return queue;
    }

}
