public class StepTracker {

    // +1
    private int steps;
    private int activeDays;
    private int days;
    private int minimum;


    // +1
    public StepTracker(int minimum) {
        this.minimum = minimum;
        // +1
    }

    // + 1
    public void addDailySteps(int steps) {
        // + 1
        if (steps >= this.minimum) {
            this.activeDays++;
        }

        // + 1
        this.days++;
        this.steps += steps;
    }

    // +1
    public int activeDays() {
        return this.activeDays;
    }

    // +1
    public double averageSteps() {
        if (this.days == 0) {
            return 0;
        }
// +1
        return ((double) this.steps) / this.days;


    }

}