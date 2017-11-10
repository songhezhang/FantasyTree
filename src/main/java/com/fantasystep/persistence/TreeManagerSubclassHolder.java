package com.fantasystep.persistence;

import com.fantasystep.systemweaver.item.ByteArrayDesignSignal;
import com.fantasystep.systemweaver.item.Socket;
import com.fantasystep.systemweaver.item.EnumerationDesignSignal;
import com.fantasystep.domain.Resource;
import com.fantasystep.systemweaver.item.FloatDesignSignal;
import com.fantasystep.systemweaver.item.DataTypeEnum;
import com.fantasystep.systemweaver.item.EnumerationSystemSignal;
import com.fantasystep.systemweaver.item.FloatSystemSignal;
import com.fantasystep.systemweaver.item.PhysicalLink;
import com.fantasystep.systemweaver.item.EthernetNetwork;
import com.fantasystep.systemweaver.item.DataIdentifier;
import com.fantasystep.systemweaver.item.DesignSignalGroup;
import com.fantasystep.domain.User;
import com.fantasystep.systemweaver.item.DiagnosticEvent;
import com.fantasystep.systemweaver.item.ProtocolDataUnit;
import com.fantasystep.domain.Application;
import com.fantasystep.domain.EntityGroup;
import com.fantasystep.domain.Table;
import com.fantasystep.systemweaver.item.Vlan;
import com.fantasystep.systemweaver.item.ControlRoutine;
import com.fantasystep.systemweaver.item.BusController;
import com.fantasystep.domain.Permission;
import com.fantasystep.systemweaver.item.SignalMapping;
import com.fantasystep.systemweaver.item.EthernetSwitch;
import com.fantasystep.domain.Group;
import com.fantasystep.systemweaver.item.Composition;
import com.fantasystep.systemweaver.item.EcuSw;
import com.fantasystep.domain.Entity;
import com.fantasystep.systemweaver.item.LogicComponent;
import com.fantasystep.systemweaver.item.EPlatform;
import com.fantasystep.systemweaver.item.IntegerDesignSignal;
import com.fantasystep.systemweaver.item.MicroControllerCoreVirtualMachine;
import com.fantasystep.systemweaver.item.ByteArraySystemSignal;
import com.fantasystep.systemweaver.item.SomeIpSystemSignal;
import com.fantasystep.systemweaver.item.Frame;
import com.fantasystep.systemweaver.item.MicroController;
import com.fantasystep.systemweaver.item.IntegerSystemSignal;
import com.fantasystep.systemweaver.item.DataInMemory;
import com.fantasystep.systemweaver.item.BusConnection;
import com.fantasystep.systemweaver.item.SystemSignalGroup;
import com.fantasystep.domain.Organization;

import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;

import com.fantasystep.persistence.TreeManager;

@WebService
@XmlSeeAlso({ByteArrayDesignSignal.class, Socket.class, EnumerationDesignSignal.class, Resource.class, FloatDesignSignal.class, DataTypeEnum.class, EnumerationSystemSignal.class, FloatSystemSignal.class, PhysicalLink.class, EthernetNetwork.class, DataIdentifier.class, DesignSignalGroup.class, User.class, DiagnosticEvent.class, ProtocolDataUnit.class, Application.class, EntityGroup.class, Table.class, Vlan.class, ControlRoutine.class, BusController.class, Permission.class, SignalMapping.class, EthernetSwitch.class, Group.class, Composition.class, EcuSw.class, Entity.class, LogicComponent.class, EPlatform.class, IntegerDesignSignal.class, MicroControllerCoreVirtualMachine.class, ByteArraySystemSignal.class, SomeIpSystemSignal.class, Frame.class, MicroController.class, IntegerSystemSignal.class, DataInMemory.class, BusConnection.class, SystemSignalGroup.class, Organization.class})
public interface TreeManagerSubclassHolder extends TreeManager {

}
