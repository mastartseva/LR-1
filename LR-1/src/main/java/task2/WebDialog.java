package task2;

class WebDialog extends AbstractDialog {
    public Button getButton() {
        return new WebButton();
    }
}