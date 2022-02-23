package web.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Collection;
@Getter
@Setter
@Entity
@Table(name = "usercd")
public class UserEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(nullable = false, columnDefinition="VARCHAR(20)")
    private String userid;

    @Column(nullable = false, columnDefinition="VARCHAR(255)")
    private String pwd;

    @Column(nullable = false, columnDefinition="VARCHAR(20)")
    private String name;

    @Column(columnDefinition="VARCHAR(20)")
    private String uc;

    @Column(columnDefinition="VARCHAR(20)")
    private String rnkcd;

    @Column(nullable = false, columnDefinition="VARCHAR(20)")
    private String srvno;

    @Column(nullable = false, columnDefinition="VARCHAR(20)")
    private String telno;

    @Column(nullable = false, columnDefinition="VARCHAR(30)")
    private String email;

    @Column(nullable = false, columnDefinition="CHAR(1)")
    private String usrth;

    @Column(nullable = false, columnDefinition="CHAR(1)")
    private String usevcd;

    @Column(columnDefinition="int")
    private String loginfailrnumtm;

    @Column(columnDefinition="DATETIME")
    private LocalDateTime blocktime;

    @Column(columnDefinition="DATETIME")
    private LocalDateTime rctlogindt;

    @Column(columnDefinition="DATETIME")
    private LocalDateTime rctpwdchngdt;

    @Column(columnDefinition="DATETIME")
    private LocalDateTime crtdt;

    @Column(columnDefinition="DATETIME")
    private LocalDateTime mdfcdt;



}
