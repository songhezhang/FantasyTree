package com.fantasystep.persistence;

import com.fantasystep.systemweaver.item.IntegerSystemSignal;
import com.fantasystep.systemweaver.item.DataTypeEnum;
import com.fantasystep.systemweaver.item.Socket;
import com.fantasystep.domain.Group;
import com.fantasystep.systemweaver.item.EnumerationDesignSignal;
import com.fantasystep.systemweaver.item.FloatDesignSignal;
import com.fantasystep.systemweaver.item.EthernetSwitch;
import com.fantasystep.systemweaver.item.Composition;
import com.fantasystep.systemweaver.item.RoutineOperation;
import com.fantasystep.systemweaver.item.MicroControllerCoreVirtualMachine;
import com.fantasystep.systemweaver.item.SignalMapping;
import com.fantasystep.systemweaver.item.ProtocolDataUnit;
import com.fantasystep.domain.Entity;
import com.fantasystep.systemweaver.item.DataIdentifier;
import com.fantasystep.systemweaver.item.IntegerDesignSignal;
import com.fantasystep.domain.Application;
import com.fantasystep.domain.Permission;
import com.fantasystep.systemweaver.item.ByteArrayDesignSignal;
import com.fantasystep.systemweaver.item.BusConnection;
import com.fantasystep.systemweaver.item.ByteArraySystemSignal;
import com.fantasystep.systemweaver.item.BusController;
import com.fantasystep.systemweaver.item.MicroController;
import com.fantasystep.systemweaver.item.EthernetNetwork;
import com.fantasystep.systemweaver.item.EPlatform;
import com.fantasystep.systemweaver.item.PhysicalLink;
import com.fantasystep.systemweaver.item.EcuSw;
import com.fantasystep.systemweaver.item.Frame;
import com.fantasystep.systemweaver.item.Vlan;
import com.fantasystep.systemweaver.item.BooleanDesignSignal;
import com.fantasystep.systemweaver.item.SomeIpSystemSignal;
import com.fantasystep.systemweaver.item.EnumerationSystemSignal;
import com.fantasystep.systemweaver.item.LogicComponent;
import com.fantasystep.domain.User;
import com.fantasystep.systemweaver.item.ControlRoutine;
import com.fantasystep.domain.Organization;
import com.fantasystep.systemweaver.item.SystemSignalGroup;
import com.fantasystep.domain.Resource;
import com.fantasystep.domain.Table;
import com.fantasystep.domain.EntityGroup;
import com.fantasystep.systemweaver.item.DesignSignalGroup;
import com.fantasystep.systemweaver.item.DataInMemory;
import com.fantasystep.systemweaver.item.FloatSystemSignal;
import com.fantasystep.systemweaver.item.DiagnosticEvent;

import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;

import com.fantasystep.persistence.TreeManager;

@WebService
@XmlSeeAlso({IntegerSystemSignal.class, DataTypeEnum.class, Socket.class, Group.class, EnumerationDesignSignal.class, FloatDesignSignal.class, EthernetSwitch.class, Composition.class, RoutineOperation.class, MicroControllerCoreVirtualMachine.class, SignalMapping.class, ProtocolDataUnit.class, Entity.class, DataIdentifier.class, IntegerDesignSignal.class, Application.class, Permission.class, ByteArrayDesignSignal.class, BusConnection.class, ByteArraySystemSignal.class, BusController.class, MicroController.class, EthernetNetwork.class, EPlatform.class, PhysicalLink.class, EcuSw.class, Frame.class, Vlan.class, BooleanDesignSignal.class, SomeIpSystemSignal.class, EnumerationSystemSignal.class, LogicComponent.class, User.class, ControlRoutine.class, Organization.class, SystemSignalGroup.class, Resource.class, Table.class, EntityGroup.class, DesignSignalGroup.class, DataInMemory.class, FloatSystemSignal.class, DiagnosticEvent.class})
public interface TreeManagerSubclassHolder extends TreeManager {

}
