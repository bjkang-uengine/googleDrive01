package googledrive.domain;

import googledrive.infra.AbstractEvent;
import java.util.*;
import lombok.Data;

@Data
public class Indexed extends AbstractEvent {

    private Long id;
    private Integer fileId;
    private String path;
    private String keyword;
}
