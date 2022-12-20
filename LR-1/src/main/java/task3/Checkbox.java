package task3;

interface Checkbox {
    void render();
    Checkbox state(boolean state);
    boolean state();
}