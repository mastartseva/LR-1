package task2;

abstract class AbstractDialog implements Dialog {

    // Фабричный метод
    abstract Button getButton();

    public void render() {
        Button button = getButton();
        button.render();
    }

}