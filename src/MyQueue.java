import java.util.DoubleSummaryStatistics;

public class MyQueue {
    public int capacity;
    public int[] queueArr;
    public int head = 0;
    public int tail = -1;
    public int currentSize = 0;

    public MyQueue(int queueSize){
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }

    public boolean isQueueFull(){
        boolean status = false;
        if(currentSize == capacity){
            status = true;
        }
        return status;
    }

    public boolean isQueueEmpty(){
        boolean status = false;
        if(currentSize == 0){
            status = true;
        }
        return status;
    }

    public void enqueue(int item){
        if(isQueueFull()){
            System.out.println("Đã đầy.");
        } else {
            tail++;
            if(tail == capacity -1){
                tail = 0;
            }
            queueArr[tail] = item;
            currentSize++;
            System.out.println("Đối tượng " + item + " đẫ được thêm.");
        }
    }

    public void dequeue(){
        if(isQueueEmpty()){
            System.out.println("Không thể xóa");
        } else {
            head++;
            if (head == capacity - 1){
                System.out.println("Xóa thành công phần tử " + queueArr[head-1]);
                head = 0;
            } else {
                System.out.println("Xóa thành công phần tử " + queueArr[head-1]);
            }
            currentSize--;
        }
    }
}
