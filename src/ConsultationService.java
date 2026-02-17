public class ConsultationService extends Service
        implements Billable {

    // TODO: constructor
    public ConsultationService(String serviceName,int serviceId){
        super(serviceName,serviceId);
    }


    @Override
    public void performService() {

        // TODO:
        // check active
        // print consultation message
        if (isActive()){
            System.out.println(getServiceName()+"Начало онлайн-консультации со специалистом");
        }
        else {
            System.out.println(getServiceName()+"Аккаунт неактивен. Консультация невозможна");
        }

    }

    @Override
    public void generateBill() {

        // TODO:
        // print billing message
        System.out.println(getServiceName()+"счет за время консультации");

    }
}