package smarthome.models;

/**
 * Class of type Window.
 */
public class Window {
    /**
     * Creating a private int called id.
     */
    private int id;
    /**
     * Creating a private boolean called opened
     */
   private boolean opened;
    /**
     * Creating a private boolean called blocked
     */
   private boolean blocked;

    /**
     * Instantiates a new Window with the following parameters.
     *
     * @param id      the int id
     * @param opened  the boolean opened
     * @param blocked the boolean blocked
     */
    public Window(int id, boolean opened, boolean blocked) {
        this.id = id;
        this.opened = opened;
        this.blocked = blocked;
    }

    /**
     * Getter method that returns id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Getter method returning value of boolean opened.
     *
     * @return the boolean opened
     */
    public boolean isOpened() {
        return opened;
    }

    /**
     * Getter method returning value of boolean blocked.
     *
     * @return the boolean blocked
     */
    public boolean isBlocked() {
        return blocked;
    }


    /**
     * Setter method that will set the value of boolean opened
     *
     * @param opened the boolean opened
     */
    public void setOpened(boolean opened) {
        this.opened = opened;
    }

    /**
     * Setter method that will set the value of boolean blocked
     *
     * @param blocked the boolean blocked
     */
    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    /**
     * To String method that will display the features of the room
     * @return String
     */

    @Override
    public String toString() {
        return "Window{" +
                "id=" + id +
                ", opened=" + opened +
                ", blocked=" + blocked +
                '}';
    }
}
