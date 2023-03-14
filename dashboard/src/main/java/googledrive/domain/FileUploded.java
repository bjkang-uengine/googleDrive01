package googledrive.domain;

import googledrive.infra.AbstractEvent;
import java.util.*;
import lombok.Data;

@Data
public class FileUploded extends AbstractEvent {

    private Long id;
    private String name;
    private Integer size;
}
