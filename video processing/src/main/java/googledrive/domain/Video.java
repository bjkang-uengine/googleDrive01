package googledrive.domain;

import googledrive.VideoProcessingApplication;
import googledrive.domain.StreamFile;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Video_table")
@Data
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer fileId;

    private String url;

    @PostPersist
    public void onPostPersist() {
        StreamFile streamFile = new StreamFile(this);
        streamFile.publishAfterCommit();
    }

    public static VideoRepository repository() {
        VideoRepository videoRepository = VideoProcessingApplication.applicationContext.getBean(
            VideoRepository.class
        );
        return videoRepository;
    }

    //<<< Clean Arch / Port Method
    public static void processVideo(Indexed indexed) {
        /** Example 1:  new item 
        Video video = new Video();
        repository().save(video);

        */

        /** Example 2:  finding and process
        
        repository().findById(indexed.get???()).ifPresent(video->{
            
            video // do something
            repository().save(video);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
