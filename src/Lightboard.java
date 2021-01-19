public class Lightboard {
    private boolean [][] lights; // +3
    public Lightboard(int numRows, int numCols) {
        lights = new boolean[numRows][numCols];
        int d = (int) (Math.random() * 100);
        for (int r = 0; r < numRows; r++) {
            for (int c = 0; c < numRows; c++) {
                if (d > 40) {
                    lights[r][c] = true;
                } else {
                    lights[r][c] = false;
                }
            }
        }
    }

    // +5
    public boolean evaluateLight(int row, int col) {
        boolean light = this.lights[row][col];

        int numLightsOn = numLights(col);
        if (light && numLightsOn % 2 == 0) {
            return false;
        }

        if (!light && numLightsOn % 3 == 0) {
            return true;
        }

        return light;
    }

    private int numLights(int col) {
        int counter = 0;
        for (int i = 0; i < this.lights.length; i++) {
            if (this.lights[i][col]) {
                counter++;
            }
        }

        return counter;
    }


}
