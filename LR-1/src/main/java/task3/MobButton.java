package task3;

class MobButton implements Button {
    public void render() {
        System.out.println("render MobButton");
    }

    public void onClick() {
        System.out.println("Event on click MobButton");
    }
}