import com.ayoub.framework.validation.MiniContainer;
import com.ayoub.framework.validation.PaymentProcess;

public class Main {
    public static void main(String[] args) {

        MiniContainer miniContainer = new MiniContainer();

        PaymentProcess p1 = (PaymentProcess) miniContainer.getBean(PaymentProcess.class);
        PaymentProcess p2 = (PaymentProcess) miniContainer.getBean(PaymentProcess.class);

        System.out.println(p1 == p2);
    }
}