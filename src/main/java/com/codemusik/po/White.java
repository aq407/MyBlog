package com.codemusik.po;

import javax.persistence.*;

@Entity
@Table(name = "t_white")
public class White {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ip;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        return "White{" +
                "id=" + id +
                ", ip='" + ip + '\'' +
                '}';
    }
}
