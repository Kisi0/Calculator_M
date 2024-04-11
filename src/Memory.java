public class Memory {

    private double memoryValue;

    public void addToMemory(double newValue) {
        memoryValue += newValue;

    }

    public double recallMemory() {
        return memoryValue;
    }

    public void clearMemory() {
        memoryValue = 0.0;
    }
}
