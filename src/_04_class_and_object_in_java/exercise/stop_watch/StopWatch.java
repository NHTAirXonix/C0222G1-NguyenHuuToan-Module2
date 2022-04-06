package _04_class_and_object_in_java.exercise.stop_watch;

public class StopWatch {
    private long input1, input2;

    public StopWatch() {
        this.input1 = 0;
        this.input2 = 0;
    }

    public void setInput1(long put1) {
        this.input1 = put1;
    }

    public void setInput2(long put2) {
        this.input2 = put2;
    }

    public long timeElapsed() {
        return this.input2 - this.input1;
    }
}
