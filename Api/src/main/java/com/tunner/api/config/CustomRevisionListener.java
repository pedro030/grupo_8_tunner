package com.tunner.api.config;

import com.tunner.api.audit.Revision;
import org.hibernate.envers.RevisionListener;

public class CustomRevisionListener implements RevisionListener {

    public void newRevision(Object RevisionEntity) {final Revision revision= (Revision) RevisionEntity;}
}
