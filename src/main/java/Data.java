import org.apache.hadoop.io.IntWritable;

public class Data extends IntWritable {
    private final int UpData;
    private final int DownData;

    public Data(int up, int down) {
        this.UpData = up;
        this.DownData = down;
    }

    public int getUpData() {
        return this.UpData;
    }

    public int getDownData() {
        return this.DownData;
    }
}