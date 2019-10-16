package knights;

public class Knight {

    public double[] getAccur() {
        return accur;
    }

    public void setAccur(double[] accur) {
        this.accur = accur;
    }

    double [] accur;

    public double [] knightAcc (double acc, int step) {
        accur = new double [step];
        for (int i = 0; i<accur.length; i++) {
            accur[i] = acc + ((1-acc)/step)*(i+1);
        }
       return accur;
    }

}
