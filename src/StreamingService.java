public class StreamingService extends Service
        implements PremiumFeature {

    private boolean premium;


    // TODO: constructor
    public StreamingService(String serviceName,int serviceId){
        super(serviceName,serviceId);
        this.premium=false;
    }


    @Override
    public void performService() {

        // TODO:
        if (isActive()){
            if (premium){
                System.out.println(getServiceName()+"Смотрите видео в 4K и скачивайте их для просмотра без интернета");
            }
            else {
                System.out.println(getServiceName()+"Просмотр видео в стандартном качестве");
            }
        }
        else {
            System.out.println(getServiceName()+"Невозможно воспроизвести");
        }

        // print different message for premium and normal
    }

    @Override
    public void upgradeToPremium() {

        // TODO:
        if (!premium){
          premium = true;
          System.out.println(getServiceName()+"Вы оформили Премиум! Смотрите в 4K и скачивайте видео без интернета.");
        } else {
            System.out.println(getServiceName()+"Премиум уже подключён.");
        }
        // print message

    }
}