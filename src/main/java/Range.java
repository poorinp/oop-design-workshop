import com.sun.jdi.Value;

public class Range {

    private String rangeText;

    public Range(String text) {
        this.rangeText = text;
    }

    public boolean isStartWithInclusive() {
        return rangeText.startsWith("[");
    }

    public int getStartInput() {
        String[] splittedText = rangeText.split("");
//        return Integer.parseInt(rangeText.substring(1, 2));
        return Integer.parseInt(splittedText[1]);
    }

    public boolean isEndWithInclusive() {
        return rangeText.endsWith("]");
    }

    public int getEndInput() {
        String[] splittedText = rangeText.split("");
        return Integer.parseInt(splittedText[splittedText.length-2]);
    }
}
