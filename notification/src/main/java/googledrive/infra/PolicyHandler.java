package googledrive.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import googledrive.config.kafka.KafkaProcessor;
import googledrive.domain.*;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PolicyHandler {

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='StreamFile'"
    )
    public void wheneverStreamFile_SendNotifycation(
        @Payload StreamFile streamFile
    ) {
        StreamFile event = streamFile;
        System.out.println(
            "\n\n##### listener SendNotifycation : " + streamFile + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='FileUploded'"
    )
    public void wheneverFileUploded_SendNotifycation(
        @Payload FileUploded fileUploded
    ) {
        FileUploded event = fileUploded;
        System.out.println(
            "\n\n##### listener SendNotifycation : " + fileUploded + "\n\n"
        );
        // Sample Logic //

    }
}
