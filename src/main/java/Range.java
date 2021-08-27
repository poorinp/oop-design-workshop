public class Range {

    private String rangeText;

    public Range(String text) {
        this.rangeText = text;
    }

    public boolean isStartWithInclusive() {
        boolean result = false;
        if (rangeText.startsWith("[")) {
            result = true;
        }
        return result;
    }
}
