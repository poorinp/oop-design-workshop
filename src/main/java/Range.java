public class Range {

    String rangeText;

    public Range(String text) {
        this.rangeText = text;
    }

    public boolean isStartWithInclusive() {
        boolean result = false;
        if (rangeText.contains("[")) {
            result = true;
        }
        return result;
    }
}
