package main.com.adventure.world.objects;

import main.com.adventure.world.objects.keys.Key;
import main.com.adventure.world.objects.keys.HoleContent;

public class Hole {
    private HoleContent holeContent;

    /**
     * Creates a hole with the given content.
     * @param content - the item that is covered by the hole.
     */
    public Hole(Key content) {
        this.holeContent = new HoleContent(content);
    }

    public boolean isCovered() {
        //TODO This value should come from HoleContent
        //HoleContent newVariableName = new HoleContent();
        //return newVariableName.isCovered();
        return holeContent.isCovered();
    }

    /**
     * Uncovers the hole. If applicable, the contents are now revealed.
     */
    public void dig() {
        //TODO this function should update holeContent's isCovered property.
        holeContent.setIsCovered(false);
    }

    /**
     * If the HoleContent is uncovered, return the key. Otherwise, return null.
     * @return the key if the hold is uncovered.
     */
    private Key getKeyIfPossible() {
        //TODO Get the HoleContent's content only if the hole is uncovered.
        if (!holeContent.isCovered()) {
            return holeContent.getKey();
        }
        else return null;
    }

    /**
     * If the HoleContent is uncovered, return the content. Otherwise, return null.
     * @return - the content if the hole is uncovered.
     */
    public Tangible getContent() {
        return getKeyIfPossible();
    }
}
