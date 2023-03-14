package googledrive.domain;

import googledrive.infra.AbstractEvent;
import java.util.*;
import lombok.Data;

@Data
public class StreamFile extends AbstractEvent {

    private Long id;
    private Integer fileId;
    private String url;
}
