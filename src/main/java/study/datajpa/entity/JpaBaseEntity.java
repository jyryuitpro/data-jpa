package study.datajpa.entity;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass
public class JpaBaseEntity {

    @Column(updatable = false)
    private LocalDateTime createdDate;

    private LocalDateTime updateDate;

    @PrePersist
    public void prePrePersist() {
        LocalDateTime now = LocalDateTime.now();
        //등록일
        this.createdDate = now;
        //수정일
        this.updateDate = now;
    }

    @PreUpdate
    public void preUpdate() {
        //수정일
        this.updateDate = LocalDateTime.now();
    }
}
