public class CloudStorageService extends Service
        implements PremiumFeature, Billable {

    // TODO: declare premium field
    private boolean premium;


    // TODO: constructor
    public CloudStorageService(String serviceName,int serviceId){
        super(serviceName,serviceId);
        this.premium=false;
    }


    @Override
    public void performService() {

        // TODO:
        // check if active
        // print cloud access message
        if (isActive()){
            System.out.println(getServiceName()+"Доступ к облачному хранилищу");
        }else{
            System.out.println(getServiceName()+"Неактивно. Невозможно получить доступ к облаку.");
        }

    }

    @Override
    public void upgradeToPremium() {

        // TODO:
        // enable premium
        // print message
        if (!premium){
            premium=true;
            System.out.println(getServiceName()+"Вы перешли на Премиум");
        }

    }

    @Override
    public void generateBill() {

        // TODO:
        // print billing message
        System.out.println(getServiceName()+"счет за использование хранилище");

    }
}