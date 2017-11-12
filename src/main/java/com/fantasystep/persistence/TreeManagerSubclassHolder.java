package com.fantasystep.persistence;

import com.fantasystep.domain.Application;
import com.fantasystep.systemweaver.item.SomeIpSystemSignal;
import com.fantasystep.systemweaver.item.ProtocolDataUnit;
import com.fantasystep.systemweaver.item.EnumerationSystemSignal;
import com.fantasystep.domain.Group;
import com.fantasystep.systemweaver.item.SignalMapping;
import com.fantasystep.systemweaver.item.MicroController;
import com.fantasystep.systemweaver.item.BooleanDesignSignal;
import com.fantasystep.systemweaver.item.ByteArraySystemSignal;
import com.fantasystep.systemweaver.item.FloatSystemSignal;
import com.fantasystep.domain.Table;
import com.fantasystep.domain.Entity;
import com.fantasystep.systemweaver.item.IntegerDesignSignal;
import com.fantasystep.systemweaver.item.Composition;
import com.fantasystep.systemweaver.item.LogicComponent;
import com.fantasystep.domain.EntityGroup;
import com.fantasystep.systemweaver.item.BusController;
import com.fantasystep.systemweaver.item.BusConnection;
import com.fantasystep.systemweaver.item.IntegerSystemSignal;
import com.fantasystep.systemweaver.item.EnumerationDesignSignal;
import com.fantasystep.systemweaver.item.DataTypeEnum;
import com.fantasystep.systemweaver.item.DiagnosticEvent;
import com.fantasystep.systemweaver.item.EcuSw;
import com.fantasystep.domain.Permission;
import com.fantasystep.systemweaver.item.RoutineOperation;
import com.fantasystep.systemweaver.item.PhysicalLink;
import com.fantasystep.systemweaver.item.ByteArrayDesignSignal;
import com.fantasystep.systemweaver.item.Frame;
import com.fantasystep.systemweaver.item.DataInMemory;
import com.fantasystep.systemweaver.item.ControlRoutine;
import com.fantasystep.systemweaver.item.EPlatform;
import com.fantasystep.systemweaver.item.SystemSignalGroup;
import com.fantasystep.systemweaver.item.FloatDesignSignal;
import com.fantasystep.systemweaver.item.EthernetNetwork;
import com.fantasystep.systemweaver.item.MicroControllerCoreVirtualMachine;
import com.fantasystep.domain.Resource;
import com.fantasystep.systemweaver.item.Socket;
import com.fantasystep.systemweaver.item.DesignSignalGroup;
import com.fantasystep.domain.User;
import com.fantasystep.systemweaver.item.Vlan;
import com.fantasystep.systemweaver.item.DataIdentifier;
import com.fantasystep.domain.Organization;
import com.fantasystep.systemweaver.item.EthernetSwitch;

import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;

import com.fantasystep.persistence.TreeManager;

@WebService
@XmlSeeAlso({Application.class, SomeIpSystemSignal.class, ProtocolDataUnit.class, EnumerationSystemSignal.class, Group.class, SignalMapping.class, MicroController.class, BooleanDesignSignal.class, ByteArraySystemSignal.class, FloatSystemSignal.class, Table.class, Entity.class, IntegerDesignSignal.class, Composition.class, LogicComponent.class, EntityGroup.class, BusController.class, BusConnection.class, IntegerSystemSignal.class, EnumerationDesignSignal.class, DataTypeEnum.class, DiagnosticEvent.class, EcuSw.class, Permission.class, RoutineOperation.class, PhysicalLink.class, ByteArrayDesignSignal.class, Frame.class, DataInMemory.class, ControlRoutine.class, EPlatform.class, SystemSignalGroup.class, FloatDesignSignal.class, EthernetNetwork.class, MicroControllerCoreVirtualMachine.class, Resource.class, Socket.class, DesignSignalGroup.class, User.class, Vlan.class, DataIdentifier.class, Organization.class, EthernetSwitch.class})
public interface TreeManagerSubclassHolder extends TreeManager {

}
