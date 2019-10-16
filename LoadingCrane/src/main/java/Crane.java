public class Crane {

    public void craneLoadingAlgorithm (String a, String b, String c, int num) {
        if (num == 1 ) {
            System.out.println("#" + num + " " + a + " -> " + b);
        } else {
            craneLoadingAlgorithm(a,c,b, num - 1);
            System.out.println("#" + num + " " + a + " -> " + b);
            craneLoadingAlgorithm(c,b,a, num - 1);
        }
    }
}
