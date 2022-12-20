package task2;


class FabricMethodService {
    public final static int WEB = 1;
    public final static int MOB = 2;
    public void exec() throws Exception {
        Configuration configuration = Configuration.initMob();

        Dialog dialog;
        switch(configuration.getPlatform()) {
            case (WEB):
                dialog = new WebDialog();
                dialog.render();
                break;
            case (MOB):
                dialog = new MobDialog();
                dialog.render();
                break;
            default:
                throw new Exception("Неизвестный тип платформы");
        }
    }

}