public class Parser {


    public Parser(String temp) {

    }

    public String letterPrs (String t) {
        String l =t.substring(t.length() - 1);
        return l;
    }

    public double numTemp (String t) {
        if (t != null && t.length() > 0) {
            t = t.substring(0, t.length()-1);
        }
        double numtemp = Double.parseDouble(t);
        return numtemp;
    }


}
