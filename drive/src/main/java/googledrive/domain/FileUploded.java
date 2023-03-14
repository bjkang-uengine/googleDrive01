package googledrive.domain;

import googledrive.domain.*;
import googledrive.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class FileUploded extends AbstractEvent {

    private Long id;
    private String name;
    private Integer size;

    public FileUploded(File aggregate) {
        super(aggregate);
    }

    public FileUploded() {
        super();
    }
}
