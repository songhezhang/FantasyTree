package com.fantasystep.persistence;

import com.fantasystep.domain.Application;
import com.fantasystep.domain.Group;
import com.fantasystep.domain.EntityGroup;
import com.fantasystep.domain.Table;
import com.fantasystep.domain.Resource;
import com.fantasystep.domain.User;
import com.fantasystep.domain.Permission;
import com.fantasystep.domain.Organization;
import com.fantasystep.domain.Entity;

import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;

import com.fantasystep.persistence.TreeManager;

@WebService
@XmlSeeAlso({Application.class, Group.class, EntityGroup.class, Table.class, Resource.class, User.class, Permission.class, Organization.class, Entity.class})
public interface TreeManagerSubclassHolder extends TreeManager {

}
