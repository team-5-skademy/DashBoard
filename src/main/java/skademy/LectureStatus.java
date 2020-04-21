package skademy;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="LectureStatus_table")
public class LectureStatus {

        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
        private Long lectureId;
        private String lectureStatus;


        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }
        public Long getLectureId() {
            return lectureId;
        }

        public void setLectureId(Long lectureId) {
            this.lectureId = lectureId;
        }
        public String getLectureStatus() {
            return lectureStatus;
        }

        public void setLectureStatus(String lectureStatus) {
            this.lectureStatus = lectureStatus;
        }

}
