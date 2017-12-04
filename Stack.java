package s;

public class  Stack implements CustomStack {
    private int[] data;
    private int realDataCount;

    public Stack () {
        data = new int [4];

    }


    @Override
    public boolean push (int value) {
        if (realDataCount == data.length) {
            int [] oldData = data;
            data = new int[(int)(data.length * 1.5)];
            System.arraycopy (oldData,0, data,0, oldData.length);
        }
        data[realDataCount]= value;
        realDataCount++;

        return true;
    }

    @Override
    public void print() {
        for (int index =0; index < realDataCount; index++) {
            System.out.println(data[index] + " ");
        }
        System.out.println();
    }

    @Override
    public int getSize() {
        return data.length;
    }

    @Override
    public void pop () {

        realDataCount--;




    }
}



