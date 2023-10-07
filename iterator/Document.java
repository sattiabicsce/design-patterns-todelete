package iterator;

import java.util.Stack;

public class Document {
    private String title;
    private Stack<String> undoStack;
    private Stack<String> redoStack;

    /**
     * Constructs a new document with the specified title.
     *
     * @param title the title of the document
     */
    public Document(String title) {
        this.title = title;
        this.undoStack = new Stack<>();
        this.redoStack = new Stack<>();
    }

    /**
     * Makes a change to the document and adds it to the undo stack.
     *
     * @param change the change to be made to the document
     * @return a message indicating that the change was made
     */
    public String makeChange(String change) {
        undoStack.push(change);
        redoStack.clear();
        return "Making change: " + change;
    }

    /**
     * Undoes the last change made to the document.
     *
     * @return a message indicating that the last change was undone, or "Nothing to undo" if there are no changes to undo
     */
    public String undoChange() {
        if (canUndo()) {
            String undoneChange = undoStack.pop();
            redoStack.push(undoneChange);
            return "Undo: " + undoneChange;
        }
        return "Nothing to undo";
    }

    /**
     * Checks if there are changes that can be undone.
     *
     * @return true if there are changes that can be undone, false otherwise
     */
    public boolean canUndo() {
        return !undoStack.isEmpty();
    }

    /**
     * Redoes the last undone change in the document.
     *
     * @return a message indicating that the last change was redone, or "Nothing to redo" if there are no changes to redo
     */
    public String redoChange() {
        if (canRedo()) {
            String redoneChange = redoStack.pop();
            undoStack.push(redoneChange);
            return "Redo: " + redoneChange;
        }
        return "Nothing to redo";
    }

    /**
     * Checks if there are changes that can be redone.
     *
     * @return true if there are changes that can be redone, false otherwise
     */
    public boolean canRedo() {
        return !redoStack.isEmpty();
    }

    /**
     * Gets an iterator for the undo stack.
     *
     * @return a StackIterator for the undo stack
     */
    public StackIterator getUndoIterator() {
        return new StackIterator(undoStack);
    }

    /**
     * Gets an iterator for the redo stack.
     *
     * @return a StackIterator for the redo stack
     */
    public StackIterator getRedoIterator() {
        return new StackIterator(redoStack);
    }
}
