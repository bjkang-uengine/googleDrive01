package googledrive.domain;

import googledrive.domain.*;
import googledrive.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class StreamFile extends AbstractEvent {

    private Long id;
    private Integer fileId;
    private String url;

    public StreamFile(Video aggregate) {
        super(aggregate);
    }

    public StreamFile() {
        super();
    }
}
