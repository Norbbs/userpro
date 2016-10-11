package com.norbs.userpro.entity.base;

import com.norbs.userpro.entity.user.User;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Norbs on 18/09/2016.
 */
@MappedSuperclass
public abstract class BaseEntity implements Serializable {

    @ManyToOne
    @JoinColumn(name = "creator_user", nullable = false)
    private User creator;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "creation_date", nullable = false)
    private Date creationDate;

    @ManyToOne
    @JoinColumn(name = "updater_user")
    private User updater;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "update_date")
    private Date updateDate;

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public User getUpdater() {
        return updater;
    }

    public void setUpdater(User updater) {
        this.updater = updater;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}