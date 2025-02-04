package main.com.adventure.world.objects.keys;

public class HoleContent {
    private Key content;
    private boolean isCovered = true;

    /**
     *
     * @param key - the value to save to the content property
     */
    public HoleContent(Key key) {
        this.content = key;
    }

    public void setIsCovered(boolean isCovered) {
        this.isCovered = isCovered;
    }

    public boolean isCovered() {
        return isCovered;
    }

    public Key getKey() {
        return content;
    }
}
