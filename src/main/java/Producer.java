import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Producer {

    public static void main(String[] args) {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
        AmqpTemplate amqpTemplate = ctx.getBean(AmqpTemplate.class);

        for (int i=1;i<=10;i++)
            amqpTemplate.convertAndSend(i+"HELLO");
    }

}
