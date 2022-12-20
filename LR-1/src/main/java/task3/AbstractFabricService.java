package task3;

class AbstractFabricService {
    public final static int WEB = 1;
    public final static int MOB = 2;
    private FormElementFactory initFactory() throws Exception {
        Configuration conf = Configuration.initMob();

        FormElementFactory factory;
        switch(conf.getPlatform()) {
            case (WEB):
                factory = new WebFormElementFactory();
                break;
            case (MOB):
                factory = new MobFormElementFactory();
                break;
            default:
                throw new Exception("Неизвестный тип платформы");
        }

        return factory;
    }

    private void renderForm(FormElementFactory factory) {
        Input input = factory.createInput();
        Button button = factory.createButton();

        input.value("Тестовое значение поля ввода данных");
        input.render();
        button.render();
    }

    public void exec() throws Exception {
        renderForm(
                initFactory()
        );
    }

}
