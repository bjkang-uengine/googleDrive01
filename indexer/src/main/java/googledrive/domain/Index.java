package googledrive.domain;

import googledrive.IndexerApplication;
import googledrive.domain.Indexed;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Index_table")
@Data
public class Index {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer fileId;

    private String path;

    private String keyword;

    @PostUpdate
    public void onPostUpdate() {
        Indexed indexed = new Indexed(this);
        indexed.publishAfterCommit();
    }

    public static IndexRepository repository() {
        IndexRepository indexRepository = IndexerApplication.applicationContext.getBean(
            IndexRepository.class
        );
        return indexRepository;
    }

    //<<< Clean Arch / Port Method
    public static void makeIndexing(FileUploded fileUploded) {
        /** Example 1:  new item 
        Index index = new Index();
        repository().save(index);

        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploded.get???()).ifPresent(index->{
            
            index // do something
            repository().save(index);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
