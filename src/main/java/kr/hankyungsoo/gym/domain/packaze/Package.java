package kr.hankyungsoo.gym.domain.packaze;

import kr.hankyungsoo.gym.domain.comm.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;


@Getter
@Setter
@ToString
@Entity
@Table(name = "package")
public class Package extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long packageSeq;
    private String packageName;
    private int count;
    private int period;


}
