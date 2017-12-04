package q;

  public class FifoQueue implements CustomQueue {
    private int[] data;
    private int realDataCount;
      private int first;
      private int last;
    public FifoQueue () {
        data = new int [6];
        first = 0;
//        last =
////        last = 0;

      }


      @Override
      public boolean enqueue(int value) {
        if (realDataCount == data.length) {
            int [] oldData = data;
            data = new int[(int)(data.length*1.5)];
            System.arraycopy (oldData,0, data,0, oldData.length);
        }
        data[realDataCount]= value;
        realDataCount ++;
          return true;
      }

      @Override
      public void print() {
        for (int index =0; index < realDataCount; index ++) {
            System.out.println(data[index] + " ");
        }
          System.out.println();
      }

      @Override
      public int getSize() {
         return data.length;
      }

      @Override
      public void dequeue() {
          int index = 0;
//
            System.arraycopy(data, index + 1, data, index, data.length - index - 1);
            realDataCount--;




      }
  }
